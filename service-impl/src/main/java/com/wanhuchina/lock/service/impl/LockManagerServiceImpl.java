package com.wanhuchina.lock.service.impl;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.lock.dao.WeigateCabiMapper;
import com.wanhuchina.lock.dao.WeigateCabinetMapper;
import com.wanhuchina.lock.dao.WeigateCabinetRecordMapper;
import com.wanhuchina.lock.model.cabinet.WeigateCabi;
import com.wanhuchina.lock.model.cabinet.WeigateCabinet;
import com.wanhuchina.lock.model.cabinet.WeigateCabinetExample;
import com.wanhuchina.lock.model.cabinet.WeigateCabinetExample.Criteria;
import com.wanhuchina.lock.model.cabinet.WeigateCabinetRecord;
import com.wanhuchina.lock.model.netty.Session;
import com.wanhuchina.lock.service.LockManagerService;
import com.wanhuchina.lock.service.impl.netty.server.LockTcpServer;
import com.wanhuchina.lock.service.impl.netty.utils.RandomCode;
import com.wanhuchina.lock.service.impl.netty.utils.SetCmdBase;
import com.wanhuchina.lock.service.redis.RedisService;
import io.netty.channel.ChannelFuture;
import io.netty.channel.socket.SocketChannel;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service("lockManagerService")
public class LockManagerServiceImpl implements LockManagerService {

	private static final org.slf4j.Logger log= LoggerFactory.getLogger(LockManagerServiceImpl.class);

	@Resource
	private RedisService redisService;

	@Resource
	private WeigateCabiMapper cabiMapper;
	
	@Resource
	private WeigateCabinetMapper weigateCabinetMapper;
	
	@Resource
	private WeigateCabinetRecordMapper cabinetRecordMapper;

	
	@Override
	public int OpenLock(String requestOpenDoorStr) throws CommonException {
		log.info("开门参数"+requestOpenDoorStr);
		SocketChannel channel = null;
		
			SetCmdBase setCmd = new SetCmdBase();
			try {
				if(requestOpenDoorStr!=null){
					String[] params = requestOpenDoorStr.split("-");
					String cabinetId = params[0];
					String careId =params[3];
					byte[] data = new byte[] { 0x00, 0x01 };
					//业务-1 需要params[2] -1 
					int valueOf = Integer.valueOf(params[2])-1;
				    data[0] = (byte)valueOf;//
				    byte[] bs = setCmd.SetCommand(new byte[] { 0x02 }, data);
					String SerNo = params[1];
					System.out.println("SerNo:"+SerNo);
					Session session = LockTcpServer.InfoMap.get(params[1]);
					System.out.println("SerialNo"+params[1]);
					channel = (SocketChannel)session.get_channel();
					log.info("bs:"+bs+"channel"+channel);
					if(bs==null && channel==null){

						throw new CommonException(CommonCode.SOCKET_ONLINE_ERROR.getCode(),CommonCode.SOCKET_ONLINE_ERROR.getMsg());

					}else{
						 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				    	 String queryTime=dateFormat.format(new Date());
				    	 String cabinetIdAndCareId = cabinetId+"-"+careId;
				    	 //updateCabinetInfoBycanbientId
				 		String[] s=cabinetIdAndCareId.split("-");
						cabinetId=s[0];
						careId=s[1];
						//WeigateCabinet cabinet = weigateCabinetMapper.selByCabinetId(cabinetId);
						WeigateCabinetExample example = new WeigateCabinetExample();
						Criteria criteria1 = example.createCriteria();
						criteria1.andCabinetIdEqualTo(cabinetId);
						List<WeigateCabinet> cabinetList = weigateCabinetMapper.selectByExample(example);
						WeigateCabinet cabinet = new WeigateCabinet();
						for (WeigateCabinet wcabinet : cabinetList ) {
							cabinet = wcabinet;
						}
						if(cabinet!=null){
				  	    System.out.println("====:"+cabinet);
				  		//cabinet.setCabinet_status("0");
				  		cabinet.setCabinetStatus("0");
				  		//System.out.println("===================..>>"+cabinet.getCabinet_status());
						WeigateCabinetExample example1 = new WeigateCabinetExample();
							Criteria criteria = example1.createCriteria();
							criteria.andCabinetIdEqualTo(cabinet.getCabiId());
						weigateCabinetMapper.updateByExampleSelective(cabinet,example1);
						WeigateCabi cabi  = cabiMapper.selectByPrimaryKey(cabinet.getCabiId());
							if(cabi!=null){
								cabi.setCabiLastAccessTime(queryTime);
								cabiMapper.updateByPrimaryKeySelective(cabi);
							}
							WeigateCabinetRecord cabinetRecord =  cabinetRecordMapper.selectByPrimaryKey(careId);
								cabinetRecord.setCareQueryTime(queryTime);
								cabinetRecordMapper.updateByPrimaryKeySelective(cabinetRecord);

				  	    	}

					  	 }

						ChannelFuture channelFuture = channel.writeAndFlush(bs);

					boolean success = channelFuture.isDone();
					System.out.println(success);
					if (channelFuture.isSuccess() == true) {
								return 0;
						} else {
								return 0;
						}

					}else{

					throw new CommonException(CommonCode.PARAM_ERROR.getCode(), "开门参数错误");
				}
			} catch (NumberFormatException e){
				log.error("ERROR:"+e);
				
				e.printStackTrace();
				throw new CommonException(CommonCode.PARAM_ERROR.getCode(), "柜号错误");
			}catch (Exception e){
				e.printStackTrace();
				throw new CommonException(CommonCode.SERVER_ERROR.getCode(), "服务器内部异常");
			}
			
	}
			
		
	
	
	@Override
	public int createPassword(String SetPadPass)  throws CommonException {
		log.info("设置密码参数" + SetPadPass);
		try {
			String[] split = SetPadPass.split("-");
			String cabinetid = split[0];//柜体id
			String BoardNo = split[1];//板子编号
			String cabinetdoorNo = split[2];//锁号
			String careNo = split[3];//柜门号
			careNo = careNo.replaceAll("[a-zA-Z]", "");
			String CustTel = split[4];//电话号
			String OrderId = split[5];//orderId
			String password = "";
			String param1 = null;

			SetCmdBase setCmd = new SetCmdBase();
			if (careNo != null && !careNo.equals("")) {
				//Integer intcareNo = Integer.valueOf(careNo);
				byte[] data = new byte[51]; //第1至第12个字节密码，第13为门锁号为0x01至0x18，第14个字节为第n密码
				for (int i = 0; i < data.length; i++) {
					data[i] = (byte) 0xFF;
				}
				for (int n = 0; n < 3; n++) {
					if (n == 0) {
						String generateRandomStr1 = RandomCode.generateRandomStr(6);
//						param1 = Integer.toString(10+intcareNo)+randomStr;
						param1 = generateRandomStr1;
						password += param1;
						for (int i = 0; i < param1.length(); i++) {
							String newparam1 = param1.substring(i, i + 1);
							char[] chars = newparam1.toCharArray();
							data[i] = (byte) chars[0];      //第一个密码
						}
						int careNos = Integer.valueOf(cabinetdoorNo);
						data[15] = (byte) careNos;
						int param3s = Integer.valueOf(n + 1);//第n+1个密码
						data[16] = (byte) param3s;
					}
					if (n == 1) {
						String generateRandomStr2 = RandomCode.generateRandomStr(8);
//						param1 = Integer.toString(40+intcareNo)+randomStr;
						param1 = generateRandomStr2;
						password += "," + param1;

						int m = 0;
						for (int i = 17; i < param1.length() + 17; i++) {
							String newparam1 = param1.substring(m, m + 1);
							m = m + 1;
							char[] chars = newparam1.toCharArray();
							data[i] = (byte) chars[0];      //第一个密码
						}
						int careNos = Integer.valueOf(cabinetdoorNo);
						data[32] = (byte) careNos;
						int param3s = Integer.valueOf(n + 1);//第n+1个密码
						data[33] = (byte) param3s;
					}
					if (n == 2) {
						careNo.trim();
						String numCareNo = "";
						if (careNo != null && !"".equals(careNo)) {
							for (int i = 0; i < careNo.length(); i++) {
								if (careNo.charAt(i) >= 48 && careNo.charAt(i) <= 57) {
									numCareNo += careNo.charAt(i);
								}
							}
						}
//						if (numCareNo.length() < 3) {
//							for (int i = numCareNo.length(); i < 3; i++) {
//								numCareNo = "0" + numCareNo;
//							}
//						}
						String randomStr = RandomCode.generateRandomStr(1);
						if(cabinetdoorNo.length()==1){
							cabinetdoorNo = "0"+cabinetdoorNo;
						}
						//这里将原先  电话+柜门号+随机号 改为 电话 + 锁号 0728
						param1 = CustTel + cabinetdoorNo;
						password += "," + param1;
						int m = 0;
						for (int i = 34; i < param1.length() + 34; i++) {
							String newparam1 = param1.substring(m, m + 1);
							m = m + 1;
							char[] chars = newparam1.toCharArray();
							data[i] = (byte) chars[0];      //第一个密码
						}
						int careNos = Integer.valueOf(cabinetdoorNo);     //+1
						data[49] = (byte) careNos;
						int param3s = Integer.valueOf(n + 1);//第n+1个密码
						data[50] = (byte) param3s;
					}
				}
				//2017-2-9 密码加入redis
				redisService.set(BoardNo + "-Pwd-" + careNo, password);
				//2017-2-23 密码加入数据库  可以删除0321
				WeigateCabinet cabinet = new WeigateCabinet();
				WeigateCabinetExample example = new WeigateCabinetExample();
				Criteria create = example.createCriteria();
				create.andCabinetIdEqualTo(cabinetid);
				//cabinet.setCabinet_id(cabinetid);
				cabinet.setCabiId(cabinetid);
				//cabinet.setCabinet_supper_password(password);
				cabinet.setCabinetSupperPassword(password);
				weigateCabinetMapper.updateByExampleSelective(cabinet, example);
				byte[] bs = setCmd.SetCommand(new byte[]{0x09}, data);
				Session session = LockTcpServer.InfoMap.get(BoardNo);//需修改
				SocketChannel channel = null;
				try {
					channel = (SocketChannel) session.get_channel();
				} catch (Exception e) {
					channel = null;
				}
				if (bs == null || channel == null) {
					throw new CommonException(CommonCode.SOCKET_ONLINE_ERROR.getCode(), "socket断线");
				} else {
					ChannelFuture channelFuture = null;
					try {
						channelFuture = channel.writeAndFlush(bs);
					} catch (Exception e) {
						throw new CommonException(CommonCode.SOCKET_ONLINE_ERROR.getCode(), "socket断线");
					}
					if (channelFuture.isSuccess() == true) {

						return 0;
					} else {

						return 1;
					}
				}
			} else {
				log.info("柜号错误：" + careNo);
				throw  new CommonException(CommonCode.PARAM_ERROR.getCode(), "柜号错误"+careNo);
			}
		}   catch (CommonException e) {
			log.error("ERROR:"+e);
			throw new CommonException(e.getCode(),e.getMsg());
		}

	}






}

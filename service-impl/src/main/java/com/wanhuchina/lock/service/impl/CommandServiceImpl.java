package com.wanhuchina.lock.service.impl;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.lock.model.netty.Session;
import com.wanhuchina.lock.service.CommandService;
import com.wanhuchina.lock.service.impl.netty.server.LockTcpServer;
import com.wanhuchina.lock.service.impl.netty.utils.CmdUtils;
import com.wanhuchina.lock.service.impl.netty.utils.SendCmdBase;
import com.wanhuchina.lock.service.impl.netty.utils.SetCmdBase;
import com.wanhuchina.lock.service.impl.netty.utils.StringUtils;
import io.netty.channel.socket.SocketChannel;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



@Service("commandService")
public class CommandServiceImpl implements CommandService {


	private static final org.slf4j.Logger log= LoggerFactory.getLogger(CommandServiceImpl.class);



	/**
	 * 指令操作
	 */
	@Override
	public void CommandBoard(String sltCommand, String SerialNo, String sltSessionIDs) throws CommonException{

		System.out.println("服务器下发命令：");

		//0103 ssh
		//
		//sltCommand = request.getParameter("sltCommand");
		try {
			SetCmdBase setCmd = new SetCmdBase();
			SendCmdBase sendCmd = new SendCmdBase();
			String[] paramArr = sltCommand.split(":");
			String par = paramArr[1];
			String name = par.trim();
			String param1 = null;
			String param2 = null;
			String param3 = null;
			String param4 = null;
			byte[] bs = null;

			if(paramArr.length==2){
				param1 = paramArr[2].trim();
			}else if(paramArr.length==3){
				param1 = paramArr[2].trim();
			}else if(paramArr.length==4){
				param1 = paramArr[2].trim();
				param2 = paramArr[3].trim();
				
			}else if(paramArr.length==5){
				param1 = paramArr[2].trim();
				param2 = paramArr[3].trim();
				param3 = paramArr[4].trim();
			}
			//
			byte[] data = null;
			int valueOf ;

			switch (name) {
				case "SetRunMode"://设置运行模式
					valueOf = Integer.valueOf(param1);
					data = new byte[] { (byte)valueOf };
					bs = setCmd.SetCommand(new byte[] { 0x01 }, data);
					break;
				case "SetOpenDoor"://开门指令

					data = new byte[] { 0x00, 0x01 };
					valueOf = Integer.valueOf(param1);
					data[0] = (byte)valueOf;//这儿要改成活的
					bs = setCmd.SetCommand(new byte[] { 0x02 }, data);
					break;
				case "SetAPInfo"://设置热点
					data = new byte[96];
					for(int i=0;i<data.length;i++){
						data[i]=0x00;
					}
					data = CmdUtils.SetAPInfo(param1, param2, data);   //2 为热点名，3 为密码
					bs = setCmd.SetCommand(new byte[] { 0x03 }, data);
					break;
				case "SetRemoteServer"://设置远程服务器
					data = new byte[38];
					for(int i=0;i<data.length;i++){
						data[i]=0x00;
					}
					data = CmdUtils.SetAPInfo(param1, param2, data);   //2 IP，3 为端口
					bs = setCmd.SetCommand(new byte[] { 0x04 }, data);
					break;
				case "SetRouterInfo"://设置路由器的信息
					data =  new byte[98];
					for(int i=0;i<data.length;i++){
						data[i]=0x00;
					}
					data = CmdUtils.SetRouterInfo(param1, param2, param3, param4, data);   //2 SSID，3 为密码， 4通道号 5 加密方式
					bs = setCmd.SetCommand(new byte[] { 0x06 }, data);
					break;
				case "SetResetDevice"://设置复位装置
					bs = setCmd.SetCommand(new byte[] { 0x07 }, new byte[] { });

					break;
				case "SetPlayVoice":
					String stringToHexString = StringUtils.StringToHexString(param1,"gbk");
					String[] split = stringToHexString.split(" ");
					data = new byte[split.length];
					for(int i = 0;i<data.length;i++){
						data[i] = 0x00;
					}
					for(int i = 0;i<split.length;i++){
						data[i] = (byte)StringUtils.StringHaxtoByte(split[i]);

					}
					byte[] len = new byte[] { (byte)param1.length() };
					byte[] lendata = new byte[data.length + 1];
					lendata[0]=len[0];
					int n=0;
					for(int i = 1;i < data.length+1;i++){
						lendata[i]=data[n];
						n++;
					}
					bs = setCmd.SetCommand(new byte[] { 0x08 }, lendata);
					break;
				case "SetPadPass"://通过设置垫
					data = new byte[17]; //第1至第12个字节密码，第13为门锁号为0x01至0x18，第14个字节为第n密码
					for(int i=0;i<data.length;i++){
						data[i]=(byte) 0xFF;
					}
					for (int i = 0; i < param1.length(); i++){
						String newparam1 = param1.substring(i, i+1);
						char[] chars = newparam1.toCharArray();
						data[i] = (byte)chars[0];      //第一个密码
					}
					int param2s = Integer.valueOf(param2);
					data[15] = (byte)param2s;
					int param3s = Integer.valueOf(param3);
					data[16] = (byte)param3s;
					bs = setCmd.SetCommand(new byte[] { 0x09 }, data);

					break;
				case "SendCoreJump":
					bs = sendCmd.SetCommand(new byte[] { 0x15 }, new byte[] {  });
					break;
				case "SetSerialNo":
					data = new byte[15];
					for(int i=0;i<data.length;i++){
						data[i]=0x00;
					}
					for (int i = 0; i < param1.length(); i++){
						String newparam1 = param1.substring(i, i+1);
						char[] chars = newparam1.toCharArray();
						data[i] = (byte)chars[0];      //第一个密码
					}
					bs = setCmd.SetCommand(new byte[] { 0x12 }, data);
					break;
				case "GetDoorFeedback":
					bs = setCmd.SetCommand(new byte[] { 0x24 }, new byte[] { });
					break;
				case "GetBoardInfo":
					bs = setCmd.SetCommand(new byte[] { 0x26 }, new byte[] { });
					break;
				case "SendLockInfo":
					data = new byte[3];
					for(int i=0;i<data.length;i++){
						data[i]=0x00;
					}
					for (int i = 0; i < param1.length(); i++){
						String newparam1 = param1.substring(i, i+1);
						char[] chars = newparam1.toCharArray();
						data[i] = (byte)chars[0];      //第一个密码
					}
					bs = sendCmd.SetCommand(new byte[] { 0x34 }, data);
					break;
				case "SendBoardInfo":
					data = new byte[57];
					for(int i=0;i<data.length;i++){
						data[i]=0x00;
					}
					for (int i = 0; i < param1.length(); i++){
						String newparam1 = param1.substring(i, i+1);
						char[] chars = newparam1.toCharArray();
						data[i] = (byte)chars[0];      //12
					}
					int z = 0;
					for (int i = param1.length(); i < param1.length()+param2.length(); i++){
						String newparam2 = param2.substring(z, z+1);
						char[] chars = newparam2.toCharArray();
						data[i] = (byte)chars[0];  //42
						z++;
					}
					int m=0;
					for (int i = param1.length()+param2.length(); i < param1.length()+param2.length()+param3.length(); i++){
						String newparam3 = param3.substring(m, m+1);
						char[] chars = newparam3.toCharArray();
						data[i] = (byte)chars[0];   //57
						m++;
					}
					bs = sendCmd.SetCommand(new byte[] { 0x36 }, data);
					break;
				case "SetCoreJumpReply":

					break;
				default:
					break;
			}


//			if(name.equals("SetRunMode")){//设置运行模式
//				int valueOf = Integer.valueOf(param1);
//				byte[] data = { (byte)valueOf  };
//				bs = setCmd.SetCommand(new byte[] { 0x01 }, data);
//			}else if(name.equals("SetOpenDoor")){//开门指令
//				byte[] data = new byte[] { 0x00, 0x01 };
//				int valueOf = Integer.valueOf(param1);
//		        data[0] = (byte)valueOf;//这儿要改成活的
//		        bs = setCmd.SetCommand(new byte[] { 0x02 }, data);
//			}else if(name.equals("SetAPInfo")){//设置热点
//
//				byte[] data = new byte[96];
//				for(int i=0;i<data.length;i++){
//					data[i]=0x00;
//				}
//				data = CmdUtils.SetAPInfo(param1, param2, data);   //2 为热点名，3 为密码
//				bs = setCmd.SetCommand(new byte[] { 0x03 }, data);
//
//			}else if(name.equals("SetRemoteServer")){//设置远程服务器
//
//				byte[] data = new byte[38];
//				for(int i=0;i<data.length;i++){
//					data[i]=0x00;
//				}
//				data = CmdUtils.SetAPInfo(param1, param2, data);   //2 IP，3 为端口
//				bs = setCmd.SetCommand(new byte[] { 0x04 }, data);
//
//			}else if(name.equals("SetRouterInfo")){//设置路由器的信息
//				byte[] data =  new byte[98];
//				for(int i=0;i<data.length;i++){
//					data[i]=0x00;
//				}
//				data = CmdUtils.SetRouterInfo(param1, param2, param3, param4, data);   //2 SSID，3 为密码， 4通道号 5 加密方式
//				bs = setCmd.SetCommand(new byte[] { 0x06 }, data);
//
//			}else if(name.equals("SetResetDevice")){//设置复位装置
//				bs = setCmd.SetCommand(new byte[] { 0x07 }, new byte[] { });
//			}else if(name.equals("SetPlayVoice")){//设置播放声音
//				String stringToHexString = StringUtils.StringToHexString(param1,"gbk");
//				String[] split = stringToHexString.split(" ");
//				byte[] data = new byte[split.length];
//				for(int i = 0;i<data.length;i++){
//					data[i] = 0x00;
//				}
//				for(int i = 0;i<split.length;i++){
//					data[i] = (byte)StringUtils.StringHaxtoByte(split[i]);
//
//				}
//	            byte[] len = new byte[] { (byte)param1.length() };
//	            byte[] lendata = new byte[data.length + 1];
//	            lendata[0]=len[0];
//	            int n=0;
//	            for(int i = 1;i < data.length+1;i++){
//	            	lendata[i]=data[n];
//	            	n++;
//	            }
//	            bs = setCmd.SetCommand(new byte[] { 0x08 }, lendata);
//			}else if(name.equals("SetPadPass")){//通过设置垫
//				 byte[] data = new byte[17]; //第1至第12个字节密码，第13为门锁号为0x01至0x18，第14个字节为第n密码
//				 for(int i=0;i<data.length;i++){
//						data[i]=(byte) 0xFF;
//					}
//	             for (int i = 0; i < param1.length(); i++){
//	            	 String newparam1 = param1.substring(i, i+1);
//	            	 char[] chars = newparam1.toCharArray();
//	            	 data[i] = (byte)chars[0];      //第一个密码
//	             }
//	             int param2s = Integer.valueOf(param2);
//	             data[15] = (byte)param2s;
//	             int param3s = Integer.valueOf(param3);
//	             data[16] = (byte)param3s;
//	             bs = setCmd.SetCommand(new byte[] { 0x09 }, data);
//			}else if(name.equals("SendCoreJump")){//发芯跳
//				 bs = sendCmd.SetCommand(new byte[] { 0x15 }, new byte[] {  });
//			}else if(name.equals("SetSerialNo")){//设置编号
//				byte[] data = new byte[15];
//				for(int i=0;i<data.length;i++){
//					data[i]=0x00;
//				}
//				for (int i = 0; i < param1.length(); i++){
//	           	 String newparam1 = param1.substring(i, i+1);
//	           	 char[] chars = newparam1.toCharArray();
//	           	 data[i] = (byte)chars[0];      //第一个密码
//	            }
//				bs = setCmd.SetCommand(new byte[] { 0x12 }, data);
//
//			}else if(name.equals("GetDoorFeedback")){//让门反馈
//				bs = setCmd.SetCommand(new byte[] { 0x24 }, new byte[] { });
//			}else if(name.equals("GetBoardInfo")){//得到董事会的信息
//				bs = setCmd.SetCommand(new byte[] { 0x26 }, new byte[] { });
//			}else if(name.equals("SendLockInfo")){//把锁的信息
//				byte[] data = new byte[3];
//				for(int i=0;i<data.length;i++){
//					data[i]=0x00;
//				}
//				for (int i = 0; i < param1.length(); i++){
//	           	 String newparam1 = param1.substring(i, i+1);
//	           	 char[] chars = newparam1.toCharArray();
//	           	 data[i] = (byte)chars[0];      //第一个密码
//	            }
//				bs = sendCmd.SetCommand(new byte[] { 0x34 }, data);
//			}else if(name.equals("SendBoardInfo")){//送板信息
//				data = new byte[57];
//				for(int i=0;i<data.length;i++){
//					data[i]=0x00;
//				}
//	            for (int i = 0; i < param1.length(); i++){
//	            	String newparam1 = param1.substring(i, i+1);
//	            	char[] chars = newparam1.toCharArray();
//	            	data[i] = (byte)chars[0];      //12
//	            }
//	            int n = 0;
//	            for (int i = param1.length(); i < param1.length()+param2.length(); i++){
//	            	String newparam2 = param2.substring(n, n+1);
//	            	char[] chars = newparam2.toCharArray();
//	            	data[i] = (byte)chars[0];  //42
//	            	n++;
//	            }
//	            int m=0;
//	            for (int i = param1.length()+param2.length(); i < param1.length()+param2.length()+param3.length(); i++){
//	            	String newparam3 = param3.substring(m, m+1);
//	            	char[] chars = newparam3.toCharArray();
//	            	data[i] = (byte)chars[0];   //57
//	            	m++;
//	            }
//	            bs = sendCmd.SetCommand(new byte[] { 0x36 }, data);
//			}else if(name.equals("SetCoreJumpReply")){//设置核心跳转答复
//
//			}
			SocketChannel channel = null;
			if(!"".equals(sltSessionIDs)&&sltSessionIDs!=null){
				
				Session session = LockTcpServer.map.get(sltSessionIDs);
				System.out.println("========1=========");
				channel = (SocketChannel)session.get_channel();
			}else if(!"".equals(SerialNo)&&SerialNo!=null){
				System.out.println("========2=========");
				Session session = LockTcpServer.InfoMap.get(SerialNo);
				System.out.println("SerialNo"+SerialNo);
				channel = (SocketChannel)session.get_channel();
			}
			log.info("bs:"+bs+"channel："+channel);
			if(bs==null && channel==null){
				throw new CommonException(CommonCode.SOCKET_ONLINE_ERROR.getCode(),"socket断线");
			}else{
			  	 channel.writeAndFlush(bs);
				throw new CommonException(CommonCode.SUCCESS.getCode(),"操作成功");

			}
		} catch (CommonException e) {
			log.error("ERROR:"+e);
			throw e;
		} catch (Exception e) {
			log.error("ERROR:"+e);
			throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务内部异常");
		}
	}
	
	
	@Override
	public List<String> BoardSerialNos() throws CommonException{
		List<String> SerialNolist = new ArrayList<String>();
		Map<String, Session> infoMap = LockTcpServer.InfoMap;
		
			Iterator<String> it = infoMap.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("SerialNos    "+key);
				
				SerialNolist.add(key);
			}
			log.info("SerialNolist:"+SerialNolist);
		
		return SerialNolist;
	}



	@Override
	public List<String> MapToList() throws CommonException {
		List<String> list = new ArrayList<String>();
		Map<String, Session> map = LockTcpServer.getMap();
		 Iterator<String> it = map.keySet().iterator();
		 while (it.hasNext()) {
			 String key = it.next();
			 System.out.println("key    "+key);
			 //解决重复key 0108
			 map.get(key).get_channel().closeFuture();
			 if(map.get(key).get_channel().isActive()==false){
				 map.remove(key);
			 }
		     list.add(key);
		 }
		 return list;
	}
	
	
	@Override
	public String geLockMsg() {
		
		
		return null;

	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}

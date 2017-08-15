package com.wanhuchina.lock.service.impl.netty.utils;

import com.wanhuchina.lock.model.netty.BoardInfo;
import com.wanhuchina.lock.model.netty.Session;
import com.wanhuchina.lock.service.ChangeLockService;
import com.wanhuchina.lock.service.impl.netty.server.LockTcpServer;
import com.wanhuchina.lock.service.redis.RedisService;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@Service
public class ResponseBase {
	@Resource
	private RedisService redisService;

	@Resource
	private ChangeLockService changeLockService;


	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(ResponseBase.class);
    
    //响应类：处理响应数据
	/**
	 * 1，给infoMap赋值，实时改变其channel以保证实时控制电路板
	 */

    public  String GetReponse(String response, Session session,ChannelHandlerContext ctx) {

        String[] resp = response.split(" ");//按照指定编码将string编程字节数组;
        return GetReponse(resp,session,ctx);

    }
    public  String GetReponse(String[] resp, Session session,ChannelHandlerContext ctx){
    	//序列号对应的map
    	Map<String, Session> infoMap = LockTcpServer.getInfoMap();
    	String res =" ";
		String [] deviceArr = null;
		String [] versionInfoArr =null;
		String [] serialNoArr = null;
		String deviceId ;
		String versionInfo ;
				switch (resp[9]){
					case "15":
						try {
							//here return corejump 0104
							if(session.getBoardInfo().get_serialNo()==null){
								//byte[] sendBoacdSeriNo = StringUtils.HaxSreingToint("7E 7E 00 13 00 00 00 00 61 30 31 32 33 34 35 36 37 26 00 02 36 7E 7E");
								//ctx.writeAndFlush(sendBoacdSeriNo);
							}else{

								logger.info("序列号："+session.getBoardInfo().get_serialNo());
								byte[] haxSreingToint = StringUtils.HaxSreingToint("7E 7E 00 14 00 00 00 00 61 30 31 32 33 34 35 36 37 10 00 00 02 21 7E 7E");
								ctx.writeAndFlush(haxSreingToint);
							}
						} catch (Exception e) {
							logger.error("废包：错误"+e.getStackTrace());
							byte[] sendBoacdSeriNo = StringUtils.HaxSreingToint("7E 7E 00 13 00 00 00 00 61 30 31 32 33 34 35 36 37 26 00 02 36 7E 7E");
							ctx.writeAndFlush(sendBoacdSeriNo);
							System.out.println("ssh");
						}
						break;

					//0x34门锁返回
					case "34":
						String lockInfo = "";
						SimpleDateFormat sdf =  new SimpleDateFormat("yyyyMMddhhmmss");
						String nowtime = sdf.format(new Date());
						//第一个信号1~8门
						String lockStr1 = convertHexToBinary3(resp[10]);
						for (int i = 8; i > 0 ; i--) {
							String substring = lockStr1.substring(i-1, i);
							lockInfo += (9-i)+ ("1".equals(substring)  ? " 锁:"+nowtime+"-" : " 开:"+nowtime+"-") ;

						}
						//9~16门
						//lockInfo += " ";
						String lockStr2 = convertHexToBinary3(resp[11]);
						for (int i = 8; i > 0 ; i--) {
							String substring = lockStr2.substring(i-1, i);
							lockInfo += (17-i) + ("1".equals(substring)  ? " 锁:"+nowtime+"-" : " 开:"+nowtime+"-") ;

						}
						//17~24
						//lockInfo += " ";
						String lockStr3 = convertHexToBinary3(resp[12]);
						for (int i = 8; i > 0 ; i--) {
							String substring = lockStr3.substring(i-1, i);
							lockInfo += (25-i) + ("1".equals(substring)  ? " 锁:"+nowtime+"-" : " 开:"+nowtime+"-") ;

						}

						res = "锁信息 :" + lockInfo;
						System.out.println(res);
						if (session != null){
							session.getBoardInfo().set_lockMsg(lockInfo);
							String SerialNo = session.getBoardInfo().get_serialNo();
							String LockState = redisService.get(SerialNo+"-LockState");

							if(LockState!=null){
								String newLockState = LockInfor(SerialNo,LockState,lockInfo);
								redisService.set(SerialNo+"-LockState", newLockState);
							}else{
								redisService.set(SerialNo+"-LockState", lockInfo);
								//NewLockInfor(SerialNo,lockInfo);
							}

							System.out.println("redissssssssss====="+LockState);
						}

						break;

					//0x36获取主板信息
					//0108


					case "36":
						//
						deviceArr = Arrays.copyOfRange(resp, 10, 22);
						versionInfoArr = Arrays.copyOfRange(resp, 22, 52);
						serialNoArr = Arrays.copyOfRange(resp, 52, 68);
						//设备唯一编号
						deviceId = "";
						for (String devices : deviceArr) {
							deviceId+= devices;
						}
						System.out.println(deviceId);
						//固件版本号
						versionInfo = HaxtoStr(versionInfoArr);
						//序列号
						String serialNo = HaxtoStr(serialNoArr).trim();
						System.out.println("deviceId : " +deviceId);
						System.out.println("versionInfo : " +versionInfo);
						System.out.println("serialNo : " +serialNo);
						String boardMsg = "设备唯一编码号:" + deviceId + "\t 固件版本号:" + versionInfo + "\t 序列号：" + serialNo;
						res +=  "设备唯一编码号:" + deviceId + "\t 固件版本号:" + versionInfo + "\t 序列号：" + serialNo + "\t Session:" + session;
						if(session!=null){
							BoardInfo boardInfo = new BoardInfo();
							boardInfo.set_deviceId(deviceId);
							boardInfo.set_serialNo(serialNo);
							boardInfo.set_version(versionInfo);
							boardInfo.set_boardMsg(boardMsg);
							session.setBoardInfo(boardInfo);
							if(serialNo!=null){
								session.setSessionId_id(serialNo);
								LockTcpServer.getInfoMap().put(serialNo, session);
								//infoMap.put(serialNo, session);
							}
						}

						break;

					case "38":
						deviceArr = Arrays.copyOfRange(resp, 10, 22);
						versionInfoArr = Arrays.copyOfRange(resp, 22, 52);
						//设备唯一编号
						deviceId = "";
						for (String devices : deviceArr) {
							deviceId+= devices;
						}
						System.out.println(deviceId);
						//固件版本号
						versionInfo = HaxtoStr(versionInfoArr);
						//序列号
						System.out.println("deviceId : " +deviceId);
						System.out.println("versionInfo : " +versionInfo);
						res +=  "设备唯一编码号:" + deviceId + "\t 固件版本号:" + versionInfo;

						break;


					default:
						res +="还未设置命令";
						break;
				}

//    	//0x15收到心跳包
//				if(("15").equals(resp[9])){
//					try {
//						//here return corejump 0104
//						if(session.getBoardInfo().get_serialNo()==null){
//							//byte[] sendBoacdSeriNo = StringUtils.HaxSreingToint("7E 7E 00 13 00 00 00 00 61 30 31 32 33 34 35 36 37 26 00 02 36 7E 7E");
//							//ctx.writeAndFlush(sendBoacdSeriNo);
//						}else{
//
//							logger.info("序列号："+session.getBoardInfo().get_serialNo());
//							byte[] haxSreingToint = StringUtils.HaxSreingToint("7E 7E 00 14 00 00 00 00 61 30 31 32 33 34 35 36 37 10 00 00 02 21 7E 7E");
//							ctx.writeAndFlush(haxSreingToint);
//						}
//					} catch (Exception e) {
//						logger.error("废包：错误"+e.getStackTrace());
//			        	byte[] sendBoacdSeriNo = StringUtils.HaxSreingToint("7E 7E 00 13 00 00 00 00 61 30 31 32 33 34 35 36 37 26 00 02 36 7E 7E");
//			        	ctx.writeAndFlush(sendBoacdSeriNo);
//			        	System.out.println("ssh");
//					}
//
//					//res = "CoreJump";
//				}else
//				//0x34门锁返回
//				if(("34").equals(resp[9])){
//					String lockInfo = "";
//					SimpleDateFormat sdf =  new SimpleDateFormat("yyyyMMddhhmmss");
//					String nowtime = sdf.format(new Date());
//					//第一个信号1~8门
//					String lockStr1 = convertHexToBinary3(resp[10]);
//					for (int i = 8; i > 0 ; i--) {
//						String substring = lockStr1.substring(i-1, i);
//						lockInfo += (9-i)+ ("1".equals(substring)  ? " 锁:"+nowtime+"-" : " 开:"+nowtime+"-") ;
//
//					}
//					//9~16门
//					//lockInfo += " ";
//					String lockStr2 = convertHexToBinary3(resp[11]);
//					for (int i = 8; i > 0 ; i--) {
//						String substring = lockStr2.substring(i-1, i);
//						lockInfo += (17-i) + ("1".equals(substring)  ? " 锁:"+nowtime+"-" : " 开:"+nowtime+"-") ;
//
//					}
//					//17~24
//					//lockInfo += " ";
//					String lockStr3 = convertHexToBinary3(resp[12]);
//					for (int i = 8; i > 0 ; i--) {
//						String substring = lockStr3.substring(i-1, i);
//						lockInfo += (25-i) + ("1".equals(substring)  ? " 锁:"+nowtime+"-" : " 开:"+nowtime+"-") ;
//
//					}
//
//					res = "锁信息 :" + lockInfo;
//					System.out.println(res);
//					if (session != null){
//						session.getBoardInfo().set_lockMsg(lockInfo);
//						String SerialNo = session.getBoardInfo().get_serialNo();
//						String LockState = redisService.get(SerialNo+"-LockState");
//
//						if(LockState!=null){
//							String newLockState = LockInfor(SerialNo,LockState,lockInfo);
//							redisService.set(SerialNo+"-LockState", newLockState);
//						}else{
//							redisService.set(SerialNo+"-LockState", lockInfo);
//							//NewLockInfor(SerialNo,lockInfo);
//						}
//
//						System.out.println("redissssssssss====="+LockState);
//					}
//				}else
//				//0x36获取主板信息
//				//0108
//				if(("36").equals(resp[9])){
//					//
//					String [] deviceArr = Arrays.copyOfRange(resp, 10, 22);
//					String [] versionInfoArr = Arrays.copyOfRange(resp, 22, 52);
//					String [] serialNoArr = Arrays.copyOfRange(resp, 52, 68);
//					//设备唯一编号
//					String deviceId = "";
//					for (String devices : deviceArr) {
//						deviceId+= devices;
//					}
//					System.out.println(deviceId);
//					//固件版本号
//					String versionInfo = HaxtoStr(versionInfoArr);
//					//序列号
//					String serialNo = HaxtoStr(serialNoArr).trim();
//					System.out.println("deviceId : " +deviceId);
//					System.out.println("versionInfo : " +versionInfo);
//					System.out.println("serialNo : " +serialNo);
//					String boardMsg = "设备唯一编码号:" + deviceId + "\t 固件版本号:" + versionInfo + "\t 序列号：" + serialNo;
//					res +=  "设备唯一编码号:" + deviceId + "\t 固件版本号:" + versionInfo + "\t 序列号：" + serialNo + "\t Session:" + session;
//					if(session!=null){
//						BoardInfo boardInfo = new BoardInfo();
//						boardInfo.set_deviceId(deviceId);
//						boardInfo.set_serialNo(serialNo);
//						boardInfo.set_version(versionInfo);
//						boardInfo.set_boardMsg(boardMsg);
//						session.setBoardInfo(boardInfo);
//						if(serialNo!=null){
//							session.setSessionId_id(serialNo);
//							LockTcpServer.getInfoMap().put(serialNo, session);
//							//infoMap.put(serialNo, session);
//						}
//					}
//
//			  	}else if(("38").equals(resp[9])){
//			  		String [] deviceArr = Arrays.copyOfRange(resp, 10, 22);
//					String [] versionInfoArr = Arrays.copyOfRange(resp, 22, 52);
//					//设备唯一编号
//					String deviceId = "";
//					for (String devices : deviceArr) {
//						deviceId+= devices;
//					}
//					System.out.println(deviceId);
//					//固件版本号
//					String versionInfo = HaxtoStr(versionInfoArr);
//					//序列号
//					System.out.println("deviceId : " +deviceId);
//					System.out.println("versionInfo : " +versionInfo);
//					String boardMsg = "设备唯一编码号:" + deviceId + "\t 固件版本号:" + versionInfo;
//					res +=  "设备唯一编码号:" + deviceId + "\t 固件版本号:" + versionInfo;
//			  	}
//			  	else {
//							res +="还未设置命令";
//			  	}
			  	if(session!=null){
							if(" ".equals(res))
							session.set_message(res);
							
			  	}

    	
    		return res;
    	
    }
    //========================工具类=======================
    //填0工具类
    public static String PadLeftRight(String str){
		if(str.length() <= 8){
			if(str.length()==8){
				return str;
			}else{
				int i=str.length();
				while (i<8) {
					str=str+"0";
					i++;
				}
				return str; 
			}
			 
		}else{
			return str;
		}
		
	}
    //唯一编号工具类
    public static String HaxtoStr(String[] s){//ASCII转换为字符串
    	String result = "";
    	try {
    		for (int i = 0; i < s.length; i++) {
    			int parseInt = Integer.parseInt(s[i], 16);
    			String str = Integer.toString(parseInt);
//    			if("0".equals(str)||"".equals(str)){
//    				result += "0";
//    			}
    			result += (char)Integer.parseInt(str);
    		}
			
		} catch (Exception e) {
			result = "转换出错";
		}
		  return result;
	}
    
    //16转换2
    public static String convertHexToBinary3(String hexString){
        long l = Long.parseLong(hexString, 16);
        String binaryString = Long.toBinaryString(l);
        int shouldBinaryLen = hexString.length()*4;
        StringBuffer addZero = new StringBuffer();
        int addZeroNum = shouldBinaryLen-binaryString.length();
        for(int i=1;i<=addZeroNum;i++){
            addZero.append("0");
        }
        return addZero.toString()+binaryString;
         
    }
    
    ///=========================main
    public static void main(String[] args) {
//    //	
//    		String abc = "7E 7E 00 16 00 00 00 00 61 34 41 43 35 00 01 64 7E 7E";
//    		String re = GetReponse(abc,null,null);
//    		System.out.println(re);
    }
    
    public  String LockInfor(String SerialNo,String OldLockInfor,String newLockInfor){
    	System.out.println("OldLockInfor:"+OldLockInfor);
    	System.out.println("newLockInfor:"+newLockInfor);
    	String[] OldLockInfors = OldLockInfor.split("-");
    	String[] newLockInfors = newLockInfor.split("-");
    	String state = "";
    	for(int i = 0;i<OldLockInfors.length;i++){
    		String Oldstate = "";
	    	String Newstate = "";
    		String OldLInfor = OldLockInfors[i];
    		String NewLInfor = newLockInfors[i];
			System.out.println("OldLInfor:"+OldLInfor+"    NewLInfor:"+NewLInfor);
    		String[] OldLInfors = OldLInfor.split(" ");
    		String[] NewLInfors = NewLInfor.split(" ");
    		System.out.println("OldLInfors[0]:"+OldLInfors[0]+"    NewLInfors[0]:"+NewLInfors[0]);
    		if(OldLInfors[0].equals(NewLInfors[0])){
    			Oldstate = Oldstate+OldLInfors[1].charAt(0);
    			Newstate = Newstate+NewLInfors[1].charAt(0);
    			System.out.println("Oldstate:"+Oldstate+"    Newstate:"+Newstate);
    			if(!Oldstate.equals(Newstate)){
    				state = state+NewLInfor+"-";
    				System.out.println("NewLInfor:"+NewLInfor);
    				String[] newLockTime = NewLInfor.split(":");
    				String lockSTime = newLockTime[1].substring(0,4)+"-"+newLockTime[1].substring(4,6)+"-"+newLockTime[1].substring(6,8)+" "+newLockTime[1].substring(8,10)+":"+newLockTime[1].substring(10,12)+":"+newLockTime[1].substring(12,14);
    				changeLockService.changeLockState(SerialNo,NewLInfors[0],lockSTime,Newstate);
    			}else if(Oldstate.equals(Newstate)){
    				state = state+OldLInfor+"-";
    			}
    		}
    	}
    	System.out.println("state:"+state);
    	return state;
    }
    /**
     * 数据库中没有此板子的信息时
     * @param SerialNo
     * @param LockInfor
     */
    public  void NewLockInfor(String SerialNo,String LockInfor){
    	String[] LInfors = LockInfor.split("-");
    	int n=0;
    	for (int i = 0; i < LInfors.length-1; i++){
    		n=n+1;
    		System.out.println("------n-------"+n+"=======LInfors.length======"+LInfors.length);
    		String[] LInfor = LInfors[i].split(" ");
    		String[] lockSandTime = LInfor[1].split(":");
    		String lockSTime = lockSandTime[1].substring(0,4)+"-"+lockSandTime[1].substring(4,6)+"-"+lockSandTime[1].substring(6,8)+" "+lockSandTime[1].substring(8,10)+":"+lockSandTime[1].substring(10,12)+":"+lockSandTime[1].substring(12,14);
    		changeLockService.changeLockState(SerialNo,LInfor[0],lockSTime,lockSandTime[0]);
    	}
    }
}

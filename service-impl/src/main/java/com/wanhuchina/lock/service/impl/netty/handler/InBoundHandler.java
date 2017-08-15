package com.wanhuchina.lock.service.impl.netty.handler;

import com.wanhuchina.lock.model.netty.Session;
import com.wanhuchina.lock.service.impl.netty.server.LockTcpServer;
import com.wanhuchina.lock.service.impl.netty.utils.ResponseBase;
import com.wanhuchina.lock.service.impl.netty.utils.SpringContextUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

	public class InBoundHandler extends SimpleChannelInboundHandler<byte[]> {  
		//Client请求日志
		private static final org.slf4j.Logger logger= LoggerFactory.getLogger(InBoundHandler.class);

		private ResponseBase responseBase = (ResponseBase) SpringContextUtil.getBean("responseBase");

		@Override  
	    public void channelActive(ChannelHandlerContext ctx) throws Exception {  
	        super.channelActive(ctx);  
	        String remoteAddress = getRemoteAddress(ctx);
	        logger.info("Client:"+remoteAddress+" 接入连接");
	        //全局唯一变量
	        String sessionID = Integer.toString(ctx.hashCode());
	        System.out.println("active:"+sessionID);
	        logger.info("sessionid:"+sessionID);
	        ///
	        //ChannelGroup
	        //放入Session中
	        Session session = new Session();
	        session.setSessionId_id(sessionID);
	        session.setConnectedTime(new Date());
	        session.set_channel(ctx.channel());
	        //加入全局map
	        LockTcpServer.getMap().put(sessionID,session);
//	        LockClientAction.cache.put(getIPString(ctx), ctx.channel());///测试用 上生产需要删除
	        String ipString = getIPString(ctx);
	        logger.info("ip:"+ipString);
	    }  
	  
//	    @Override  
//	    public void channelInactive(ChannelHandlerContext ctx) throws Exception {  
//	        //删除Channel Map中的失效Client  
//	    	LockTcpServer.getMap().remove(getIPString(ctx));     
//	        ctx.close();  
//	    }  
	  
	    @Override  
	    protected void channelRead0(ChannelHandlerContext ctx, byte[] msg)  
	            throws Exception { 
	    	
	        try {
				if(msg.length>=9){
					if(msg[9]==21){
						logger.info("设备心跳");
					}else{
						logger.info("来自设备的信息:"+LockTcpServer.bytesToHexString(msg));
						logger.info("ip:"+getIPString(ctx));
					}
				}else{
					logger.info("断包（读小包）");
					
				}
				//对指令进行处理!!!!!
				String bts = LockTcpServer.bytesToHexString(msg);
				String hashcode = Integer.toString(ctx.hashCode());
				System.out.println("read:"+hashcode);//删掉0113
				Map<String, Session> map = LockTcpServer.getMap();
				//这个session中有新的channel，经过下一步后有板子的序列号
				Session session = map.get(hashcode);
				//指令处理（这一步处理后 必有唯一编号,在GetResponse中处理）；经过这一步有了serialNo
				long startTime  = System.currentTimeMillis();
				responseBase.GetReponse(bts, session, ctx);
				long endTime = System.currentTimeMillis(); // 获取结束时间  
			    System.out.println("程序运行时间============>： " + (endTime - startTime) + "ms");  
				//序列号对应的map///这里很重要！！！
				Map<String, Session> infoMap = LockTcpServer.getInfoMap();
				//这个Session中有旧的channel，key是serialNo
				if(session.getBoardInfo()==null){
					System.out.println("到下面");
					return;
				}
				Session session2 = infoMap.get(session.getBoardInfo().get_serialNo());
				//将新的hashcolde放入Session，重点是新的hashcold中有最新的channel
				session2.setSessionId_id(hashcode);
				infoMap.put(session.getBoardInfo().get_serialNo(), session2);
				///
				Iterator<String> it = infoMap.keySet().iterator();
				while(it.hasNext()){
					String key = it.next();
					//查找新的hashcode中的序列号 对应 infoMap中的序列号，再将infoMap中的Session换乘最新的
					if((infoMap.get(key).getBoardInfo().get_serialNo()).equals(session.getBoardInfo().get_serialNo())){
						Session session3 = infoMap.get(key);
						session3.set_channel(session.get_channel());
					}
				}
				byte byteA3 = msg[11];
				byte[] addressDomain = new byte[5];
				System.arraycopy(msg, 7, addressDomain, 0, 5);  
				logger.info("地址为："+getIPString(ctx));
				if (byteA3==0) {  
					//logger.info("设备采集器无消息");
				}else{  
					//System.out.println("上述消息是从设备采集到的消息！");
					logger.info("上述消息是从设备采集到的消息！");
				}
			} catch (Exception e) {
				logger.info("channelRead0读错误"+e.getStackTrace());
				e.printStackTrace();
			}  
	        
	    }  
	      
	    @Override  
	    public void userEventTriggered(ChannelHandlerContext ctx, Object evt)  
	            throws Exception {  
	        String socketString = ctx.channel().remoteAddress().toString();  
	        //20170220
	        String hashcode = Integer.toString(ctx.hashCode());
	        System.out.println("read超时时候的hashcode:"+hashcode);//删掉0113
			Map<String, Session> map = LockTcpServer.getMap();
			//这个session中有新的channel，经过下一步后有板子的序列号
			Session session = map.get(hashcode);
			//////////////////////////////////////////
			if(session!=null){
				String SerialNo = session.getBoardInfo().get_serialNo();
				Map<String, Session> infoMap = LockTcpServer.InfoMap;
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String Date = sdf.format(new Date());
				session.setDisConnectedTime(Date);
				infoMap.put(SerialNo, session);
			}
	        if (evt instanceof IdleStateEvent) {  
	            IdleStateEvent event = (IdleStateEvent) evt;  
	            if (event.state() == IdleState.READER_IDLE) { 
	            	//解决重复key 0108
	            	logger.info("Client: "+socketString+" READER_IDLE 读超时");
	                ctx.close();
	            } else if (event.state() == IdleState.WRITER_IDLE) {  
	            	logger.info("Client: "+socketString+" WRITER_IDLE 写超时");
	                ctx.disconnect();  
	            } else if (event.state() == IdleState.ALL_IDLE) {  
	            	logger.info("Client: "+socketString+" ALL_IDLE 总超时");
	                ctx.disconnect();  
	            } 
	        }  
	    }  
	    
	    /**
	     * 捕获异常
	     * ssh 2017.02.03
	     */
	    
	    @Override
		public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
				throws Exception {
	    	 Channel incoming = ctx.channel();
	         if(!incoming.isActive()){
	        	 logger.error("SimpleClient:" + incoming.remoteAddress()
	        			 + "异常,读信道:"+incoming.isActive());
	        	 cause.printStackTrace();
	        	 ctx.close();
	        	 
	         }else{
	        	 logger.error("SimpleClient:" + incoming.remoteAddress()
	        			 + "异常,读信道:"+incoming.isActive());
	        	 cause.printStackTrace();
	        	 ctx.close();
	         }
		}

		public static String getIPString(ChannelHandlerContext ctx){  
	        String ipString = null;
			try {
				ipString = "";  
				String socketString = ctx.channel().remoteAddress().toString();  
				int colonAt = socketString.indexOf(":");  
				ipString = socketString.substring(1, colonAt);
				//logger.info("ipString: "+ipString);
			} catch (Exception e) {
				logger.error("ERROR: "+e);
				e.printStackTrace();
			}  
	        return ipString;  
	    }  
	      
	      
	    public static String getRemoteAddress(ChannelHandlerContext ctx){  
	        String socketString = null;
			try {
				socketString = "";  
				socketString = ctx.channel().remoteAddress().toString();
				logger.info("socketString: "+socketString);
			} catch (Exception e) {
				logger.error("ERROR: "+e);
				e.printStackTrace();
			}  
	        return socketString;  
	    }  
	  
	    protected String to8BitString(String binaryString) {  
	        int len = binaryString.length();  
	        for (int i = 0; i < 8-len; i++) {  
	            binaryString = "0"+binaryString;  
	        }  
	        return binaryString;  
	    }  
	  
	    protected static byte[] combine2Byte(byte[] bt1, byte[] bt2){  
	        byte[] byteResult = new byte[bt1.length+bt2.length];  
	        System.arraycopy(bt1, 0, byteResult, 0, bt1.length);  
	        System.arraycopy(bt2, 0, byteResult, bt1.length, bt2.length);  
	        return byteResult;  
	    }  
}

package com.wanhuchina.lock.service.impl.netty.handler;

import com.wanhuchina.lock.service.impl.netty.server.LockTcpServer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import org.slf4j.LoggerFactory;


public class OutBoundHandler extends ChannelOutboundHandlerAdapter {
	//响应日志
	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(OutBoundHandler.class);


	@Override
	public void write(ChannelHandlerContext ctx, Object msg,
					  ChannelPromise promise) throws Exception {
		
		if (msg instanceof byte[]) {
			byte[] bytesWrite = (byte[])msg;
			
			ByteBuf buf = ctx.alloc().buffer(bytesWrite.length);
			if(bytesWrite[17]==16){
				logger.info("心跳包反馈");
		        String hashcode = Integer.toString(ctx.hashCode());
		        System.out.println("out:"+hashcode);//删掉0113
			}else{
				logger.info("向设备下发的信息为："+ LockTcpServer.bytesToHexString(bytesWrite));
			}
			
			buf.writeBytes(bytesWrite);
			ctx.writeAndFlush(buf).addListener(new ChannelFutureListener(){
                @Override
                public void operationComplete(ChannelFuture future)
                        throws Exception {
                	System.out.println("是否下发："+future.isSuccess());
                	if(future.isSuccess()==true){
                		logger.info("下发成功！");
                	}else{
                		logger.info("下发失败！");
                	}
                }
            });
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
        			 + "异常,写信道:"+incoming.isActive());
        	 cause.printStackTrace();
        	 ctx.close();
        	 
         }else{
        	 logger.error("SimpleClient:" + incoming.remoteAddress()
        			 + "异常,写信道:"+incoming.isActive());
        	 cause.printStackTrace();
        	 ctx.close();
         }
	}
	
	
}
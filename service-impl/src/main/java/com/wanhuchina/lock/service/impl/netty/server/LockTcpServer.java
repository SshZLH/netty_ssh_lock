package com.wanhuchina.lock.service.impl.netty.server;

import com.wanhuchina.lock.model.netty.Session;
import com.wanhuchina.lock.service.impl.netty.handler.InBoundHandler;
import com.wanhuchina.lock.service.impl.netty.handler.OutBoundHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.bytes.ByteArrayEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class LockTcpServer {
		private static final Logger log= LoggerFactory.getLogger(LockTcpServer.class);
	 	private int port;  
	 	//1229 ssh
	    public static Map<String, Session> map = new ConcurrentHashMap<String, Session>();
	    //private static Map<String, ChannelHandlerContext> map2 = new ConcurrentHashMap<String, ChannelHandlerContext>();  
	    //序列号对应的缓存
	    public static Map<String, Session> InfoMap = new ConcurrentHashMap<String, Session>();  
	    
	    public LockTcpServer(){} 
	    
	    public void startServer() throws Exception{
	    	
			new LockTcpServer(5758).start();
	    }
	    
	    public LockTcpServer(int port){  
	        this.port = port;  
	    }  

		//启动服务 长期启动
	    public void start() throws Exception{  
	        EventLoopGroup bossGroup = new NioEventLoopGroup(1);  
	        EventLoopGroup workerGroup = new NioEventLoopGroup(1);  
	        try {  
	            ServerBootstrap b = new ServerBootstrap();  
	            b.group(bossGroup, workerGroup)  
	                    .channel(NioServerSocketChannel.class)  
	                    .option(ChannelOption.SO_BACKLOG, 10000)
	                    .option(ChannelOption.SO_REUSEADDR, true)
	                    .option(ChannelOption.SO_KEEPALIVE, true)
	                    .option(ChannelOption.TCP_NODELAY, true)
	                    .option(ChannelOption.SO_RCVBUF, 128)
	                    .option(ChannelOption.SO_SNDBUF, 128)
	                    .handler(new LoggingHandler(LogLevel.INFO))  
	                    .childHandler(new ChannelInitializer<SocketChannel>() { 
	                        @Override  
	                        public void initChannel(SocketChannel ch)  
	                                throws Exception {  
	                            //0110test
	                            ///ch.pipeline().addLast("bytesDecoder", new ByteArrayDecoder());  
	                             
	                        	///ch.pipeline().addLast("whcDecoder", new WhcDecoder());                           
	                        	ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(1024, 2, 2,0, 0,false));
	                        	ch.pipeline().addLast("bytesDecoder", new ByteArrayDecoder());
	                            ch.pipeline().addLast("bytesEncoder", new ByteArrayEncoder());                           
	                            ch.pipeline().addLast(new OutBoundHandler());
	                            //解决重复key 0108 
	                            ch.pipeline().addLast(new IdleStateHandler(20,0,300), new InBoundHandler());
	                         
	                        }  
	                    });  
	  
	            ChannelFuture server = b.bind(port);
	            if(server.isSuccess()){
	            	log.info(":---------server start------");
	            }
	           
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        } finally {  
	           
	        }  
	    }
	    /***
	     * map 缓存 存放句柄
	     * @return
	     */
	    public static Map<String, Session> getMap() {
			return map;
		}

		public static void setMap(Map<String, Session> map) {
			LockTcpServer.map = map;
		}
		
		/**
		 * info 缓存  存放序列号为key的session
		 * 
		 */
		public static Map<String, Session> getInfoMap() {
			return InfoMap;
		}

		public static void setInfoMap(Map<String, Session> infoMap) {
			InfoMap = infoMap;
		} 
	    /**
	     * bytes To Hex return String
	     * @param src
	     * @return 
	     */
	    
	    public static String bytesToHexString(byte[] src){         
	        StringBuilder stringBuilder = new StringBuilder();         
	        if (src == null || src.length <= 0) {         
	            return null;         
	        }         
	        for (int i = 0; i < src.length; i++) {         
	            int v = src[i] & 0xFF;         
	            String hv = Integer.toHexString(v).toUpperCase();         
	            if (hv.length() < 2) {         
	                stringBuilder.append(0);         
	            }         
	            stringBuilder.append(hv);   
	            stringBuilder.append(' ');  
	        }         
	        return stringBuilder.toString();         
	    }
 
}

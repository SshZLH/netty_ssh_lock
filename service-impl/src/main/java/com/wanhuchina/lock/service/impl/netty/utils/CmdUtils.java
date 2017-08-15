package com.wanhuchina.lock.service.impl.netty.utils;

import org.apache.log4j.Logger;



public class CmdUtils {
	//第2至第33字节为30个字符SSID(转成16进制数ASCII码发送)结束时补写5C 30,第34至第97字节为62个字符密码(转成16进制数ASCII码发送) 结束时补写5C 30,,
	static Logger log = Logger.getLogger("FocusLog");
    public static byte[] SetAPInfo(String ssid, String pass, byte[] dat){
    	
    	try {
			byte[] names = StringToASCII.showIntArray(ssid);
			byte[] passes = StringToASCII.showIntArray(pass);
			byte[] end = new byte[] { 0x5c, 0x30 };
			//dat = new byte[96];
			for(int i=0;i<dat.length;i++){
				  
				dat[i] = 00;
			}
			for (int i=0;i<names.length;i++){
				dat[i]=names[i];
			}
			int n=0;
			for (int i = names.length;i<names.length+2;i++){
				dat[i] = end[n];
				n=n+1;
			}
			int p = 0;
			for (int i = 32;i<32+passes.length;i++){
				dat[i] = passes[p];
				p=p+1;
			}
			int pa = 0;
			for(int i = 32+passes.length ;i<32+passes.length+2;i++ ){
				dat[i] = end[pa];
				pa=pa+1;
			}
		} catch (Exception e) {
			log.error("ERROR:"+e);
			e.printStackTrace();
		}
		log.info("dat:"+dat);
    	return dat;
    }
    
    

  //第2至第33字节为32个字符SSID 结束时补写5C 30,第34至第97字节为64个字符密码结束时补写5C 30,第98字节为通道号;第99字节为加密方式, 
    public static byte[] SetRouterInfo(String ssid, String pass, String chan, String enryMod, byte[] dat){
        
    	try {
			byte[] names = StringToASCII.showIntArray(ssid);;
			byte[] passes = StringToASCII.showIntArray(pass);
			byte[] channel = StringToASCII.showIntArray(chan);
			byte[] enryMode = StringToASCII.showIntArray(enryMod);
			byte[] end = new byte[] { 0x5c, 0x30 };
			for(int i=0;i<dat.length;i++){
			  
				dat[i] = 0;
			}
			
			for (int i=0;i<names.length;i++){
				dat[i]=names[i];
			}
			
			int n=0;
			for (int i = names.length;i<names.length+2;i++){
				dat[i] = end[n];
				n=n+1;
			}
			
			int p = 0;
			for (int i = 32;i<32+passes.length;i++){
				dat[i] = passes[p];
				p=p+1;
			}
			
			int pa = 0;
			for(int i = 32+passes.length ;i<32+passes.length+2;i++ ){
				dat[i] = end[pa];
				pa=pa+1;
			}
			int c = 0;
			for(int i = 96;i<96+channel.length;i++){
				dat[i] = channel[c];
				c=c+1;
			}
			int e = 0;
			for(int i = 97;i<97+enryMode.length;i++){
				dat[i] = enryMode[e];
				e=e+1;
			}
		} catch (Exception e) {
			log.error("ERROR:"+e);
			e.printStackTrace();
		}
		log.info("dat:"+dat);
    	return dat;
    }
//设置再开机无线热点信�?0x03: SetAPInfo: whc-2.4:Whc-027827
//    public static void main(String[] args) {
//      byte[] dat = new byte[96];
//      String ssid = "whc-2.4";
//      String pass = "Whc-027827";
//    	SetAPInfo(ssid,pass,dat);
//    	byte[] dat = new byte[98];
//    	String ssid = " OpenDoor";
//    	String pass = " 1";
//    	String chan = " ";
//    	String enryMod  = " ";
//    	SetAPInfo(ssid,pass,dat);
//    	SetRouterInfo(ssid,pass,chan,enryMod,dat);
//	}
   
}

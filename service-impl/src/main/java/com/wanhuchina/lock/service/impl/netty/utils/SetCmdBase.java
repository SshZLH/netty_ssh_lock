package com.wanhuchina.lock.service.impl.netty.utils;

public class SetCmdBase {
	 byte[] header = new byte[] { 0x7e, 0x7e };      //2
     byte[] valid = new byte[] { 0x00, 0x00 };
     byte[] reserve = new byte[] { 0x00, 0x00, 0x00, 0x00 };
     byte[] type = new byte[] { 0x61 };
     byte[] defcode = new byte[] { 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37 };       //默认码
           
     byte[] tail = new byte[] { 0x7e, 0x7e };
     
     public SetCmdBase()
     {

     }
     public byte[] SetCommand(byte[] cmd, byte[] dat)
     {
    	 byte[] command = new byte[] { 0x00 };
         command = cmd;
         
         byte[] valid = getValid(dat);
         byte[] checkSum = getCheckSum(dat,valid,command);
         byte[] getCommand = GetCommand(dat, checkSum,valid,command);
        return getCommand;
     }
     public void SetValid(byte[] val)
     {  
         valid = val;

     }
     //19位固定个数ge+18号N个数据位; 2号-有效字节数高位：2号至21号字节个数相加得到的16进制数的高位部分: 
     //3号-有效字节数低位：2号至21号字节个数相加得到的16进制数的低位部分。
     public byte[] getValid(byte[] data)
     {
         int lenth = 19 + data.length;
         String lenHex = Integer.toHexString(lenth);
         
         if (lenHex.length() <= 2)
         {
             valid[0] = 0x00;
             valid[1] = StringUtils.StringHaxtoByte(lenHex) ;
         }
         else
         {
             String high = lenHex.length() == 3 ? lenHex.substring(0, 1) : lenHex.substring(lenHex.length() - 4, 2); ;
             valid[0] = StringUtils.StringHaxtoByte(high);
             String low = lenHex.substring(lenHex.length() - 2, lenHex.length());
             valid[1] = StringUtils.StringHaxtoByte(low); 

         }
         return valid;
     }

     //0x00-0xFF（2号至18号相加）高8位。
     public byte[] getCheckSum(byte[] data,byte[] valid,byte[] command){
    	 byte[] checkSum = new byte[] { 0x00,0x00,0x00 };
         int sum = 0;
         for (int i = 0; i < valid.length; i++){
        	 sum += valid[i];
        	 } 
         for (int i = 0; i < reserve.length; i++){
        	 sum += reserve[i];
         } 
         for (int i = 0; i < type.length; i++){
        	 sum += type[i];
         } 
         for (int i = 0; i < defcode.length; i++){
        	 sum += defcode[i];
         } 
         for (int i = 0; i < command.length; i++){
        	 sum += command[i];
         } 
         for (int i = 0; i < data.length; i++){
        	 if(data[i]>=0){
        		 sum += data[i]; 
        	 }else{
        		 sum += 256+data[i];
        	 }
         } 
         String sumHex = Integer.toHexString(sum); 
         if (sumHex.length()<=2) {
             checkSum[0] = 0x00;
             checkSum[1] = 0x00;
             checkSum[2] =  StringUtils.StringHaxtoByte(sumHex) ;
            
         }
         else if (sumHex.length() <= 4)  //ok
         {
             checkSum[0] = 0x00;
             String mid = sumHex.length() == 3 ? sumHex.substring(0, 1) : sumHex.substring(0, 2);
             checkSum[1] =  StringUtils.StringHaxtoByte(mid);
             String low = sumHex.substring(sumHex.length() - 2, sumHex.length());
             checkSum[2] = StringUtils.StringHaxtoByte(low); 
         }
         else 
         {
        	 
             String high = sumHex.length() == 5 ? sumHex.substring(0, 1) : sumHex.substring(sumHex.length() - 6, 4);
             checkSum[0] = StringUtils.StringHaxtoByte(high);
             String mid = sumHex.substring(sumHex.length() - 4, sumHex.length() - 2);
             checkSum[1] = StringUtils.StringHaxtoByte(mid);
             String low = sumHex.substring(sumHex.length() - 2, sumHex.length());
             checkSum[2] = StringUtils.StringHaxtoByte(low);
         }
         return checkSum;
     }

     public byte[] GetCommand(byte[] data,byte[] checkSum,byte[] valid,byte[] command){
    	
    	 byte[] all = new byte[18  + data.length + 5];
    	 
    	 for(int i=0;i<header.length;i++){
     		all[i] = header[i];
     	}
     	int n=0;
     	for(int i=2;i<2+valid.length;i++){
     		all[i] = valid[n];
     		n++;
     	}
     	int a=0;
     	for(int i = 4;i<4+reserve.length;i++){
     		all[i] = reserve[a];
     		a++;
     		
     	}
     	int b=0;
     	for(int i = 8;i<8+type.length;i++){
     		all[i] = type[b];
     		b++;
     	}
     	int c=0;
     	for(int i = 9;i<9+defcode.length;i++){
     		all[i] = defcode[c];
     		c++;
     	}
     	int d=0;
     	for(int i = 17;i<18;i++){
     		all[i] = command[d];
     		d++;
     	}
     	int e = 0;
     	for(int i = 18;i<18+data.length;i++){
     		all[i] = data[e];
     		e++;
     	}
     	int f = 0;
     	for(int i = 18 + data.length;i<18+data.length+checkSum.length;i++){
     		all[i] = checkSum[f];
     		f++;
     	}
     	int g=0;
     	for(int i = 21+data.length;i<21+data.length+tail.length;i++){
     		all[i] = tail[g];
     		g++;
     	}
         
         return all;
     }

}

package com.wanhuchina.lock.service.impl.netty.utils;

public class RandomCode {
	/**
	 * 
	 * @param len
	 * @return 一个字符串
	 */
	public static String generateRandomStr(int n) {
	    //字符源，可以根据需要删减
	    String generateSource = "1234567890";
	    String rtnStr = "";
	    for (int i = 0; i < n; i++) {
	        //循环随机获得当次字符，并移走选出的字符
	        String nowStr = String.valueOf(generateSource.charAt((int) Math.floor(Math.random() * generateSource.length())));
	        rtnStr += nowStr;
	        generateSource = generateSource.replaceAll(nowStr, "");
	    }
	    return rtnStr;
	}
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++ ){
			String generateRandomStr = generateRandomStr(4);
			System.out.println(generateRandomStr);
		}
		
		
		
	}
}

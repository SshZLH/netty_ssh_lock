package com.wanhuchina.lock.service;

import com.wanhuchina.common.exception.CommonException;

import java.util.List;

public interface CommandService {
	/**
	 * 控制下发各种指令的service
	 * @return
	 */
	void CommandBoard(String sltCommand, String SerialNo, String sltSessionIDs) throws CommonException;

	/***
	 * ajax传递list
	 * 同时也有删除缓存中的冗余数据
	 */
	List<String> MapToList() throws CommonException;
	
	/***
	 * ajax传递SerialNolist
	 * 同时也有删除缓存中的冗余数据
	 */
	List<String> BoardSerialNos() throws CommonException;
	
	
	/***
	 * ajax传递msglock
	 * 
	 */
	String geLockMsg();
	
	/***
	 * ajax传递板卡信息
	 * 
	 */
	String getMessage();
}

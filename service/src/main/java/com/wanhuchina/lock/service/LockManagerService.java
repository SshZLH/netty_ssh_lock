package com.wanhuchina.lock.service;

import com.wanhuchina.common.exception.CommonException;

public interface LockManagerService {
	/**
	 * 开门-一键开锁
	 * 有向数据库操作 querytime
	 */
	int OpenLock(String requestOpenDoorStr) throws CommonException;
	
	/**
	 * 
	 * //预定柜子时设置密码
	 */
	int createPassword(String SetPadPass) throws CommonException;
	

}

package com.wanhuchina.lock.service;

import com.wanhuchina.common.exception.CommonException;

public interface ChangeLockService {
	/**
	 */
	
	void changeLockState(String cabinetNo, String cabinetDoorNo, String stateTime, String stateLock) throws CommonException;
}

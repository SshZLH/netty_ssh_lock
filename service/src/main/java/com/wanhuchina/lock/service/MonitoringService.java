package com.wanhuchina.lock.service;

import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.lock.model.common.CabinetInfo;

import java.util.List;


public interface MonitoringService {
	/**
	 * 实时监控的业务层
	 * @return
	 * @throws Exception
	 */
	List<CabinetInfo> GainInfo() throws CommonException;
	
	/**
	 * 实时监控未通讯板子
	 */
	List<CabinetInfo> GainNotInfo() throws CommonException;
}

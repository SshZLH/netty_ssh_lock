package com.wanhuchina.lock.model.common;

import com.wanhuchina.lock.model.base.BaseDO;

public class DBresult  extends BaseDO {
	private String CABINET_NO;
	private String WAHO_NAME;
	private String WAHO_STATUS;
	public String getCABINET_NO() {
		return CABINET_NO;
	}
	public void setCABINET_NO(String cABINETNO) {
		CABINET_NO = cABINETNO;
	}
	public String getWAHO_NAME() {
		return WAHO_NAME;
	}
	public void setWAHO_NAME(String wAHONAME) {
		WAHO_NAME = wAHONAME;
	}
	public String getWAHO_STATUS() {
		return WAHO_STATUS;
	}
	public void setWAHO_STATUS(String wAHOSTATUS) {
		WAHO_STATUS = wAHOSTATUS;
	}
	@Override
	public String toString() {
		return "DBresult [CABINET_NO=" + CABINET_NO + ", WAHO_NAME="
				+ WAHO_NAME + ", WAHO_STATUS=" + WAHO_STATUS + "]";
	}

	
}

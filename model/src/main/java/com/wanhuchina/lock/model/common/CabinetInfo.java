package com.wanhuchina.lock.model.common;

import com.wanhuchina.lock.model.base.BaseDO;

public class CabinetInfo extends BaseDO {
	private String serialNo;//板子编号
	private String DisConnectedTime;//断线时间
	private String WohoName;//门店名称
	private long index;
	private String wahoStatus;//门店启用状态 1停用 2启用
	private String connectionStatu;//连接状态 连接 断开
	private String LockOpened;//打开的门
	private String LockClosed;//打开的门
	private String DownTime;
	
	
	
	
	public String getDownTime() {
		return DownTime;
	}
	public void setDownTime(String downTime) {
		DownTime = downTime;
	}
	public String getLockOpened() {
		return LockOpened;
	}
	public void setLockOpened(String lockOpened) {
		LockOpened = lockOpened;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getDisConnectedTime() {
		return DisConnectedTime;
	}
	public void setDisConnectedTime(String disConnectedTime) {
		DisConnectedTime = disConnectedTime;
	}
	public String getWohoName() {
		return WohoName;
	}
	public void setWohoName(String wohoName) {
		WohoName = wohoName;
	}
	public long getIndex() {
		return index;
	}
	public void setIndex(long index) {
		this.index = index;
	}
	public String getWahoStatus() {
		return wahoStatus;
	}
	public void setWahoStatus(String wahoStatus) {
		this.wahoStatus = wahoStatus;
	}
	public String getConnectionStatu() {
		return connectionStatu;
	}
	public void setConnectionStatu(String connectionStatu) {
		this.connectionStatu = connectionStatu;
	}
	
	public String getLockClosed() {
		return LockClosed;
	}
	public void setLockClosed(String lockClosed) {
		LockClosed = lockClosed;
	}
	@Override
	public String toString() {
		return "CabinetInfo [DisConnectedTime=" + DisConnectedTime
				+ ", DownTime=" + DownTime + ", LockClosed=" + LockClosed
				+ ", LockOpened=" + LockOpened + ", WohoName=" + WohoName
				+ ", connectionStatu=" + connectionStatu + ", index=" + index
				+ ", serialNo=" + serialNo + ", wahoStatus=" + wahoStatus + "]";
	}
	


	

	
	
}

package com.wanhuchina.lock.model.netty;

import com.wanhuchina.lock.model.base.BaseDO;

import java.util.Arrays;

public class BoardInfo  extends BaseDO {
    private String _serialNo;   //主板序列号
    private String _deviceId ;   //设备唯一号
    private String _version;   //版本号
    private byte[] _locksInfo = new byte[24];
    private String _lockMsg; //锁子状态
    private String _boardMsg;//板子信息包括123
    
    
	public String get_boardMsg() {
		return _boardMsg;
	}
	public void set_boardMsg(String boardMsg) {
		_boardMsg = boardMsg;
	}
	public String get_serialNo() {
		return _serialNo;
	}
	public void set_serialNo(String serialNo) {
		_serialNo = serialNo;
	}
	public String get_deviceId() {
		return _deviceId;
	}
	public void set_deviceId(String deviceId) {
		_deviceId = deviceId;
	}
	public String get_version() {
		return _version;
	}
	public void set_version(String version) {
		_version = version;
	}
	public byte[] get_locksInfo() {
		return _locksInfo;
	}
	public void set_locksInfo(byte[] locksInfo) {
		_locksInfo = locksInfo;
	}
	public String get_lockMsg() {
		return _lockMsg;
	}
	public void set_lockMsg(String lockMsg) {
		_lockMsg = lockMsg;
	}
	@Override
	public String toString() {
		return "BoardInfo [_deviceId=" + _deviceId + ", _lockMsg=" + _lockMsg
				+ ", _locksInfo=" + Arrays.toString(_locksInfo)
				+ ", _serialNo=" + _serialNo + ", _version=" + _version + "]";
	}
    
    
}

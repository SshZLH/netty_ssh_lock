package com.wanhuchina.lock.model.netty;

import com.wanhuchina.lock.model.base.BaseDO;
import io.netty.channel.Channel;

import java.util.Date;

/// <summary>
/// 客户端与服务器之间的会话类
/// 版本: 1.1
/// 替换版本: 1.0
/// 说明:
/// 会话类包含远程通讯端的状态,这些状态包括Socket,报文内容,
/// 客户端退出的类型(正常关闭,强制退出两种类型)
/// </summary>
public class Session  extends BaseDO {
	// / <summary>
	// / 会话ID
	// / </summary>
	private String SessionId_id;
	// / <summary>
	// / 客户端发送到服务器的报文
	// / 注意:在有些情况下报文可能只是报文的片断而不完整
	// / </summary>
	// private String _datagram; // 客户端发送到服务器的报文
	private String _message; // 返回session的消息
	private Channel _channel; // 客户端的Socket通道

	// private ExitType _exitType; // 客户端的退出类型 (正常退出、异常退出）

	private Date connectedTime; // 连接时间
	private String disConnectedTime; //不需要，中断后将删除本session
	// private byte[] _dataRow = new byte[1024]; //原始数据
	private String _deviceId; // 设备唯一ID；
	// 板子的信息
	private BoardInfo boardInfo;

	// 退出类型枚举
	public enum ExitType {
		NormalExit, ExceptionExit
	};

	public String getSessionId_id() {
		return SessionId_id;
	}

	public void setSessionId_id(String sessionIdId) {
		SessionId_id = sessionIdId;
	}


	public String get_message() {
		return _message;
	}

	public void set_message(String message) {
		_message = message;
	}


	public Channel get_channel() {
		return _channel;
	}

	public void set_channel(Channel channel) {
		_channel = channel;
	}

	public Date getConnectedTime() {
		return connectedTime;
	}

	public void setConnectedTime(Date connectedTime) {
		this.connectedTime = connectedTime;
	}

	public String get_deviceId() {
		return _deviceId;
	}

	public void set_deviceId(String deviceId) {
		_deviceId = deviceId;
	}

	// / <summary>
	// / 关闭会话
	// / </summary>
	public void Close() {
		if (_channel != null)
			;
		_channel.close();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((_channel == null) ? 0 : _channel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		if (_channel == null) {
			if (other._channel != null)
				return false;
		} else if (!_channel.equals(other._channel))
			return false;
		return true;
	}

	public BoardInfo getBoardInfo() {
		return boardInfo;
	}

	public void setBoardInfo(BoardInfo boardInfo) {
		this.boardInfo = boardInfo;
	}

	public String getDisConnectedTime() {
		return disConnectedTime;
	}

	public void setDisConnectedTime(String disConnectedTime) {
		this.disConnectedTime = disConnectedTime;
	}

	
}

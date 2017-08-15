package com.wanhuchina.lock.service.impl;

import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.lock.dao.SerialNoInfoMapper;
import com.wanhuchina.lock.model.common.CabinetInfo;
import com.wanhuchina.lock.model.common.DBresult;
import com.wanhuchina.lock.model.netty.Session;
import com.wanhuchina.lock.service.MonitoringService;
import com.wanhuchina.lock.service.impl.netty.server.LockTcpServer;
import com.wanhuchina.lock.service.redis.RedisService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;




@Service("monitoringService")
public class MonitoringServiceImpl implements MonitoringService {
	private static final org.slf4j.Logger log= LoggerFactory.getLogger(MonitoringServiceImpl.class);
	//notOnlineMap;
	public static Map<String,String> notOnlineMap = new HashMap<String, String>();
	
	@Resource
	private RedisService jedisDao;
	
	@Resource
	private SerialNoInfoMapper serialNoInfoMapper;//这里调出来的数据是数据库中有的数据
	
	@Override
	public List<CabinetInfo> GainInfo()  throws CommonException {
		List<CabinetInfo> InfoList = new ArrayList<CabinetInfo>();
		Map<String, Session> infoMap = LockTcpServer.InfoMap;
		//Map<String, String> DBinfoMap = null;
		CabinetInfo cabinetInfo = new CabinetInfo();
		List<DBresult> selAllInfo = serialNoInfoMapper.selAllInfo();
		System.out.println("=============="+selAllInfo);
		//将List对象转换成键值对 方便查询和控制
		Map<String, String> DBinfoMap = new HashMap<String, String>();
		for(int i=0;i<=selAllInfo.size()-1;i++){
		
				DBresult dBresult = selAllInfo.get(i);
				String cabiNo = dBresult.getCABINET_NO();
				String wahoName = dBresult.getWAHO_NAME();//门店名称
				String wahoStatus = dBresult.getWAHO_STATUS();//门店状态 1停用 2启用
		        DBinfoMap.put(cabiNo, wahoName+"-"+wahoStatus);
		}
		//所有板子
		notOnlineMap = DBinfoMap;
		
		for(Entry<String, Session> entry:infoMap.entrySet()){
			Session session = entry.getValue();
			if(session.get_channel().isActive()==false){
				//通道已关闭或不活动 则statu为不在线
				cabinetInfo.setSerialNo(entry.getKey());//序列号
				cabinetInfo.setConnectionStatu("断线");//连接状态
				String disConnectedTime = infoMap.get(entry.getKey()).getDisConnectedTime();//断线时间
				cabinetInfo.setDisConnectedTime(disConnectedTime);//断线时间
				String downTime = null;//断线时长
				try {
					downTime = DownTime(disConnectedTime);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				cabinetInfo.setDownTime(downTime);
				if(DBinfoMap.get(entry.getKey()) != null){
					cabinetInfo.setWohoName(DBinfoMap.get(entry.getKey()).split("-")[0]);
					if(("1").equals(DBinfoMap.get(entry.getKey()).split("-")[1])){
						cabinetInfo.setWahoStatus("停用");
					}else if(("2").equals(DBinfoMap.get(entry.getKey()).split("-")[1])){
						cabinetInfo.setWahoStatus("启用");
					}else if(("null").equals(DBinfoMap.get(entry.getKey()).split("-")[1])){
						cabinetInfo.setWahoStatus("");
					}
				}else{
					cabinetInfo.setWohoName("");
					cabinetInfo.setWahoStatus("");
				}
			}else{
				//否则 statu为在线
				cabinetInfo.setSerialNo(entry.getKey());//序列号
				cabinetInfo.setConnectionStatu("正常");//连接状态
				cabinetInfo.setDisConnectedTime("");//断线时间
				cabinetInfo.setDownTime("");
				if(DBinfoMap.get(entry.getKey()) != null){
					if(("null").equals(DBinfoMap.get(entry.getKey()).split("-")[0])){
						cabinetInfo.setWohoName("");
					}else{
						cabinetInfo.setWohoName(DBinfoMap.get(entry.getKey()).split("-")[0]);
					}
					if(("1").equals(DBinfoMap.get(entry.getKey()).split("-")[1])){
						cabinetInfo.setWahoStatus("停用");
					}else if(("2").equals(DBinfoMap.get(entry.getKey()).split("-")[1])){
						cabinetInfo.setWahoStatus("启用");
					}else if(("null").equals(DBinfoMap.get(entry.getKey()).split("-")[1])){
						cabinetInfo.setWahoStatus("");
					}
				}else{
					cabinetInfo.setWohoName("");
					cabinetInfo.setWahoStatus("");
				}
			}
			String LockInfoState = jedisDao.get(entry.getKey()+"-LockState");
			String LockStatus = LockStateCompUtil(LockInfoState);
			String LockOpened = LockStatus.split("-")[0];
			String LockClosed = LockStatus.split("-")[1];
			cabinetInfo.setLockOpened(LockOpened);
			cabinetInfo.setLockClosed(LockClosed);
			
			notOnlineMap.remove(entry.getKey());
			InfoList.add(cabinetInfo);
			System.out.println("InfoList:"+InfoList);
		}
		return InfoList;
	}
	/**
	 * 未通讯板子业务
	 */
	@Override
	public List<CabinetInfo> GainNotInfo() throws CommonException {
		List<CabinetInfo> notOnlineList = new ArrayList<CabinetInfo>();
		Map<String, String> notOnlineMap = MonitoringServiceImpl.notOnlineMap;
		for(Entry<String, String> entry:notOnlineMap.entrySet()){
			CabinetInfo cabinetInfo = new CabinetInfo();
			cabinetInfo.setSerialNo(entry.getKey());
			if(!("null").equals(entry.getValue().split("-")[0])){
				cabinetInfo.setWohoName(entry.getValue().split("-")[0]);
				if(entry.getValue().split("-")[1].equals("2")){					
					cabinetInfo.setWahoStatus("启用");
				}else if(entry.getValue().split("-")[1].equals("1")){
					cabinetInfo.setWahoStatus("停用");
				}
			}else{
				cabinetInfo.setWohoName("");
				cabinetInfo.setWahoStatus("");
			}
			notOnlineList.add(cabinetInfo);
		}
		System.out.println("notOnlineList:"+notOnlineList);
		return notOnlineList;
	}
	/**
	 * 这里取出所有开着的门的柜体
	 * @param LockInfoState
	 * @return
	 */
	private   String LockStateCompUtil(String LockInfoState){
		String openedLock = " ";
		String closedLock = " ";
		String lockStatus = "";
		if(LockInfoState != null){
			String[] split = LockInfoState.split("-");
			for (String string : split) {
				if(string.indexOf("开")!=-1){
					openedLock += string.split(" ")[0]+",";
				}else if(string.indexOf("锁")!=-1){
					closedLock += string.split(" ")[0]+",";
				}
			}
			lockStatus = openedLock+"-"+closedLock;
		}
		return lockStatus;
		
	}
	
	/**
	 * 获取当机后的持续时间
	 * @param disConnectedTime
	 * @return
	 * @throws ParseException 
	 */
	private  String DownTime(String disConnectedTime) throws ParseException{
		String DownTime = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date disConTime = sdf.parse(disConnectedTime);
		Date nowTime = new Date();
	    long diff = nowTime.getTime() - disConTime.getTime();//这样得到的差值是微秒级别  
	    long days = diff / (1000 * 60 * 60 * 24);  
	    long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);  
	    long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60); 
	    DownTime +=""+days+"天"+hours+"小时"+minutes+"分";
		return DownTime;
	}
}

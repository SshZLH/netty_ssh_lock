package com.wanhuchina.lock.service.impl;

import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.lock.dao.WeigateCabinetMapper;
import com.wanhuchina.lock.model.cabinet.WeigateCabinet;
import com.wanhuchina.lock.model.cabinet.WeigateCabinetExample;
import com.wanhuchina.lock.model.cabinet.WeigateCabinetExample.Criteria;
import com.wanhuchina.lock.service.ChangeLockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



@Service("changeLockService")
public class ChangeLockServiceImpl implements ChangeLockService  {
	
	@Resource
	private WeigateCabinetMapper weigateCabinetMapper;
	
	@Override
	public void changeLockState(String cabinetNo, String cabinetDoorNo,
			String stateTime, String stateLock)  throws CommonException {
		System.out.println("*****************************************************");
		System.out.println("cabinetNo="+cabinetNo+",cabinetDoorNo"+cabinetDoorNo);
		WeigateCabinet weigateCabinet = new WeigateCabinet();
		weigateCabinet.setCabinetNo(cabinetNo);
		weigateCabinet.setCabinetDoorNo(cabinetDoorNo);
		WeigateCabinet cabinet = weigateCabinetMapper.selByCabinetNoAndCabinetDoorNo(weigateCabinet);

		System.out.println("测试测试测试测试测试测试测试测试测试测试"+cabinet);
		if(cabinet!=null){
			WeigateCabinetExample example = new WeigateCabinetExample();
			Criteria criteria = example.createCriteria();
			//条件
			criteria.andCabinetIdEqualTo(cabinet.getCabinetId());
			
			if(stateLock.equals("开")){
//				cabinet.setCabinet_open_time(stateTime);
//				cabinet.setCabinet_clos_time("");
//				cabinet.setCabinet_state_lock("0");
				cabinet.setCabinetOpenTime(stateTime);
				cabinet.setCabinetClosTime("");
				cabinet.setCabinetStateLock("0");
				System.out.println("==========================");
				System.out.println("==========================>"+cabinet.getCabiId());
				//cabinetMapper.updByLockSome(cabinet);
				weigateCabinetMapper.updateByExampleSelective(cabinet, example);
			}else if(stateLock.equals("锁")){
//				cabinet.setCabinet_open_time(cabinet.getCabinet_open_time());
//				cabinet.setCabinet_clos_time(stateTime);
//				cabinet.setCabinet_state_lock("1");
				cabinet.setCabinetOpenTime(cabinet.getCabinetOpenTime());
				cabinet.setCabinetClosTime(stateTime);
				cabinet.setCabinetStateLock("1");
				weigateCabinetMapper.updateByExampleSelective(cabinet, example);
				//cabinetMapper.updByLockSome(cabinet);
			}
		}
	}

}

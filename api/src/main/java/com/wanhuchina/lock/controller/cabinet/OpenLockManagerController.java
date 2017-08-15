package com.wanhuchina.lock.controller.cabinet;


import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.common.util.zk.ZkPropertyUtil;
import com.wanhuchina.lock.controller.SignUtil;
import com.wanhuchina.lock.model.common.CabinetInfo;
import com.wanhuchina.lock.service.LockManagerService;
import com.wanhuchina.lock.service.MonitoringService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/lock/auto")
public class OpenLockManagerController {
	private static final org.slf4j.Logger log= LoggerFactory.getLogger(OpenLockManagerController.class);
	//private String requestOpenDoorStr;
	@Resource
	private LockManagerService lockManagerService;

	@Resource
	private MonitoringService monitoringService;

	//一键开锁
	@RequestMapping(value = "/openLock" , method = RequestMethod.POST)
	public TxResultResponse OpenLock(@RequestParam String requestOpenDoorStr,@RequestParam String combineString){
		String key = ZkPropertyUtil.get("signKeyByOpenCabinet");
		TxResultResponse response = new TxResultResponse(CommonCode.SUCCESS,"操作成功");

           boolean result = SignUtil.getSign( requestOpenDoorStr,  key,  combineString);
            if (result == true){

				try {
					System.out.println("lockManagerService:"+lockManagerService.toString());
					Integer index = lockManagerService.OpenLock(requestOpenDoorStr);
					if(index==0){
                        return response;
                    }else{
                        return new TxResultResponse(CommonCode.DATA_NOT_FOUND,"参数错误");
                    }
				} catch (CommonException e) {
					return new TxResultResponse(e.getCode(),e.getMsg());
				} catch (Exception e){
					e.getMessage();
					return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"接口内部错误");
				}

			}else {
                return new TxResultResponse(CommonCode.DATA_NOT_FOUND.getCode(),"秘钥错误");
            }

	}
	//预定柜子时设置密码
	@RequestMapping(value = "/createPassword" , method = RequestMethod.POST)
	public TxResultResponse CreatePassword(@RequestParam String SetPadPass){
		TxResultResponse response = new TxResultResponse(CommonCode.SUCCESS,"操作成功");

		try {
			int index = lockManagerService.createPassword(SetPadPass);

			if(index==0){
                return response;
            }else{
                return new TxResultResponse(CommonCode.DATA_NOT_FOUND,"参数错误");
            }
		} catch (CommonException e) {
			e.printStackTrace();
			return new TxResultResponse(e.getCode(),e.getMsg());
		} catch (Exception e){
			return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"接口内部错误");
		}
	}
	
	
	/**
	 * 实时监控功能 
	 * ssh
	 */
	@RequestMapping(value = "/monitoring" , method = RequestMethod.POST)
	@ResponseBody
	public List<CabinetInfo> Monitoring(){
		List<CabinetInfo> gainInfo = null;
		try {
			gainInfo = monitoringService.GainInfo();
		} catch (Exception e) {
			log.debug("Monitoring接口错误:"+e.getMessage());
			e.printStackTrace();
		}
		return gainInfo;
		
	}
	/**
	 * 实时监控未通讯 
	 * ssh
	 */
	@RequestMapping(value = "/notonLine" , method = RequestMethod.POST)
	@ResponseBody
	public List<CabinetInfo> MonitoringNot(){
		List<CabinetInfo> gainNotInfo = null;
		try {
			gainNotInfo = monitoringService.GainNotInfo();
		} catch (Exception e) {
			log.debug("NotonLine接口错误:"+e.getMessage());
			e.printStackTrace();
		}
		return gainNotInfo;
		
	}
	
///==================================================================================================================================================================================
///																																													
///						备注：：：													 																									
///	private String requestOpenDoorStr;//开门参数   格式      8a224e515741452e015770d1b10c015c(柜体门id)-ACCF23C050C4(柜体编号)-11(柜体门编号(锁号))-fbb8f2925995caa9015995cb16bf0000(柜体门开门记录表)	
///	private String SetPadPass;//设置密码    格式      板子序列号-锁号    8a224e515741452e015770d1b10c015c(柜体门id)-ACCF23C050C4(柜体编号cabinetNo)-11(柜体门编号(锁号)doorNo)-warehousegetNo-电话号码												=
///	private byte[] bs;																																								
///	private String param1;																																							
///	private String cabinetId;																																						
///	private String careId;//柜体门ID																																					
///	private String SerialNo;//板子序列号																																				
///	private String LockNo;																																							
///	private String result;																																							
///																																													
///						以下是get/set													 																								
///																																													
///==================================================================================================================================================================================
	
}

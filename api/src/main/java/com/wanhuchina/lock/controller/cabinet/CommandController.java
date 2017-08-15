package com.wanhuchina.lock.controller.cabinet;


import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.lock.service.CommandService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/lock/manual")
public class CommandController {
	private static final org.slf4j.Logger log= LoggerFactory.getLogger(CommandController.class);

	@Resource
	private CommandService commandService;
	/**
	 * 控制电路板下发指令 接口
	 */
	@RequestMapping(value = "/command" , method = RequestMethod.POST)
	public TxResultResponse Command(@RequestParam String sltCommand, @RequestParam String serialNo, @RequestParam String sltSessionIDs){
		TxResultResponse response = new TxResultResponse(CommonCode.SUCCESS,"操作成功");
		try {
			commandService.CommandBoard(sltCommand, serialNo, sltSessionIDs);
			return response;
		} catch (CommonException e) {
			return new TxResultResponse(e.getCode(),e.getMsg());
		}
	}

	/**
	 * 获取SessionID的集合
	 */
	@RequestMapping(value = "/gainSessionIDs", method = RequestMethod.POST)
	public List<String> gainSessionIDs(){
		List<String> sessionIDs = null;
		try {
			sessionIDs = commandService.MapToList();
		} catch (Exception e) {
			log.debug("接口gainSessionIDs错误:"+e.getStackTrace());
			e.printStackTrace();
		}
		return sessionIDs;
	}

	
	/**
	 * 获取boardSerialNos的集合
	 */
	@RequestMapping(value = "/gainBoardSerialNos", method = RequestMethod.POST)
	public List<String> gainBoardSerialNos(){
		List<String> boardSerialNos = null;
		try {
			boardSerialNos = commandService.BoardSerialNos();
		} catch (Exception e) {
			log.debug("接口gainBoardSerialNos错误:"+e.getStackTrace());
			e.printStackTrace();
		}
		
		return boardSerialNos;
	}
}

package com.lottery.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.dto.ResponseMsg;
import com.lottery.entity.History;
import com.lottery.service.HistoryService;

@Controller
public class HistoryController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HistoryService historyService;
	
	/*
	 * 三星投注
	 */
	@RequestMapping(value="/threeTouZhu")
	@ResponseBody
	public ResponseMsg threeTouZhu(@RequestBody History history) {
		int result = historyService.insertHistory(history);
		ResponseMsg responseMsg = null;
		if(result > 0) {
			responseMsg = new ResponseMsg();
		} else {
			responseMsg = new ResponseMsg("9999", "失败");
		}
		return responseMsg;
	}
}

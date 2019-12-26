package com.qingao.app190806.springmvc190806.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingao.app190806.springmvc190806.service.AppService;

@RestController
@RequestMapping("/goodsinfocontroller")
public class GoodsInfoController {
	
	@Autowired
	AppService appService;
	
	@RequestMapping("getinfoes")
	public Object getInfoes(Integer pagenum){
		
		Integer rowCount=20;
		Integer pagecount= appService.getPageCount_GoodsInfo(rowCount);
		
		Map result=new HashMap();
		result.put("pagecount",pagecount);
		result.put("infoes",appService.getGoodsInfoes(rowCount, pagenum));
		
		
		
		return result;
		
	}
	
}

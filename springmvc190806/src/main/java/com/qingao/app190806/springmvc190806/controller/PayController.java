package com.qingao.app190806.springmvc190806.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alipay.api.AlipayApiException;
import com.qingao.app190806.springmvc190806.service.AppService;
import com.qingao.app190806.springmvc190806.service.App_Service_Ali;

@Controller
public class PayController {

	@Autowired
	App_Service_Ali app_Service_Ali;
	
	
	@Autowired
	AppService appService;
	
	@RequestMapping("/ali/pay")
	public void ali(HttpServletResponse response,String orderid) throws IOException, AlipayApiException {
		app_Service_Ali.ali(response, orderid);
	}
	
	
	@RequestMapping("/ali/pieddone")
	public String paiedDone(HttpServletRequest request){
		
		String orderid=request.getParameter("out_trade_no");
		
		appService.paiedDone(orderid);;
		
		return "/paied_ok.html";
		
	}

}

package com.qingao.app190806.springmvc190806.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.qingao.app190806.springmvc190806.App_Cfg_Alipay;
import com.qingao.app190806.springmvc190806.mapper.App_OrderList_Mapper;

@Service
public class App_Service_Ali {
	
	@Autowired
	App_OrderList_Mapper app_OrderList_Mapper;
	
	
	public Double getSum(String orderinfoid){
		
		return app_OrderList_Mapper.getSum(orderinfoid);
	}
	
	
	
	public void ali(HttpServletResponse response, String orderid) throws AlipayApiException, IOException{
		//设置编码  
		response.setContentType("text/html;charset=utf-8");  
		PrintWriter out = response.getWriter();   
		//获得初始化的AlipayClient 
		AlipayClient alipayClient = new DefaultAlipayClient(App_Cfg_Alipay.gatewayUrl, App_Cfg_Alipay.app_id, App_Cfg_Alipay.merchant_private_key, "json", App_Cfg_Alipay.charset, App_Cfg_Alipay.alipay_public_key, App_Cfg_Alipay.sign_type);   
		//设置请求参数
		AlipayTradePagePayRequest aliPayRequest = new AlipayTradePagePayRequest();   aliPayRequest.setReturnUrl(App_Cfg_Alipay.return_url);   aliPayRequest.setNotifyUrl(App_Cfg_Alipay.notify_url);      
	
		//付款金额，从前台获取，必填 
		String total_amount = this.getSum(orderid).toString();
		//订单名称，必填  
		String subject = new String("支付宝沙箱支付（名称随便起）");
		aliPayRequest.setBizContent("{\"out_trade_no\":\"" + orderid + "\","    + "\"total_amount\":\"" + total_amount + "\","    + "\"subject\":\"" + subject + "\","    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");  
		//请求   
		String result = alipayClient.pageExecute(aliPayRequest).getBody();   
		//输出   
		out.println(result);//以下写自己的订单代码 } 
	}
	
}

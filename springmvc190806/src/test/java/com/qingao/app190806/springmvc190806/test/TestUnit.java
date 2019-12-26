package com.qingao.app190806.springmvc190806.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qingao.app190806.springmvc190806.mapper.App_OrderList_Mapper;
import com.qingao.app190806.springmvc190806.pojo.Areainfo;
import com.qingao.app190806.springmvc190806.pojo.Goodsinfo;
import com.qingao.app190806.springmvc190806.pojo.Orderlist;
import com.qingao.app190806.springmvc190806.pojo.User;
import com.qingao.app190806.springmvc190806.service.AppService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication(scanBasePackages="com.qingao.app190806.springmvc190806")
@MapperScan(value="com.qingao.app190806.springmvc190806.mapper") 
public class TestUnit implements ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	@Autowired
	AppService appService;
	
	@Autowired 
	App_OrderList_Mapper app_OrderList_Mapper; 
	

	@Test
	public void test1(){
		
		Double sum=app_OrderList_Mapper.getSum("9650447d-6359-4ed2-8b33-ce5ee464195f");
		
		System.out.println(sum);
	}



	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.applicationContext=applicationContext;
		
	}

	
	
}

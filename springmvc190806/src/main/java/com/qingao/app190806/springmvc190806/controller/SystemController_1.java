package com.qingao.app190806.springmvc190806.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.qingao.app190806.springmvc190806.pojo.Areainfo;
import com.qingao.app190806.springmvc190806.service.AppService;
import com.qingao.app190806.springmvc190806.service.SystemTool_1;

@Controller
@RequestMapping("/systemcontroller1")
@SessionAttributes({"atr_session"})
public class SystemController_1 {

	
	@Autowired
	AppService appService;
	
	@RequestMapping("setatr")
	public String doSessionSetAttribute(String atr1,ModelMap map,HttpSession session){
		
		Areainfo a= appService.getAreaInfoByAid(4);
		
		
		
		map.put("area",a);
		
		
		return "/el_1.jsp";
	}
	
}

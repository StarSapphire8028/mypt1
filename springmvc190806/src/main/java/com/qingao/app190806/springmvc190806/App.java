package com.qingao.app190806.springmvc190806;

import java.util.Timer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication(scanBasePackages="com.qingao.app190806.springmvc190806")
@MapperScan(value="com.qingao.app190806.springmvc190806.mapper") 
@EnableScheduling
public class App {
	
	
	/*@Scheduled(fixedRate=5000)
	public void abc(){
		System.out.println("呵呵。。。。。。。。。。。");
		
	}*/
	
	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
		
		
	}


}

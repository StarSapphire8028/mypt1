package com.qingao.app190806.springmvc190806.exception;

public class PasswordErrorException extends Exception{

	@Override
	public void printStackTrace() {
		System.out.println("用户名密码有误");
	}
	
}

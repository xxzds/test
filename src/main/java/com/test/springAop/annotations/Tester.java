package com.test.springAop.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springAop.annotations.service.UserService;

public class Tester {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 启动Spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-aop-annotations.xml");
		// 获取service组件
		UserService service = (UserService) context.getBean("userService");
		
		service.getUsers();
	}
}

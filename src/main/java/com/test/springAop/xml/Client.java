package com.test.springAop.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		
//		ICommon c=(ICommon)factory.getBean("common");
		
		Common c = (Common) factory.getBean("common");
		System.out.println(c.getClass().getName());
		c.execute("zhengjunhua", "zhengjunhua");
		System.out.println(c);

	}
}

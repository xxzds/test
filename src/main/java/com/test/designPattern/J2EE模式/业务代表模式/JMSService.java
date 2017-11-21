package com.test.designPattern.J2EE模式.业务代表模式;

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}
}

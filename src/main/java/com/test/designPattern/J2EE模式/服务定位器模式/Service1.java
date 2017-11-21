package com.test.designPattern.J2EE模式.服务定位器模式;

/**
 * 创建实体服务。
 * @author ding.shuai
 * @date 2016年8月6日上午10:24:42
 */
public class Service1 implements Service {
	public void execute() {
		System.out.println("Executing Service1");
	}

	@Override
	public String getName() {
		return "Service1";
	}
}
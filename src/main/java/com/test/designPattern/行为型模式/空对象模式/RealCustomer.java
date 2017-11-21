package com.test.designPattern.行为型模式.空对象模式;

/**
 * 创建扩展了上述类的实体类。
 * @author ding.shuai
 * @date 2016年8月6日上午8:13:17
 */
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNil() {
		return false;
	}
}

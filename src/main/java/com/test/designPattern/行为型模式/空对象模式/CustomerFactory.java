package com.test.designPattern.行为型模式.空对象模式;

/**
 * 创建 CustomerFactory 类。
 * @author ding.shuai
 * @date 2016年8月6日上午8:14:08
 */
public class CustomerFactory {

	public static final String[] names = { "Rob", "Joe", "Julie" };

	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
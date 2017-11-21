package com.test.designPattern.J2EE模式.服务定位器模式;

/**
 * 为 JNDI 查询创建 InitialContext。
 * @author ding.shuai
 * @date 2016年8月6日上午10:25:49
 */
public class InitialContext {
	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE1")) {
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("SERVICE2")) {
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}
}

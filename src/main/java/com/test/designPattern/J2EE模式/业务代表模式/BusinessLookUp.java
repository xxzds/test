package com.test.designPattern.J2EE模式.业务代表模式;

/**
 * 创建业务查询服务。
 * @author ding.shuai
 * @date 2016年8月6日上午8:54:11
 */
public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}

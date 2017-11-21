package com.test.designPattern.J2EE模式.业务代表模式;

/**
 * 创建业务代表。
 * @author ding.shuai
 * @date 2016年8月6日上午8:54:53
 */
public class BusinessDelegate {
	private BusinessLookUp lookupService = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}

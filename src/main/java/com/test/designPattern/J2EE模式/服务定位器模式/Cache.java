package com.test.designPattern.J2EE模式.服务定位器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建缓存 Cache。
 * @author ding.shuai
 * @date 2016年8月6日上午10:26:48
 */
public class Cache {

	private List<Service> services;

	public Cache() {
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached  " + serviceName + " object");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}

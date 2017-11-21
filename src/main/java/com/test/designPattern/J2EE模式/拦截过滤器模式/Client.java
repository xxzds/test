package com.test.designPattern.J2EE模式.拦截过滤器模式;

/**
 * 创建客户端 Client。
 * @author ding.shuai
 * @date 2016年8月6日上午10:07:13
 */
public class Client {
	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}

package com.test.designPattern.J2EE模式.拦截过滤器模式;

/**
 * 创建过滤管理器。
 * @author ding.shuai
 * @date 2016年8月6日上午10:06:39
 */
public class FilterManager {
	FilterChain filterChain;

	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}
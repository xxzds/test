package com.test.filter;

/**
 * 管理器
 * @author ding.shuai
 * @date 2016年8月6日上午11:56:28
 */
public class FilterManager {
	private FilterChainImpl filterChain;
	
	public FilterManager(Target target) {
		filterChain=FilterChainImpl.getInstance();
		filterChain.setTarget(target);
	}
	
	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request,String response) {
		filterChain.doFilter(request, response);
	}

}

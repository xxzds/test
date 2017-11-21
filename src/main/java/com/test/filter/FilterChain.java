package com.test.filter;

/**
 * 过滤器链接口
 * 
 * @author ding.shuai
 * @date 2016年8月6日上午11:22:04
 */
public interface FilterChain {

	public void doFilter(String request, String response);

}

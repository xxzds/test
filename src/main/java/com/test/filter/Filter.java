package com.test.filter;

/**
 * 过滤器接口
 * @author ding.shuai
 * @date 2016年8月6日上午11:21:16
 */
public interface Filter {	
	public void doFilter (String request,String response,FilterChain chain);
}

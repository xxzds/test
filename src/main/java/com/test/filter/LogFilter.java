package com.test.filter;

/**
 * 日志过滤器
 * @author ding.shuai
 * @date 2016年8月6日上午11:21:38
 */
public class LogFilter  implements Filter{

	@Override
	public void doFilter(String request, String response, FilterChain chain) {
		System.out.println("Log request");
		
		chain.doFilter(request, response);
		
		System.out.println("Log response");
		
	}

}

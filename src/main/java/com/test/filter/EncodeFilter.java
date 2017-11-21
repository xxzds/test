package com.test.filter;


/**
 * 编码过滤器
 * @author ding.shuai
 * @date 2016年8月6日上午11:21:52
 */
public class EncodeFilter implements Filter {

	@Override
	public void doFilter(String request, String response, FilterChain chain) {
		System.out.println("Encode request");

		chain.doFilter(request, response);
//		System.out.println("Encode response");

	}

}

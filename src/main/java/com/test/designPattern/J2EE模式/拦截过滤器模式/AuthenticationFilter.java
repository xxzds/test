package com.test.designPattern.J2EE模式.拦截过滤器模式;

/**
 * 创建实体过滤器。
 * @author ding.shuai
 * @date 2016年8月6日上午10:04:37
 */
public class AuthenticationFilter implements Filter {
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
}

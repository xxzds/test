package com.test.designPattern.J2EE模式.拦截过滤器模式;

/**
 * 创建 Target。
 * @author ding.shuai
 * @date 2016年8月6日上午10:05:38
 */
public class Target {
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}

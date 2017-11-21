package com.test.designPattern.J2EE模式.拦截过滤器模式;

public class DebugFilter implements Filter {
	public void execute(String request) {
		System.out.println("request log: " + request);
	}
}
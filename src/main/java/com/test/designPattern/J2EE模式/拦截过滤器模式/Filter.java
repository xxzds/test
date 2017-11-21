package com.test.designPattern.J2EE模式.拦截过滤器模式;

/**
 * 创建过滤器接口 Filter。
 * @author ding.shuai
 * @date 2016年8月6日上午10:04:06
 */
public interface Filter {
	public void execute(String request);
}
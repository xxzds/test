package com.test.designPattern.行为型模式.空对象模式;

/**
 * 创建一个抽象类。
 * @author ding.shuai
 * @date 2016年8月6日上午8:12:27
 */
public abstract class AbstractCustomer {
	protected String name;

	public abstract boolean isNil();

	public abstract String getName();
}
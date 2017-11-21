package com.test.designPattern.行为型模式.策略模式;

/**
 * 创建 Context 类。
 * @author ding.shuai
 * @date 2016年8月6日上午8:22:38
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}

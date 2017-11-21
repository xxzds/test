package com.test.designPattern.行为型模式.责任链模式;

/**
 * 创建扩展了该记录器类的实体类。
 * @author ding.shuai
 * @date 2016年8月5日下午1:40:07
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}

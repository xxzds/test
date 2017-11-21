package com.test.designPattern.行为型模式.观察者模式;

/**
 * 创建实体观察者类。
 * @author ding.shuai
 * @date 2016年8月6日上午7:55:13
 */
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}
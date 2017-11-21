package com.test.designPattern.行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建 Subject 类。
 * @author ding.shuai
 * @date 2016年8月6日上午7:53:22
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}

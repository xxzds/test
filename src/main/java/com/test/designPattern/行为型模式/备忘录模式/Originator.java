package com.test.designPattern.行为型模式.备忘录模式;

/**
 * 创建 Originator 类。
 * @author ding.shuai
 * @date 2016年8月6日上午7:48:12
 */
public class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento Memento) {
		state = Memento.getState();
	}
}

package com.test.designPattern.行为型模式.备忘录模式;

/**
 * 创建 Memento 类
 * @author ding.shuai
 * @date 2016年8月5日下午5:19:11
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
package com.test.designPattern.行为型模式.状态模式;

/**
 * 创建实现接口的实体类。
 * @author ding.shuai
 * @date 2016年8月6日上午8:05:43
 */
public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}

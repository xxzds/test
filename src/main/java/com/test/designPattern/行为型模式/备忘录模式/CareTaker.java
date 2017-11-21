package com.test.designPattern.行为型模式.备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建 CareTaker 类。
 * @author ding.shuai
 * @date 2016年8月6日上午7:48:49
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}

package com.test.designPattern.行为型模式.观察者模式;

/**
 * 创建 Observer 类。
 * 
 * @author ding.shuai
 * @date 2016年8月6日上午7:53:57
 */
public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}

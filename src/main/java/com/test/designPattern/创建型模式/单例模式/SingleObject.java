package com.test.designPattern.创建型模式.单例模式;

/**
 * 创建一个 Singleton 类。
 * @author ding.shuai
 * @date 2016年8月3日下午9:58:39
 */
public class SingleObject {
	// 创建 SingleObject 的一个对象
	private static SingleObject instance = new SingleObject();

	// 让构造函数为 private，这样该类就不会被实例化
	private SingleObject() {
	}

	// 获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}

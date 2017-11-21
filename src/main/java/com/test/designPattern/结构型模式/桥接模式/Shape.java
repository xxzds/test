package com.test.designPattern.结构型模式.桥接模式;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * @author ding.shuai
 * @date 2016年8月4日下午1:53:58
 */
public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
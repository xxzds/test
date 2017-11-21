package com.test.designPattern.结构型模式.装饰器模式;

/**
 * 创建实现了 Shape 接口的抽象装饰类。
 * @author ding.shuai
 * @date 2016年8月5日上午9:21:45
 */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}

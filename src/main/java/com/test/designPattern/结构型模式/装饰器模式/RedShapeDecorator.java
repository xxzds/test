package com.test.designPattern.结构型模式.装饰器模式;

/**
 * 创建扩展了 ShapeDecorator 类的实体装饰类。
 * @author ding.shuai
 * @date 2016年8月5日上午9:23:09
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
}

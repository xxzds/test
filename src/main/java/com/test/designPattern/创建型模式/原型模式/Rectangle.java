package com.test.designPattern.创建型模式.原型模式;

/**
 * 创建扩展了上面抽象类的实体类。
 * @author ding.shuai
 * @date 2016年8月3日下午10:46:02
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}

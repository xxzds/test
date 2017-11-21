package com.test.designPattern.结构型模式.外观模式;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}
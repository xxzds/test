package com.test.designPattern.结构型模式.装饰器模式;

/**
 * 创建实现接口的实体类。
 * @author ding.shuai
 * @date 2016年8月5日上午9:20:19
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}

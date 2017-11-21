package com.test.designPattern.结构型模式.外观模式;

/**
 * 创建实现接口的实体类。
 * @author ding.shuai
 * @date 2016年8月5日下午1:19:59
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}
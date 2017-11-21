package com.test.designPattern.结构型模式.享元模式;

import java.util.HashMap;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * @author ding.shuai
 * @date 2016年8月5日下午1:26:19
 */
public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}

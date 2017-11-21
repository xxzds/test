package com.test.designPattern.创建型模式.抽象工厂模式;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 * @author ding.shuai
 * @date 2016年8月3日下午9:50:37
 */
public abstract class AbstractFactory {
	
	abstract Color getColor(String color);

	abstract Shape getShape(String shapeType);
}

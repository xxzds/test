package com.test.designPattern.结构型模式.桥接模式;

/**
 * 创建实现了 DrawAPI 接口的实体桥接实现类。
 * @author ding.shuai
 * @date 2016年8月4日下午1:50:45
 */
public class RedCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}
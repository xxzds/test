package com.test.designPattern.行为型模式.命令模式;

/**
 * 创建一个请求类。
 * @author ding.shuai
 * @date 2016年8月5日下午4:39:16
 */
public class Stock {

	private String name = "ABC";
	private int quantity = 10;

	public void buy() {
		System.out.println("Stock [ Name: " + name + ",  Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
	}
}

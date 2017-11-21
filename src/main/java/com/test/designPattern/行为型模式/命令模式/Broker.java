package com.test.designPattern.行为型模式.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建命令调用类。
 * @author ding.shuai
 * @date 2016年8月5日下午4:42:24
 */
public class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}

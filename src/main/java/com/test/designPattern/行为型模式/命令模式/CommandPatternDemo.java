package com.test.designPattern.行为型模式.命令模式;

/**
 * 使用 Broker 类来接受并执行命令。
 * @author ding.shuai
 * @date 2016年8月5日下午4:43:31
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
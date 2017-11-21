package com.test.designPattern.行为型模式.空对象模式;

/**
 * 在空对象模式（Null Object Pattern）中，一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。
 * 这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
 * 在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，还创建一个未对该类做任何实现的空对象类，
 * 该空对象类将无缝地使用在需要检查空值的地方。
 * 
 * 
 * 使用 CustomerFactory，基于客户传递的名字，来获取 RealCustomer 或 NullCustomer 对象。
 * @author ding.shuai
 * @date 2016年8月6日上午8:14:39
 */
public class NullPatternDemo {
	public static void main(String[] args) {

		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}

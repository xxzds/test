package com.test.designPattern.创建型模式.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个 Meal 类，带有上面定义的 Item 对象。
 * @author ding.shuai
 * @date 2016年8月3日下午10:34:55
 */
public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}

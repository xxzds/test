package com.test.designPattern.创建型模式.建造者模式;

/**
 * 建一个表示食物条目和食物包装的接口。
 * @author ding.shuai
 * @date 2016年8月3日下午10:25:34
 */
public interface Item {
	public String name();

	public Packing packing();

	public float price();
}

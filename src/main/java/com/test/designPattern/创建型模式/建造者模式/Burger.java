package com.test.designPattern.创建型模式.建造者模式;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * 
 * @author ding.shuai
 * @date 2016年8月3日下午10:28:44
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}

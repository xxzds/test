package com.test.designPattern.创建型模式.建造者模式;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

}

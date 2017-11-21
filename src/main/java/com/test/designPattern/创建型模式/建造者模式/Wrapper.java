package com.test.designPattern.创建型模式.建造者模式;

/**
 * 创建实现 Packing 接口的实体类。
 * @author ding.shuai
 * @date 2016年8月3日下午10:26:58
 */
public class Wrapper implements Packing {

	@Override
	public String pack() {
		 return "Wrapper";
	}

}

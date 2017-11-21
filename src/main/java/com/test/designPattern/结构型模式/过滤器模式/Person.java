package com.test.designPattern.结构型模式.过滤器模式;

/**
 * 创建一个类，在该类上应用标准。
 * @author ding.shuai
 * @date 2016年8月4日下午2:16:10
 */
public class Person {

	private String name;
	private String gender;
	private String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}
}
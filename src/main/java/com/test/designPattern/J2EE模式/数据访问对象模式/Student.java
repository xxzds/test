package com.test.designPattern.J2EE模式.数据访问对象模式;

/**
 * 创建数值对象。
 * @author ding.shuai
 * @date 2016年8月6日上午10:49:32
 */
public class Student {
	private String name;
	private int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}

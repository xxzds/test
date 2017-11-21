package com.test.designPattern.J2EE模式.传输对象模式;

/**
 * 创建传输对象。
 * @author ding.shuai
 * @date 2016年8月6日上午10:18:55
 */
public class StudentVO {
	private String name;
	private int rollNo;

	StudentVO(String name, int rollNo) {
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
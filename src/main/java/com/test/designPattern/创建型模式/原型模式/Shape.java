package com.test.designPattern.创建型模式.原型模式;

/**
 * 创建一个实现了 Clonable 接口的抽象类。
 * @author ding.shuai
 * @date 2016年8月3日下午10:43:42
 */
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}

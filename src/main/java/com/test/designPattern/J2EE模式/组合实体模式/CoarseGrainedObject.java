package com.test.designPattern.J2EE模式.组合实体模式;

/**
 * 创建粗粒度对象。
 * @author ding.shuai
 * @date 2016年8月6日上午10:55:49
 */
public class CoarseGrainedObject {
	DependentObject1 do1 = new DependentObject1();
	DependentObject2 do2 = new DependentObject2();

	public void setData(String data1, String data2) {
		do1.setData(data1);
		do2.setData(data2);
	}

	public String[] getData() {
		return new String[] { do1.getData(), do2.getData() };
	}
}

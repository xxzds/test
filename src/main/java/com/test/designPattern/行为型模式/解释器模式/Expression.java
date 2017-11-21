package com.test.designPattern.行为型模式.解释器模式;

/**
 * 创建一个表达式接口。
 * @author ding.shuai
 * @date 2016年8月5日下午4:48:14
 */
public interface Expression {
	public boolean interpret(String context);
}

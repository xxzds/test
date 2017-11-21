package com.test.designPattern.行为型模式.解释器模式;


/**
 * 创建实现了上述接口的实体类。
 * @author ding.shuai
 * @date 2016年8月5日下午4:48:51
 */
public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}

package com.test.designPattern.行为型模式.策略模式;

public class OperationAdd implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}

package com.test.designPattern.行为型模式.访问者模式;

/**
 * 定义一个表示访问者的接口。
 * @author ding.shuai
 * @date 2016年8月6日上午8:29:45
 */
public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}

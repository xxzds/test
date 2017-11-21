package com.test.designPattern.行为型模式.访问者模式;

/**
 * 定义一个表示元素的接口。
 * @author ding.shuai
 * @date 2016年8月6日上午8:30:06
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}

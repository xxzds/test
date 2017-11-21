package com.test.designPattern.行为型模式.访问者模式;

/**
 * 创建扩展了上述类的实体类。
 * @author ding.shuai
 * @date 2016年8月6日上午8:30:48
 */
public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
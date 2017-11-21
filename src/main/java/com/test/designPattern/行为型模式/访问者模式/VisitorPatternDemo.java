package com.test.designPattern.行为型模式.访问者模式;

/**
 * 在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。
 * 类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 * 
 * 使用 ComputerPartDisplayVisitor 来显示 Computer 的组成部分。
 * @author ding.shuai
 * @date 2016年8月6日上午8:39:18
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}

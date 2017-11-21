package com.test.designPattern.行为型模式.备忘录模式;

/**
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * @author ding.shuai
 * @date 2016年8月6日上午7:52:10
 */
public class MementoPatternDemo {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #4");

		System.out.println("Current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());
	}
}

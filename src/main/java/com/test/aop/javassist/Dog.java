package com.test.aop.javassist;

public class Dog {
	
	public void run(){
		System.out.println("dog running...");
	}
	
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.run();
	}
}



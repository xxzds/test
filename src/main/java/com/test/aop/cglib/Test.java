package com.test.aop.cglib;

/**
 * CGLIB是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强
 * @author ding.shuai
 * @date 2016年8月1日上午9:43:43
 */
public class Test {
	public static void main(String[] args) {
        PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk());
        peopleTalk.talk("业务方法");
    }
}

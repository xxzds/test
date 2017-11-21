package com.test.aop.staticAgent;

import com.test.aop.ITalk;
import com.test.aop.PeopleTalk;

public class ProxyPattern {
	public static void main(String[] args) {
        // 不需要执行额外方法的。
        ITalk people = new PeopleTalk("AOP", "18");
        people.talk("No ProXY Test");
        System.out.println("-----------------------------");

        // 需要执行额外方法的（切面）
        TalkProxy talker = new TalkProxy(people);
        talker.talk("ProXY Test", "代理");
    }
}

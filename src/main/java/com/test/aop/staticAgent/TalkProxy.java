package com.test.aop.staticAgent;

import com.test.aop.ITalk;

public class TalkProxy implements ITalk {
	private ITalk talker;

	public TalkProxy(ITalk talker) {
		// super();
		this.talker = talker;
	}

	public void talk(String msg) {
		talker.talk(msg);
	}

	public void talk(String msg, String singname) {
		talker.talk(msg);
		sing(singname);
	}

	private void sing(String singname) {
		System.out.println("唱歌：" + singname);
	}

}

package com.test.aop.cglib;

/**
 * 业务类
 * @author ding.shuai
 * @date 2016年8月1日上午9:38:39
 */
public class PeopleTalk {
	public void talk(String msg) {
		System.out.println("people talk" + msg);
	}
}

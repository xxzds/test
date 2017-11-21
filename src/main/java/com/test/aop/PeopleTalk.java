package com.test.aop;

public class PeopleTalk implements ITalk {

	public String username;
	public String age;
	
	public PeopleTalk(){
		
	}
	
	public PeopleTalk(String username, String age) {
		this.username = username;
		this.age = age;
	}

	public void talk(String msg) {
		System.out.println(msg + "!你好,我是" + username + "，我年龄是" + age);
	}

	public String getName() {
		return username;
	}

	public void setName(String name) {
		this.username = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}

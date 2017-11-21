package com.test.designPattern.J2EE模式.前端控制器模式;

/**
 * 创建调度器 Dispatcher。
 * @author ding.shuai
 * @date 2016年8月6日上午10:43:53
 */
public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(String request) {
		if (request.equalsIgnoreCase("STUDENT")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}

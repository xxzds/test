package com.test.designPattern.行为型模式.模板模式;

/**
 * 创建扩展了上述类的实体类。
 * @author ding.shuai
 * @date 2016年8月6日上午8:26:40
 */
public class Cricket extends Game {

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
}

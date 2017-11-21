package com.test.designPattern.行为型模式.模板模式;

/**
 * 创建一个抽象类，它的模板方法被设置为 final。
 * @author ding.shuai
 * @date 2016年8月6日上午8:25:48
 */
public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// 模板
	public final void play() {

		// 初始化游戏
		initialize();

		// 开始游戏
		startPlay();

		// 结束游戏
		endPlay();
	}
}

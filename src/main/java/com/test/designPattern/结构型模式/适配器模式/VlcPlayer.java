package com.test.designPattern.结构型模式.适配器模式;


/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类。
 * @author ding.shuai
 * @date 2016年8月4日下午2:07:26
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 什么也不做
	}
}
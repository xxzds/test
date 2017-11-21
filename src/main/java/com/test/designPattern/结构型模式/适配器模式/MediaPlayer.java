package com.test.designPattern.结构型模式.适配器模式;

/**
 * 为媒体播放器和更高级的媒体播放器创建接口。
 * @author ding.shuai
 * @date 2016年8月4日下午2:05:46
 */
public interface MediaPlayer {
	public void play(String audioType, String fileName);
}

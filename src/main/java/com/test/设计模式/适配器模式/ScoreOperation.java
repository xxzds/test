package com.test.设计模式.适配器模式;

//抽象成绩操作类：目标接口  
interface ScoreOperation {
	public int[] sort(int array[]); // 成绩排序

	public int search(int array[], int key); // 成绩查找
}

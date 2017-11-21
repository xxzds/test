package com.test.designPattern.J2EE模式.业务代表模式;

/**
 * 创建实体服务类。
 * @author ding.shuai
 * @date 2016年8月6日上午8:53:13
 */
public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}

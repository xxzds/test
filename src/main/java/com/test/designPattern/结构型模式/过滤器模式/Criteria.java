package com.test.designPattern.结构型模式.过滤器模式;

import java.util.List;

/**
 * 为标准（Criteria）创建一个接口。
 * @author ding.shuai
 * @date 2016年8月4日下午2:17:05
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}

package com.test.designPattern.结构型模式.过滤器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了 Criteria 接口的实体类。
 * @author ding.shuai
 * @date 2016年8月4日下午2:18:11
 */
public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}

package com.test.designPattern.J2EE模式.拦截过滤器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建过滤器链。
 * @author ding.shuai
 * @date 2016年8月6日上午10:06:10
 */
public class FilterChain {
	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void execute(String request) {
		for (Filter filter : filters) {
			filter.execute(request);
		}
		target.execute(request);
	}

	public void setTarget(Target target) {
		this.target = target;
	}
}

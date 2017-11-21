package com.test.filter;

public class FilterDemo {

	public static void main(String[] args) {
		FilterManager filterManager=new FilterManager(new Target());
		filterManager.setFilter(new LogFilter());
		filterManager.setFilter(new EncodeFilter());
		
		filterManager.filterRequest("request", "response");
	}
}

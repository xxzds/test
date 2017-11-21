package com.test.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 过滤器链实现类
 * @author ding.shuai
 * @date 2016年8月6日上午11:56:03
 */
public class FilterChainImpl implements FilterChain{
	private final List<Filter> filters;
	
	private Iterator<Filter> iterator;
	
	private Target target;
	
	
	private FilterChainImpl() {
		this.filters=new ArrayList<Filter>();
	}
	
	public static FilterChainImpl getInstance(){
		return new FilterChainImpl();
	}
	
	
	public void addFilter(Filter filter){
		this.filters.add(filter);
	}
	
	public void setTarget(Target target){
		this.target=target;
	}

	@Override
	public void doFilter(String request, String response) {
		
		if(request==null || "".equals(request)){
			throw new  IllegalStateException("This FilterChain has already been called!");
		}
		
		if(this.iterator==null){
			this.iterator=this.filters.iterator();
		}
		
		if(this.iterator.hasNext()){
			Filter nextFilter=this.iterator.next();
			nextFilter.doFilter(request, response, this);
		}else{
			this.target.excute();
		}
		
	}

}

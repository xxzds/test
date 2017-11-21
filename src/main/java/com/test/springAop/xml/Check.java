package com.test.springAop.xml;

import org.aspectj.lang.JoinPoint;

/**
 * 切面类
 * @author ding.shuai
 * @date 2016年8月1日下午3:07:08
 */
public class Check {
	public void checkValidity() {
		System.out.println("------------------验证合法性----------------");
	}

	public void addLog(JoinPoint j) {
		System.out.println("------------------添加日志----------------");
		Object obj[] = j.getArgs();
		for (Object o : obj) {
			System.out.println(o);
		}
		System.out.println("========checkSecurity==" + j.getSignature().getName());// 这个是获得方法名
	}
}

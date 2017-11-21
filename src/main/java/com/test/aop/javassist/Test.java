package com.test.aop.javassist;

import javassist.ClassPool;
import javassist.tools.reflect.Loader;

/**
 javassist是一个编辑字节码的框架，可以让你很简单地操作字节码。它可以在运行期定义或修改Class。
 使用Javassist实现AOP的原理是在字节码加载前直接修改需要切入的方法
 * 使用系统类加载器启动我们自定义的类加载器，在这个类加载器里加一个类加载监听器，监听器发现目标类被加载时就织入切入逻辑
 * @author ding.shuai
 * @date 2016年8月1日下午2:33:01
 */
public class Test {
	public static void main(String[] args) throws Throwable {
		//获取存放CtClass的容器ClassPool   
		ClassPool cp = ClassPool.getDefault();   
		//创建一个类加载器   
		Loader cl = new Loader();   
		//增加一个转换器   
		cl.addTranslator(cp, new MyTranslator());   
		//启动MyTranslator的main函数   
		cl.run("com.test.aop.javassist.Dog", args);   
	}
}

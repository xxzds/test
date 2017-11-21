package com.test.aop.javassist;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.Translator;

public class MyTranslator  implements Translator{

	@Override
	public void start(ClassPool pool) throws NotFoundException, CannotCompileException {
		
		
	}

	/**
	 * 类装载到JVM前进行代码织入
	 */
	@Override
	public void onLoad(ClassPool pool, String classname) throws NotFoundException, CannotCompileException {
		
		CtClass  cc = pool.get(classname);   
        //获得指定方法名的方法   
        CtMethod m = cc.getDeclaredMethod("run");   
        //在方法执行前插入代码   
        m.insertBefore("{ System.out.println(\"记录日志\"); }"); 
	}
}

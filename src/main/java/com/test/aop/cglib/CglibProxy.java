package com.test.aop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

    private Object target;

    /**
     * 创建代理对象
     * 
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        //创建一个织入器 
        Enhancer enhancer = new Enhancer();
        //设置父类 
        enhancer.setSuperclass(this.target.getClass());
        //设置需要织入的逻辑 
        enhancer.setCallback(this);
        //使用织入器创建子类
        return enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        System.out.println("事物开始");
        result = methodProxy.invokeSuper(proxy, args);
        System.out.println("事物结束");
        return result;
    }

}

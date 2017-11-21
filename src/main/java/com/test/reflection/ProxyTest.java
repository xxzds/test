package com.test.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*
 类的生命周期

在一个类编译完成之后，下一步就需要开始使用类，如果要使用一个类，肯定离不开JVM。在程序执行中JVM通过装载，链接，初始化这3个步骤完成。

类的装载是通过类加载器完成的，加载器将.class文件的二进制文件装入JVM的方法区，并且在堆区创建描述这个类的java.lang.Class对象。用来封装数据。 但是同一个类只会被类装载器装载。

链接就是把二进制数据组装为可以运行的状态。
链接分为校验，准备，解析这3个阶段

校验一般用来确认此二进制文件是否适合当前的JVM（版本），

准备就是为静态成员分配内存空间，并设置默认值

解析指的是转换常量池中的代码作为直接引用的过程，直到所有的符号引用都可以被运行程序使用（建立完整的对应关系）

完成之后，类型也就完成了初始化，初始化之后类的对象就可以正常使用了，直到一个对象不再使用之后，将被垃圾回收。释放空间。

当没有任何引用指向Class对象时就会被卸载，结束类的生命周期
 */

//定义项目接口
interface Subject {
	public String say(String name, int age);
}

// 定义真实项目
class RealSubject implements Subject {
	@Override
	public String say(String name, int age) {
		return name + "  " + age;
	}
}

// 代理执行器
class MyInvocationHandler implements InvocationHandler {
	private Object obj = null;

	public Object bind(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 接口代理，规范代理方法
		System.out.println(proxy.getClass());
		Method[] methods = proxy.getClass().getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

		System.out.println("增强处理");
		Object temp = method.invoke(this.obj, args);
		return temp;
	}

}

public class ProxyTest {
	public static void main(String[] args) {
		MyInvocationHandler demo = new MyInvocationHandler();
		Subject sub = (Subject) demo.bind(new RealSubject());
		System.out.println(sub.getClass());
		String info = sub.say("Rollen", 20);
		System.out.println(info);
	}
}

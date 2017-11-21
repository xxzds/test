package com.test.aop.dynamicProxy;

import com.test.aop.ITalk;
import com.test.aop.PeopleTalk;

/*
动态代理在运行期通过接口动态生成代理类，这为其带来了一定的灵活性，但这个灵活性却带来了两个问题，
第一代理类必须实现一个接口，如果没实现接口会抛出一个异常。
第二性能影响，因为动态代理使用反射的机制实现的，首先反射肯定比直接调用要慢，经过测试大概每个代理类比静态代理多出10几毫秒的消耗。
其次使用反射大量生成类文件可能引起Full GC造成性能影响，因为字节码文件加载后会存放在JVM运行时区的方法区（或者叫持久代）中，
当方法区满的时候，会引起Full GC，所以当你大量使用动态代理时，可以将持久代设置大一些，减少Full GC次数。 

 */
public class Test {
	public static void main(String[] args) {
		// 绑定代理，这种方式会在所有的方法都加上切面方法
		ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("ds", "23"));
		iTalk.talk("业务说明");
	}
}

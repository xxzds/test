package com.test.reflection;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
	public static void main(String[] args) {
		Book book=new Book();
		//获取完整的包名和类名
		System.out.println(book.getClass().getName());
		
		/*************************************************************/
		//所有类的对象其实都是Class的实例
		 try {
			Class<?> demo1= Class.forName("com.test.reflection.Book");
			System.out.println("类名称："+demo1.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 Class<?> demo2=new Book().getClass();
		 System.out.println("类名称："+demo2.getName());
		 
		 Class<?> demo3=Book.class;
		 System.out.println("类名称："+demo3.getName());
		 
		 
		 /*************************************************************/
		 try {
			Class<?> demo4=Class.forName("com.test.reflection.Book");
			Book book4=(Book) demo4.newInstance();
			book4.setAuthor("ds");
			System.out.println(book4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 /*************************************************************/
		 try {
			Class<?> demo5=Class.forName("com.test.reflection.Book");
			Constructor<?>[] cons= demo5.getConstructors();
			for(Constructor<?>con:cons){
				System.out.println("构造方法："+con.toString());
			}
			Book b1=(Book)cons[0].newInstance();
			Book b2=(Book)cons[1].newInstance(1,"hehe","66",12,"1","343",new byte[]{12});
			System.out.println(b1);
			System.out.println(b2);
			
			
			demo5.getInterfaces();   //获取所有接口
			demo5.getSuperclass();   //获取父类
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 /*************************************************************/
		 try {
			 Class<?> demo6=Class.forName("com.test.reflection.Book");
			 Constructor<?>[] cons=demo6.getConstructors();
			 for(int i=0;i<cons.length;i++){
				 Class<?> p[]=cons[i].getParameterTypes();
		            System.out.print("构造方法：  ");
		            int mo=cons[i].getModifiers();
		            System.out.print(Modifier.toString(mo)+" ");
		            System.out.print(cons[i].getName());
		            System.out.print("(");
		            for(int j=0;j<p.length;++j){
		                System.out.print(p[j].getName()+" arg"+j);
		                if(j<p.length-1){
		                    System.out.print(",");
		                }
		            }
		            System.out.println("){}");
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 /*************************************************************/
		try {
			Class<?> demo7 = Class.forName("com.test.reflection.Book");
			Method[] methods = demo7.getMethods();
			for (Method method : methods) {
				Class<?> returnType = method.getReturnType();
				Class<?>[] params = method.getParameterTypes();
				int temp = method.getModifiers();
				System.out.print(Modifier.toString(temp) + " ");
				System.out.print(returnType.getName() + "  ");
				System.out.print(method.getName() + " ");
				System.out.print("(");
				for(int j=0;j<params.length;++j){
	                System.out.print(params[j].getName()+" "+"arg"+j);
	                if(j<params.length-1){
	                    System.out.print(",");
	                }
	            }
				 Class<?> exce[]=method.getExceptionTypes();
				 if(exce.length>0){
		                System.out.print(") throws ");
		                for(int k=0;k<exce.length;++k){
		                    System.out.print(exce[k].getName()+" ");
		                    if(k<exce.length-1){
		                        System.out.print(",");
		                    }
		                }
		            }else{
		                System.out.print(")");
		            }
		            System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("===============本类属性========================");
			Class<?> demo8 = Class.forName("com.test.reflection.Book");
			// 取得本类的全部属性
			Field[] field = demo8.getDeclaredFields();
			for (int i = 0; i < field.length; i++) {
	            // 权限修饰符
	            int mo = field[i].getModifiers();
	            String priv = Modifier.toString(mo);
	            // 属性类型
	            Class<?> type = field[i].getType();
	            System.out.println(priv + " " + type.getName() + " "
	                    + field[i].getName() + ";");
	        }
			System.out.println("===============实现的接口或者父类的属性========================");
	        // 取得实现的接口或者父类的属性
	        Field[] filed1 = demo8.getFields();
	        for (int j = 0; j < filed1.length; j++) {
	            // 权限修饰符
	            int mo = filed1[j].getModifiers();
	            String priv = Modifier.toString(mo);
	            // 属性类型
	            Class<?> type = filed1[j].getType();
	            System.out.println(priv + " " + type.getName() + " "
	                    + filed1[j].getName() + ";");
	        }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("===============通过反射调用类中的方法========================");
			Class<?> demo9=Class.forName("com.test.reflection.Book");
			Method method=demo9.getMethod("toString");
			Object obj= method.invoke(demo9.newInstance());
			System.out.println(obj);
			
			Method method2=demo9.getMethod("setName", String.class);
			Object obj2= method2.invoke(demo9.newInstance(), "666");
			System.out.println(obj2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("===============通过反射调用类中的属性========================");
			Class<?> demo10 = Class.forName("com.test.reflection.Book");
			Object obj = demo10.newInstance();
			Field field = demo10.getDeclaredField("author");
			//可以调用私有方法
			field.setAccessible(true);
			field.set(obj, "heheehe");
			System.out.println(field.get(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("===============通过反射取得并修改数组的信息========================");
		int[] temp={1,2,3,4,5};
		System.out.println(temp.getClass().getName());
        Class<?>demo=temp.getClass().getComponentType();
        System.out.println("数组类型： "+demo.getName());
        System.out.println("数组长度  "+Array.getLength(temp));
        System.out.println("数组的第一个元素: "+Array.get(temp, 0));
        Array.set(temp, 0, 100);
        System.out.println("修改之后数组第一个元素为： "+Array.get(temp, 0));
		
        
        System.out.println("===============类加载器========================");
//        其实在java中有三种类类加载器。
//        1）Bootstrap ClassLoader 此加载器采用c++编写，一般开发中很少见。
//        2）Extension ClassLoader 用来进行扩展类的加载，一般对应的是jre\lib\ext目录中的类
//        3）AppClassLoader 加载classpath指定的类，是最常用的加载器。同时也是java中默认的加载器。
		Book b=new Book();
		System.out.println("类加载器 "+b.getClass().getClassLoader().getClass().getName());
		 
		 
	}
}

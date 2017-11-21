package com.test.reflection.factory;

/*
 * 不用反射的工厂模式
 */
interface fruit{
    public abstract void eat();
}
 
class Apple implements fruit{
    public void eat(){
        System.out.println("Apple");
    }
}
 
class Orange implements fruit{
    public void eat(){
        System.out.println("Orange");
    }
}
 
// 构造工厂类
// 也就是说以后如果我们在添加其他的实例的时候只需要修改工厂类就行了
class Factory{
    public static fruit getInstance(String fruitName){
        fruit f=null;
        if("Apple".equals(fruitName)){
            f=new Apple();
        }
        if("Orange".equals(fruitName)){
            f=new Orange();
        }
        return f;
    }
}

public class Factory1 {
	public static void main(String[] args) {
		fruit f=Factory.getInstance("Orange");
	    f.eat();
	}	
}

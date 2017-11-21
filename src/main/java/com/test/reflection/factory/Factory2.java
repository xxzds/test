package com.test.reflection.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 使用反射的工厂模式
 */
interface fruit2{
    public abstract void eat();
}
 
class Apple2 implements fruit2{
    public void eat(){
        System.out.println("Apple");
    }
}
 
class Orange2 implements fruit2{
    public void eat(){
        System.out.println("Orange");
    }
}

//操作属性文件类
class Init{
  public static Properties getPro() throws FileNotFoundException, IOException{
      Properties pro=new Properties();
      File f=new File("fruit.properties");
      if(f.exists()){
          pro.load(new FileInputStream(f));
      }else{
          pro.setProperty("apple", "com.test.reflection.factory.Apple2");
          pro.setProperty("orange", "com.test.reflection.factory.Orange2");
          pro.store(new FileOutputStream(f), "FRUIT CLASS");
      }
      return pro;
  }
}
 
// 构造工厂类
class Factoryx{
    public static fruit2 getInstance(String ClassName){
        fruit2 f=null;
        try{
            f=(fruit2)Class.forName(ClassName).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}

public class Factory2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		fruit2 f=Factoryx.getInstance("com.test.reflection.factory.Apple2");
		Properties pro=Init.getPro();
		fruit2 f=Factoryx.getInstance(pro.getProperty("apple"));
	    f.eat();
	}	
}

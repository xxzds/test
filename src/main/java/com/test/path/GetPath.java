package com.test.path;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class GetPath {

	public static void getPath()
	{
		//方式一
		System.out.println("方式一");
		System.out.println(System.getProperty("user.dir"));
		//方式二
		System.out.println("方式二");
		File directory = new File("");//设定为当前文件夹
		try{
		    System.out.println(directory.getCanonicalPath());//获取标准的路径
		    System.out.println(directory.getAbsolutePath());//获取绝对路径
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		//方式三
		System.out.println("方式三");
		System.out.println(GetPath.class.getResource("/"));
		System.out.println(GetPath.class.getResource(""));
		//方式4
		System.out.println("方式四");
		System.out.println(GetPath.class.getClassLoader().getResource(""));
		System.out.println(GetPath.class.getClassLoader().getResource("source.xml"));
	}
	/**
	 * @param name   文件名  不包含路径
	 */
	public static  String getSrcPath(String name)
	{
		String result=null;
		URL urlpath = GetPath.class.getClassLoader().getResource(name); 
		String path=urlpath.toString();
		//remove the head "file:",if it exists
		if(path.startsWith("file"))
		{
			path=path.substring(5);
		}
		path.replace("/", File.separator);
		result=path;
		return result;
	}
	// filename 文件名 不包含路径
	// ...args  文件夹名      可以输入多个文件夹名参数
	public static String getParallelPath(String filename,String ...args)
	{
		String pre=System.getProperty("user.dir");
		String path=pre;
		for(String arg:args)
		{
			path+=File.separator+arg;
		}
		path+=File.separator+filename;
		if(path.startsWith("file"))
		{
			path=path.substring(5);
		}
		path.replace("/", File.separator);
		return path;
	}
	public static void readFile(String filepath)
	{
		File file=new File(filepath);
		try {
			InputStreamReader sr=new InputStreamReader(new FileInputStream(file));
			BufferedReader br=new BufferedReader(sr);
			String line=null;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getPackagePath(String filename)
	{
		String result=null;
		URL urlpath=GetPath.class.getResource("");
		String path=urlpath.toString();
		if(path.startsWith("file"))
		{
			path=path.substring(5);
		}
		path.replace("/", File.separator);
		result=path+filename;
		return result;
	}
	//获取WebRoot目录
	public static String getWebRootPath()
	{
		URL urlpath=GetPath.class.getResource("");
		String path=urlpath.toString();
		if(path.startsWith("file"))
		{
			path=path.substring(5);
		}
		if(path.indexOf("WEB-INF")>0)
		{
			path=path.substring(0,path.indexOf("WEB-INF")-1);
		}
		path.replace("/", File.separator);
		return path;
	}
	//webroot  WebRoot目录
	//filename  文件名
	//...args   文件名所在文件夹，多个参数输入
	public static String getWebRootFilepath(String webroot,String filename,String ...args)
	{
		String pre=webroot;
		String path=pre;
		for(String arg:args)
		{
			path+=File.separator+arg;
		}
		path+=File.separator+filename;
		if(path.startsWith("file"))
		{
			path=path.substring(5);
		}
		path.replace("/", File.separator);
		return path;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GetPath.getPath();
//		//1 test
		System.out.println(GetPath.getSrcPath("source.xml"));
//		GetPath.readFile(GetPath.getSrcPath("source.xml"));
//		//2 test
//		System.out.println(GetPath.getParallelPath("source.xml", "my file"));
//		GetPath.readFile(GetPath.getParallelPath("source.xml", "my file"));
//		//3 test
//		System.out.println(GetPath.getPackagePath("source.xml"));
//		GetPath.readFile(GetPath.getPackagePath("source.xml"));
		
	}

}

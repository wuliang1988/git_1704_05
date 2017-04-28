package com.hxzy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//获取类类型
		//由jvm来确定，运行时调用谁
		Class oc = Class.forName("com.hxzy.proxy.A");
		
		//获取类加载器
		//proxy的第一个参数
		ClassLoader cl = oc.getClassLoader();
		
		//接口的集合
		//proxy的第二个参数
		Class[] is = oc.getInterfaces();
		
		//代理对象
		//proxy的第三个参数
		InvocationHandler ih = new MyProxy(oc.newInstance());
		
		
		//动态代理
		I i = (I)Proxy.newProxyInstance(cl, is, ih);
		
		
		i.test();
		
		
		
		
	}

}

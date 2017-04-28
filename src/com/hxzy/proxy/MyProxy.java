package com.hxzy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler{
	
	private Object obj;//被代理的实例
	
	public MyProxy(Object obj){
		this.obj = obj;
	}
	
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		//方法调用前
		//增强
		System.out.println("前置增强");
		System.out.println("环绕前");
		Object result = method.invoke(this.obj, args);//切入点
		System.out.println("环绕后");
		//方法调用后
		//增强
		System.out.println("后置增强");
		return result;
	}

}

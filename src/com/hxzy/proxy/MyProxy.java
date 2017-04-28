package com.hxzy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler{
	
	private Object obj;//�������ʵ��
	
	public MyProxy(Object obj){
		this.obj = obj;
	}
	
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		//��������ǰ
		//��ǿ
		System.out.println("ǰ����ǿ");
		System.out.println("����ǰ");
		Object result = method.invoke(this.obj, args);//�����
		System.out.println("���ƺ�");
		//�������ú�
		//��ǿ
		System.out.println("������ǿ");
		return result;
	}

}

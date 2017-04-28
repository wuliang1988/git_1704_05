package com.hxzy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client2 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//��ȡ������
		//��jvm��ȷ��������ʱ����˭
		I i = new A();
		
		System.out.println(i);
		
		Class oc = i.getClass();
		//��ȡ�������
		//proxy�ĵ�һ������
		ClassLoader cl = oc.getClassLoader();
		
		//�ӿڵļ���
		//proxy�ĵڶ�������
		Class[] is = oc.getInterfaces();
		
		//�������
		//proxy�ĵ���������
		InvocationHandler ih = new MyProxy(oc.newInstance());
		
		
		//��̬����
		I i2 = (I)Proxy.newProxyInstance(cl, is, ih);
		
		System.out.println(i2);
		
		
		
		
		
	}

}

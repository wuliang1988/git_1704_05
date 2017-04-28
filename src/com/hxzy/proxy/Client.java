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
		//��ȡ������
		//��jvm��ȷ��������ʱ����˭
		Class oc = Class.forName("com.hxzy.proxy.A");
		
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
		I i = (I)Proxy.newProxyInstance(cl, is, ih);
		
		
		i.test();
		
		
		
		
	}

}

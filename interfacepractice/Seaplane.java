package com.orilore.interfacepractice;

public class Seaplane extends Airplane implements Flyer{
	
	public Seaplane(String name){
		super(name);
	}
	
	public void fly(){
		System.out.print("����");
		super.fly();
		
	}//��д�ķ����Ը���ķ������ԶԸ���ķ�����������
	
	
	public void swim(){
		
		System.out.printf("���Ϸɻ�%s���к���%n",name);
	}

}

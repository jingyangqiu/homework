package com.orilore.interfacepractice;

public class Airplane implements Flyer{
	protected String name;
	
	public Airplane(String name){
		this.name=name;
	}

	public void fly(){
		System.out.printf("�ɻ�%s�ڷ�%n",name);
	}
}

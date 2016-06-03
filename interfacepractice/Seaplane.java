package com.orilore.interfacepractice;

public class Seaplane extends Airplane implements Flyer{
	
	public Seaplane(String name){
		super(name);
	}
	
	public void fly(){
		System.out.print("海上");
		super.fly();
		
	}//重写的方法对父类的方法可以对父类的方法进行修饰
	
	
	public void swim(){
		
		System.out.printf("海上飞机%s航行海面%n",name);
	}

}

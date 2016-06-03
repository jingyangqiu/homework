package com.orilore.interfacepractice;

public class Ocean {

	public static void main(String []args){
		
		//doSwim(new Human("jiasting"));//操作接口swimmer的类的对象     都可调用此方法
		doSwim(new Submarint("黄色一号"));
		
	}
	
	static void doSwim(Swimmer swimmer){//定义是面向接口进行编程  swim方法体为空程序不会报错
		                  //实现了swimmer接口的类都可以调用此方法
		swimmer.swim();
	}
}

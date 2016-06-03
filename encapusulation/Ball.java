package com.orolore.encapusulation;

public class Ball {

	double radius;
	static final double PI=3.14159;
	
	static double toRadians(double angedeg){
		
		return angedeg*(Ball.PI/180);
	}
	
	
	
	
	
	static void doSome(){
//		double i = radius;//静态方法去开中不能调用或访问费静态类成员
		
		double o =2*PI;//静态方法调用静态变量
	}
	
	
	static void doOther(){
		
		doSome();//静态方法调用静态方法
	}
	
	
	//理解    
	//因为在类内部还没创建对象  费静态成员属于对象不属于类 所以他们不能被静态方法访问
	
	
}

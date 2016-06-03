package com.orolore.encapusulation;

public class ballMain {

	public static void main (String[]args){
		
		Ball b = new Ball();
		
		System.out.println(Ball.PI);//静态成员可以直接通过类名访问 （建议）  也可通过对象访问(不建议)
		System.out.println(Ball.toRadians(100));
		
		
		
	}
	
}

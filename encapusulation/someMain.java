package com.orolore.encapusulation;

public class someMain {

	public static void main(String []args){
		
		Some s = new Some(1);
		Integer integer=100;
		s.someMethod(100);//重载的用法    
		s.someMethod(integer);//根据参数的类型  个数  顺序 确定调用哪个同名函数
	
		
	}
}

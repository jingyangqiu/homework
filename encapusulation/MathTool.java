package com.orolore.encapusulation;

public class MathTool {

	public static int sum(int...numbers){
		
		int sum=0;
		
		//增强的for循环    不定长度自变量numbers
		for(int number:numbers){//numbers每取一个数  赋值给number  执行一次循环体  直至取完
			
			sum+=number;
		}
		
		return sum;
	}
	
}

package com.orolore.encapusulation;

public class MathTool {

	public static int sum(int...numbers){
		
		int sum=0;
		
		//��ǿ��forѭ��    ���������Ա���numbers
		for(int number:numbers){//numbersÿȡһ����  ��ֵ��number  ִ��һ��ѭ����  ֱ��ȡ��
			
			sum+=number;
		}
		
		return sum;
	}
	
}

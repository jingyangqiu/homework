package com.orilore.objectpractice;

import java.util.Arrays;

public class test4 {

	public static void main(String[]args){
		//数组的复制
		int []score1={88,7,7,44,32,2,1,33};
		int []score2=new int[score1.length];
		
		//以下两个方法使用于基本 数据类型    对于类类型的数组复制   要手动进行
		System.arraycopy(score1, 0, score2, 0, score1.length);//赋值数组的方法
		int []score3=Arrays.copyOf(score1, score1.length*2);//不用建立新的数组  而且复制后的长度可以自己指定
		
//		for(int i=0;i<score1.length;i++){
//			score2[i]=score1[i];
//		}
		for(int value:score3){
			System.out.printf("%3d",value);
		}
		
	
   		
		
		
		
		
	}
}

package com.orilore.objectpractice;

public class Score {

	public static void main(String []args){
		
		int[]scores={88,81,74,68,90,34};
//		for(int i=0;i<scores.length;i++){
//			System.out.printf("学生分数：%d %n",scores[i]);
//			
//		}
		
		//增强的for循环
		
		
		for(int score:scores){
			System.out.printf("学生分数： %d  %n",score);
		}
		
	}
	
}

package com.orilore.objectpractice;

import java.util.Arrays;

public class Score2 {

	public static void main(String[]args){
		
		int[] scores=new int[10];//事先不知道数组元素  只知道数组个数
		
		for(int score:scores){
			System.out.print(score);
		}
		System.out.println();
		
		
		Arrays.fill(scores, 60);//对数组值  指定新值
		for(int score:scores){
			System.out.printf("%3d", score);
			
		}
		
		
		
		
		
	}
}

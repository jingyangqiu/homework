package com.orilore.objectpractice;

import java.util.Arrays;

public class Score2 {

	public static void main(String[]args){
		
		int[] scores=new int[10];//���Ȳ�֪������Ԫ��  ֻ֪���������
		
		for(int score:scores){
			System.out.print(score);
		}
		System.out.println();
		
		
		Arrays.fill(scores, 60);//������ֵ  ָ����ֵ
		for(int score:scores){
			System.out.printf("%3d", score);
			
		}
		
		
		
		
		
	}
}

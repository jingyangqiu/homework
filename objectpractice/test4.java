package com.orilore.objectpractice;

import java.util.Arrays;

public class test4 {

	public static void main(String[]args){
		//����ĸ���
		int []score1={88,7,7,44,32,2,1,33};
		int []score2=new int[score1.length];
		
		//������������ʹ���ڻ��� ��������    ���������͵����鸴��   Ҫ�ֶ�����
		System.arraycopy(score1, 0, score2, 0, score1.length);//��ֵ����ķ���
		int []score3=Arrays.copyOf(score1, score1.length*2);//���ý����µ�����  ���Ҹ��ƺ�ĳ��ȿ����Լ�ָ��
		
//		for(int i=0;i<score1.length;i++){
//			score2[i]=score1[i];
//		}
		for(int value:score3){
			System.out.printf("%3d",value);
		}
		
	
   		
		
		
		
		
	}
}

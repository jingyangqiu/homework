package com.orilore.objectpractice;

public class test3 {

	public static void main(String []args){
		
//		int[][] arr=new int[2][];//ָֻ�����е�һ������  �ڶ����������Բ�ָ��  Ҳ���Ƕ�ά���鲢��һ�����Ǿ���    ÿ�����������  �и�����ͬ��Ԫ��            
//		//arr[0]=new int[]{1,2,3,4,5};
//		arr[0]=new int[]{1,2,3,4,5};//�����⸳ֵʱ�������������ʽ  ��Ϊ������һ������
//		arr[1]=new int[]{1,2,3};
		
	//������һ�ֶ�����ʽ	
		int[][]arr={
				{1,2,3,4,5},
				{1,2,3}
		};
		
   for(int [] row:arr){
	   
	   for(int value:row){
		   System.out.printf("%3d",value);
	   }
	   System.out.println();
	   
   }
		
	}
	
}

package com.orilore.objectpractice;

public class test3 {

	public static void main(String []args){
		
//		int[][] arr=new int[2][];//只指定其中的一个索引  第二个索引可以不指定  也就是二维数组并不一定都是矩阵    每个行数组可以  有个数不同的元素            
//		//arr[0]=new int[]{1,2,3,4,5};
//		arr[0]=new int[]{1,2,3,4,5};//声明外赋值时必须采用这种形式  因为数组是一个对象
//		arr[1]=new int[]{1,2,3};
		
	//数组另一种定义形式	
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

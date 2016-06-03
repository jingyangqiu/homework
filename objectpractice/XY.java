package com.orilore.objectpractice;

public class XY {

	public static void main(String []args){
		
		int[][]cords={
				{1,2,3},{4,5,6}	
		};
		System.out.println(cords.length);
		System.out.println(cords[0].length);
		for(int x=0;x<cords.length;x++){//得知有几行
			
			for(int y=0;y<cords[x].length;y++){//循环每列
				
				
				System.out.printf("%2d",cords[x][y]);
			}
			
			System.out.println();
		}
		//增强的for循环
		for(int[]row:cords){//取出数组每行的数组   赋给row  执行循环体
			
			for(int value:row){//取出数组row中的每个元素  执行循环体
				
				System.out.printf("%2d ",value);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

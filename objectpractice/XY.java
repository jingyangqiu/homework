package com.orilore.objectpractice;

public class XY {

	public static void main(String []args){
		
		int[][]cords={
				{1,2,3},{4,5,6}	
		};
		System.out.println(cords.length);
		System.out.println(cords[0].length);
		for(int x=0;x<cords.length;x++){//��֪�м���
			
			for(int y=0;y<cords[x].length;y++){//ѭ��ÿ��
				
				
				System.out.printf("%2d",cords[x][y]);
			}
			
			System.out.println();
		}
		//��ǿ��forѭ��
		for(int[]row:cords){//ȡ������ÿ�е�����   ����row  ִ��ѭ����
			
			for(int value:row){//ȡ������row�е�ÿ��Ԫ��  ִ��ѭ����
				
				System.out.printf("%2d ",value);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

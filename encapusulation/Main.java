package com.orolore.encapusulation;

import java.util.Scanner;

public class Main {

	public static void main(String[]args){
//		//创建对象时初始化的封装
//		CashCard []cards={
//				new CashCard("A001",500,0),
//				new CashCard("A002",300,0),
//				new CashCard("A003",3000,3)
//				
//		};//注意对象数组的创建和初始化
//		
//		for(CashCard card:cards){
//			System.out.printf("(%s,%d,%d)%n",card.number,card.balance,card.bounds);
//		}//这一for循环的使用  注意掌握
//	
		
//	Scanner s = new Scanner(System.in);
//	CashCard card1=new CashCard("A001",500,0);
//	card1.store(s.nextInt());
//		
		
	 
		
	CashCard card1=new CashCard("A1001",100,900);
//	card1.balance+=100;//私有数据成员   不能再类外进行访问
	System.out.print(card1.getBounds());//桶过set给私有数据赋值   get 方法取得私有数据  
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

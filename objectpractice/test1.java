package com.orilore.objectpractice;

public class test1 {

	public static void main(String []args){
		
		int data1=10;
		int data2= 20;
		
		Integer wrapper1=new Integer(data1);//基本类型打包
		Integer wrapper2=new Integer(data2);
		
		System.out.println(data1/3);
		System.out.println(wrapper1.doubleValue()/3);//操作打包好的对象
		
		System.out.println(wrapper1.compareTo(wrapper2));//copareTo  方法用于比较两个对象的比较  返回值可以是-1  1 0                                              
		
		
		
	}
	
}

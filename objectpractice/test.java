package com.orilore.objectpractice;
import java.math.BigDecimal;
public class test {

	public  static void main(String[]args){
//		int a=100;
//		int b=100;
//		int c=a;
//		
//		System.out.println(a==b);
//		System.out.println(a==c);
		//==用于基本数据类型时        是比较两个变量存储的值是否相等
		
		
		BigDecimal a= new BigDecimal("0.1");
		BigDecimal b= new BigDecimal("0.1");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//==  用于对象类型时   是比较两个参考名称是否指向同一对象
		//equas 用于对象类型时   是比较两个对象的 具体内容是否相同
		
		
		
	}
	
	
	
}

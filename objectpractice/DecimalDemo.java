package com.orilore.objectpractice;
import java.math.BigDecimal;
public class DecimalDemo {

	public static void main(String[]args){
//		BigDecimal op1=new BigDecimal("0.1");
//		BigDecimal op2=new BigDecimal("0.1");
//		BigDecimal op3=new BigDecimal("0.1");
//		BigDecimal result = new BigDecimal("0.3");
//		
//		if(op1.add(op2).add(op3).equals(result)){
//			System.out.println("����0.3");
//		}
//		else{
//			
//			System.out.println("������0.3");
//			
//		}
		
		
		BigDecimal op1= new BigDecimal("1.0");
		BigDecimal op2=new BigDecimal("0.8");
		
		
		BigDecimal result=op1.subtract(op2);//�������ļ���
		
		BigDecimal result1=op1.multiply(op2);//�������ĳ˷�
		
		BigDecimal result2=op1.divide(op2);//�������ĳ���
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		
	}
	
	
}

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
		//==���ڻ�����������ʱ        �ǱȽ����������洢��ֵ�Ƿ����
		
		
		BigDecimal a= new BigDecimal("0.1");
		BigDecimal b= new BigDecimal("0.1");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//==  ���ڶ�������ʱ   �ǱȽ������ο������Ƿ�ָ��ͬһ����
		//equas ���ڶ�������ʱ   �ǱȽ���������� ���������Ƿ���ͬ
		
		
		
	}
	
	
	
}

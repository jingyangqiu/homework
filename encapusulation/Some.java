package com.orolore.encapusulation;

public class Some {

	private  int a=10;
	private String text="n.a";
	
	
	public Some (int a){
		if(a>0){
		this.a=a;
		}
	}
	
	public Some(int a,String text)
	{
		
		this(a);//���ø���Ĺ��캯��
//		if(a>0){
//			this.a=a;
//		}
		if(text!=null){
			this.text=text;
		}
				
	}	//���캯������һ��д���������������ĶԶ�����г�ʼ��
	
	
	public void someMethod(int i){
		System.out.println("int�汾������");
	}
	
	public void someMethod(Integer integer){
		
		System.out.println("Integer �汾������");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

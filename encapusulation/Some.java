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
		
		this(a);//调用父类的构造函数
//		if(a>0){
//			this.a=a;
//		}
		if(text!=null){
			this.text=text;
		}
				
	}	//构造函数的另一种写法，可以有条件的对对象进行初始化
	
	
	public void someMethod(int i){
		System.out.println("int版本被调用");
	}
	
	public void someMethod(Integer integer){
		
		System.out.println("Integer 版本被调用");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

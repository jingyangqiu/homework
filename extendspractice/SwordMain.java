package com.orlore.extendspractice;

public class SwordMain extends Role {
	
	public void fight(){
		
		System.out.println("挥剑攻击");
	}
	
	
	public String toString(){
		
		return "剑士"+super.toString();//通过super关键字调用父类的方法     
	}

}

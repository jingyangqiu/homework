package com.orlore.extendspractice;

public class Magician  extends Role{
	
	public void fight(){
		
		
		System.out.println("魔法攻击");
	}

	
	public void cure(){
		
		System.out.println("魔法治疗");
	}
	
        public String toString(){
        	
        	return "魔法师"+super.toString();
        }
	
	
	
	
	
}

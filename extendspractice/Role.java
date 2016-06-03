package com.orlore.extendspractice;

public abstract class Role {//抽象方法不完整  不可实例化

	private String name;
	private int level;
	private int blood;
	
	public int getBlood(){
		
		return blood;
	}
	
	public void setBlood(int blood){
		
		this.blood=blood;
	}
	
	public int getLevel(){
		
		return level;
	}
	
	public void setLevel(int level){
		
		this.level=level;
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setName(String name){
		
		
		this.name=name;
	}
	
	
	public  String  toString(){
		
		return String.format("(%s,%d,%d)", this.name,this.level,this.blood);//将指定形式形式的字符串
		
		
	}
	
	
	
	
	//public void fight(){}//不完整的方法   必须在子类中重写才有具体的意义
	
	public abstract void fight();//抽象方法可以不带方法体   强制子类必须重写
	
	
	
}

package com.orilore.interfacepractice;

public class Submarint implements Swimmer{
	
	private String name;
	public Submarint(String name){
		this.name=name;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void swim(){
		
		System.out.printf("Ǳˮͧ%s Ǳ�� %n",this.name);
	}
	

}

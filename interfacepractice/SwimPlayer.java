package com.orilore.interfacepractice;

public class SwimPlayer extends Human implements Swimmer{
	
	 public SwimPlayer(String name){
		super(name);
	}
	 
	 
	 public void swim(){
		 
		 System.out.printf("��Ӿѡ��%s��Ӿ %n",name);
	 }
	 
	 

}

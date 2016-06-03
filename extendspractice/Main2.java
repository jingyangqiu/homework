package com.orlore.extendspractice;

public class Main2 {

 
	public static void main(String[] args){
		
		
		SwordMain swordMan=new SwordMain();
		swordMan.setName("Justin");
		swordMan.setLevel(1);
		swordMan.setBlood(200);
		
		
		Magician magician= new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		
//		drawFight(swordMan);//实际操作的是swordman的实例  
//		drawFight(magician);
	String s = swordMan.toString();
	String s1=magician.toString();
	
	System.out.println(s);
	System.out.println(s);
	}
	
	
	static void drawFight(Role role){//父类对象指向子类实例   父类同名方法被子类覆盖
		
		
		System.out.print(role.getName());
		role.fight();
		
	}//面向父类进行编程，根据不同的参数决定不同的动作
	//
	
	
	
	
	
	
	
}

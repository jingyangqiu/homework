package com.orlore.extendspractice;

public class Main {
 
	public static void main(String[]args){
		
		demoSwordMan();
		demoMagician();
		
	}
	
	static void demoSwordMan(){
		SwordMain swordMan=new SwordMain();
		swordMan.setName("Justin");
		swordMan.setLevel(1);
		swordMan.setBlood(200);
		
		System.out.printf("剑士:(%s,%d,%d)%n",swordMan.getName(),swordMan.getLevel(),swordMan.getBlood());
		//c语言形式的带格式输出  %n表示输出后换行
	}
	
	static void demoMagician(){
		
		Magician magician= new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("魔法师：(%s,%d,%d)%n",magician.getName(),magician.getLevel(),magician.getBlood());
		
		
		
	}
	
	
	
}

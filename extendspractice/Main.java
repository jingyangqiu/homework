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
		
		System.out.printf("��ʿ:(%s,%d,%d)%n",swordMan.getName(),swordMan.getLevel(),swordMan.getBlood());
		//c������ʽ�Ĵ���ʽ���  %n��ʾ�������
	}
	
	static void demoMagician(){
		
		Magician magician= new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("ħ��ʦ��(%s,%d,%d)%n",magician.getName(),magician.getLevel(),magician.getBlood());
		
		
		
	}
	
	
	
}

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
		
//		drawFight(swordMan);//ʵ�ʲ�������swordman��ʵ��  
//		drawFight(magician);
	String s = swordMan.toString();
	String s1=magician.toString();
	
	System.out.println(s);
	System.out.println(s);
	}
	
	
	static void drawFight(Role role){//�������ָ������ʵ��   ����ͬ�����������า��
		
		
		System.out.print(role.getName());
		role.fight();
		
	}//��������б�̣����ݲ�ͬ�Ĳ���������ͬ�Ķ���
	//
	
	
	
	
	
	
	
}

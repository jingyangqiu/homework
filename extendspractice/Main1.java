package com.orlore.extendspractice;

public class Main1 {

	public static void main(String [] args){
		SwordMain swordman=new SwordMain();
		
		swordman.setName("Justan");
		swordman.setLevel(1);
		swordman.setBlood(100);
		
		Magician magician= new Magician();
		magician.setName("Monicia");
		magician.setLevel(1);
		magician.setBlood(100);
		
	showblood(swordman);//swordman��һ��role
	
	showblood(magician);//magician������һ��role
			
	}
	
	static void showblood(Role role){
		
	System.out.printf("%s, Ѫ��    %d%n",role.getName(),role.getBlood());
		
	}//��һ��ڲ����������͵Ķ���   ��ʵ������������б��  ����������ָ�������ʵ��
	
	//��̬   һ�ַ�����Բ�ͬ�����ͽ��в�ͬ�Ķ���  ����ʱ��̬
	
	
	
	
	
	
	
	
	
}

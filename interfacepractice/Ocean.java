package com.orilore.interfacepractice;

public class Ocean {

	public static void main(String []args){
		
		//doSwim(new Human("jiasting"));//�����ӿ�swimmer����Ķ���     ���ɵ��ô˷���
		doSwim(new Submarint("��ɫһ��"));
		
	}
	
	static void doSwim(Swimmer swimmer){//����������ӿڽ��б��  swim������Ϊ�ճ��򲻻ᱨ��
		                  //ʵ����swimmer�ӿڵ��඼���Ե��ô˷���
		swimmer.swim();
	}
}

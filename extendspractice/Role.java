package com.orlore.extendspractice;

public abstract class Role {//���󷽷�������  ����ʵ����

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
		
		return String.format("(%s,%d,%d)", this.name,this.level,this.blood);//��ָ����ʽ��ʽ���ַ���
		
		
	}
	
	
	
	
	//public void fight(){}//�������ķ���   ��������������д���о��������
	
	public abstract void fight();//���󷽷����Բ���������   ǿ�����������д
	
	
	
}

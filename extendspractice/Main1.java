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
		
	showblood(swordman);//swordman是一种role
	
	showblood(magician);//magician是另外一种role
			
	}
	
	static void showblood(Role role){
		
	System.out.printf("%s, 血量    %d%n",role.getName(),role.getBlood());
		
	}//单一借口操作多种类型的对象   其实质是面向父类进行编程  传进来的是指向子类的实例
	
	//多态   一种方法针对不同的类型进行不同的动作  运行时多态
	
	
	
	
	
	
	
	
	
}

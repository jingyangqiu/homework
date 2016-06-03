package com.orolore.encapusulation;

public class Other {

	
	//构造函数调用之前调用的初始化区块   用一对大括号括起来
	
	{
		
		System.out.println("初始化区块");
	}
	
	Other (){
		
		System.out.println("调用构造函数");
	}
	
	
}

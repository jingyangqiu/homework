package com.orolore.encapusulation;

public class CashCard {

	private String number;
	private int balance;
	private int bounds;//对私有数据成员进行封装
	
public 	CashCard(String number,int balance,int bounds){
		this.number=number;//this  指向当当前对象
		this.balance=balance;
		this.bounds=bounds;
	}
	
	public void store(int money){
		if(money>0){
			this.balance+=money;
			if(money>1000){
				this.bounds++;		
			}
			
		}
		
		else{
			System.out.println("储值是负的，你是乱来的吗？");
		}
		
	}
	
	public void charge(int money){
		
		if(money>0){
			
			if(money<this.balance){
				this.balance-=money;
			}
			
			else{
				
				System.out.println("钱不够啦！！");
			}
		}
		else{
			System.out.println("取值是负的，这不是存钱吗?");
		}
		
	}
	
    public int exchange(int bouds){
    	if(bounds>0){
    		
    		this.bounds-=bounds;
    	}
    	
    	return this.bounds;
    	
    	
    }
    
    public int gteBalance(){
    	return this.balance;
    }
    
    public int getBounds(){
    	
    	return this.bounds;
    	
    }
    
    public String getNumber(){
    	
    	return this.number;
    }
    
    
    
    
    
    
	
	
	
	
	
	
	
}

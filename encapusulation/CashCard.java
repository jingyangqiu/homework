package com.orolore.encapusulation;

public class CashCard {

	private String number;
	private int balance;
	private int bounds;//��˽�����ݳ�Ա���з�װ
	
public 	CashCard(String number,int balance,int bounds){
		this.number=number;//this  ָ�򵱵�ǰ����
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
			System.out.println("��ֵ�Ǹ��ģ�������������");
		}
		
	}
	
	public void charge(int money){
		
		if(money>0){
			
			if(money<this.balance){
				this.balance-=money;
			}
			
			else{
				
				System.out.println("Ǯ����������");
			}
		}
		else{
			System.out.println("ȡֵ�Ǹ��ģ��ⲻ�Ǵ�Ǯ��?");
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

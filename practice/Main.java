package com.orilore.calendar.practice;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String []args){
		
		Calendar c = Calendar.getInstance();
		
		c.set(2016,1,1,10,10,10);
		
		Date d = c.getTime();
		System.out.println(d.toString());
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.MONTH,1);
		
		Date d1= c1.getTime();
		System.out.println(d1);
		System.out.println(d1.toString());
		
		
		
		
	}
}

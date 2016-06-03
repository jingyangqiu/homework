package com.orilore.housework.live;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Salary {

	public static void main(String []args){
		Scanner in= new Scanner(System.in);
		System.out.println("请输入起始时间");
		
		String start=in.next();
		System.out.println("请输入截止时间");
		String end=in.next();
		//String start= "2016-5-1";
		//String end="2016-6-1";
		long start1=0;
		long end1=0;
		int wage= 10000;
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-hh");
		try{
		Date date1= s.parse(start);
		Date date2= s.parse(end);
		end1 = date2.getTime();
         start1=date1.getTime();
        //System.out.println(start1);
		
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		long time = (end1-start1)/1000/60/60/24;
		System.out.println(time);
		long pay=time*wage;
		System.out.println(pay);
		
		
	}
	
}

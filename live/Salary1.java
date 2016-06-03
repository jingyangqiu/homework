package com.orilore.housework.live;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Salary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starttime=0;
		long endtime=0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入起始日期");		
		String start=in.next();
		System.out.println("请输入截止日期");
		String end = in.next();
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		
		try{
	       Date start1=s.parse(start);
	        starttime=start1.getTime();
	       Date end1= s.parse(end);
	        endtime=end1.getTime();

	       
		}catch(Exception e){
			
			e.printStackTrace();
		}
		long worktime=(endtime-starttime)/1000/60/60/24;
		System.out.println("工作时间为"+worktime+"天");
		System.out.println("请输入薪酬（天）");
	     String  wage=in.next();
	     Double wage1= Double.parseDouble(wage);
		double pay = wage1*worktime;
		System.out.println("工资为"+pay);
	}

}

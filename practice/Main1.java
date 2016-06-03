package com.orilore.calendar.practice;
import java.util.Calendar;
import java.util.Date;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		int  day=c.get(Calendar.YEAR);//获取当前日期的年
		System.out.println(day);
 
		c.set(Calendar.YEAR, 9999);//为当前日历设置年份
		Date d= c.getTime();
		
		System.out.println(d.toString());
		
	}

}

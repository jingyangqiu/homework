package com.orilore.calendar.practice;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Main3 {

	public static void main(String[] args){
		
//		Calendar c = Calendar.getInstance();		
//		Date d = c.getTime();		
//		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
//		String time= s.format(d);//把当前的日期对象转换成simpledateformat指定格式的字符串		
//		System.out.println(time);
		
		String s = "1990-01-01";
		
		SimpleDateFormat str = new SimpleDateFormat("yyyy-MM-dd");
		try{
		Date d = str.parse(s);//把指定形式字符串，转换成日期对象
		
		System.out.println(d.toString());
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		
	}
}

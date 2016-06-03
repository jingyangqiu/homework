package com.orilore.housework.live;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Live {
	
	public static void main(String [] args){
		long a1=0;
		String birday="1991-08-26";
		
		SimpleDateFormat s=  new SimpleDateFormat("yyyy-MM-dd");
		try{
		Date d1 = s.parse(birday);//将字符串 转换成date对象
		 a1= d1.getTime();//获取当前对象 距离1970年的毫秒数
		System.out.println(a1);
		
		
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
		Calendar c = Calendar.getInstance();
		Date d2 = c.getTime();//获取当前时间对象
		
		long a2 = d2.getTime();//当前时间对象至历元的毫秒数
		
		System.out.println(a2);
		
		long age= (a2-a1)/1000/60/60/24/365;//活了多少年
		System.out.println(age);
	}

}

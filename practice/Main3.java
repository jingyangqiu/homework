package com.orilore.calendar.practice;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Main3 {

	public static void main(String[] args){
		
//		Calendar c = Calendar.getInstance();		
//		Date d = c.getTime();		
//		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
//		String time= s.format(d);//�ѵ�ǰ�����ڶ���ת����simpledateformatָ����ʽ���ַ���		
//		System.out.println(time);
		
		String s = "1990-01-01";
		
		SimpleDateFormat str = new SimpleDateFormat("yyyy-MM-dd");
		try{
		Date d = str.parse(s);//��ָ����ʽ�ַ�����ת�������ڶ���
		
		System.out.println(d.toString());
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		
	}
}

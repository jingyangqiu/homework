package com.orilore.calendar.practice;
import java.util.Calendar;
import java.util.Date;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		int  day=c.get(Calendar.YEAR);//��ȡ��ǰ���ڵ���
		System.out.println(day);
 
		c.set(Calendar.YEAR, 9999);//Ϊ��ǰ�����������
		Date d= c.getTime();
		
		System.out.println(d.toString());
		
	}

}

package com.orlore.useofstring;

public class Main {
	
	public static void main(String[]args){
		
		String str= "liujianfei";
//		Integer length =str.length();//ȡ���ַ����ĳ���
//		System.out.println(length);
		
		String str1 = "qiujiangyang";
//		Boolean flag = str.equals(str1);//�Ƚ����ַ����ĳ���
//		System.out.println(flag);
		
//		String str2=str.toUpperCase();//���ַ���ת���ɴ�д  tolowercase��ת����Сд		
//		System.out.println(str2);
		
//		Character c = str.charAt(4);//�����ڴ��㿪ʼ�ĵ���λ�ַ�
//		System.out.println(c);
		
//		Boolean flag = str.contains("qqqqq");//�ж��ַ������Ƿ����ָ�����ַ���
//		System.out.println(flag);
		
//		Boolean flag = str.startsWith("uuu");//�ж��ַ������Ƿ����ָ���ַ�����ʼ endswith�ж��Ƿ���ָ����׺��β
//		System.out.println(flag);
		
//		Boolean flag = str.equalsIgnoreCase("ljajld");//���Դ�Сд�ж��ַ������Ƿ����ָ���ַ���
//		System.out.println(flag);
		
//		
//		byte[] bb=str.getBytes();//���ַ���ת�����ֽ���
//		for(int i =0;i<bb.length;i++){        
//		System.out.print(bb[i]);
//		
//		}	
		
		
		
//		Integer i = str.indexOf("i");//��һ�γ���ָ���ַ���λ��   lastindexof���һ�γ���ָ���ַ���λ��
//		System.out.println(i);
		
//		String s =str.replace("liu", "qiu");//�����ַ����滻�ַ�����ָ�����ֶ�
//		System.out.println(s);
		
//		String []s = str.split("i");//�����ַ�������ַ���
//		for(int i=0;i<s.length;i++){
//			
//			System.out.println(s[1]);
//		}
		
		
		String s = str.substring(3,6);//���ش�0��ʼ���ĵ���λ������λǰһλ�ַ���
		System.out.println(s);
		
		
		char[] c = str.toCharArray();//�����µ��ַ�����
		for(int i=0;i<c.length;i++){
			
			
			System.out.print(c[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}

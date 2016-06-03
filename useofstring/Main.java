package com.orlore.useofstring;

public class Main {
	
	public static void main(String[]args){
		
		String str= "liujianfei";
//		Integer length =str.length();//取得字符串的长度
//		System.out.println(length);
		
		String str1 = "qiujiangyang";
//		Boolean flag = str.equals(str1);//比较两字符串的长度
//		System.out.println(flag);
		
//		String str2=str.toUpperCase();//将字符串转换成大写  tolowercase是转换成小写		
//		System.out.println(str2);
		
//		Character c = str.charAt(4);//返回在从零开始的第四位字符
//		System.out.println(c);
		
//		Boolean flag = str.contains("qqqqq");//判断字符串中是否包含指定的字符串
//		System.out.println(flag);
		
//		Boolean flag = str.startsWith("uuu");//判断字符串中是否包以指定字符串开始 endswith判断是否以指定后缀结尾
//		System.out.println(flag);
		
//		Boolean flag = str.equalsIgnoreCase("ljajld");//忽略大小写判断字符串中是否包含指定字符串
//		System.out.println(flag);
		
//		
//		byte[] bb=str.getBytes();//将字符串转换成字节码
//		for(int i =0;i<bb.length;i++){        
//		System.out.print(bb[i]);
//		
//		}	
		
		
		
//		Integer i = str.indexOf("i");//第一次出现指定字符的位置   lastindexof最后一次出现指定字符的位置
//		System.out.println(i);
		
//		String s =str.replace("liu", "qiu");//用新字符串替换字符串中指定的字段
//		System.out.println(s);
		
//		String []s = str.split("i");//根据字符串拆分字符串
//		for(int i=0;i<s.length;i++){
//			
//			System.out.println(s[1]);
//		}
		
		
		String s = str.substring(3,6);//返回从0开始数的第三位至第六位前一位字符串
		System.out.println(s);
		
		
		char[] c = str.toCharArray();//返回新的字符数组
		for(int i=0;i<c.length;i++){
			
			
			System.out.print(c[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}

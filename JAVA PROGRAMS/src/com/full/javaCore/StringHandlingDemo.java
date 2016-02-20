package com.full.javaCore;

public class StringHandlingDemo {

	public void stringDemo(){
		
		String s="Hello String";// creating string using string literal
		String s1=new String("Hello java");// creating string using new keyword
		
		System.out.println(s1);
		System.out.println(s);
		
		System.out.println(s.compareTo(s1));
		System.out.println(s.concat(s1));
	}
	
	public void stringBufferDemo(){
		
		StringBuffer sb= new StringBuffer("Hello");
		StringBuffer str= new StringBuffer("FULL");
		sb.append(str);
		
	}
	public void stringBuilderDemo(){
		
		StringBuilder sb= new StringBuilder("Hello");
		StringBuffer sb1= new StringBuffer("FULL");
		
		System.out.println(sb.append(sb1));
		
	}
	public static void main(String[] args) {
		
		StringHandlingDemo sh= new StringHandlingDemo();
		sh.stringDemo();
		sh.stringBuilderDemo();
		sh.stringBufferDemo();
	}
}

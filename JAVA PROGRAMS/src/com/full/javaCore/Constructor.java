package com.full.javaCore;

public class Constructor {

	int id;
	String name;
	
	public Constructor(int i , String n){
		
		id=i;
		name=n;
	}
	public void disp(){
		
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		Constructor c= new Constructor(10,"arun");
		Constructor c1= new Constructor(11,"kumar");
		c.disp();
		c1.disp();
	}
}

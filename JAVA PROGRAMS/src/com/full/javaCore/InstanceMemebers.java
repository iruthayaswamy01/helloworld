package com.full.javaCore;

public class InstanceMemebers {

		int rollno;  
		String name;  
	  
	 void insertRecord(int r, String n){  
		   
	  rollno=r;  
	  name=n;  
	  
	 }  
	  
	 void displayInformation(){
		 
		 System.out.println(rollno+" "+name);
		 
	 } 
	  
	 public static void main(String args[]){  
		 
		 InstanceMemebers s1=new InstanceMemebers();  
		 InstanceMemebers s2=new InstanceMemebers();  
	  
		 s1.insertRecord(111,"Karan");  
		 s2.insertRecord(222,"Aryan");  
	  
		 s1.displayInformation();  
		 s2.displayInformation();  
	  
	 }  
}

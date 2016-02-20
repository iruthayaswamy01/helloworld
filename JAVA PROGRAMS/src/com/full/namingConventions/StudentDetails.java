package com.full.namingConventions;

public class StudentDetails {

	int stuId=10;

	String stuname="ravi";
	
	public void display(){
		
		System.out.println("The id is "+stuId);
		System.out.println("The name is"+stuname);
	}
	public static void main(String[] args) {
		
		StudentDetails sd= new StudentDetails();
		sd.display();
		
	}
}

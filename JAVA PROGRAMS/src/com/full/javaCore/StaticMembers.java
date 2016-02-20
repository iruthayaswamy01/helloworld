package com.full.javaCore;

public class StaticMembers {

		 int rollno;  
		 
	     String name;
	     
	     static String college = "SRM";// static variable  
	       
	     static void change(){ // static method
	    	 
	     college = "EEC";  
	     
	     }  
	  
	     StaticMembers(int r, String n){  
	    	 
	     rollno = r;  
	     name = n;
	     
	     }  
	  
	     void display (){
	    	 
	    	 System.out.println(rollno+" "+name+" "+college);
	    	 
	     }  
	  
	    public static void main(String args[]){  
	    	StaticMembers.change();  
	  
	    	StaticMembers s1 = new StaticMembers (111,"Karan");  
	    	StaticMembers s2 = new StaticMembers (222,"Aryan");  
	    	StaticMembers s3 = new StaticMembers (333,"Sonoo");  
	  
	    	s1.display();  
	    	s2.display();  
	    	s3.display();  
	    }  
	
}

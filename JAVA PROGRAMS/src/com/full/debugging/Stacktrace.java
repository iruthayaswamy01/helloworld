package com.full.debugging;

public class Stacktrace {

	public void arithmeticException(){
		
try{
			
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			
			ae.printStackTrace();
		
		}
	}
	public static void main(String[] args) {
		
		Stacktrace st= new Stacktrace();
		st.arithmeticException();
	}
}

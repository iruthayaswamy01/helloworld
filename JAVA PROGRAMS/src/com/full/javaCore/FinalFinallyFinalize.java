package com.full.javaCore;

import java.util.*;

public class FinalFinallyFinalize extends GregorianCalendar {

	public void finalDemo(){
		
//		final int a=10; // Remove the comment and run the program
//		
//		a=20;
//		
//		System.out.println(a);
	}
	
	public void finallyDemo(){
		
		
		try{
			
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			
			
			System.out.println(ae);
		}
		finally{
			
			System.out.println("End of exception");
			
		}
		
	}
	
	public void finalizeDemo(){
		
		try
		{
			FinalFinallyFinalize ff= new FinalFinallyFinalize();
			System.out.println("" + ff.getTime());
			System.out.println("finalizing");
			ff.finalize();
			System.out.println("finalized");
		}
		catch(Throwable ex){
			
			ex.printStackTrace();
		}
			
			
		}
	public static void main(String[] args) {
		
		FinalFinallyFinalize fff= new FinalFinallyFinalize();
		fff.finalDemo();
		fff.finallyDemo();
		fff.finalizeDemo();
	}
}

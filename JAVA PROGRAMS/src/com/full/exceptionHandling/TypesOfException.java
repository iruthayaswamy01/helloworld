package com.full.exceptionHandling;

public class TypesOfException {

public void arithmeticException(){
		
		try{
			
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			
			System.out.println(e);
		}
	}
	
	public void nullPointerException(){
		
		try{
			
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException np){
			
			System.out.println(np);
		}
		
	}
	
	public void arrayIndexOutOfBoundException(){
		
		try{
			
			int[] a={10,20};
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			
			System.out.println(ae);
		}
		
	}
	
	public void classCastException(){
		
		try{
			
			Object o= new Object();
			String s=(String)o;
		}
		catch(ClassCastException c){
			
			System.out.println(c);
		}
		
	}
	
	public void numberFormatException(){
		
		try{
			
			String s="arun";
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException nf){
			
			System.out.println(nf);
		}
		
	}
	
	public static void main(String[] args) {
	
		TypesOfException te= new TypesOfException();
		te.arithmeticException();
		te.arrayIndexOutOfBoundException();
		te.nullPointerException();
		te.classCastException();
		te.numberFormatException();
	}
}

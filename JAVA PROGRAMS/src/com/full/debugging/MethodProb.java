package com.full.debugging;

public class MethodProb {

	public void methodOne(){
		
		System.out.print("1");
	}
	
	public void methodTwo(){
		
		System.out.print("2");
	}
	
	public void methodThree(){
		
		System.out.print("3");
	}
	public static void main(String[] args) {
		
		
		MethodProb m =new MethodProb();
		m.methodTwo();
		m.methodOne();
		m.methodThree();
	}

}

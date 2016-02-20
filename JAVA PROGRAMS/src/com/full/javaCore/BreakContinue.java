package com.full.javaCore;

public class BreakContinue {

	public void breakDemo(){
		
		for(int i=0 ; i<10 ; i++){
			
			if(i==3){
				
				break;
			}
			
			System.out.println(i);
		}
	}
	
	public void continueDemo(){
		
		for(int i=0 ; i<10 ; i++){
			
			if(i==3){
				
				continue;
			}
			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		BreakContinue bc= new BreakContinue();
		bc.breakDemo();
		bc.continueDemo();

	}

}

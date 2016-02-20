package com.full.dataStructure;


import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		
		ArrayList l= new ArrayList();
		List a=Collections.synchronizedList(l);
		
		System.out.println(l.size());
		
		a.add("A");
		a.add(10);
		a.add(null);
		a.add("A");
		
		System.out.println(a.size());
		System.out.println(a);
		
		
		
		
		
	}
}

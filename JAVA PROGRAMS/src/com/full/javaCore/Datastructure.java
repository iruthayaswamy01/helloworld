package com.full.javaCore;

import java.util.*;
public class Datastructure {

	public void listDemo(){
		
		ArrayList a= new ArrayList();
		a.add("A");
		a.add(null);
		a.add("A");
		a.add(12);
		System.out.println(a);
	}
	public void setDemo(){
		
		HashSet s= new HashSet();
		s.add("a");
		s.add("A");
		s.add(null);
		s.add("a");
		System.out.println(s);
	}
	
	public void mapDemo(){
		
		HashMap m=new HashMap(16);
		Map h=Collections.synchronizedMap(m);
		h.put(1,"Ganesh");
		h.put(2, "ravi");
		h.put(3, "Chandra");
		h.put('a',"Kumar");
		h.put(3,"Chandra");
		h.put(null,"arul");
		h.put(null,"arul");
		System.out.println(h);
		
		Set s=h.keySet();
		System.out.println(s);
		
		Collection c= h.values();
		System.out.println(c);
		
		
	}
	public static void main(String[] args) {
		
		Datastructure ds= new Datastructure();
		ds.listDemo();
		ds.setDemo();
		ds.mapDemo();
		
	}
}

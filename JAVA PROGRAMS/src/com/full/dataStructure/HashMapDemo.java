package com.full.dataStructure;
import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
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
}

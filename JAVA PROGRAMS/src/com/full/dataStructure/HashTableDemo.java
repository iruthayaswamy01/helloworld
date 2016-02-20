package com.full.dataStructure;

import java.util.*;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable h= new  Hashtable();
		h.put(1, "arun");
		h.put(2, "Kumar");
		h.put(3, "Ravi");
		System.out.println(h);
		System.out.println(h.get(2));
	}
}

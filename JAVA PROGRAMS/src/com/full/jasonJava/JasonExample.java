package com.full.jasonJava;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class JasonExample {

	public void encodeJason(){
		
		JSONObject obj= new JSONObject();
		obj.put("name", "arun");
		obj.put("salary", 15000.00);
		System.out.println(obj);
	}
	
	public void decodeJason(){
		
		 	String s="{\"name\":\"arun\",\"salary\":15000.00}";  
		    Object obj=JSONValue.parse(s);  
		    JSONObject jsonObject = (JSONObject) obj;  
		  
		    String name = (String) jsonObject.get("name");  
		    double salary = (Double) jsonObject.get("salary");  
		    System.out.println(name+" "+salary);  
	}
	public static void main(String[] args) {
		
		JasonExample je= new JasonExample();
		je.encodeJason();
		je.decodeJason();
	}


	
}

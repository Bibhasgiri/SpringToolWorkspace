package com.bibhas.java;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapSorting {
public static void main(String[] args)throws ParseException {
	HashMap<String, String> h=new HashMap<String, String>();
	h.put("JDK 1.1.4", "Sparkler"); 
	h.put("J2SE 1.2", "Playground"); 
	h.put("J2SE 1.3", "Kestrel"); 
	h.put("J2SE 1.4", "Merlin"); 
	h.put("J2SE 5.0", "Tiger");
	h.put("Java SE 6", "Mustang");
	h.put("Java SE 7", "Dolphin");
	
	System.out.println("HashMap Before sorting,random order");
	Set<Entry<String,String>> entries=h.entrySet();
	
	
	

	
}
}

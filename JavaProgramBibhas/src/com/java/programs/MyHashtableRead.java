package com.java.programs;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableRead {
	public static void main(String[] args) {
		Hashtable<String, Integer> hm = new Hashtable<String, Integer>();
		hm.put("ABB",010);
		hm.put("CGI", 020);
		hm.put("HCL", 003);
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println("Value of " + key + " is: " + hm.get(key));
		}
	}
}

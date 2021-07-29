package com.java.programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashMapEntrySet {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		hm.put("null", "null");
		hm.put("", "");
		hm.put("null", "");
		hm.put("null", "");
		System.out.println(hm);
		Set<Entry<String, String>> entries = hm.entrySet();
		for (Entry<String, String> en : entries) {
			System.out.println(en.getKey() + "==>" + en.getValue());
		}
	}
}

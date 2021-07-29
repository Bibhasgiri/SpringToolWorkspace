package com.java.programs;

import java.util.HashMap;

public class MyHashMapCopy {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");

		System.out.println(hm);

		HashMap<String, String> subMap = new HashMap<String, String>();
		subMap.put("s1", "S1 Value");
		subMap.put("s2", "S2 Value");
		hm.putAll(subMap);
		System.out.println(hm);
	}

}

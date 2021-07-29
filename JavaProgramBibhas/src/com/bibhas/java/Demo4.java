package com.bibhas.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo4 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("null");
		a.add("null");
		a.add("null");
		a.add("A");
		a.add("B");
		a.add("C");
		Iterator<String> itr = a.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equals("B")) {
				itr.remove();
				//System.out.println(itr);
			}
			
		}
		
	}
}

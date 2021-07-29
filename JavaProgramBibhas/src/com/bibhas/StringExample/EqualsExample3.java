package com.bibhas.StringExample;

import java.util.ArrayList;

public class EqualsExample3 {
	public static void main(String[] args) {
		String st1 = "Mukesh";
		ArrayList<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Mukesh");
		list.add("Ajay");
		list.add("Ramesh");
		for (String st : list) {
			if (st.equals(st1)) {
				System.out.println("Mukesh is Present");
			}
		}
	}
}

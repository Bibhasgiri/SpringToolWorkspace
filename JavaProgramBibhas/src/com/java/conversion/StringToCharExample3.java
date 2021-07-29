package com.java.conversion;

public class StringToCharExample3 {
	public static void main(String[] args) {
		String s = "hello";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println("char at " + i + " index is " + ch[i]);
		}
	}
}

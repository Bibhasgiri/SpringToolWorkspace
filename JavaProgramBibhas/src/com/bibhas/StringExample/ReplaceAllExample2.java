package com.bibhas.StringExample;

public class ReplaceAllExample2 {
	public static void main(String[] args) {
		String s1 = "My name is khan. My name is Bob. My name is Sonoo";
		String rs = s1.replaceAll("is", "was");
		System.out.println(rs);
	}
}

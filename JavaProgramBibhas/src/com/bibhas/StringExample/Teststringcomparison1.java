package com.bibhas.StringExample;

public class Teststringcomparison1 {
	public static void main(String[] args) {
		String s = "A";
		String s1 = "A";
		String s2 = new String("A");
		String s3 = "B";
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}
}

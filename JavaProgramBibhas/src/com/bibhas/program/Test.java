package com.bibhas.program;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.exit(1000);
		
		} catch (Exception e) {
			System.out.println("Catch");

		} finally {
			System.out.println("finally");
		
		}
	}
}

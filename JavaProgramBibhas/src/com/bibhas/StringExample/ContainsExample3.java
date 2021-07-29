package com.bibhas.StringExample;

public class ContainsExample3 {
	public static void main(String[] args) {
		String str = "To learn Java visit Javatpoint.com";
		if (str.contains("Javatpoint")) {
			System.out.println("This String contins javatpoint");
		} else {
			System.out.println("Result not found");
		}
	}
}

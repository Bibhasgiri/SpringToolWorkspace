package com.bibhas.StringExample;

public class EndsWithExample2 {
   public static void main(String[] args) {
	String st="Welcome to javatpoint.com";
	System.out.println(st.endsWith("point"));
	if(st.endsWith(".com")) {
		System.out.println("String ends with com");
		
	}else System.out.println("It doen't not end with.com");
}
}

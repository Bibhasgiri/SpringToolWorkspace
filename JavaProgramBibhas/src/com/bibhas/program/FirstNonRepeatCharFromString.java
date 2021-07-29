package com.bibhas.program;

public class FirstNonRepeatCharFromString {
	 public static void main(String[] args) {

	        String s = "SIMPLEST";
	        for(Character ch:s.toCharArray()) {
	            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
	                System.out.println("First non repeat character = " + ch);
	                break;
	            }
	        }
	    }
}

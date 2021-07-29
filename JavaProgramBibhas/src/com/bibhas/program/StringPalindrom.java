package com.bibhas.program;

public class StringPalindrom {
	public static void main(String[] args) {
		String s="momom";
		char ch[]=s.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length/2; i++) {
			if(ch[i]!=ch[ch.length-i-1]) {
				f=1;
			}	
		}
		if(f==0)
			System.out.println("String is Palindrom="+s);
		else
			System.out.println("String is not Palindrom=" +s);
		
	}
}
 
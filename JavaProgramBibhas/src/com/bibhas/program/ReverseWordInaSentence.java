package com.bibhas.program;

public class ReverseWordInaSentence {
public static void main(String[] args) {
	String s="Bibhas is a Bad Boy";
	char ch[]=s.toCharArray();
	String sp=" ";
	for (int i =0; i<ch.length; i++) {
		int k=i;
		while(i<ch.length&&ch[i]!=' ') {
			i++;	
		}
		int j=i-1;
		while(j>=k) {
			sp=sp+ch[j];
			j--;
		}  
		sp=sp+" ";
	}
	System.out.println(sp);
}
}

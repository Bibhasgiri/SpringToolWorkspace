package com.bibhas.program;

public class ReplaceSequenceChar {
  public static void main(String[] args) {
	String s="AAAAAABBBBBBCCCGGGAAAHHHDD";
	char ch[]=s.toCharArray();
	String s1="";
	for (int i = 0; i < ch.length; i++) {
		int flag=0;
		while(ch[i]==ch[i+1]) {
			flag=1;
			i++;
		}
		if(flag==1) {
			s1=s1+"*";
			
		}
		s1=s1+ch[i];
		System.out.println(s1);
	}
}
}

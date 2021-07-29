package com.bibhas.program;

public class MaxElement {
public static void main(String[] args) {
	int n[]= {1,5,62,6,100};
	int max=n[0];
	for (int i = 1; i < n.length; i++) {
		if(n[i]>max) {
			max=n[i];
			System.out.println(max);
		}
		
	}
}
}

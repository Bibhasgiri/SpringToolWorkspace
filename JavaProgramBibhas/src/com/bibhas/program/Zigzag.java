package com.bibhas.program;

public class Zigzag {
  public static void main(String[] args) {
	int a[]= {2,4,6};
	int b[]= {1,3,5};
	int add=a.length+b.length;
	int n[]=new int[add];
	int k=0;
	for(int i=0,j=0;i<add;i++,j++) {
		if(j<a.length) {
			n[k]=a[i];
		    k=k+1;
		}
		if(j<b.length) {
			n[k]=b[i];
			k=k+1;
		}
	}
	for(int i=0;i<add;i++) {
		System.out.print(n[i]+" ");
	}
}
}

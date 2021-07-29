package com.java.programs;

public class ArrayCyclicallyRotate {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	for (int i =arr.length; i>0; i--) {
		arr[i]=arr[i-1];
		arr[i-1]=arr[i];
		System.out.print(arr[i]);
	}
	
}
}

package com.bibhas.datastru;

public class MyLinearSearch {
	private static int linersearch(int[] arr,int key) {
		int size=arr.length;
		for (int i = 0; i <size; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5,6};
	int searhkey=3;
	System.out.println("Key "+searhkey+"found at index "+linersearch(arr1,searhkey));
}
}

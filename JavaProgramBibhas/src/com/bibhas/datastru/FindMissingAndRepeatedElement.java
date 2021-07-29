package com.bibhas.datastru;

public class FindMissingAndRepeatedElement {
	
	static void printTwoElements(int arr[], int size) {
		System.out.print("The repeating element is ");

		for (int i = 0; i < size; i++) {
			int val = Math.abs(arr[i]);
			if (arr[val - 1] > 0)
				arr[val - 1] = -arr[val - 1];
			else
				System.out.println(val);
		}

		System.out.print("And the missing element is ");
		for (int i = 0; i < size; i++) {
			if (arr[i] > 0)
				System.out.println(i + 1);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 7,2,2,1,3,1,7};
		int n = arr.length;
		printTwoElements(arr, n);
	}
}

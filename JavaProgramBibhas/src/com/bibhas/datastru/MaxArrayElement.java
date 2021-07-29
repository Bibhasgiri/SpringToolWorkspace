package com.bibhas.datastru;

public class MaxArrayElement {
	static int findMaxium(int arr[], int low, int high) {
		int max = arr[low];
		for (int i = low; i <= high; i++) {
			if (arr[i] > max)
				max = arr[i];

		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 30, 40, 50, 60, 70, 23, 20 };
		int n = arr.length;
		System.out.println("The Maximum element is " + findMaxium(arr, 0, n - 1));
	}
}
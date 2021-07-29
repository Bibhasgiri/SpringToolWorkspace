package com.bibhas.datastru;

public class CountNoOfOccurance {

	/*
	 * static int countOccurance(int arr[], int n, int x) { int res = 0; for (int i
	 * = 0; i < n; i++) if (x == arr[i]) res++; return res; }
	 * 
	 * public static void main(String[] args) { int arr[] = { 1, 2, 2, 2, 2, 3, 4,
	 * 7, 8, 8 }; int n = arr.length; int x = 2;
	 * System.out.println(countOccurance(arr, n, x)); }
	 */
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 2, 2,2, 3, 4, 7, 8, 8 };
		int x = 2;
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i])
				res++;

		}
		System.out.println(res);
	}

}

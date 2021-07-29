package com.bibhas.datastru;

public class GFG1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int m = 11;
		int t = 0;
		while (true) {
			int items = 0;
			for (int i = 0; i < arr.length; i++)
				items += (t / arr[i]);
			     t++;
			
				System.out.println(items);
			

		}

	}
}

package com.bibhas.datastru;

public class MissingElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5};
		int total = (a.length + 1) * (a.length + 2) / 2;
		for (int i = 0; i < a.length; i++) {
			total -= a[i];

		}
		System.out.println(total);
	}
}

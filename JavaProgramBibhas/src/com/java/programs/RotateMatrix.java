package com.java.programs;

public class RotateMatrix {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int N = 3;
		for (int i = N - 1; i >= 0; i--) {
			for (int j = N - 1; j >= 0; j--)
				System.out.print(mat[i][j] + " ");

			System.out.println();
		}
	}
}
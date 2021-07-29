package com.bibhas.program;



public class ReverseString {
	public static void main(String[] args) {
		String s = "A!!!B.C.D,E'F,GHI Bibhas";
		char ch[] = s.toCharArray();
		char ch1[] = new char[ch.length];
		for (int k = 0, j = ch.length - 1; j >= 0; j--) {

			int i = (int) ch[j];
			if (i >= 65 && i <= 90) {
				ch1[k] = ch[j];
				k++;
			}

		}
		for (int m = 0, k = 0; m < ch.length; m++) {

			int i = (int) ch[m];
			if (i >= 65 && i <= 90) {
				ch[m] = ch1[k];
				k++;
			}

		}
		System.out.println(ch);
	}
}

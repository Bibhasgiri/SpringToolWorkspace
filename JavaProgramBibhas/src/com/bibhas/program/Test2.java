package com.bibhas.program;

import java.util.StringTokenizer;

public class Test2 {
	public static void main(String[] args) {

		String s = "Bibhas Giri Bangalore";
		int count = 0;
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			count++;
			if (count == 1 || count == 2) {
				System.out.print(word.charAt(0));
			}

		}
		
	}

}

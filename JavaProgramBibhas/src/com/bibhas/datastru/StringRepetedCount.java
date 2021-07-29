package com.bibhas.datastru;

public class StringRepetedCount {
	public static void main(String[] args) {
		String s = "BBibhaas";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int k = 1;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j])
				{
					ch[j]=' ';
					k++;
				}
				
			}
			if(ch[i]!=' ')
				System.out.println(ch[i] + "== " + k);
			

		}

	}
}

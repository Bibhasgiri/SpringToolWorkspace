package com.bibhas.java;

public class Demo3 {
	public static void main(String[] args) {
		String match = "Bibhas";
		String text = "BibhasBibhas is BadBibhasBadBibhasBadBibhas BangaloreBibhasBibhasghskj1233099818`=+BibhasBibhas+Bibhas+GirlrBibhas====+biBibBhBibhas";
		int i = 0;
		int c = 0;
		while ((i = (text.indexOf(match, i) + 1)) > 0) {
			c = c + 1;
		}
		System.out.println(match+ " Total Matches elements is= " +c);

	}
}

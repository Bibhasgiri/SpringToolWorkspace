package com.bibhas.datastru;

public class RepeatElement {
   public static void main(String[] args) {
		
		/*
		 * int a[] = { 1, 2, 3, 2, 1, 5, 6, 5 }; for (int i = 0; i < a.length; i++) {
		 * for (int j = i + 1; j < a.length; j++) { if (a[i] == a[j])
		 * System.out.print(a[i] + " "); }
		 * 
		 * }
		 */
		 
		
		  String s[]= {"HI","HI","Hello","Hello","HI","Hello","H"}; for (int i = 0;
		  i < s.length; i++) { for (int j =i+1; j < s.length; j++) { if(s[i]==s[j]) {
		  System.out.println(s[i]+" "); }
		  
		  }
		  
		  }
		 
}
}

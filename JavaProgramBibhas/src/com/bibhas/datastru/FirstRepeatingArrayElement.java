package com.bibhas.datastru;

import java.util.HashSet;

public class FirstRepeatingArrayElement {
    public static void main(String[] args) {
		int arr[]= {1,1,2,3,2,3,3};
		int min=-1;
		HashSet<Integer> set=new HashSet<Integer>();
		for (int i =arr.length-1; i>=0; i--) {
			if(set.contains(arr[i])) 
				min=i;
			else
				set.add(arr[i]);
			
		}
		if(min!=-1)
			System.out.println("The first repeated array Element is " + arr[min]);
		else
			System.out.println("There are no repeating array Element");
	}
}

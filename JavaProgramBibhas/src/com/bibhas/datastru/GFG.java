package com.bibhas.datastru;

import java.util.Arrays;

public class GFG {

	static int findDiff(int arr[],int n,int m) {
		if(m==0||n==0)
			return 0;
		Arrays.sort(arr);
		if(n<m) 
			return -1;
		int mid_diff=Integer.MAX_VALUE;
		
		int first=0,last=0;
		for(int i=0;i+m-1<n;i++) {
			
			int diff=arr[i+m-1]-arr[i];
			
			if(diff<mid_diff) {
				mid_diff=diff;
				first=i;
				last=i+m-1;
			}
		}
		return (arr[last]-arr[first]);
	}
	public static void main(String[] args) {
		int arr[] = {12, 4, 7, 9, 2, 23, 
                25, 41, 30, 40, 28, 
                42, 30, 44, 48, 43, 
               50}; 
		int m=8;
		int n=arr.length;
		System.out.println("Minimum different is "+findDiff(arr, n, m));
	}
}

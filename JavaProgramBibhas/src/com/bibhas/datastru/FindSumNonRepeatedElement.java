package com.bibhas.datastru;

import java.util.Arrays;

public class FindSumNonRepeatedElement {
	 static int findSum(int arr[], int n) { 
	        // sort all elements of array  
	  
	        Arrays.sort(arr); 
	         
	        int sum = arr[0]; 
	        for (int i = 0; i < n-1; i++) { 
	            if (arr[i] != arr[i + 1]) { 
	                sum = sum + arr[i+1]; 
	            } 
	        } 
	  
	        return sum; 
	    } 
	  
	// Driver code  
	    public static void main(String[] args) { 
	        int arr[] = {1, 2, 3, 1, 1, 4, 5, 6}; 
	        int n = arr.length; 
	        System.out.println(findSum(arr, n)); 
	  
	    } 
	} 

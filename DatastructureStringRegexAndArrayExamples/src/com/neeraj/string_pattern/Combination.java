package com.neeraj.string_pattern;

// Reference
// https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
//Print all possible combinations of r elements in a given array of size n
//Given an array of size n, generate and print all possible combinations of r elements in array. For example, if input array is {1, 2, 3, 4} and r is 2, then output should be {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.
//Following are two methods to do this.

//Java program to print all combination of size r in an array of size n 
import java.io.*; 

class Combination { 

	/* arr[] ---> Input Array 
	data[] ---> Temporary array to store current combination 
	start & end ---> Staring and Ending indexes in arr[] 
	index ---> Current index in data[] 
	r ---> Size of a combination to be printed */
	static void combinationUtil(int arr[], int data[], int start, 
								int end, int index, int r) 
	{ 
		// Current combination is ready to be printed, print it 
		if (index == r) 
		{ 
			for (int j=0; j<r; j++) 
				System.out.print(data[j]+" "); 
			System.out.println(""); 
			return; 
		} 

		// replace index with all possible elements. The condition 
		// "end-i+1 >= r-index" makes sure that including one element 
		// at index will make a combination with remaining elements 
		// at remaining positions 
		for (int i=start; i<=end && end-i+1 >= r-index ; i++) 
		{ 
		    System.out.println("elem ="+arr[index]+",index ="+index+", i ="+i+", end ="+end+", end-i+1 = "+(end-i+1)+", r-index = "+(r-index));
			data[index] = arr[i]; 
			combinationUtil(arr, data, i+1, end, index+1, r); 
		} 
	} 

	// The main function that prints all combinations of size r 
	// in arr[] of size n. This function mainly uses combinationUtil() 
	static void printCombination(int arr[], int n, int r) 
	{ 
		// A temporary array to store all combination one by one 
		int data[]=new int[r]; 

		// Print all combination using temprary array 'data[]' 
		combinationUtil(arr, data, 0, n-1, 0, r); 
	} 

	/*Driver function to check for above function*/
	public static void main (String[] args) { 
		int arr[] = {1, 2, 3, 4, 5}; 
		int r = 3; 
		int n = arr.length; 
		printCombination(arr, n, r); 
	} 
} 

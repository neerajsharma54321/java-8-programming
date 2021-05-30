package com.array;

import java.util.Scanner;

// Program for array rotation
// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

public class ArrayRotation {

//	public static void main(String[] args) {
//		int arr[] = new int[]{ 2, 4, 6, 9, 8 , 10};
//		int revArr [] = new int[arr.length];
//		System.out.println("Enter the position for reverse");
//		
//		int pos = Integer.valueOf(new Scanner(System.in).nextLine());
//		
//		if(pos > arr.length) {
//			System.out.println("Position should not greater than "+arr.length);
//		}else {
//			int startIndex = pos - 1;
//			for(int i=startIndex; i<arr.length ; i++) {
//				revArr[i] = arr[i];
//				
//				if(i == arr.length)
//				
//			}
//		}
// 	}

	 void leftRotate(int arr[], int d, int n) 
	    { 
	        for (int i = 0; i < d; i++) 
	            leftRotatebyOne(arr, n); 
	    } 
	  
	    void leftRotatebyOne(int arr[], int n) 
	    { 
	        int i, temp; 
	        temp = arr[0]; 
	        for (i = 0; i < n - 1; i++) 
	            arr[i] = arr[i + 1]; 
	        arr[i] = temp; 
	    } 
	  
	    /* utility function to print an array */
	    void printArray(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    } 
	  
	    // Driver program to test above functions 
	    public static void main(String[] args) 
	    { 
	    	ArrayRotation rotate = new ArrayRotation(); 
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
	        rotate.leftRotate(arr, 2, 7); 
	        rotate.printArray(arr, 7); 
 	    } 
	} 

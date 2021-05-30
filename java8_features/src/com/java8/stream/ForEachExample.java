package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Example 1 : To perform print operation on each element of reversely sorted stream.

public class ForEachExample {
	public static void main(String ...s) {
		// Creating a list of Integers 
        List<Integer> list = Arrays.asList(2, 14, 6, 8, 10); 
  
        
        // sorted list
        System.out.println("sorted order");
        list.stream().sorted().forEach(System.out::println);
        
        System.out.println("reverse order.");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}
}

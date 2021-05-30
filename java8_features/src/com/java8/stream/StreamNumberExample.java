package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamNumberExample {
	public static void main(String ...s) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		
		// parallel stream
		list.stream().parallel().filter(number -> number > 90).forEach(output -> {
			System.out.println("parallel data = \t"+ output);
		});
		
		
		// sequential stream
		list.stream().sequential().filter(number -> number > 90).forEach(output -> {
			System.out.println("output from sequential =\t"+ output);
		});
		
		// sum the number those are greter then 80
		int sum = list.stream().parallel().filter(number -> number >80).mapToInt(i -> i).sum();
	}
}

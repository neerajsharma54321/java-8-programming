package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(3);
		list.add(8);
		
		list.forEach(element -> System.out.println(element));

	}

}

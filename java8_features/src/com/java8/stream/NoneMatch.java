package com.java8.stream;

import java.util.stream.Stream;

// https://www.geeksforgeeks.org/stream-nonematch-method-java-examples/
public class NoneMatch {
	public static void main(String ...s) {
		boolean b = new StringLenghtCheck().noneMatch(Stream.of("CSE", "C++", 
                "Jav", "DS"));
		System.out.println("b ="+b);
		
		boolean b1 = new StringLenghtCheck().noneMatch(Stream.of());
		System.out.println("b1 ="+b1);
	}
}

class StringLenghtCheck{
	public boolean noneMatch(Stream<String> stream) {
		
		// Here we can also use the Predicate function
//		new Predicate<String>() {
//			@Override
//			public boolean test(String t) {
//				return t.length() > 4;
//			}
//		};
		return stream.noneMatch(data -> data.length() > 2);
	}
}
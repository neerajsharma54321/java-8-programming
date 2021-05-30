package com.java8.stream;

import java.util.stream.Stream;

public class ParseToWrapperClass {

	public static void main(String ...s) {
		Stream<String> stringStream = Stream.of("2","50", "8", "9");
		
		stringStream.mapToInt(str -> Integer.parseInt(str))
		.map(data -> data*2)
		.forEach(System.out::println);
	}
}

package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AnyMatch {
	public static void main(String ...s) {
		Integer [] num = {2,5,6,3,1};
		new MatchExample().myMethod(Arrays.asList(num).stream());
		
		String str[] = {"Hello", "HI", "How", "Are", "You"};
		System.out.println(new HavingUpperCaseAtFirstIndex().myMethod(Arrays.asList(str).stream()));
		
	}
}

class MatchExample {
	void myMethod(Stream<Integer> l) {
		boolean b = l.anyMatch(i -> i%2 !=0);
		System.out.println("b = "+b);
	}
}

class HavingUpperCaseAtFirstIndex{
	boolean myMethod(Stream<String> s) {
		return s.anyMatch(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return Character.isUpperCase(t.charAt(0));
			}
		});
	}
}
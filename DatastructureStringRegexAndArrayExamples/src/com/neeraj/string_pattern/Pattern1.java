package com.neeraj.string_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("ab");
		
		Matcher  m = pattern.matcher("sunRahahnaabtuabababhjj");
		
		while(m.find()) {
			System.out.println("start ="+m.start()+", end ="+m.end());
		}
		
		// group count
		
		System.out.println("m.groupCount()"+m.groupCount());
		
		// group
		System.out.println("m.group()"+m.group());
		
	}

}
// output

/*
start =10, end =12
start =14, end =16
start =16, end =18
start =18, end =20

*/
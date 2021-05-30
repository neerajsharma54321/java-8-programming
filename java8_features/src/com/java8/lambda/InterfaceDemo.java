package com.java8.lambda;

public class InterfaceDemo {
	
	interface MyInterfaceExample{
		String helloWorld(String s);
	}
		
	public static void main(String s[]) {
		MyInterfaceExample myInterfaceExample = (String msg) -> {
			return msg;
		};
		
		System.out.println(myInterfaceExample.helloWorld("Kaise ho, Kanha ho, Chale Aao..."));
	}
}



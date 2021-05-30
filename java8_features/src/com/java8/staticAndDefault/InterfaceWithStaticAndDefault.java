package com.java8.staticAndDefault;


interface MyInterface1{
	void show();
	default void myfun() {
		System.out.println("myfun in my interface1");
	}
	
	static void hello() {
		System.out.println("Hello MyInterface1 static method");
	}
	
	// error- the static method can not hide the instance method from Object
//	static void toString() {
//		
//	}
}

interface MyInterface2{
	void show();
	default void myfun() {
		System.out.println("myfun in my interface2");
	}
	
	static void hello() {
		System.out.println("Hello MyInterface1 static method");
	}
}

public class InterfaceWithStaticAndDefault implements MyInterface1, MyInterface2 {
	public static void main(String ...s) {
		InterfaceWithStaticAndDefault i = new InterfaceWithStaticAndDefault();
		i.show();
		i.myfun();
		MyInterface1.hello();
	}

	@Override
	public void show() {
		System.out.println("i m show of implemented class");
	}

	@Override
	public void myfun() {
//		MyInterface1.super.myfun();
		System.out.println("myfun of implemented class");
	}
}


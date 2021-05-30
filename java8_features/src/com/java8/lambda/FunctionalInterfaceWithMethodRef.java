package com.java8.lambda;

interface Foo{
	void say();
}

interface FooBar{
	String hello(String messageForMe);
}

public class FunctionalInterfaceWithMethodRef {
	public static void main(String ...s) {
		Foo foo = FunctionalInterfaceWithMethodRef::saySomeThing;
		
		foo.say();
		
		FooBar fooBar = FunctionalInterfaceWithMethodRef::hi;
		System.out.println(fooBar.hello("Dil ko phir se pyar hua, 2ri bar hua"));
		
	}
	
	private static void saySomeThing() {
		System.out.println("Dil ko tum se pyar hua");
	}
	
	private static String hi(String messageForMe) {
		return messageForMe;
	}
}

// Predefined functional interface Runnable to refer static method
 class MethodReference2 {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(MethodReference2::ThreadStatus);  
        t2.start();       
    }  
}  
 
 // We can also use instance method in functional interface
 
 // 
 class MethodReference3 {  
	 	interface A {
	 		void show();
	 	}
	 
	    public void myCustomShow(){  
	        System.out.println("my custom show");  
	    } 
	    
	    public static void main(String[] args) {  
	        MethodReference3 mR3 = new MethodReference3();
	        A a = mR3::myCustomShow;
	        
	        a.show();
	    }  
	} 
 
 // output my custom show
 
 // reference to a constructor


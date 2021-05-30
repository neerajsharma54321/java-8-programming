package com.java8.lambda;

public class FunctionalInterfaceWIthCons {
	public static void main(String s[]) {
		
		   Messageable hello = Message::new;  
	       hello.getMessage("Hello", 4);  
	       
	       Messageable messageable = (msg, a) -> {
	    	   return new Message(msg, a);
	       };
	       
	       messageable.getMessage("neeraj", 5);
	}
}


interface Messageable{  
    Message getMessage(String msg, int a);  
}  
class Message{  
    Message(String msg, int a){  
        System.out.println(msg);  
    }  
}  
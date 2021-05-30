package function_overriding;

// https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/

import java.io.IOException;
// when child class is uses the broder class as compared to base class then it will throw an 
//error 
public class ExceptionBroadingInOverriding {
	public static void main(String str[]) {
		Parent7 parentRef = new Child7();
		try {
			int i = parentRef.show();
			System.out.println(i);
		} catch(Exception ex) {
			System.err.println("An exception is occured.");
		}
	}
}

class Parent7{
	// throws an checked exception
	public Integer show() throws ArithmeticException  {
		System.out.println("show of parent");
		return 1;
	}
}

class Child7 extends Parent7{
//	public Integer show() throws Exception  {
//		System.out.println("show of child");
//		return 1;
//	}
}

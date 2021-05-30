package function_overriding;

import java.io.IOException;

//If child class throws an checked exception but base class doesn't throws an checked exception

// program will throw an error in compilation
public class CheckedExceptionInChildClassExample {
	public static void main(String str[]) {
		Parent5 parentRef = new Child5();
		try {
			int i = parentRef.show();
			System.out.println(i);
		} catch(Exception ex) {
			System.err.println("An exception is occured.");
		}
	}
}

class Parent5{
	// throws an checked exception
	public Integer show(){
		System.out.println("show of parent");
		return 1;
	}
}

class Child5 extends Parent5{
//	public Integer show() throws IOException  {
//		System.out.println("show of child");
//		return 1;
//	}
}



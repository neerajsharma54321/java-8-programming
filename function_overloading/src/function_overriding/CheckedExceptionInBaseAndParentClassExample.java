package function_overriding;

import java.io.IOException;

//If child and base both class throws an checked exception 

// program will execute in proper manner
public class CheckedExceptionInBaseAndParentClassExample {
	public static void main(String str[]) {
		Parent6 parentRef = new Child6();
		try {
			int i = parentRef.show();
			System.out.println(i);
		} catch(Exception ex) {
			System.err.println("An exception is occured.");
		}
	}
}

class Parent6{
	// throws an checked exception
	public Integer show() throws IOException  {
		System.out.println("show of parent");
		return 1;
	}
}

class Child6 extends Parent6{
	public Integer show() throws IOException  {
		System.out.println("show of child");
		return 1;
	}
}

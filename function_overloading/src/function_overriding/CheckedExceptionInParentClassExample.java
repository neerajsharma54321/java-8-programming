package function_overriding;

import java.io.IOException;

//If base class throws an checked exception but child class doesn't throws an checked exception
public class CheckedExceptionInParentClassExample {
	public static void main(String str[]) {
		Parent4 parentRef = new Child4();
		try {
			int i = parentRef.show();
			System.out.println(i);
		} catch(Exception ex) {
			System.err.println("An exception is occured.");
		}
	}
}

class Parent4{
	// throws an checked exception
	public Integer show() throws IOException{
		System.out.println("show of parent");
		return 1;
	}
}

class Child4 extends Parent4{
	public Integer show()   {
		System.out.println("show of child");
		return 1;
	}
}

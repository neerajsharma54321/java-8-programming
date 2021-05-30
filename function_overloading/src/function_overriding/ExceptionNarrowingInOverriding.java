package function_overriding;

public class ExceptionNarrowingInOverriding {
	public static void main(String str[]) {
		Parent parentRef = new Child();
		try {
			int i = parentRef.show();
			System.out.println(i);
		} catch(Exception ex) {
			System.err.println("An exception is occured.");
		}
	}
}

class Parent{
	public Integer show() throws Exception {
		System.out.println("show of parent");
		return 1;
	}
}

class Child extends Parent{
	public Integer show() throws ArithmeticException {
		System.out.println("show of child");
		return 1;
	}
}

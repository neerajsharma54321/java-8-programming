package function_overriding;

//if a parent class throws any unchecked exception while the child class doesn't throws any uncheck exception
//in that class program executes in proper manner.
public class UncheckedExceptionInBaseClassExample {
	public static void main(String str[]) {
		Parent2 parentRef = new Child2();
		try {
			int i = parentRef.show();
			System.out.println(i);
		} catch(Exception ex) {
			System.err.println("An exception is occured.");
		}
	}
}

class Parent2{
	//It throws an unchecked exception
	public Integer show() throws NullPointerException {
		System.out.println("show of parent");
		return 1;
	}
}

class Child2 extends Parent2{
	public Integer show() {
		System.out.println("show of child");
		return 1;
	}
}

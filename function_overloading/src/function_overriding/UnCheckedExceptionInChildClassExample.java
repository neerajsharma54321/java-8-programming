package function_overriding;

//if a parent class doesn't throw any unchecked exception while the child class throws an uncheck exception
//in that class program executes in proper manner.
public class UnCheckedExceptionInChildClassExample {
	public static void main(String str[]) {
		Parent3 parentRef = new Child3();
		try {
			int i = parentRef.show();
			System.out.println(i);
		} catch(Exception ex) {
			System.err.println("An exception is occured.");
		}
	}
}

class Parent3{
	public Integer show(){
		System.out.println("show of parent");
		return 1;
	}
}

class Child3 extends Parent3{
	//It throws an unchecked exception
	public Integer show() throws NullPointerException  {
		System.out.println("show of child");
		return 1;
	}
}

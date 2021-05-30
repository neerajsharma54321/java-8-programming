package function_overriding.covariantreturntypes;

public class Covariant1 {

	public static void main(String[] args) {
		A a = new A();
		a.fun();
		
		
		A b = new B();
		b.fun();
		b.show();
		
	}

}

class A{
	public A fun() {
		System.out.println("Base fun");
		return new A();
	}
	
	public void show() {
		System.out.println("Base show");
	}
}

class B extends A{
	public A fun() {
		System.out.println("Derived fun");
		return new B();
	}
}

package method_overloading;

public class Covariant {

	public A getObj(int a){
		System.out.println("inside A return");
		return new A();
	}
	
	public A getObj(short a) {
		System.out.println("inside B return");
		return new B();
	}
	
	public static void main(String[] args) {
		Covariant c = new Covariant();
		c.getObj(5);
		c.getObj((byte)50);
	}

}

class A {
	
}

class B extends A{
	
}

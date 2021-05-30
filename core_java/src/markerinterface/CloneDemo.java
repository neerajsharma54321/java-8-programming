package markerinterface;

import java.util.ArrayList;

class A implements Cloneable{
	
	int a = 5;
	ArrayList<Integer> arr = new ArrayList<>();
	
	A() {
		arr.add(5);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		A a = (A)super.clone();
		a.arr = new ArrayList<>(a.arr);
		return a;
	}
}

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A();
		A a1 = (A) a.clone();
		a.a = 6;
		a.arr.add(78);
		
		System.out.println("a"+a.a+", a1 = "+a1.a);
		
		System.out.println("arr"+a.arr+", a1 = "+a1.arr);
	}

}

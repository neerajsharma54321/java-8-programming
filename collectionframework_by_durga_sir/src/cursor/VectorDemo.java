package cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String ...s) {
		Vector<Integer> v = new Vector<>();
		Enumeration<Integer> e = v.elements();
		Iterator<Integer> i = v.iterator();
		ListIterator<Integer> listIterator = v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(listIterator.getClass().getName());
	}
}

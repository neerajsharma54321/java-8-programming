package testingDemo;

import myjava.util.Iterator;
import myjava.util.MyArrayList;
import myjava.util.MyList;

public class ArrayListTesting {
	public static void main(String ...s) {
		
		MyList<Integer> myList1 = new MyArrayList<Integer>();
		myList1.add(5);
		myList1.add(25);
		
		Iterator<Integer> iterator =  myList1.iterator();
		while(iterator.hasNext()) {
			int i = iterator.next();
			System.out.println(i);
			if(i == 25) {
				myList1.add(30);
			}
		}
		
		MyList<Integer> myList = new MyArrayList<Integer>();
		myList.add(5);
		myList.add(2);
		myList.addAll(myList1);
		System.out.println(myList);
		
		System.out.println(myList.get(0));
		System.out.println(myList.get(1));
		System.out.println(myList.get(2));
		System.out.println(myList.get(6));
	}
}

package list_interface_basic;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListBasicExample {
	public static void main(String ...s) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		
		System.out.println("starting of the list\n"+list+"\n-------------------------");
		
		// add number at index
		list.set(1, 5);
		System.out.println("after replace object\n"+list+"\n-------------------------");
		
		// add object using index
		list.add(1, 6);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(30);
		list1.add(5);
		
		list.addAll(1, list1);
		System.out.println("----------------after add list--------------\n"+list+"\n-------------------------");
		
		// index related method
		System.out.println(list.indexOf(10));
		System.out.println(list.lastIndexOf(5));
		
		System.out.println("iterate object one by one using listIterator");
		ListIterator<Integer> listIterator = list.listIterator();
		
		while(listIterator.hasNext()) 
			System.out.print("|"+listIterator.next()+"|\t");
		
		System.out.println();
		
		
	}
}

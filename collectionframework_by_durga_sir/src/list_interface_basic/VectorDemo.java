package list_interface_basic;

import java.util.Stack;

public class VectorDemo {
	public static void main(String ...str) {

		// stack related important method for stack
		/*
		 * push(1)
		 * pop();
		 * peek();
		 * pop();
		 * empty();
		 * 
		 */
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(6);
		s.push(8);
		s.push(9);
		
		System.out.println(s);
		
		System.out.println(s.search(2));
		
		System.out.println(s.search(11)); // return -1
		
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		
	}
} 

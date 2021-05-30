package com.ds.stack;

/*
 * In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.*/

// https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
public class StackExample {
	
	public static void main(String[] args) {
		String str = "[{}]]";
		try {
			if(isBalancedStack(str.toCharArray())) {
				System.out.println("Balanced expression");
			}else {
				System.err.println("Not the balanced expression");
			}
		}catch(StackError st) {
			st.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isBalancedStack(char[] expression) throws StackError {
		Stack<Character> stack = new Stack<Character>();
		
		for(int index = 0; index<expression.length; index++) {
			if(isClosing(expression[index])) {
				if(stack.isEmpty())
				return false;
				
				isProperClosingSyntax(stack.pop(), expression[index]);
			}
			else {
				stack.push(expression[index]);
			}
		}
		if(stack.isEmpty()) return true;
		return false;
	}
	
	private static boolean isProperClosingSyntax(char lastChar, char currentChar) {
		if(lastChar == '(' && currentChar == ')') return true;
		else if(lastChar == '{' && currentChar ==  '}') return true;
		else if(lastChar == '[' && currentChar == ']') return true;
		else return false;
	}
	
	private static boolean isOpeningChar(char ch) {
		if(ch == '(' || ch == '{' || ch == '[') return true;
		return false;
	}

	private static boolean isClosing(char ch) {
		if(ch == ')' || ch == '}' || ch == ']') return true;
		return false;
	}
}
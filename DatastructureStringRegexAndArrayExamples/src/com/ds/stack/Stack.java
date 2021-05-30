package com.ds.stack;
public class Stack<T>{
		private final int MAX_SIZE = 100;
		private Object data[] = new Object[MAX_SIZE];
		private int top = -1;
		
		void push(T t) throws StackError {
			if(top == MAX_SIZE) {
				throw new StackError("Stack Over flow error");
			} else {
				data[++top] = t;
			}
		}
		
		T pop() {
			return (T)data[top--];
		}
		
		boolean isEmpty() {
			if(top == -1) return true;
			return false;
		}
		
	}
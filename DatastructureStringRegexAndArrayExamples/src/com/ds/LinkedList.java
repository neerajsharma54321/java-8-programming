package com.ds;

public class LinkedList<T> {
	
	private Node head;
	private int size;
	
	public LinkedList() {
	}
	
	public static class Node<T> {
		private Node<T> next;
		private T data;
	
		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void printAll() {
		System.out.println();
		Node currentNode = head;
		printLinkedList(currentNode);
	}
	
	public void printLinkedList(LinkedList.Node<Integer> currentNode) {
		System.out.print("[");
		while(currentNode != null) {
			System.out.print(currentNode.data);
			currentNode = currentNode.next;
			if(currentNode != null) System.out.print(", ");
		}
		
		System.out.print("]\n");
	}
	
	public int size() {
		int size = 0;
		Node currentNode = head;
		while(currentNode != null) {
			size +=1;
			currentNode = currentNode.next;
		}
		return size;
	}
	
	public void insertAtFirst(T data) {
		@SuppressWarnings("unchecked")
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;	
	}
	
	/**
	 * To remove the first element from the linkedlist
	 * */
	public void remove() {
		Node node = null;
		
		if(head == null) throw new NoSuchElementException();
		
		if(head.next !=null) {
			node = head.next;
		}
		head = node;
	}
	
	/**
	 * To remove the element from the linked list according to index from start to end
	 * */
	public void remove(int index) {
		Node previousNode = null;
		Node currentNode = null;
		
		if(head == null) throw new NoSuchElementException();
		if(index <=0 || index > size()) throw new ArrayIndexOutOfBoundsException();
		
		if(index == 1) {
			remove();
			return;
		}
		
		index -=1;
		int counter = 0;
		currentNode = head;
		for(int i = 0; i < (size()-index); i++) {
			previousNode = currentNode;
			currentNode = currentNode.next;
			counter +=1;
		}	
		previousNode.next = currentNode.next;
		printLinkedList(previousNode);
		head = previousNode;
	}
	
	public T get(int position) {
		if(position <=0) throw new ArrayIndexOutOfBoundsException();
		
		Node node = head;
		position -=1;
		int counter = 0;
		while(node != null) {
			if(counter == position) return (T) node.data;
			counter +=1;
			node = node.next;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	
	/**
	 * Insert the node at last position
	 * */
	public void add(T data) {
		Node<T> temp = new Node<T>(data);
		
		// if linked list is empty then insert into the head and return
		if(head == null) {
			head = temp;
			return;
		}
		
		// traverse to the last element and then add elem
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = temp;
		return;
	}
}

package com.ds;

public class NoSuchElementException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = Long.MAX_VALUE;

	public NoSuchElementException() {}
	
	public NoSuchElementException(String exMessage) {
		super(exMessage);
	}
}

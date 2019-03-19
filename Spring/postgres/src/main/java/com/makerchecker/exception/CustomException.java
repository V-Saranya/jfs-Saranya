package com.makerchecker.exception;

public class CustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CustomException() {
	        super("Customer id does not exist");
	    }
}

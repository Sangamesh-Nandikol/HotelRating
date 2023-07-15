package com.nandii.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String ex) {
		
		super(ex);
		
	}
	
	public ResourceNotFoundException() {
		super("Resource not found");
	}
}

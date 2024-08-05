package com.dsa360.api.exceptions;

/*
 * Author :- Abhay
 * */
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(message);
	}

}

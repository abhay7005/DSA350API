package com.dsa360.api.exceptions;

/*
 * Author :- Abhay
 * */
public class SomethingWentWrongException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SomethingWentWrongException(String message) {
		super(message);
	}

	public SomethingWentWrongException(String message, Throwable cause) {
		super(message, cause);
	}

}

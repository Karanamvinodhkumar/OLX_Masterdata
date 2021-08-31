package com.masterdata.exception;

public class InvalidIdException extends RuntimeException {
	private String message;

	public InvalidIdException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidIdException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Invalid Id :"+message;
	}
	
	
	
	

}

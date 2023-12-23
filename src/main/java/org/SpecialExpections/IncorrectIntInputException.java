package org.SpecialExpections;

public class IncorrectIntInputException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectIntInputException(String message) {
		super(message);
	}
	
	public IncorrectIntInputException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
}

package org.SpecialExpections;

public class IncorrectClassInputExpection extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectClassInputExpection(String message) {
        super(message);
    }

    public IncorrectClassInputExpection(String message, Throwable cause) {
        super(message, cause);
    }
}

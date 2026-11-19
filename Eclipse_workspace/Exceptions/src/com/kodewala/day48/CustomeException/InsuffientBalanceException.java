package com.kodewala.day48.CustomeException;


// Custom Exception -
public class InsuffientBalanceException extends Exception {

	/**
	 
	 */
	private static final long serialVersionUID = 1L; // In case for Serialization
	
	
	//Constructor for this cls- 
	public InsuffientBalanceException(String msg) {
		
		super(msg);
	}

}

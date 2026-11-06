package com.whatsapp.message.day41_Interface_Serialization;

import java.io.Serializable;

public class Message implements Serializable{
	
//	private static final long serialVersionUID = 1L; // L for long number
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String messageId;
	private String message;
	private transient String userId; // we dont want to Serialization --> Transient : Skipped during Serialization.
	
	public Message(String messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}
	
	
	
	

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	// Exception Error : Runtime Error

	
	
}

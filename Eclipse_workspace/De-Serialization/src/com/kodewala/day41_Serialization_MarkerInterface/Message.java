package com.kodewala.day41_Serialization_MarkerInterface;

import java.io.Serializable;






// Owner of this class given permission to serialize or De-serialize any Objects of this class -
public class Message implements Serializable{


	private static final long serialVersionUID = 1L; // By-default we put 1L  -->  L for long number
	
	private String messageId;
	private String message;
	private transient String userId; // we dont want to Serialization --> Transient : Skipped during Serialization.
	
	
	// Init constructor for this class  -
	public Message(String messageId, String message, String userId) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.userId = userId;
	}
	
	
	// Getter and Setter Method for all attributes of this class -


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
	
	
	
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}


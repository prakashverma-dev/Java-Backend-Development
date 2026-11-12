package com.kodewala.day41_DeSerialization;


import java.io.Serializable;

/*
 * 
 * # De-Serialization : It is reverse process of Serialization, means we need to convert recived byte stream into Object and write inside heap.
 * 
 * 
 * 
 * 	Note : When Transferring the Object from one system(mine JVM) to another sytem JVM, SO befoe transferng I made that Object data into byte Stream which got transferred and when another mahacnie De-serialize it he will convert that bytstrem into objects in his JVM machine. Hence, We can say that JAVA objects are machine Indepenent as well as JVM independent.
 * 
 * 
 * We need Serialization, when we taking Objects from one's JVM Machine to  Other's JVM Machine. 
 * 
 * 
 * # How to To Do De_serialization : - We need exact class name of Object to de-serialize.
 * 
 * There are two steps for it (which is Reverse) -
 * 
 * Step1 : File Input Stream --> Firstly read the byte Stream object using 'FileInputStream' Class. 
 * Step2 : Object Input Stream  --> 
 * 
 * 
 * */



//Note : We need same class with all Data Same for De-serialize -

// Owner of this class given permission to serialize or De-serialize any Objects of this class -
public class Message implements Serializable{


	private static final long serialVersionUID = 1L; // By-default we put 1L  -->  L for long number
	
	private String messageId;
	private String message;
	private transient String userId; // we dont want to Serialization --> Transient : Skipped during Serialization.
	
	
	// Init constructor for this class  -
	public Message(String messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}
	
	
	// Getter and Setter Method for all attributes of this class -
	
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
	
	

	
}



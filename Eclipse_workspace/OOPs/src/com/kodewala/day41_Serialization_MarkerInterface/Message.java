package com.kodewala.day41_Serialization_MarkerInterface;

import java.io.Serializable;
/*
 * Class : It is a blueprint of object creation.
 * Object : To represent the Real entities of Real-world. 
 * 
 * #1. We will understand Inbuilt 'Serializable' Marker Interface :-
 * 
 *  It will look like inside the Serializable.class -
 *  
 *  public interface Serializable {
	
	}
	
	Serialization : It is process of Writing the objects of class to file system in byte stream. SO It can be transformed over the network or, store to database, or write to file system.
	
	De-Serialization : sent bytestream will de-seriliazation in reciver computer by his pc JVM from our JVM, to read Object data from given byte streams.
	
	JVM --> So far our class objects are inside the Heap in the JVM. 
	
 *  JVM(mine) --> Heap ---> Java objects 
 * 
 * Serialization : Converting Java Objects into Byte Stream. Hence output of Serialization is 'Byte Stream'.
 * De-Serialization : Converting Byte Stream into Java Objects, stores in our JVM.
 * 
 * 
 * 
 * #2.  How To Implement seriliazation of Objects :-   There are two steps for it -
 * 
 * Step1 : File Output Stream --> Firstly create a file using 'FileOutputStream' Class. 
 * Step2 : Object Output Stream  --> Once file created, we create Object for Output Stream in order to write the file in it.
 *  
 * 
 * 
 * What is Not Serializable Exception In Java ?
 * 
 * Not Serializable Exception : If we dont implements the class with 'Serializable' Interface and if we try to serialize the objects of that class then we get the 'Not Serializable Exception' Error.
 * 
 * Note : Compile Time Error is Different than Runtime Error and 'Exception Error' is one type of Run Time Error.
 * 
 * 
 * 
 * # Default Serial Version ID : The serializable class must declare a static final serialVersionUID field of type long for serialization.
 * 
 * #Note : Once we serialize the Objects, we need to refresh project under 'Project Level' to see the file generated. 
 * 
 * 
 * 
 * 
 * 
 *
 * #3. Java I/O Streams : - 
 * 
 *  There is FileWriter for writing text and Scanner for reading text in Java. These are easy to use, but they are mainly designed for simple text files.
	
	I/O Streams are more flexible, because they work with text and binary data (like images, audio, PDFs).
	
	Types of Streams -
	
	a) Byte Streams : To Work with raw binary data (like images, audio, and PDF files).
					  Examples: FileInputStream, FileOutputStream.
	
	b) Character Streams : To Work with text (characters and strings). These streams automatically handle character encoding.
						Examples: FileReader, FileWriter, BufferedReader, BufferedWriter.
						
						
	Tip: Use character streams when working with text, and byte streams when working with binary data.
	
 
 * */



// Let's Take Example of whatsapp Message To Serialize objects in our system and then de-serialize in other system -


// Message class of User - Owner of this class given permission to serialize any Objects of this class -
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


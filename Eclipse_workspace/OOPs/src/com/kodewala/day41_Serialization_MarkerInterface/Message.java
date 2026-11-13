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
 * #3. 'transient' keyword : During Serialization if some data i.e Class attributes we do not want to sent over the network i.e serialize during its process, we mark that attribute with 'transient'. SO during Serualization this attribute will not convert into byte sreama nd will not sent over network -
 * 
 *    private transient String userId; // Now, userId will not sent over the network i.e Skipped during Serialization.
 * 
 *
 *
 * 'serialVersionUID' keyword : This 'serialVersionUID' is unique keyword given by JVM to class to put some Long value, in order to indentify the class during the De-serilization and if serialVersionUID will not match during de-serilozation it will not process and throw error. 
 *
 *
 * If we skip serialVersionUID then JVM will generte its value internally, everytime when something we change in code with some different value assign to it. So, It is better to assign our own fixed static value i.e 1L for now to not change everytime during code changes. and same ID destination uses while de-serilization. 
 *
 *
 * If we skip skip serialVersionUID, then JVM will give new its value each time internally while code changes. SO we put it manually a fixed i.e static value 1L.
 *
 *
 *
 *Note : During De-Serialization, Right class + Same serialVersionUID + same package --> used to de-serilize the byte stream into object successfully.  
 *
 * #4. Java I/O Streams : - 
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
//	serialVersionUID = 3453543456565; // If we skip serialVersionUID, JVM willgenerates everytime new Long value for it.
	private String messageId;
	private String message;
	
	//Suppose, Some Sensitive Data 'userId' is there, which we do not want to Serialize during its process, so 
	private transient String userId; // userId data will be Skipped during Serialization.
	
	
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


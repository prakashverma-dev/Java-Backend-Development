package com.kodewala.day41_Serialization_MarkerInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * There are two steps To Achieve Serialization Logic -
 * 
 * Step1 : File Output Stream --> Firstly create a file using 'FileOutputStream' Class. 
 * Step2 : Object Output Stream  --> Once file created, we create Object for Output Stream in order to write the file in         it.

 * 
 * 
 * Note : .ser is the extention for Serialization file.
 * 
 * 
 * */

// This class only responsible for passing Message Here for Serilization, We will create object of this class in Driver to pass message and serialize it -
public class HandleMessageSerialization {
	
	public void serializeMessage(Message whatsappMsg) throws IOException {
		
		
		//creating the file where we write the object -
		FileOutputStream fio = new FileOutputStream("myWhatsappMessage.ser"); //creating a file name 'myWhatsappMessage.ser' with .ser in which I will Write the byte stream in it. // We could give .txt file to write object byte streams.
		
		
		// Creating Object for writting object for Output Stream -
		ObjectOutputStream ObjOS = new ObjectOutputStream(fio); // Created object from 'ObjectOutputStream' class to write the object in it.
		
				
		ObjOS.writeObject(whatsappMsg); // passing the object to write the Object into the byte Stream here.
		
		ObjOS.close(); // After Object write we close the connection
		
	}

}

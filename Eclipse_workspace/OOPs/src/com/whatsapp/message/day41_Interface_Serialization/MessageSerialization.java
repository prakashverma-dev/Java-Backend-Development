package com.whatsapp.message.day41_Interface_Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MessageSerialization {
	
	public void serializeMsg(Message msg) throws FileNotFoundException {
		
		FileOutputStream file = new FileOutputStream("msg.ser") ; //creating the file where we write the object.
		
//		ObjectOutputStream ofile = new ObjectOutputStream("MSG1", "mujhe kyu todaaa..");
		
		
	}

}

// we can serialize any java object.
// When we taking one object from one jVM to another jVM we need serialization.
//What is Not Serializable Exception : During Serialization 
// JVM HEAP to Write in File -- Serializable
// file to JVM Heap --> DeSerializable
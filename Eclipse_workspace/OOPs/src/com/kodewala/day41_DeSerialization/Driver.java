package com.kodewala.day41_DeSerialization;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//import com.kodewala.day41_Serialization_MarkerInterface.Message;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
 
//		Test ts = new Test("Prakash");
//		
//		System.out.println(ts.name);
		
//		Step1 : 
		
		// we need to give file location here -
		FileInputStream fis = new FileInputStream("myWhatsappMessage.ser");
		
		
//		Step2 : 
		ObjectInputStream objIS = new ObjectInputStream(fis);
		
		Message msgResult = (Message) objIS.readObject(); 
		System.out.println("Deserialized Message : "+msgResult.getMessage());  // Our bytestream into Readable Object.
		
		//DownCasting Here coz this will give common 'Object', so we need to Downcast in order to target 'Message' Object.
		

		objIS.close();

		
	
		
		
	}

}


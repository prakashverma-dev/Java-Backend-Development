package com.kodewala.day41_UserMsg_DeSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.kodewala.day41_Serialization_MarkerInterface.Message;




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
 * 
 * Note : During De-Serialization : Must Match Same Package name + Same Class name + Same SerialVersionUID, During de-serilization of an Object for that Class. Keep 'Message' Class in different Package and import into the De-serialization package; OR, import 'Message' Class directlt from the Serialization Package, In order to not create or copy Message Class from Source to Here. IF we do not follow this,  -


//We get a ClassCastException because the serialized Message class and the deserialized Message class are in two different packages. Even if both classes have the exact same name and fields, Java treats them as completely unrelated types because their fully qualified names do not match.

  


//Note : • JVM Rule: In Java, a class is uniquely identified by its package name + class name (along with its serialVersionUID). Casting across different packages is not allowed. Casting in same package allowed.



 
 * */

/* Note : -

  Option1 : Either Create a Seperate Same package name of Serilization i.e com.kodewala.day41_Serialization_MarkerInterface and Create 'Message.java' file and then Import here as - 

   import com.kodewala.day41_Serialization_MarkerInterface.Message;


   OR,


  Option2 : Dont Create any 'Message.java' file at Destination, just directlt import the 'Message.class' file from the Source Place, i.e -

   import com.kodewala.day41_Serialization_MarkerInterface.Message;


*/

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
 
//		Test ts = new Test("Prakash");
//		
//		System.out.println(ts.name);
		
//		Step1 : 
		
		// we need to give file location here -
		FileInputStream fis = new FileInputStream("myWhatsappMessage.ser"); // taking bytr stream file from system to here.
		
		
//		Step2 : 
		ObjectInputStream objIS = new ObjectInputStream(fis); // reading the byte stream
		
		Message msgResult = (Message) objIS.readObject(); // Converting 'byte Stream' to Java Object
		
		System.out.println("Deserialized Message : "+msgResult.getMessage());  // Reading the output
		
		//DownCasting Here coz this will give common 'Object', so we need to Downcast in order to target 'Message' Object.
		
		System.out.println("Message Id : "+msgResult.getMessageId());
		System.out.println("User Id : "+msgResult.getUserId());

		objIS.close(); // closing the connection

		
	
		
		
	}

}


package com.kodewala.day41_Serialization_MarkerInterface;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


/* During De-Serialization at Some Other System, Way 1 :- When we send the two files - Message.java and ByteCode i.e myWhatsappMessage.ser at Destination place or other developer via network to De-Serilialize and use it, He must follow some rules to de-serializw it successfully -

Step1 :He must create the same package name which has 'Source USer' used at the time of Serialization.
Step2 : Paste the myWhatsappMessage.ser file under the project folder level.class
Step3 : Paste the Message.java file in the created package.
Step4 : create a new Driver.java file where you will de-serialize it.

//REMEMBER, to keep Message.java file under source package same name. 

*/



//For De-Serialization Way 2 : - Must Match Same Package name + Same Class name + Same SerialVersionUID, During de-serilization of an Object for that Class. Keep 'Message' Class in different Package and import into the De-serialization package; OR, import 'Message' Class directlt from the Serialization Package, In order to not create or copy Message Class from Source to Here. IF we do not follow this,  -


//We get a ClassCastException because the serialized Message class and the deserialized Message class are in two different packages. Even if both classes have the exact same name and fields, Java treats them as completely unrelated types because their fully qualified names do not match.

  


//Note : • JVM Rule: In Java, a class is uniquely identified by its package name + class name (along with its serialVersionUID). Casting across different packages is not allowed. Casting in same package allowed.



public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Step1 : 
		
		// we need to give file location here -
		FileInputStream fis = new FileInputStream("myWhatsappMessage.ser");
		
		
//		Step2 : 
		ObjectInputStream objIS = new ObjectInputStream(fis);
		
		Message msgResult = (Message) objIS.readObject(); 
		System.out.println("Deserialized Message : "+msgResult.getMessage());  // Our bytestream into Readable Object.
		
		//DownCasting Here cozz this will give common 'Object', so we need to Downcast in order to target 'Message' Object.
		
		System.out.println("Message Id : "+msgResult.getMessageId());
		System.out.println("User Id : "+msgResult.getUserId());

		objIS.close(); // closing the connection

	}

}


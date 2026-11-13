package com.kodewala.day41_Serialization_MarkerInterface;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		//Lets Create Object of Message Class -
		Message msg = new Message("MSG111", "Kya kar rahi ho tum...", "PRA234"); // We will write this message content into the byte stream using I/O class, and and writting to byte Steam is part of Serialization so Class owner must give permission via implements it to 'Serializiable' Interface.
		
//		System.out.println(msg.getMessage());
		
		
		
		//Here 'msg' is a Object which we will Serialize it - (There might be 100 of Message Objects between two users, so each message object needs to be serialize to transfer over the network..)
		
//		Note : Once we take Objects from HEAP it will no more alive, then we need to put that Object in another heap to make it alive.
		
		//This Object for handling the logic of Serialization -
		HandleMessageSerialization msgSerialization = new HandleMessageSerialization();
		
		msgSerialization.serializeMessage(msg); // passing Object to here for Serialization.
		

	
	}

}



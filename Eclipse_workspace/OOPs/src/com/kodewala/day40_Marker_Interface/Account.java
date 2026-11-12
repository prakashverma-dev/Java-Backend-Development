package com.kodewala.day40_Marker_Interface;

/*
 * # Marker Interface/Tag Interface : A interface where no methods will be there, an empty method block of Marker Interface.
 * 
 * 	Marker Interface allow JVM to perform special Activity, permission given by Owner of the class.
 * 
 * Ex: 
 * 
 * public interface IMyMarker{
 * 
 *     // No methods
 *
 * }
 * 
 * 
 * 
 * Purpose of Marker Interface: To allow developer to perform some special Activity, which requires some permission.
 * 
 * Ex: Cloning of obj of class --> Copying the objects of class by giving permission with inbuilt Marker Interface 'Cloneable' 
 * 	   For Serialization --> Writing the data in the object.
 * 						 Write to file system, network, memory, database.
 * 
 * //For Serialization (Writing the state of the object to the Memory) : by using java inbuilt Marker Interface 'Serializable'.// Written to file system called serialization(written to byte streams) and when to read it by de-Serilization(convert byte to source code) at that time.
 * 
 * Writing the state of the object to the Memory/Objects can write(in .txt or .pdf formate) to system file if serialization allowed and sends to friend and he will de-serialization.
 * 
 * 
 * Serialization means Object can be Written to user file system.
 * send it to anybody on network
 * Reciever will de-serialized the object and use it in this system.
 * 
 * Serialization : To send OOP's Object from one system to another system over network, we serialize it.
 * 
 * To writting objects to Database, we use serialization to convert Objects into byte stream.
 * byte Stream will be stored and who will read it will convert it into Object data via De-serialization.
 * 
 * Ex: Can anybody clone the Object of Account class in Java, No.. Only If we give permission with Marker Interface then It could be clonned.
 * 
 * 
 * # Inbuilt 'Cloneable' Marker Interface In Java  : -
 * 
 * If we do not implements 'Cloneable' Interface to a class, and we try to clone the object of that class then we get error like 'Clone Not Supported Exception'.
 * 
 * If class implements the 'Cloneable' Marker Interface, means giving instrcuttion to JVM that allow objects of this class to clone.  
 * 
 * If class implements the 'Cloneable' Marker Interface, means Owner of that class has given permission to clone.
 * 
 * 
 * As Java Says We canot bydefault allow anyone to clone object of any class. For that Thet need to take permission from 'Clobeable' Marker Interface by implents into that class.
 * 
 * 
 * # How to Achieve cloning of Object from a class : -
 * 
 * There is a method called .clone() which is available in 'Object' class that help use to clone the objects created from this class, It will only clonned when This class 'Account' give permission by implmenting the inbuilt marker Interface name 'Clonable' which allows each class in Java to clone by taking help of .clone() method -
 * 
 * 
 * Note : If class is implements 'Cloneable' Marker Interface --> clonning of all objects of this class allowed by JVM.
 *       If class is implements 'Serializable' Marker Interface --> serialization of all objects of this class allowed by JVM.
 *       
 *       
 *       
 * # How JVM understands that this class is eligible for Clonable or Serializtion : JVM checks by using keyword 'instanceOf' -
 * 
 * 	instanceOf Operator : It checks the object is instance of given class or provided Interface or not.
 * 
 * Note : When we 'implements' any Interface in class then that Class all Objects will be instance of that Interface.
 * 
 * public class Account implements Cloneable{
 * 
 * }
 * 
 * Here, 'Account' class all objects will be instance of 'Cloneable' MarkerInterface coz It Implements the Interface.
 * 
 * 
 * 
 * Note : Overall, Marker Interface use to control special behaviour, so that JVM can do the activity which are restricted by JAVA internally like cloning of Objects of class, serialization of objects etc.
 * 
 * */



public class Account implements Cloneable {  // We giving permission To get clone/copied of this class objects, we need to give permission from existing marker interface 'Cloneable' to get copy of this class objects by implements  -
	// Tells JVM please allow to clone object of this class.
	
	String name;
	String address;
	String accNo;
	
	
	public Account(String name, String address, String accNo) {
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;
	}

	//creating a Method which responsible for using .clone() method in order to clone any Object created of this class, by calling this method -
	public Object myClone() throws CloneNotSupportedException {
		
		return super.clone(); // get cloned all objects of this class.
		
		//cloning is just xerox of the object.
		
	}

}











package com.kodewala.day27_Prerequisite;

/*
 * 
 * # Concept of Prerequisite In Java : Whatever language we learning there are some common Activity to perform.
 * 
 * Ex: For every user, connection with Database will be common. 
 * 
 * 
 * 
 * # Initialization Blocks/ Init Blocks : -
 * 
 * 	i. Static Init Block :executed once per class loading.
 * 		syntax : static {
 * 
 * 				}
 * ii. Instance Init Block : executed for each Object creation.
 * 
 * 	Syntax  : {
 * 
 * 			  }
 * 
 * 
 * 
 * 
 * 
 * */

public class Driver {
	
	//Writing Static Block - execute when this class will be loaded --> class will be loaded when we try to create objects.
	static {
		
		System.out.println("I am Static Init Block...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

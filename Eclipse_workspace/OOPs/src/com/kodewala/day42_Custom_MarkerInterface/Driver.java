package com.kodewala.day42_Custom_MarkerInterface;

//Lets Check Here, Are will allowed to delete object of 'User' Class or not -

public class Driver {
	
	public static void main(String[] args) {
		
		//Creating a object of 'User' Class -
		User u = new User("Prakash", "23445xyz");
//		System.out.println(u.getUserName());
		
		
		//Let's try to delete the 'u' object -
		DataDeleter del = new DataDeleter();
		
		del.deleteMyObject(u);
		
		/*If we try to delete without implements the our 'Deletable' Custom Marker Interface we get message like -
		
				Not allowed to perform Object Deletion or Data Cleaning Activity.
		
		 And, if we allowed our custom Marker Interface by implements then, We get message to allowed to delete -
				
				Allowed to perform the Object Deletion or Data Cleaning Activity.
				
				
		*/
		
		
//		NOte : How it happened - In Designed DataDeleter logic, we make sure , if here 'u' or any object of 'User' Class is instance of Created Custom Marker Interface 'Deletable' then only allowed to delete, otherwise Not.
		
		
		
	}

}

/**
 * Gree
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

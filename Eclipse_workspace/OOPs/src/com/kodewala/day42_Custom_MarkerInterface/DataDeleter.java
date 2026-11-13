package com.kodewala.day42_Custom_MarkerInterface;


//Class Resonsible for Delete the Data - MAIN LOGIC for data/Object deleting -
public class DataDeleter {
	
	//TO delete data method -
	public void deleteMyObject(Object obj) {
		
		
		// We check, if There is objects of Custom 'Deletable' Marker Interface is there, allowed to delete else Not -
		if(obj instanceof Deletable) {
			
			System.out.println("Allowed to perform the Object Deletion or Data Cleaning Activity.");
			//100 lines logic
			
		}else {
			
			System.err.println("Not allowed to perform Object Deletion or Data Cleaning Activity.");
		}
		
		
	}

}

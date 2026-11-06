package com.kodewala.day42_Interface_Marker;

public class DataCleaner {
	
	//TO delete data method -
	public void deleteMyObject(Object obj) {
		
		if(obj instanceof Deletable) {
			
			System.out.println("Allowed to perform the data cleaning!");
			//100 lines
			
		}else {
			
			System.err.println("Sorry, Not allowed to perform data Cleaning!");
		}
		
		
	}

}

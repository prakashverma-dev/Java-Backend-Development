package com.day50.CollectionStart;
/*
 * 
 Collection Framework : T
 
 Memory (HEAP, STack) : Temporary area to store data. After we close our application our data will be lost.
 
 Database(JDBC) : TO store the data permanently. After we close our application our data will be still stored.
 
 Array : It act as container or box which holds one type of data to store. Ex: Integer data
 
 
 
 
 
 
 
 */
public class Driver {

	public static void main(String[] args) {
		
		//1. storing price i.e data : container or box which holds integer value-
		int price[] = {500, 60, 5000, 2334, 2323, 454, 20, 8000, 323, 123};
		
		//2. Process : find the price value above 1000 -
		for(int i = 0; i<price.length; i++) {
			
			int currentPrice = price[i]; 
			
			if(currentPrice > 1000) {
				
				System.out.println(currentPrice);

			}
		}
		
		
	}

}

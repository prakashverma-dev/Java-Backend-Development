package com.kodewala.day18.loops;

public class DriverSBICustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBICustomers p1 = new SBICustomers("PRakash", 60000, "73784345330");
		SBICustomers p2 = new SBICustomers("Rahul", 1000, "3543455656");
		SBICustomers p3 = new SBICustomers("Sibu", 2000, "8654566455");
		SBICustomers p4 = new SBICustomers("Manansa", 1500, "354543444");
		SBICustomers p5 = new SBICustomers("Priyanshu", 670, "564584345330");
		SBICustomers p6 = new SBICustomers("Prathamesh", 40000, "65545845330");
		
		//Creating an Array to store all customers object to it -
		SBICustomers[] allCustomers = {p1, p2, p3, p4, p5, p6};
		
		
// You need to find the customers whose balance is less than 2000. Print the name and balance of the customers : run loop -
		
		for(int i=0; i< allCustomers.length; i++ ) {
					
			
			if(allCustomers[i].accBalance < 2000) {
				
				System.out.println("-----The Customers Whose Bank Balance is less than 2000 ----");
				System.out.printf("Name : %s and Balance : %f%n ", allCustomers[i].customerName, allCustomers[i].accBalance);
			}
			
		}
	}

}

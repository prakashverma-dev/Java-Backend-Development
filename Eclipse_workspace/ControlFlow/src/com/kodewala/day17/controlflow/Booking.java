package com.kodewala.day17.controlflow;

/*    
	# Control Flow : -
	
	
	1. Your program goes throw different execution path -
	
	i) If fare is less than 5k, then I will book flight ticket.
	ii. If I have less time to travel, then i will book flight ticket.
	iii. If have less money, then I will go by train.
	iv) If i have more time and no money, then I will go by walk. 
	
	
	Here, before then part --> condition
	      after then part ---->  logic to execute
	
	
	Based on Condition --> Program flow will be decided.
	
	Example : i) Filter the students who got more than 60% marks in the exam.
	          ii) IRCTC --> per PRN max 6 passenger allowed. 
	          iii) Get 100 rupees off on order value above 2000. means minimum purchase is 2000.
	
	All these can be performed by or achieve by control flow statements.
	
	Syntax : 
	
	
	a) If we have only two cases or condition : - if-else 
	
	if(<condition>){ // if this conditon is true then only this block of code get executed.
	
	        // if block of code.
	}
	
	If 'if' condition is false then only else block executed, if 'if' block is true then else block will not execute -
	
	else {
	    
	}
	
	
	
	b) If I have Multiple cases - Concept of else-if -
	
	 Budget is less than 1000 --> condition 1
	 Budget is between 1000 to 3000 --> condition 2
	 Budget is 3000 to 5000 --> condition 3
	 Budget is above 5000 --> condition 4
	
	 if(<condition1>){
	 
	 }else if(<condition2){
	 
	 }else if(<condition3){
	 
	 }else{
	
	    // if none above condition get true then it will execute.
	}
	
	Note : If any one condition get true from top to down, then if-else block will terminates immediately at that point only and come out of next step in the program.
	
	
	
	
	Note : ctrl + shift + i ==> inspect to see result by selecting the condition.
	
	if(noOFpax > 7){
	
	}


 *
 */










// Secnario1 : Requirement for developing BOOKing system like IRCT booking system -

// Condition - Do not allow 6 passenger(Pax) per PNR (if pasesenger are more than 6 create another booking, realtime booking) -

public class Booking {
	
	public String doBooking(String from, String to , int noOfPax) {
		
		
		// Assigning the default value for PNR -
		 String pnr = null;
		
		// DO NOT ALLOW BOOKING - 
		if(noOfPax > 6) { // if this is true then code get executed.
			
			
			System.err.println("As per IRCTC policy, only 6 pax are allowed per PNR");
			
		}else {
		// ALLOW BOOKING : Confirming the booking -
			pnr = "234534554";
			System.out.println("Confirming the booking : "+ pnr);
			System.out.println("Status : CONFIRMED");
			System.out.println("SEAT : 23 A1 ");
			
			
		}
		
		//If above condition is false control flow gets here of program.
		
		return pnr;
	}

}

// Scenario2 : How can you plan your trip -

//Budget is less than 1000 --> condition 1
//Budget is between 1000 to 3000 --> condition 2
//Budget is 3000 to 5000 --> condition 3
//Budget is above 5000 --> condition 4

class TripPlanner{
	
	public String suggestPlan(String source, String dest, int budget) {
		
		String suggestion = null;
		
		if(budget <= 1000) {
			
			suggestion = "Stay at home";	
			System.out.println(suggestion);
			
		}else if(budget > 1000 && budget <= 3000) {
			
			suggestion = "You can go to watch movies";
			System.out.println(suggestion);		
			
		}else if(budget > 3000 && budget <= 5000) {
			
			suggestion = "You can book flight go to other city";		
			System.out.println(suggestion);		
			
		}else {
			
			suggestion = "You can go to goa.";
			System.out.println(suggestion);
			
		}
		
		return suggestion;
		
		
		
		
	}
	
	
}

/*   
   TASK Time GIVEN BY SIR :  
   
   Develop a MakeMyTrip discount module -

1. If fare is 5000 and below, no discount applied.
2. If fare is between 5000 to 10000 then 10% of total fare as a discount.
3. If fare is more then 10000 then 15% discount.
4. Maximum discount per customer is 1250 only.
      
 inputs : 20,000  --> 18750.0   
      
      
 */  


class MakeMyTripDiscount{
	
	
	public double discount(int fare) {
		
		// We assigned Initial Discount as 0, Then we will update this discount according to condition -
		double discAmount = 0;
		
		
		if(fare <= 5000) {
			
//			discAmount = 0;
			System.out.println("No Discount, you get!");
			
		}else if(fare > 5000 && fare<= 10000) {
			
			discAmount = fare * 0.1; 
			System.out.println("Congrats you get discount on your total fair "+discAmount);
			
		}else {
			
			discAmount = fare * 0.15; 
			System.out.println("Congrats you get discount on your total fair "+discAmount);			
		}
		
		// As If Discount Amount gets greater than 1250 rupess then discount value get again updated with only '1250' rupess -
		// Again we will check discount amount is it greater than 1250 or not if greater update previois discunt amount with 1250 only and if not greater than 1250 then the previous discount user will get -
		if(discAmount > 1250) {  // Maximum discount limit
			
			discAmount = 1250;
			System.out.println("Maximum discount per customer is 1250 only ");
			
		}
		
		//Let's calculate the The amount to paid after discount as we get -
		 double finalFare = fare - discAmount;
		 
	     System.out.println("The Final Fare: " + finalFare);
		
		return discAmount;
		
		
		
//Note:	We use a separate if statement because the maximum discount limit must be checked after calculating the discount.


	}

}

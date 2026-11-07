package com.kodewala.day17.controlflow;
/*
 * 
 * 
 * 1. We can use if Without Braces {} : It only executes the first line of code and rest lines doesnot count in if-block.
 * 
 * if (20 > 18)  System.out.println("20 is greater than 18");
 * 
 * OR,
 * 
 * if (20 > 18)  
 * 		System.out.println("20 is greater than 18");
 * 
 * 
 * 2. Short Hand if...else / Ternary Operator : It is a short-hand if else, which is known as the ternary operator because it consists of three operands.
 * 
 * 
 * Syntax -
 * 
		variable = (condition) ? expressionTrue :  expressionFalse;
 * 
 * 
 * 
 * Note : It mostly use to replace if else multiple line of statements with single line. 
 * 
 * 
 * 
 * 
 * 
 * */
public class ShortHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(20 > 18) System.out.println("20 is greater than 18");
		 System.out.println("This line runs no matter what (not part of the if statement)");
		
		if(25 > 10) 
			
			System.out.println("25 is greater than 10");
		 	System.out.println("This line runs no matter what (not part of the if statement)");
		 	

		 	
//		 2. Ternary Operator - Instead of writing:

		 		int time = 20;
		 		
		 		if (time < 18) {
		 			
		 		  System.out.println("Good day.");
		 		  
		 		} else {
		 			
		 		  System.out.println("Good evening.");
		 		  
		 		}
		 	
//		 Better way - You can simply write -
		 		
		 int timee = 20;
		 
		 String result = (timee < 18 ) ? "Good Day" : "Good Evening";
		 System.out.println(result);
		 		
	}

}

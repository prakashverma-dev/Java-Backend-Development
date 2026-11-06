package com.kodewala.day19_while;

/*
 * 
 * do-while : It will check the condition later, First It will execute.  
 * 
 * It will firstly execute the business then it will check the condition.
 * 
 * Use of d-while, where we want to execute something atleast once, despite condition is true or false, if true it will execute again and again but false it will execute only once.
 * 
 *   Ex: IN ATM, we display the screen atleast once so in order to enter the number then we get back or get IN.
 * 
 * Note : In do-while, if condition is false, still at least once it will execute once but in while loop if condition is false, while loop never executes.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class doWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNo = 5;
		
		do {
			
			System.out.println("Do while executed..");
			
			
		}while(inputNo > 10); //False

	}

}

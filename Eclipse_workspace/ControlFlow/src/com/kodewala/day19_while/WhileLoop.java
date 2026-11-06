package com.kodewala.day19_while;

import java.util.Scanner;

/*
 * 
 * # for-loop : when we know the number of execution i.e input is fixed.
 * 				Size of an Input known beforehand ---> for loop
 * 
 * Examples : List of 2000 customers  --> max iteration will be 2000.
 * 			  List of 10000 Orders ---> max iteration will be 100000.
 * 
 * # while loop : when we do not know total numbers of iteration./how many times the loop will execute.
 * 
 * While(<condition>) -> this condition is true just keep doing and when this condition get false immediately stop it.
 * 
 * Summary : for-loop : when no of iterations are fixed, go with for loop.
 * 			 while-loop : when no of iterations are not fixed, go with while loop.
 * 
 * 
 * 
 * 
 * 
 * */

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int max = 10;
		int number = 0;
		
		while(number < max) { //boolean condition if true then executes
			System.out.println("Executing...."+number);
//			number++;
			number = number + 1;
		}
		

	}

}


// Game To Guess a Number between 1 to 100 by user -

class GuessTheNumber{
	
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("---WELCOME TO GUESS THE NUMBER GAME---");
		
		int fixedNumber = 12; // We need to guess this number
		
		System.out.print("Guess The Number between 1 to 100 : ");
		int userNumber = sc.nextInt();
		
		
		//Run while loop until user has guess successfully correct number
		
		while(fixedNumber != userNumber) { //if this true then only executes.
			
		    if (userNumber < fixedNumber) {
		    	
		        System.out.println("Too Low! Guess a Higher Number.");
		    }
		    else {
		        System.out.println("Too High! Guess a Lower Number.");
		    }
			
		
			System.out.print("Enter The Number Again : ");
			userNumber = sc.nextInt();
			
		}
		
		System.out.println("Congrats You Won, Guessed the Right Number!");
		System.err.println();
		
		sc.close();

	}
	
	
}


// using while loop : with providing combo of 'true' condition with 'break' statement together** IMPORTANT -

class GuessTheNumber2{
	
	public static void main(String[] args) {
		
		//With true while loop  and break combo together to run while loop successfully -
		
		Scanner sc = new Scanner(System.in);
		
		int fixedNumber = 27;
        int userNumber; // a number to guess by user // default value is 0 here. 

        System.out.println("Welcome to Number Guessing Game!");
        
        
        while(true) {
        	
        	System.out.print("Guess a number between 1 and 100 : ");
        	userNumber = sc.nextInt();
        	
        	if(userNumber == fixedNumber) {		
        	
               System.out.println("Congratulations! You guessed the correct number.");
               break; // as soon it reaches here, it break the while loop completely.
//               return; // we could use return as well but it will work but after while loop block will not execuets so here Scanner object 'sc' will leak the resource.
                   		
        		
        	}else if(userNumber < fixedNumber ) {
        		
        		System.out.println("Too low! Try a higher number.");
        	}else {
        		
        		System.out.println("Too high! Try a lower number.");
        	}
    		  	
        	
        }
        
        
        sc.close();
		
	}
}



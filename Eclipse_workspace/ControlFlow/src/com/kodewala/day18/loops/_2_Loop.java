package com.kodewala.day18.loops;




/*  
 * 

Req : You want to repeat the same logic again and again.

Example : Check if number is greater than 21 or not --> 100 times



# Looping in Java : -


1. For loop
2. While loop
3. Do while loop



1. for-loop in java :  When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop OR, when we know the size of input means how many time I want iterate the loop, then we use for-loop - Ex: We know loop will execute 10 times , 100 times , 7 times we use for-loop.


Syntax :  

for (statement1(Initialization for first time only); statement2(Condition to check Each time); statement3(Initialize Update Each Time) {

  // code block to be executed
  
}

Statement 1 : is executed (one time) before the execution of the code block.

Statement 2 : defines the condition for executing the code block.

Statement 3 : is executed (every time) after the code block has been executed.



2. while loop : when we don't know the size of input means how many time the loop will iterate, then we use while-loop. Ex: We dont know how many times the loop will execute may 10 times or 17 imes or 30 times, then we use while-loop -


 */




class Loop {
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("the number is : "+i); // logic executed 10 times.
		}
		
		
	}
	
	

}

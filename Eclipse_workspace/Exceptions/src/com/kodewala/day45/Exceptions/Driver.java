package com.kodewala.day45.Exceptions;

/*
 
 ##1. What is Error In Java  ?
 
 Errors in Java are problems that occur during the compilation or execution of a program. These errors can prevent the program from running correctly or produce unexpected results. Understanding different types of errors helps developers debug programs and write reliable applications.

Some errors stop program execution, while others produce incorrect output.
Learning about errors helps improve debugging and problem-solving skills.

# Types of Programming Error : The errors can be broadly classified into three categories/Three Main Types of Programming Errors -


 i. Compile-Time Error : Detected by the compiler. Prevents code from running.
 ii. Runtime Error : 	Occurs while the program is running. Often causes crashes.
 iii. Logical Error : Code runs but gives incorrect results. Hardest to find. 

 
 
 i. Compile Time Error : Compile-time errors occur when the program cannot compile due to incorrect-syntax or type issues.
 	It Caused by missing semicolons, incorrect syntax, or undeclared variables.
  	It Must be fixed before the program can be executed.
  	
  	Examples :  
  	
  	int x = 5  // Missing Semicolon
	System.out.println(x);
	
	System.out.println(myVar); // Undeclared 'myVar' Variable
  	
  	int x = "Hello"; //  Mismatched Type
  	
  	
  	for (i = 1, i <= 5; i++ { //Missing parenthesis and Incorrect format of selection statements should be ; not ,

            System.out.println(i + "\n");
       }
  	
  
  > How to Fix CompileTime-Error : Read the compiler's line number and fix the syntax or variable types.
  
  
 ii. RunTime Error : Runtime errors occur when the program compiled succefully ready for 'execution of program' but unexpectedly crashes or behaves in mid-way of code due to unexpected action or operation performed by user in the code, which JVM canot process it in java.
 
It mostly Occurs due to conditions like division by zero, invalid input, or memory issues.
It Can be handled using exception handling (try-catch blocks).
It May cause the program to terminate abruptly if not handled properly.
RunTime Error is also called in Exception in programminng lanaguge.
Run-time error/Exception must be handled by program for succufully execution of complete program.
 
 Note : only Runtime Error (specifically the recoverable ones caused by your code or bad inputs) are called as 'Exception' in Programming Language, which must be handled in the program via try catch block, then it would called as 'Exception Handling'.
 
 > How to Fix RunTime-Error : Add input validation checks or handle exceptions using try-catch blocks.
 
 
 Common RunTime Errors or Exceptions In Java -
 
 a) Array Index Out of Bounds Exception : 
 
 	int[] numbers = {1, 2, 3};
	System.out.println(numbers[8]); // Trying to access index which doesnot exist.
	
	
	Exampe2 -
	  int arr[] = new int[5];
	  arr[9] = 250; //  // Array size is 5 but assigning at 9th index
        
          
 
 b) ArithmeticException : Trying to Perform Operation on Number, Division by Zero -
 
	int x = 10;
	int y = 0;
	int result = x / y;
	System.out.println(result);
	
c) Number Format Exception : when datatype canot convert into desired result.

Integer.parseInt("Five"); // parseInt() expect a convertable input formate value into number. like "25"


d) Null Pointer Exception 





iii. Logical Errors : Logical errors happen when the code succufully compiled and also runs or executed, but the result is not what we expected something else coz of Logic Error in Program performed by user -



remainder = num / 10;  // Mistakenly Using '/' operator to get the modulus instead using '%'.


int x = 10;
int y = 2;
int sum = x - y; // Logical Error
System.out.println("The Sum is : " + sum); // The code mistakenly subtracts instead of adds, Should be int sum = x + y;







 
 
 ##2. Throwable class : In Java's internal hierarchy, both Error and Exception inherit from the Throwable class, as detailed in the Oracle Java Documentation:-
 
• Exceptions (java.lang.Exception). Represent conditions that your application can reasonably catch and recover from, such as missing files (FileNotFoundException) or bad user input.

• Errors (java.lang.Error). Indicate severe, abnormal problems with the Java Virtual Machine (JVM) or system hardware that applications should not try to catch. Common examples include OutOfMemoryError and StackOverflowError (often caused by infinite recursion).
 
 
 
 
 NOte : The Simple Rule to Remember -

• Exception (java.lang.Exception): A runtime problem caused by your program's logic or invalid data that your code can catch and handle and recoverable (e.g., FileNotFoundException).

• Error (java.lang.Error): A catastrophic system or memory failure that your code cannot recover from (e.g., OutOfMemoryError).








##3. Exception or RunTime Error in Details In Java : -
 
 
 What is Exception : Abnormal situation occurred during program execution. 
 
 Abnormal Situation could be -
 
	 Null Pointer Exception
	 Arithmetic Exception
	 Number Format Exception
	 Array Index Out of Bound Exception
	 Class Cast Exception : when trying to cast an Object to an incompatible class.
	 
 
 
  # Suppose You doing Fun-Transfer, You check all these scenarios -
  
  		> Check the sender's Balance
  		> Check if accounts are active
  		> account is positive balance.
  		
  		
  When we write code some what if some abnormal situation comes which is not exepected, and Programm gets terminated from mid-way of the code.
 

 
 a) Null Pointer Exception :- If something is null value and you trying to operates some operation via method on that will throw Null Pointer Exception.
 
  Note : null.<method_name()> --> Throws 'Null Pointer Exception'.
 
 <varibale/referenceObject>.length() ; --> Performing some Operation on variable or reference Object and getting the result.
 
  name.<whateverMethod()>; -->Here, 'name' could be a variable or a reference object upon which some operation performed.
 
 
 Null Pointer Exception is a class in Java. Even all Exception have class in java.
 
 
 Note : Java canot run without 'thread' even a basic HELLO world neeed thread.
 
 
 
 
 
 b) Array Index Out of Bound Exception : When we are try to read/access invalid index from array, which doesn exist or user doesnot suppied.
 
 
 

 Note : More than 1000 Exceptions Class In Java and Exceptions throws are Object of these Classes.
 

 
 
 
 
 
 
 
 
  
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
class Account{
	
	
	
}

//a) Null Pointer Exception : If a variable or reference Object is null value and you trying to operates some operation via method on it, It will throw Null Pointer Exception.
public class Driver {

	public static void main(String[] args) {

		System.out.println("Driver.main()........START");
		
		
		
		//i. with local variable - 
		
		
		//Positive Scenario
//		String name = "Kodewala"; // This may be null.
		
		//Negative Scenario -
		String name = null; 

		
		System.out.println(name.length()); // null.length() --> Exception occured --> Exit from here with throwing exception. 
		// 'name' could be a variable or a reference object.
		
//		Note : null.length(); --> It can perform valid operation on 'null' so It creates Exception Here and throws the exception as 'Null Pointer Exception' in console and and Program gets terminates here i.e at this line number '158' immediately without complete the program flow till END. This is called Unexpected Termination of Program due to Exception Arrises in the code.
		
		
		// 100 line of Code ---> Not executed after Exception.
		
		
		
		
		//ii. with reference Object -
		
		Account acc = null;
		System.out.println(acc.hashCode()); // Null pointer exception.
		
	
		

		
		
		System.out.println("Driver.main()..........END");

	}

}


//b) Array Index Out of Bound Exception : When we are try to read/access invalid index from array, which doesn exist or user doesnot suppied.
class Driver1{
	
	public static void main(String[] args) {
		
		System.out.println("Driver.main()..........START");
		
		
		String address = args[0]; // As tying to access index 0 which doesn exist or user doesnot suppied --> throws Array Index Out of Bounds Exception.
		String pinCode = args[1];
				
		System.out.println(address);
		System.out.println(pinCode);
		
		
		System.out.println("Driver.main()..........END");
		
		
	}
}


//c) Arithmetic Exception : when we divide a number by zero which JVM canot handle it, it throws ArithmeticException.
class Driver2{
	
	public static void main(String[] args) {
		
		System.out.println("Driver2.main()...START");
		
		// i. InCase of 'int' type -
		int amount = 10;
		int part = 0;
		
		int total = amount/part; // Exception happen here as 'ArithmeticException'.

		System.out.println(total); // Will be ignored.
		
		

		//ii. Incase of 'double' type - Java writen code to handle the Arithmetic Exception and in result return 'Infinity'.
		
		double amount1 = 100;
		double part1 = 0;
		double total1 = amount1/part1; // 'double' datatype handles the exception.
		
		System.out.println(total1); // Infinity we get as In case of 'double' Arithmetic Exception has been handled.
		
		
		
		System.out.println("Driver2.main()...END"); // Will be ignored.
		
		
	}
	
	
}


//d) Number Format Exception : When number is not in right formate means which could be convertable into number like "25" and when we try to convert that unconvertable input into number, Throws the 'Number Format Exception'. 

//Ex: parseInt(); --> method expect a input which could be convertable into number. Ex: "25", "2".

class Driver3{
	
	public static void main(String[] args) {

		
		System.out.println("Driver3.main()....START");
		
		
		String name = args[0];
		
		// Positive Scenario : user passed the marks as "25" --> then it could be converatable into Number Formate.

		// Negative Scenario : user passed the marks as "Twenty Five" --> then it could not be converatable into Number Formate by JVM.
		int marks = Integer.parseInt(args[1]) ; // parseInt() expect a convertable input formate value into number. 
		
		System.out.println("name: " + name);
		System.out.println("marks: " + marks);
		
		

		
		
		
		System.out.println("Driver3.main()....END ");
		
	
		
	
	}
}

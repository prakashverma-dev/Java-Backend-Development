package com.kodewala.day19_while;

import java.util.Scanner;

/**
 * 
 * #1. Limitation of Command line Arguments : Give all input at once and any error again we need to run.
 * 
 * java DataProcessor <input1> <input2> <input3>
 * 
 * 
 * To overcome Limitation of Command Line Arguments : Java Introduced the Scanner Class, which is part of java.util package.
 * 
 * this class allow user to supply the run-time arguments or command line arguments in interactive way. 
 * Interactive way until and unless we do not provide the correct input formate it will not move forward.
 * 
 * Scanner --> java.util package  
 * Scanner ---> Scanner class create connect with console.
 * System.in  --> To read the data typing from console.
 * 
 * To create connection with console, we need to tell from where you reading i.e 'System.in'  --> Scanner class creating connection with console.
 * 
 * 
 * To search Inbuilt classes in java : ctrl + shift + T --> then write class name.
 * 										if you dont remember class name, write *name* to match all similar class.
 * 
 * 
 * Note : In Java, by default only java.lang package is imported inheritantly, except this package we need to expliitly import other packages e.g java.util if we try to use it their methods.
 * 
 * 
 * Scanner class create connection with console so we need to close that connection with console after work. For better
 * Ex: Swith ON the fan, switch off the Fan and Open the door, close the door.
 * 
 * sc.close();
 * 
 * Supose, In Amazon for each order, the placed order connection is open(object is active), then it loads on the heap memory.
 * when we close the connection it destroy the created object from memory.
 * 
 * what is the disadvatange of keeping the connection OPEN ?
 * 
 * CONNECTION ---> create object
 * 
 * 
 * We use .nextLine() method to read String type input only. To read other types, look at the table below -
 * 
 * 		sc.next()   --> method is used to read a single word from the user input.
		nextBoolean()	Reads a boolean value from the user
		nextByte()	Reads a byte value from the user
		nextDouble()	Reads a double value from the user
		nextFloat()	Reads a float value from the user
		nextInt()	Reads a int value from the user
		nextLine()	Reads a String value from the user
		nextLong()	Reads a long value from the user
		nextShort()	Reads a short value from the user
 * 
 * Note : The Problem: When you call any Numeric methods after the String data input i.e sc.nextInt() after sc.nextLine(), the program appears to completely skip the nextLine() step and won't let you type anything.
 * 
 *  Remember, Numerical data methods like nextInt() or nextDouble() always adds extra '\n' i.e  leaves the trailing newline character (\n) which skips the next line command waiting and jumps. To avoid this, Use sc.nextLine() use this to clear the extra line left by Numeric methods.
 
 
 We need to consume this -
 
 sc.nextLine(); // It will consume the extra '\n' after Numberic data taking. //  Clear the '\n' from the buffer.
 
 *  
 *  Note2: Why we need to close scnner object and not regular object : We don't close regular objects because they only occupy memory (RAM), which Java manages automatically using GC. A Scanner object, however, connects to external system resources (like the keyboard or a file) that Java cannot clean up on its own.
 *  
 *  
  The Scanner Object: Holds an External OS Resource : When you create a Scanner to read keyboard input -

		Scanner sc = new Scanner(System.in);
		

	Here, System.in represents the standard input stream of your operating system.
	The Scanner object isn't just sitting quietly in memory; it has opened a physical doorway (a "stream") to the operating system's hardware.
 *  
 *  
 * #3. To Validate if the next line is integer value type or not by user, we use - sc.hasNextInt() -
 * 
 * has got all methods like - To check next line typed 
 * 
 * .hasNextInt()
 * .hasNextFloat()
 * .hasNextDouble()   
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class ScannerUtility {
	
	public static void main(String[] args) {
		
//		Limitation of Java Inbuilt main method args is : If user passing wrong input, user has to start the program.
		
		Scanner sc = new Scanner(System.in); //creates connection with console
		
		System.out.print("Please Enter your name :");
//		// nextLine() --> to read string data/input.
		String name = sc.nextLine();  //JVM will wait here to get respond from user to move forward.
		
		
		System.out.print("Enter Age  :");
		int age = sc.nextInt();
		
		
		
		System.out.print("Enter Product Price :");
		double price = sc.nextDouble();
		sc.nextLine(); // Consume extra '\n' which is left over of nextDouble() or any other numeric methods.
//		
		
		System.out.print("Please Enter Delivery Address :");
		String address = sc.nextLine();
		
		
		//To read Single Word or First Word from String -
		System.out.print("Did you like our service(yes/no) : ");
		String singleWord = sc.next();
//		
		System.out.println("USER NAME IS :"+name);
		System.out.println("Product Price :"+price);
		System.out.println("Delivery Address :"+address);
		System.out.println("Age is :"+age);
		System.out.println("Single Word is :"+singleWord);
		
		
		//Checking Correct user typed value -
		System.out.print("Enter Birth Year : ");
		System.out.println("Typed CMD Value is Interger or not :"+sc.hasNextInt()); // .hasNextInt() method use to Check Entered value from CMD is Integer or not.
		
	
		if(sc.hasNextInt()) {
			
			int dobYear = sc.nextInt(); // will take input
			System.out.println("DOB Year  : "+dobYear);
			
		}else {
			
			System.err.println("Please Enter DOB Year In Correct Format!");
			sc.next(); // If that is not integer then .hasNextInt() methods leaves an extra '\n' line, we need to clear that.
		}
		
		
		
		sc.close(); //closing the connection of created object.
		
	}

}

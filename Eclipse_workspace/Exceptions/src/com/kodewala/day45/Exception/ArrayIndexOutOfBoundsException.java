package com.kodewala.day45.Exception;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		System.out.println("ArrayIndexOutOfBoundsException.main()...START");
		
		
		String name = args[0];
		int marks = Integer.parseInt( args[1]);
		
		System.out.println("name: " + name);
		System.out.println("marks: " + marks);
		
		
		// Number Formate Exception -
//		String age = 25;
//		int divide = 0;
//		System.out.println(age/divide);
		
		// Null Pointer Exception -
		
		String name2 = null;
		System.out.println(name2.length()); 		// Null Pointer Exception -
 

		
		
		
		
		
		
		
		
		System.out.println("ArrayIndexOutOfBoundsException.main()......END");


	}

}

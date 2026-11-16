package com.kodewala.day45.Exception;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Driver.main()........START");
		
		String name = "Kodewala"; // It may be null.
		
//		name = null;
		
		System.out.println(name.length());// 'name' is variable or reference object.
		
		// java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null .
		// At line 13 Exception came --> and Program terminates here and We canot see anything after this.
		
//		null.<method_name> --> Throws Null Pointer Exception 
		
		// Array Index Out of Bound Exception : When we are try to read invalid index, which doesnt pass or exist by user.
		
		
		// Arithematic Exception : divide a num by zero.
		
		double amount = 100;
		double part = 0;
		double total = amount/part; // 'double' datatype handles the exception.
		
	
		
		System.out.println(total);

		
		//Number Formate Exception : when JVM cannot convert something(string) into number.
		
		//100---line of code..
		
		
		System.out.println("Driver.main()..........END");

	}

}

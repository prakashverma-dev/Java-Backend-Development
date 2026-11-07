package com.kodewala.day23_String;

/*
 * 
 * String : Any Sequence of characterers considered as String.
 * 
 *  abcd, mohit --> string
 *  a --> single character
 *  
 *  
 *  To Represent the 'string' in java, you should have 'object of String class'.
 *  
 *  Inbuilt 'String' Class In java -
 *  
 *  public class String{
 *  
 *  }
 *  
 *  We will create object of String class --> to represent String type
 *  
 *  String str = new String();
 *  
 *  Similar, To represent Integer type, we used to int a = 100;
 *  
 *  # immutable : After creation, we cannot change it.
 *  
 *  String object are immutable --> once String object created, you can not change it. If you try to change it in result we get new object but existing string object will not be changed.  
 *  
 *  # How to create String Object in java : There are two ways -
 *  
 *  a) using literals  : String myName = "hello;
 *  
 *  b) using new keyword : String myName2 = new String("hello2"); 
 *  
 *  
 *  Note : By both ways, we creating the 'String Object' at the end. hence here two string object created via Literal and new keyword.
 *  
 *  
 *  Note : String s = "hey";  --> Here 'String' is class so, s would object of String class.
 *  
 *  Note : In java, We can not initailize string data without creating string object.
 * 
 * 
 * # String Constant Pool(SCP) : In  memory management in Java, SCP stands for String Constant Pool which is present inside the Heap memory, a dedicated storage area used to store unique string literal values.
 * 
 * Creating a string object -
 * 
 * String name = "Prakash";
 * String name2 = "Prakash";
 * 
 * 	How SCP works Here -
 * 
 *  • The JVM checks the SCP first. It sees "Prakash" isn't there, so it creates a new String object inside the SCP for 'name' with assign value as 'Prakash'.
	• When name2 tries to create a new String Object, JVM first checks in SCP, is string value isn't there if not creates and if there as "Prakash" is there in SCP, JVM finds it already exists in the SC Pool and simply points name2 to exact same reference.
	
	Note : IF address of two variables points to same address then we can say only 1 Object created.
	
	add of name is equal to address of name1 ==> only 1 object created.
	
	• Result: Only 1 object is created. Hence, name == name1 will evaluate to true.
	
	
 * 
 * 
Why Does SCP Exist?

Strings are the most frequently used data type in programming. If a program creates a new memory object every single time the word "Hello" is used, it will quickly run out of memory.
To optimize this, Java uses the SCP to practice reusability and memory optimization. Because strings in Java are immutable (cannot be changed), it is perfectly safe for multiple variables to point to the exact same string object in the pool
 * 
 * 
 * */

public class Dtiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating String object which referred by 's' -
		String s = "Kodewala"; // String object are immutable so this 's' object now can not b change.
		
//		Note if we malipulate or try to change we get new object -
		// From "Kodewala" to "Kodewala Academy" -
		

		// Creating another String object which referred by 's1' -
		String s1 = new String("hey");
		
//		Note : These both two are String Object.
		
//		In Heap memory with identical contents - 
		String name1 = "Prakash"; // name1 object created in SCP : name1 address --> xyz132
		String name2 = "Prakash"; // Object with content "Prakash" already created and name2 will starts referring to existing object. Hence, 'name2' also pointing to address xyz132.
		
//		address of name1 is same as address of name2 --> hence, we can say only one object created inside the SCP in heap memory.
		
		System.out.println(name1 == name2); //true  --> Same reference(reference means actual address) in memory.
		
	// name1 and name2 are the name of reference.
		
//		if two objects pointing to same memory address in memory, == give us true otherwise false.
		
		
//		Note : == operator use to compare the address/reference of an object.
		
		
		
		
		String name3 = new String("Prakash");
		
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println(name1 == name2);
		
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		
		System.out.println(name2 == name3);
		

		
		
		

	}

}

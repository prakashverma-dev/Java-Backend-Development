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
 * #2. String Constant Pool(SCP) : In  memory management in Java, SCP stands for String Constant Pool which is present inside the Heap memory, a dedicated storage area used to store unique string literal values.
 * 
 * SCP previous was part of Permanent Generation(Static Area) which is now MetaSpace but now SCP inside Heap memory in the Java latest version.
 * 
 * Note : On SCP garbage collector will not have control. Inside heap Garbage collector will not part of SCP.
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
 * # What was the need that java should have separate String Constant Pool(SCP) :-
 * 
 * 
 * For any application, the common attributes would be for String datatype only. and very few other types.
 * 
 * Note : 90% objects are type of 'String' in memory stored.
 * 
 * 1M object --> 10 lakh --> 9 lakh Objects would be String.
 * 
 * Ex: ORDER System -
 * 
 * orderid - String
 * name - String
 * itemName - String
 * address - String
 * pin code - string
 * city name - String
 * Area name - String
 * COuntry - String
 * Veg/Non Veg - String
 * Product description - String
 * SBI account number - - String
 * 
 * Except price and tax --> int, double
 * 
 * 
 * For 10k Users in city, If string is not using String Constant Pool -
 * 
 * String pinCode = "560037" ;
 * 
 * String city = "Bangalore"; x 10k --> It would create 10K objects for 10k users and all users object will be bangalore only.
 * 
 * If using SCP, We will check if same string literal there in pool and if there we dont create another object and refers to existing object.
 *  
 * 
Why Does SCP Exist?]

To Optimize Memory Space in HEap memory in our system as our RAM is limited so SCP used in HEAP memory to reduce the space in HEAP for same content String literals.


'memory Space Optimized' for String Literal objects --> Purpose of Separate 'String Constant Pool'.

Strings objects are heavly used in java, so java took step to optimize the memory space for string lietral object and itroduced seperate String Constant Pool(SCP).


Strings are the most frequently used data type in programming. If a program creates a new memory object every single time the word "Hello" is used, it will quickly run out of memory.
To optimize this, Java uses the SCP to practice reusability and memory optimization. Because strings in Java are immutable (cannot be changed), it is perfectly safe for multiple variables to point to the exact same string object in the pool.


#3. equals() method in 'Object' Class :  Bydefault .equals() method in 'Object' class compare the reference or address of two objects but It get overrides in 'String' Class and In 'String' Class it compares the content of two strings.


Note : In case of String, It comnpares the content of two strings but in case of non-string obhects it compares the addrsss or reference of two objects.

 		
// In 'Object' class .equals() method doesnot check the content. It checks the content in case of String type.

//	Primarly .equals() method is present inside the 'Object' class.
		
		
		
// Note : If you are not happy with given or default .equals() method in 'Object' class, java says you can override it in your class and gives your custom defination to call it later in your program only.
		


#4. what is MetaSpace in java?

It is a common area in java where classes will be loaded and constants, bytecode will be stored.

It is previous use to known as PERM GEN(Parmanent Generation) but now cALL AS Metaspace.

STUDy : PERM GEN vs meta Space.




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
		
		
		//# why SCP needed in java - To optimize the memory space in HEAP/in our RAM.
		//For user1 -
		String city1 = "Bangalore"; // first object created with address id - abc123
		//For user2 -
		String city2 = "Bangalore"; // object content exists, use existing object add - abc123
		//For user3 -
		String city3 = "Bangalore"; // object content exists, use existing object add - abc123
		//For user4 -
		String city4 = "Bangalore"; // object content exists, use existing object add - abc123
		String city5 = "Bangalore"; // object content exists, use existing object add - abc123
		
		System.out.println(city1 == city2); // true --> means pointing to same object memory address.
		
		

		String city6 = "Hyd"; // new object created in pool -- > with xyz123

		System.out.println(city5 == city6); // false coz abc123 not equal to xyz123

		
		
		
//		Checking .equals() method : checks content in string -
		
		String name3 = new String("Bangalore");
		
		System.out.println(city1.equals(city2)); // true  --> ctrl + open delcartion to see which class .equals() method is opening.
		System.out.println(city1.equals(name3)); // true coz checks only the content. not address.
		
//  Checking .equals() method in other than 'String' Object Operation - i.e normal Object creation -
		
		User user1 = new User("Rahul");
		User user2 = new User("Rahul");
		
		System.out.println(user1.equals(user2)); // false as here .equals() will compare the reference not content.

		
// In Custom Datatype, .equals() compares the reference, In 'String' Datatype it compares the content.
		
// Bydefault .equals() checks reference in the memory but in case of 'String Datatype' it checks the content only.
		
//Note : In operation with strings , .equals() only checks the content and In other than String Datatype operation it will reference.
		
// bydefault .equals() and == purpose is same i.e checks the content.(CHECKKKK**)
		
//Note : In operation with strings , .equals() only checks the content and == checks the reference in SCP in heap memory.
		
// By default implementation of .equals() method in 'Object' class is to compare the reference of two objects.
		
		
		
		
		

//		
//		
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		
//		System.out.println(name1 == name2);
//		
//		System.out.println(name2.hashCode());
//		System.out.println(name3.hashCode());
//		
//		System.out.println(name2 == name3);
		
	

	}

}

// Creating a Class -
class User{
	
	String firstName;

	public User(String firstName) {
		super();
		this.firstName = firstName;
	}
	
	
}



 
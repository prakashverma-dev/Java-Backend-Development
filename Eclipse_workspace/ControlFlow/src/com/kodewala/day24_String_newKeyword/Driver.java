package com.kodewala.day24_String_newKeyword;
/*
 * 
 * 
 * String : - A string Object in java can be created using two ways -
 * 
 * Note : The way you create a string in java entirely changes how the JVM (Java Virtual Machine) uses the SCP to stores String Object -
 * 
 * a) using String literals : whatever we write in double quotes i.e String Literal always go to SCP except one or two condition.
 * 
 * 			String s = "hello";anything  --> string literal objects.
 * 
 * Any String Object created using 'String Literal' always stores in SCP(String Constant Pool) dedicated space in Heap Memory.
 * We use == to check the address or reference of two String Objects. If two string objects points to same reference then == results true and if points to two difference reference in SCP, results to false.
 * 
 * 
 * Note : Anything wrapped inside double quotes "", called as 'String Literal'.
 * Ex: String s = new String("Java");  --> "Java" wrapped in double quotes, This is a String Literal First.
 * 
 * 
 * 
 * #What is Literal in Java ??
 * 
 * Literal in programming language is the raw or actual value, we put inside the variable, called literals. It could String Literal, Integer Literals etc. As a variable acts as a container, a literal is its the actual value.
 * 
 *  Ex: int count = 50;, count is the variable, and 50 is the integer literal.
 * 
 *  # Java has  6 Types of Literals -
 * 
 *  Integer Literal : int count = 50; here 50 is the integer literal and count is the variable.
 *  String Literal : String literal values are "Hello" , "hey" etc.
 *  Floating-Point Literal : floating point literal values are 3.14, .5, 123.4f.
 *  Character Literals : Character literal values are 'a', 'Z', '9', '\t' '\n', '\''
 *  Boolean Literals :  Boolean literal values are true, false.
 *  Null Literal : Null literal value is null.
 * 
 * 
 * 
 * b) using new keywords :-
 * 
 *    String s2 = new String("Kodewala");  ---> create two Object (one in SCP + one in HEAP using new keyword).
 *    
 * Note : String object create using 'new' keyword, forces the JVM to create a brand new string objecti respetive of content in the normal Heap memory area, entirely outside of the SCP. Coz Any java object created using 'new' keyword stores in HEAP memory, as new keyword triggered heap memory to store in. TWO content might be same for different objects in HEAP.
 * 
 * 
 * OR,
 * 
 * String myStr = "Kodewala"; // one object in SCP --> xyz12
 * 
 * String s2 = new String(myStr);  ---> creates only one object here as firstly it checks myStr Content is there in SCP or not It is there so directly creates Object in HEAP memory with taking value from SCP area.
 * 
 * 
 * Note : In Java, using new keyword, Object always goes to Heap area. WIth new keyword always creates new objects whether content is exist or not.
 * 
 * 
 * 
 * 
 * 
##Summary Checklist: If someone asks you how many objects are created by String s = new String("Java");, the answer is "It depends on what is already in the pool" -

	1. If "Java" was never created or exist in SCP, It creates two Objects : One inside the SCP for "JAVA", and one in the normal Heap for 's' Object.
	
	2. If "Java" was already created or exist in SCP, It creates Only one Object in HEAP MEmory for 's' Object. The JVM skips creating a new literal in the SCP and only builds the new object in the normal Heap.
	
	
 * 
 * 
 *Why string ?
 *
 *a) Memory Optimization
 *b) 
 * 
 * 
 * 
 * */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Object created directly using 'String Literal' -
		String s1 = "Kodewala";  // only one String Object created inside SCP - 123xyx
	
		// //String Object created using 'new' keyword -
		String s2 = new String("Academy"); // Creates two objects -> 1st : String Literal i.e "Academy" in SCP and 2nd : In the heap(out side of SCP) with taking value i.e doing shallow copy from the SCP reference which by default pointed by 'original' key in SCP Space for String Object class.
		// "Academy" firstly one copy will be dropped in SCP with poiting 'orginal' key. Then JVM creates the object outside of SCP i.e in Heap which pointed by 's2' - 243zyx 
		
		
		System.out.println(s1 == s2); // false as 's1' memory address(SCP) different than 's2'(HEAP).
		
		
		String s3 = new String("Kodewala"); // Here It will create only one object --> In HEAP as 'Kodewala' already in STAck.
		System.out.println(s1 == s3); // false as two different objects : 's1' memory address(SCP) different than 's3'(HEAP)
		
		String s4 = new String("Kodewala");
		System.out.println(s3 == s4); // false as with new keyword always create new object in HEAP.
		
		System.out.println(s3.equals(s4)); // true as For String Type, .equals() method overridden and compares the CONTENT. 
		
//	Note : For object Types, ==  always checks the memory address of two objects that is same as default .equals() method from 'Object' class.
		
// Note : For String Type, .equals() method gets @overridden in 'String' Class and it checks or compares the CONTENT only.
		
// NOTE : Java is case-sensitive LAngauage - a and A are two different characters in JAVA.
		String s6 = new String("Kodewala");
		String s7 = new String("KodewalA");
		
		System.out.println(s6.equals(s7));  // false as 'A' and 'a' are different in CONTENT.
		
		
		
		
		//For Custom Type 'Person' Class : Here .equals() will by default comapres the address/
		
		
		
		Person person1 = new Person("Prakash");
		Person person2 = new Person("Rajesh");
		
		System.out.println(person1);
		
		person1.name = "Rocky";
		
//	   System.out.println(person1.name);
//	   System.out.println(person2.name);
//	   
		
		System.out.println(person1 == person2); // false as compare Memory address
		System.out.println(person1.equals(person2)); // false as compare Memory address

		
		//To make .equals() compare the CONTENT in 'Person' type we need to Override in PERSON class.
		


	}

}


class Person{
	
	
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	
	// Oveeriding the .toString() method in order to print Object as our cutome display like for 'String' output we only see the content no address.

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	// To make .equals() compare the CONTENT in 'Person' type we need to Override in Person class -
//	@Override
//    public boolean equals(Object obj) {
//		
//        if (this == anObject) {
//            return true;
//        }
//        return (obj instanceof String aString);
//    }
	
	
	
	
}

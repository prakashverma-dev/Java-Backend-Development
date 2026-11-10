package com.kodewala.day24_String_newKeyword;

/*
 * 
 * 
 * String is immutable we canot change or modify it.
 * 
 * Note : if we try to modify Java Creates new Object in memory silenetly.
 * 
 * 
 * SCP --> for memory mananagement.
 * Immutable --> for Security.
 * 
 * 
 * Note : Before Java7 String Contant Pool was part of PermGen (Permanent Generation), where the Garbage Collector (GC) never ran.
 * 
 * Since Java 7, the String Constant Pool was moved out of PermGen and placed directly inside the main Java Heap memory. Because it lives in the Heap, the GC absolutely can clean up unreferenced strings from the String Pool.
 * 
 * Starting with Java 7, you can absolutely say that the Garbage Collector cleans both the String Constant Pool (SCP) and the rest of the main Heap area, because the SCP is literally inside the main Heap.
 * 
 * 
 * 
 * 
 * */

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Kodewala"; // SCP and we canot change it or modify it. If we modify we get new Object.
		
//		We try to change the object
		
//		s.concat("Academy"); // Object created in heap with Content "Kodewala Academy" but there is no reference.
		String s2 = s.concat(" Academy"); // .contat() always creates 'new' Object in HEAP. Here It create with 'Kodewala Academy' with initially not referring but now it refering to 's2'.
		
		System.out.println(s); // "Kodewala" --> Original String will be not touched in SCP. As string is Immuatbale.
		System.out.println(s2); // "Kodewala Academy"
		
		
		
/*		Another Example - As Java says String cannot be change once created but here - 
 * 
		String name = "Prakash";
		
		name = "Prakash Verma";
		
		System.out.println(name); 
		
I		 have replace the original String with new one -
		
		
		
		
		ANSWER :- What you have actually changed here is the reference variable, not the String object itself.
		
		To understand why String is still immutable (unchangeable), it helps to picture how Java handles memory. 
		Think of a reference variable like a pointer or a label, and the actual String as a box in memory.
		
		Here is exactly what happens step-by-step behind the scenes:

		1. String name = "Prakash"; -

		Java creates a String object with the value "Prakash" in a special memory area called the String Pool. The variable name is given a pointer that points to this box.
		
		       Variable               Memory (String Pool)
		       
		      [  name  ] ----------> [ "Prakash" ]

		2. name = "Prakash Verma"; -

		Because String objects are immutable, Java cannot open the original box and append " Verma" to it. Instead, Java leaves "Prakash" completely untouched, creates a brand new String object in SCP memory with the value "Prakash Verma", and redirects the name pointer to it.Now
		
		       Variable               Memory (String Pool)
		       
		                             [ "Prakash" ] (Now orphaned/unreferenced)
		                                 
		      [  name  ] ----------> [ "Prakash Verma" ]
		      

		3. System.out.println(name); -
 
		The console prints "Prakash Verma" because that is the box name is currently pointing to. The original "Prakash" string still exists silently in memory until Java's garbage collector deals with it later.
		
		
		*/
		
		String name = "Prakash";  // This "Prakash" value get Orphaned in the SCP memory and can clear later. and now 'name' variable pointing to new String Value in SCP memory ie "Prakash Verma".  
		
		name = "Prakash Verma";
		
		System.out.println(name);
		
		
		
		

	}

}

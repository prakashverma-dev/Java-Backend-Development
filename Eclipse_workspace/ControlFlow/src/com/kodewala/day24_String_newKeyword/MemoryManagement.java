package com.kodewala.day24_String_newKeyword;


/*
 * In Java, We canot check the Memory Address of Object Stored :  -
 * 
 
	
	
	System.identityHashCode() : It is a static built-in method that ignores custom logic and always returns the default hash code based on the object's memory reference, regardless of what the class dictates.
	
	
## How to see Memory Address for Object stored in HEAP MEMORY : -

In Java, We canot see exact memory address. Just like with primitives data, the Java Virtual Machine (JVM) acts as a strict security barrier. It completely hides physical hardware memory management to prevent memory corruption, unauthorized modifications, and security exploits like buffer overflows.

In Java, you cannot directly access or print the actual physical hardware memory address of a variable.
 
The Java Virtual Machine (JVM) abstracts memory management entirely to protect your system from memory corruption and to allow the Garbage Collector to freely move objects around in memory.
	
However, you can get a virtual "memory address representation" (a reference identity) or use advanced diagnostic tools depending on your goal using System.identityHashCode().
	
However, For Objects, Java does give you a unique representation of an object's location in the form of a Hashcode.

Here is how you can see this "virtual address" representation using System.identityHashCode() -


Note : By default, if you print any object using System.out.println(obj), Java invokes its toString() method. If that class hasn't overridden toString(), it prints the class name followed by a hexadecimal number -

 Person p = new Person();
 System.out.println(p); // Prints something like: Person@2f92e0f4


 Here, The value 2f92e0f4 is the hexadecimal format of the object's Identity Hashcode. You can fetch it directly using -

int virtualAddress = System.identityHashCode(p);
System.out.println(Integer.toHexString(virtualAddress)); // Prints: 2f92e0f4


Note : No this is not actual Heap address. Technically, no—but it starts out as one.

When an object is first created in the Heap, the JVM typically takes its internal, virtual memory address and runs a hashing algorithm on it to generate this identity_hashcode.

	
	
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class MemoryManagement {

    public static void main(String[] args) {
    	
    	

//Note : By default, if you print any object using System.out.println(obj), Java invokes its toString() method. If that class hasn't overridden toString(), it prints the 'Class name' followed by a hexadecimal number -

    	Person p = new Person("Prakash");
    	System.out.println(p); // prints the 'ClassName' followed by a hexadecimal number which is virtual reresengtation of memory address of this object created in HEAP. It is not actual.
    	
    	// Prints something like: Person@2f92e0f4


// Here, The value 2f92e0f4 is the hexadecimal format of the object's Identity_Hashcode. We can fetch it directly using -

    	int virtualAddress = System.identityHashCode(p);
    	System.out.println(Integer.toHexString(virtualAddress)); // Prints: 2f92e0f4
  
//        OR, 
        System.out.println(Integer.toHexString(System.identityHashCode(p))); // Prints: 2f92e0f4
        

    }

    static class Person{

        String name;

        public Person(String name) {

            super();
            this.name = name;
        }

        

    }

    
}
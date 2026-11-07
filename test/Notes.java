

//#1. To get Datatype of 'Object' class -

class Check {

    public static void main(String[] value) {
        
        // String num = "Ram";

        // Check chk1 = new Check();

        // System.out.println(num.getClass().getName());
        // System.out.println(chk1.getClass().getName());


        
		int a = Integer.parseInt(value[0]);
		int b = Integer.parseInt(value[1]);

        // System.out.println(a.getClass().getName());
		
		// System.out.print("The sum is :"+(a+b));
		// System.out.print(STR."Hello \{a+b}, next year you will be \{b}"); // Not supported in java23
    }
    
}







/*

#2. String Templates or To Mix String and value at a time :-

There are two ways -

i) Native Java 21+ String Templates : With Java 21 and above, you can wrap strings and variables together natively using the 'STR' processor.

Instead of backticks, Java uses regular double quotes preceded by STR. and uses \{variable} instead of ${variable} -

Example : - 

String name = "Alice";
int age = 30;

String message = STR."Hello \{name}, next year you will be \{age + 1}";

        //In JavaScript: `Hello ${name}, next year you will be ${age + 1}`;

System.out.println(message); //Hello Alice, next year you will be 31


Common format specifiers:
Specifier	Purpose
%s	String
%d	Integer
%f	Decimal number
%.2f	Decimal number with 2 digits after the decimal
%n	New line


ii.) For Java Project 17 Version or Older : Using Format String - 


String name = "Alice";
int age = 25;

// Prints everything in a single line -

System.out.printf("My name is %s and I am %d years old.", name, age) 
OR,
System.out.println(String.forma("My name is %s and I am %d years old.", name, age)); 

This uses format specifiers like %s (for strings) and %d (for integers) as placeholders, followed by the variables in order.



#3. To Put Comments for each class while developing to show to other developer : - 

Eclipse will only display comments in the hover tooltip if they are written in the official Javadoc format. i.e

/** */  


// Not, // or /* */ 

// Note : The Javadoc block must be placed directly above the class declaration. If you put the comment inside the class or separated it from the public class ... line with empty lines or other code statements, Eclipse will not associate the comment with that class.

// Regular comments are ignored by the hover documentation engine.





/*




 #4. Create a Custom Template for Quickly Logged Parameters

If you want a shortcut that sets up a clean template for printing a key-value style parameter, you can build a custom template:
1. Go to Window > Preferences > Java > Editor > Templates.
2. Click New... and configure it:
	• Name: sysp (or any short trigger word)
	• Pattern:java
System.out.println("${enclosing_method} -> ${var}: " + ${var});
3. Click OK and Apply.
When you type sysp and hit Ctrl + Space, Eclipse will automatically drop the template, auto-detect a nearby variable/parameter, and let you use the Tab key to cycle through other available parameters.







#5. How data stored in Java : - 

In Java, data is stored in memory using two primary architectural zones managed by the Java Virtual Machine (JVM): Stack Memory and Heap Memory. How data is routed to these zones depends entirely on whether it is a Primitive Type or a Reference (Non-Primitive ie. Object Type) Type.




i. The Two Memory Zones: Stack vs. Heap Difference -


Stack Memory : Primary Purpose  - Method execution, tracking active threads, and storing local variables.
               Access Speed is Fast.
               Lifecycle - Automatically managed. Data is erased when a method finishes executing.



Heap Memory :   Primary Purpose - Global memory space for storing dynamic objects and data structures.
                Access Speed is Slower (requires pointer navigation).
                Lifecycle - Managed by the Garbage Collector, which destroys data only when it is no longer referenced.


ii. How Different Data Types are Stored =

  Primitive Data Types (Stored in Stack) : Java has 8 built-in primitive data types. When you declare a primitive variable inside a method, its actual binary value is stored directly inside the Stack memory.

  Ex: void myMethod() {
        int age = 25; // The value 25 is stored directly on the Stack.
    }

 Reference / Non-Primitive Types (Split: Stack + Heap) : Objects, Arrays, Strings, and Classes are Reference Types. They cannot fit into a fixed slot in the Stack, so their storage is split:

     a. The Heap: Holds the actual content, variables, and metadata of the object.
     b. The Stack: Holds a reference variable (a pointer/memory address) that links back to the object's true location in the Heap.
  Example -

    void createObject() {
        String name = new String("Alice"); 
        // "name" (the pointer) sits on the Stack.
        // The actual text "Alice" sits on the Heap.
    }


iii. Special In-Memory Optimizations

To keep applications running quickly and efficiently, Java utilizes internal pooling mechanisms:

• The String Pool: Strings are immutable. If you create two separate string literals with the exact same text (e.g., String a = "Hello"; String b = "Hello";), Java stores the text "Hello" only once in a special zone of the Heap called the String Pool. Both variables point to the exact same memory address.

• The Integer Pool: Java pre-caches integer values from -128 to 127 in the Stack layer. If your code assigns an Integer object within this range, Java reuses a pre-allocated reference to save processing power


iv. Metaspace (Class Definitions)

Apart from user data, the JVM must store the blueprints of your code. Starting with Java 8, Metaspace uses native system memory to host class metadata, method definitions, and the runtime constant pool. This is separated entirely from the standard Java Heap.

*/

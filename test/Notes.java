
/*
#0. All Eclipse Short Cut :-

Ctrl + Alt + T --> Open Terminal In Current Opened Tab
Ctrl + shift + T ---> Open Type(Search for all Inbuilt Class)
Ctrl + O  --> Opened Class, Look All methods Available Here.




Ctrl + shift + + --> zoom





*/


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












#6. == Operator In Java :  In Java, the == operator does not always check object references; its behavior depends entirely on the data type being compared -


Short : In case of Object types, It always compare the address of two Objects and In case of Primitive types It just compare the two given values.


 a) For Primitive Types: It Checks Direct Value - When you use == on primitive data types (like int, double, char, boolean), it directly compares the actual values stored in memory.

Note : In Case of Primitive data stores in Stack memory, Java doesnot provide or get the memory address or any physical location in the Stack memory. Java stores direct value of Primitive data in the STACK area.

int a = 5; // 5 directly stored in memory.
int b = 5; 
System.out.println(a == b); // true (Compares the content/compares the actual values stored in memory)




b) For Objects: It Checks Reference (Memory Address) - When you use == on object references (like String, Integer wrappers, or custom classes), it checks reference address. It returns true only if both variables point to the exact same object at the same memory location.

String str1 = new String("hello");
String str2 = new String("hello");

System.out.println(str1 == str2); // false (two different memory address)
System.out.println(str1.equals(str2)); // In case of .equals() in String Class, Its a exception coz it checks the content of two Objects.(WHERE as '.euquals()'' method bydefault in 'Object' class always checks the memory address of two objects.) // Hence true.











#7. 

i. Declaring a method : Java has strict rules for how a method declaration must be structured In same order. The compiler reads them in a specific sequence -

<Modifiers(access or non-access) in any order> <Return Type fixed> <Method Name fixed>( <Parameters>){

}

Note: The Simple Rule to Remember - Think of the Return Type + Method Name as an unbreakable unit at the end of the declaration prefix.

🧱 The Correct Order for Method Declarations

When declaring a method, you must follow this exact layout from left to right:
1. Access Modifiers : public, protected, private
2. Non-Access Modifiers : static, final, abstract, synchronized
3. Return Type : void, int, String, Person, etc.
4. Method Name : main, calculateSum, etc.
5. Parameters inside parentheses : (String[] args)


Note : The only parts you can safely swap are the modifiers themselves (Access Modifiers and Non-Access Modifiers). As long as they all appear before the return type, their relative order does not matter to the compiler -

// Standard / Recommended way
public static void main(String[] args)  // Return type always comes before method name.

// Also completely valid, though less common
static public void main(String[] args) 

Note : You cannot place static or access modifiers after the return type or after the method name.

• public void static main(String[] args) ❌ (Compilation Error: static must come before the return type void)
• public void main static(String[] args) ❌ (Compilation Error)


ii.  Declaring a Class : When declaring a class, the class keyword and the name of the class form an unbreakable unit at the very end, Remember -

<Modifiers In Any Order> class <Class_Name>{

}


The Allowed Order:

1. Access Modifier: public (or package-private if left blank).
2. Non-Access Modifiers: static, abstract, final.
3. The Core: The keyword class.
4. The Identifier: Your class name.

Valid vs. Invalid Examples:

• public final class Vehicle {} ✅ Valid (Standard)
• final public class Vehicle {} ✅ Valid (Modifiers swapped)
• public static class Person {} ✅ Valid (For nested/inner classes
• class public Vehicle {} ❌ Illegal (Cannot put modifiers after class)
• class Vehicle public {} ❌ Illegal


iii. Declaring Variables (Fields) : When you are declaring a class variable (field) or a local variable, the data type and the variable name are bind or must come last -


<Modifiers In Any Order>  <Data_type> <variable_Name>;
<Modifiers In Any Order>  <Data_type> <variable_Name> = <variable_Value> ;

The Allowed Order:
1. Access Modifier: public, protected, private.
2. Non-Access Modifiers: static, final, transient, volatile.
3. Data Type: int, String, double, Person, etc.
4. Variable Name: age, name, totalAmount.

Valid vs. Invalid Examples:

• private static final int MAX_SPEED = 120; ✅ Valid (Standard)
• static final private int MAX_SPEED = 120; ✅ Valid (Modifiers swapped)
• int private static MAX_SPEED = 120; ❌ Illegal (Cannot put modifiers after data type)
• private int static MAX_SPEED = 120; ❌ Illegal (Cannot sandwich the data type)

*/

package src;


/*
# How data stores in java :- 


In Java, data is stored in memory (RAM) while a program is running. Java uses different memory areas to store variables, objects, and method calls.

In Java, data is stored in memory using two primary areas managed by the Java Virtual Machine (JVM): Stack Memory and Heap Memory. How a piece of data is stored depends entirely on whether it is a Primitive Type or a Reference Type.

a. Stack Memory : All primitive datatypes actual value, Local variables, and object references, method call information store in Stack. Primitives are the basic, built-in data types in Java. Because their sizes are fixed and predefined, the JVM stores their actual values directly in the Stack memory.

Stores primitive variables (int, double, char, boolean)
Stores method calls, local variables.
Stores Local reference variables (references to objects).

When you write int age = 25;, the variable age and its value 25 live entirely on the Stack. Stack memory allocation is incredibly fast and follows a Last-In-First-Out (LIFO) order tied to execution blocks (methods).

Thread-specific.

Memeory allocation Automatically cleaned when methods finish.
Very fast.

Memory allocation in Stack happen Automatic LIFO (Last-In-First-Out) when methods are called/exited.

Lifespan :	Short-lived; exists only as long as the current method execution block lasts.

Fast access because of strict, simple memory management.


b. Heap Memory : All reference type data object get stored in HEAP and object reference stored in Stack which holds the precise memory address of stores Object in heap. Reference types include Objects, Strings, Arrays, and Classes. These structures are dynamic and can vary drastically in size, so Java splits their storage:
    • The Heap Memory stores the actual data or object content.
    • The Stack Memory stores the reference variable, which holds the precise memory address (pointer) pointing to the location of that object in the Heap. 

Ex1: For example, when you create an object:

    Person p = new Person();  
    
    //here, The new Person() command allocates space for the object's instance variables inside the Heap.
    And, The variable p is allocated in the Stack and stores the hexadecimal memory address of that Heap location.

Ex2: public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(); // S1 is Reference to Student object

        s1.id = 101;
        s1.name = "Prakash";
    }
}

Here, s1 → Reference to Student object which ie 'S1' stores in 'Stack Memory'.
And, In heap memory, Student Object data get stores i.e id = 101 and s1.name = "Prakash"; in Heap memory with Student Object address which will be the value of s1 = xyx123 in STACK memory.

Ex3: If we creat multiple objects -

Student s1 = new Student(); // s1 refers to the first object created.
Student s2 = new Student(); // s2 refers to the second object created.

s1.id = 101;// Here, Java creates two separate objects in heap memory and with two different memory address in HEAP.
s2.id = 102;




Ex4: What happens when an object is no longer used? -

Student s1 = new Student();

s1 = null;

Java has a feature called Garbage Collection (GC).
Now, if no other reference points to that object, it becomes eligible for garbage collection.
The JVM's garbage collector can freeup that memory automatically.






Here, Memory allocation in Heap happen Dynamic allocation via the new keyword.

Life Span : Long-lived; exists until it is cleared out by the Garbage Collector.

Slower access because of dynamic lookups and pointer resolution.

Stores objects and arrays.
Shared among threads.
Managed by Garbage Collector.
Larger but slower than stack.




Note - In The Contrast: Primitives Data vs. Objects -

• Primitives (int, char, etc.): The Stack slot holds the actual value (e.g., 5). There is no address reference available to you.

Person obj = new Person(); // In case of Object creation using new, Stack stores the reference variable (obj), which acts as a pointer or a remote control to the actual object and The actual object created in the HEAP memory having address 0x4a5f6b.

obj = 0x4a5f6b (Stored In Stack Memory) // Here, obj stores a hexadecimal memory address (e.g., 0x4a5f6b) of address points directly to the location in the Heap where the actual object data lives.


• Objects (String, ArrayList, etc.): The Stack slot holds a reference (which is a managed memory address pointing to the Heap). While you can't see the exact physical hardware address, the value inside the Stack slot itself acts as an address.


REVISON : 

int age = 25;
Student s1 = new Student();

Here, age and 's1 reference' in Stack Memory and Student object in Heap Memory.


*/

public class MemoryManagement {

    public static void main(String[] args) {

        Person p = new Person("Ram");
        System.out.println(p); // Prints something like: Person@2f92e0f4
        
    }

    static class Person{

        String name;

        public Person(String name) {

            super();
            this.name = name;
        }

        

    }

    
}



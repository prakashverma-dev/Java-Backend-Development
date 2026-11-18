package com.P03.Constructor_Defination;
/*
 * 
 * # Where all Can use 'System.out.println();' In Java : -
 
 System.out.println(); you can not use directly inside Java Class, because Java only allows declarations inside the Class Body {} not executable any statements directly inside a class.
 
 
 
 
 A class serves as a blueprint that defines fields (variables), methods, constructors, and nested classes. Executable code, such as printing to the console, must reside inside a block of code that the Java Virtual Machine (JVM) knows when to run.
 
 
 
Where System.out.println() Can Be Used -

• The main() Method: This is the most common place for printing output when a program starts running.
• Instance and Static Methods: You can print values inside any custom method you create whenever that method is called.
• Constructors: You can include print statements inside a constructor to run automatically whenever a new object of that class is created.
• Static Initialization Blocks (static { ... }): Code inside a static block runs once when the class is first loaded into memory by the JVM.
• Instance Initialization Blocks ({ ... }): Code inside a plain curly-brace block inside a class runs every time a new object is instantiated, right before the constructor executes.
 
 
 
 */
public class SysOutUse {

    // INVALID: Direct statement inside the class body causes a compilation error
    // System.out.println("This will not compile");

    // 1. VALID: Static initializer block
    static {
        System.out.println("Runs once when the class loads.");
    }

    // 2. VALID: Instance initializer block
    {
        System.out.println("Runs every time an object is created.");
    }

    // 3. VALID: Constructor of this class
    public SysOutUse() {
        System.out.println("Runs inside the constructor.");
    }

    // 4. VALID: Regular Non-Static method or Instance method 
    public void sayHello() {
        System.out.println("Runs when sayHello() is called.");
    }
    
    // 5. VALID: Regular static method  
    public static void sayHello2() {
    	System.out.println("Runs when sayHello2() is called.");
    }

    // 6. VALID: Main method
    public static void main(String[] args) {
        System.out.println("Runs when the program starts.");
        SysOutUse obj = new SysOutUse();
        obj.sayHello(); // Instance method or Non-Static method need to call via object.
    }

}

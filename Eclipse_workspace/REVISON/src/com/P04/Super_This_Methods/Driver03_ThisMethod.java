package com.P04.Super_This_Methods;

/*
 Note : - this method : - this() method only calls the current class other constructor.
 
 
 Note : this() or this(args) either method use opposite of present constructor arg type defined, if current constrictor is default then use this(args) and if current constructor is parameterized use default this().
 
 If you use this() inside the default constructor it will throw compilation error coz we calling same constructor inside same constructor.
 
 A4(){
		
		this();   //Not allowed coz calling A4()  ==>throws Compilation ERROR.
		System.out.println("A4.A4() Parameterized Constructor");
	}
	
	
 A4(int n){
		
		this();   // Allowed coz calling A4().
		System.out.println("A4.A4() Parameterized Constructor");
	}
 
 
 
 # Some Facts about super() and this() method in java : -
 
 i. super() or super(args) method calls the parent class constructor with its respective call like with args or without args constructor of Parent class, while this() or this(args) method calls constructor of same class with its respective call like with args or without args of same Class.
 
 
 ii. First Statement of any Constructor is no-arg super() method by-default, put by compiler. But with no default First Statement of any Constructor could be either super() or this() method, either one.
 
iii. Mutually Exclusive : You cannot use both super() and this() in the same constructor because both require the first line. and Either one can be used and super() by default but this() can be put manually.

iv.  Recursive constructor invocation : You cannot call no args this() inside default constructor of class. COz It will chain the loops which causes a compile-time error with Recursive loop.

v. Used inside Constructor only : super() and this() method can be used inside the constructor only as first statement. Neither one can be called or use inside regular methods or static blocks. -

     Child(int x) {
        this();  // ✅ VALID: Inside a constructor
    }

    void regularMethod() {
        // super(); // ❌ COMPILE ERROR: Cannot call constructor inside a regular method
        // this();  // ❌ COMPILE ERROR: Cannot call constructor inside a regular method
    }

    static {
        // super(); // ❌ COMPILE ERROR: Static blocks belong to the class, not an object
        // this();  // ❌ COMPILE ERROR: Static blocks have no object instance
    }
    
     Child() {
        super(); // ✅ VALID: Inside a constructor
    }

 */






class A4{
	
	A4(){
//		this(); Not Possible 
		System.out.println("A4.A4) Default Constructor");
	}
	
	A4(int n){
		
		super();
		System.out.println("A4.A4() Parameterized Constructor");
	}
}


class B4 extends A4{
	
	B4(){
		
		super(); // call the parent default constructor i.e with no args
		System.out.println("B4.B4() Default Constructor...");
	}
	
	B4(int n){
		
		this(); //==> B4(); It will call the constructor of same class which no args ie B4() and after calling block executions, below block will run.
		System.out.println("B4.B4() Parameterized Constructor..."); // Lastly execute from call stack.
	}
}


public class Driver03_ThisMethod {
	
	public static void main(String[] args) {
		
		//creating object of class B4, with args passed  a integer -
		B4 obj = new B4();
		
		/*
		 
		 A4.A4) Default Constructor
		 B4.B4() Default Constructor...
		 B4.B4() Parameterized Constructor...
		 
		 */
		
	}
	
}

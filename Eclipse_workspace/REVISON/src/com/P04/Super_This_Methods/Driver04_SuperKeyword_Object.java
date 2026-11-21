package com.P04.Super_This_Methods;
/*
 
 # 'super' keyword : 
 
 In Java, the super keyword is a reference variable or reference object used within a subclass to refer to its immediate parent class object. It has three primary uses (along with a few modern/niche applications) -
 
 Note : If a class is not inheritances any class as extends then such every independent class inheritace Bydefault 'Object' class as Parent Class or Super Class.
 
 Note : As per Inheritance, all class attributes and methods gets inheritaces to Sub Class from Super Class.
 
 Note : 'super' keyword used as reference object of Parent Class, when inside th child class have got the same attribute names and method names as Parent Class, And We want to use the attribute value from PArent class and method call from Parent Class, then 'super' keyword as object to Parent Class short this Problem and super refers to reference Object of Parent Class.
 
 Note : The difference between 'this reference object' and 'super reference Object' is that 'this reference object' is refers to the current class Object after its object creation and 'super reference Object' is refers to Parent Class i.e Super Class object.
 
 In short : this reference object : instance of own Class i.e Base Class.
 			super reference object : instance of parent Class i.e Super Class.
 
 The most common use of the 'super' keyword object is to eliminate the confusion when sub-class have same method name and attributes names with its Parent Class.
 
 
 */

//Example1 : For Class attributes Calling with 'super' reference object of super Class or Parent Class -

class P{  // super Class
	
	int i = 5;
	
	
}

class Q extends P{  // sub Class
	
	int i = 3;
	
	void show() {
		System.out.println(i); // 3; Now it will take i not from parent Class if int i = 3; was not present here it would take from super class.
	}
	
	//To Print 'i' from Parent or Super Class -
	void show1() {
		
		//Way1 : create object of 'P' class and call 'i' attribute -
		System.out.println(new P().i); // 5
		
		//Way2 : use 'super' keyword as reference object of Parent class, to call Parent class all attributes and method direcly -
		System.out.println(super.i); // ==> new P().i; //5  here 'super' refers to Parent Class Object ie. 'new P()'
	} 
}


public class Driver04_SuperKeyword_Object {

	public static void main(String[] args) {
		
		Q obj = new Q();
		
		//calling Sub-class method -
		obj.show();
		
		//calling Sub-class method but accessing parent Class Attribute -
		obj.show1();
		
	}
}


//Example2 : For Class methods Calling with 'super' reference object of super Class or Parent Class -
class P1{  // super Class
	
	int i = 5;
		
	void abc() {
		System.out.println("P.abc()..Parent method");
	}
	
}

class Q1 extends P1{  // sub Class
	
	int i = 3;
	
	void abc() {
		System.out.println("P.abc()..Child method");
	}
	
	//To Call 'abc() method' from own class -
	void showSameClass() {
		
		abc(); // P.abc()..Child method

	} 
	
	// To Call 'abc() method' from Parent class or Super Class -
	void showParentClass() {
		
		//Way1 : create object of 'P' class and call 'show()' method -
		new P1().abc(); //  P.abc()..Parent method
		
		//Way2 : use 'super' keyword as reference object of Parent class, to call Parent class all attributes and method directly -
		super.abc(); // ==> new P1().abc(); //  here 'super' refers to Parent Class Object ie. 'new P1()'
	} 
	
	
}



class Driver04_SuperKeyword1 {

	public static void main(String[] args) {
		
		Q1 obj = new Q1();
		
		//calling Parent-class method, if 'abc()' method not present in child class, It happened coz of Inheritance -
		// obj.abc(); // P.abc()..Parent method
		
		//calling Sub-class method as 'abc()' method is present in child class, It happened coz of method overriding -
     	obj.abc(); // P.abc()..Child method
     	
     	
     	//Lets, try to call showSameClass() method of Child class -
     	obj.showSameClass(); // It will call the method of Child class with child class 'abc()' method 
     	
     	//But, I want to call abc() method of Parent Class -
     	obj.showParentClass();
		
	}
}


// PracticeExample1 :  Access Parent Class Variables (Field Hiding) -

//When a parent class and a child class declare a variable with the exact same name, the child's variable hides the parent's variable. You use super.variableName to access the parent's version -

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println(color);       // Prints "Black" (child or same class)
        System.out.println(super.color); // Prints "White" (parent class)
        System.out.println(new Animal().color); // Prints "White" (parent class)
    }
}

//PracticeExample2 : Call Parent Class Methods Inside Child Class's Normal Method or Method Overriding -

//When a subclass overrides a method from its parent class, calling the method directly executes the child's version. You use super.methodName() to call the parent's original implementation—often to extend its behavior rather than completely replace it. - 
class Vehicle {
	
    void start() {
        System.out.println("Checking engine...");
    }
}

class Car extends Vehicle {
	
    @Override
    void start() {
        super.start(); // Calls Parent class i.e Vehicle's start() method - Prints "Checking engine..."
        System.out.println("Car is ready to drive."); // Prints "Car is ready to drive."
    }
}




//	public class Main {
//	  public static void main(String[] args) {
//	    Dog myDog = new Dog();
//	    myDog.printType();
//	  }
//	}
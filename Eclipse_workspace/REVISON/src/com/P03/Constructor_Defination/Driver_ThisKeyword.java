package com.P03.Constructor_Defination;

/*
 * 
 #6. 'this' keyword :-
 
  In Java, the 'this' keyword is a reference variable or reference object that points to the current object when this current object created from the class. 
  
  Most USE Case : When a method or constructor parameters has the same name as an instance variable, the local parameter hides (shadows) the instance variable. Using this resolves this naming conflict -
  
  class Student {
  
    String name;
    
    //Constructor method  -
    Student(String name) {
        this.name = name; // Assigns parameter 'name' to instance variable 'name'
    }
    
    //Normal method-
    void test(){
    	
    	// To print the Instance variables for each Object created we could either -
    	System.out.println(name);  // using 'instance' variable directly
    	
    	System.out.println(this.name); // using respective object with its instance variable.
    }
}

Most USE Case2 : For Accessing the Instance variable value from object we could use this.<instance_variable> or it also works directly accessing instance variable inside the class.
 
 
 
 
 
 
 
 
 
 As we discussed in Note2 i.e ' While defining the parameters for methods we can use same variabels names from Class as well as Different' So in Such case when any type of method defination(could be constructor) if we used the same parameters name for method with Class attribute names then we need to distinguge between the local variables and Instance vairable by using 'this' keyword to refer the object which being called while creating the object of the class.

Hence, we can say that 'this' keyword used for two purpose to full-fil -
i. To diffetrenciate the local variables inside the any type of method(could be constructor) and Instance vairable.
ii. We use 'this' keyword to refer the respective object which being called while creation of object of the class.

 
 Note : 'this' keyword can be used inside any methods inside the class. Where 'this' keyword will refer the respective 'object' when object created from the class.
 
 Normal Method
 Constructot method
 
 Note : this.<variable_name> --> Here <variable_name> always reffered to the 'Instance variable' and complete 'this.<variable_name>' refered to value of this Instance variables after object creation of this class.
 
 
 this keyword can be used inside any method or constructor when the Class Attributes and Method Attributes are same.
 
 We can directly call the Class attribute inside method with its instance variables OR, we call it using this.<instance_variable> both will result same. as here --> this will refer to the object of this class. 
 
 
 */
//using this keyword inside 'normal method' -
class Calculate2{
	
	// Instance Variables -
	int a = 10;
	int b = 30;
	
	
	//Note : Local variables here a nd b are different than above instance variables a and b .
	int sum(int a, int b) { // Here a and b are Local Variables 
		
		System.out.println(" Local Variable :"+a); // 1
		System.out.println(" Local Variable :"+b); // 2

		
		//But In Case, I want to print the Instance same variable insde this method, will use 'this' keyword -
		System.out.println(" Instance Variable :"+this.a); // 10 // this.a ==> <cal>.a  --> here 'cal' is object created for this class.
		System.out.println(" Instance Variable :"+this.b); // 30 // this.b ==> <cal>.b --> here 'cal' is object created for this class. 
		
		return a + b;
	}
	
	
	
	
	
	// main method for 'sum' method call -
	public static void main(String[] args) {
		
		Calculate2 cal = new Calculate2();
		
		System.out.println("The sum : "+cal.sum(1,2));

	}
	
	
}



// using this keyword inside 'constructor method' -
class Calculate3{
	
	// Instance Variables -
	int a;
	int b;
	
	
	//Note : Local variables here a and b in constructor method are different than above instance variables a and b.
	// Creating Parameterized constructor for Assigning Init Value for Object creation for this 'Instance variables' -
	public Calculate3(int a, int b) {
		
		System.out.println("Parameterized Constrictor Called..");
		
		// To assign the 'Passed Local Variables Values to the 'Instance variable' we need to use 'this' keyword to achive the requirement as Instance and Local Variable names are same -
		
		//But In Case I want to assign Instance varibles to local variables => will create problem without 'this' keyword
//		this.a = a; // this.a ==> <cal>.a  --> here 'cal' is object created for this class.
//		this.b = b; // // this.b ==> <cal>.b --> here 'cal' is object created for this class.
		
		
		this.a = a; // this.a --> always refered to Instance variable and last a refered to local variable.
		this.b = b; 
		
	}
	
	
	
	// A Normal Method -
	int sum() { 
		
		
//		using 'this' keyword to print the instance variable here - 

		System.out.println(" Instance Variable :"+this.a); // Same as accessing directly instance variable 'a' here. 
		System.out.println(" Instance Variable :"+a); //  
		
		System.out.println(" Instance Variable :"+this.b); // Same as accessing directly instance variable 'b' here.
		System.out.println(" Instance Variable :"+b); // 
		
		return a + b;
	}
	


	
	
	// main method for 'sum' method call -
	public static void main(String[] args) {
		
		Calculate3 cal = new Calculate3(5, 9);
		
		System.out.println("The sum : "+cal.sum());

	}
}


class Student {
	  
    String name;
    
    //Constructor method  -
    Student(String name) {
        this.name = name; // Assigns parameter 'name' to instance variable 'name'
    }
    
    //Normal method-
    void test(){
    	
    	// To print the Instance variables for each Object created we could either -
    	System.out.println("From Class Itself Instance Variable :"+ name);  // using 'instance' variable directly
    	
    	System.out.println("From Class Itself Instance Variable :"+ this.name); // using respective object with its instance variable.
    }
    
}

class Driver{
	
	public static void main(String[] args) {
		Student st = new Student("Prakash");
		Student st2 = new Student("Priyanshu");
		
		System.out.println("From Caller/Driver :"+ st.name);
		st.test();
		
		
		System.out.println("From Caller/Driver :"+ st2.name);
		st2.test();
	}
}
package com.P02.Variables_Scope;

/*
 
 
 # Scope of Variables in Java : -
 
 Scope : A region from where a variable can be accesses.
 
 In same scope, two variables names canot be same.
 
 In Different Scope two variables names could be same.
 
 a) Class level Scope : It can be access anywhere inside the class.
 
 class Algebra{
 
 	int a;
 	int b;
 	
 	int add(){
 		
 		return a + b;
 	}
 	
 	int sub(){
 		
 		return a - b;
 	}
 	
 	
 }
 
 
 
 
 b) Method Level Scope : These are the variables declared inside the method and can not be accessed outside of these methods.
 
  
 class Algebra{
 
 	int a;
 	int b;
 	
 	int add(){
 		
 		int p = 10; // local variables or Method level scole
 		int q = 20;
 		return p + q;
 	}
 	
 	System.out.println(p); // Canot access local variables outside of the respective method.
 	System.out.println(p); //
 	
 	
 	
 }
 
 
 
 
 
 
 
 c) Block Level of Scope : A block of code that may exist on its own or belongs to if-statements or for-loop etc. 
 
 Means we can declare variables inside the independent pair of {} or belong to if-statement or for-loop or methods where statt { and ends }.
 
 {
 
 
 }
 
 if{
 
 
 }
 
 
 
 */

// Instance variables and Local variables Example : -

class Algebra{
	 
 	int a; // Insance variables
 	int b; // Insance variables
 	
 	//Note : above a and b which is Intance variable is not same as below Method local variables a and b -
 	int add(int a, int b){ // Here a and b are Local variables which is not same as above a and b.
 		
// 		int a = 10; // As variable declared in this scope which is local variables, we can update the value.
// 		int b = 20; // As variable declared in this scope which is local variables, we can update the value.
// 		a = 10;
// 		b = 20;
 		
 		return a + b;
 		

 	}
 	
 	public static void main(String[] args) {
		
 		Algebra alg = new Algebra();
 		
 		System.out.println( alg.add( 5, 20) );
 		
 		//trying to access the 'p' and 'q' -
 		
// 	 	System.out.println(p); // Canot access local variables outside of the respective method.
// 	 	System.out.println(q); // Compiler complains and canot resolve to run the program.
 	 	
	}
 	
 }


// Block Level Scope vs Method Level Scope  : -

//Note : All variables decalred at method level or Inside a method are called as Local variables, even It is inside the block scope. SO Two local varibles canot be same inside the Method, REMEMEBER.

//Note :  A local variable same name can not belong to Block Scope vairables Inside 'method' but a Instance variables same can belong to Block Scope Variables inside the 'Class'.

//Note : method level variables initialized once and can be use to update it in the program again and again. Ex: decalring vairble before for-loop and updaing its value inside for-loop.

class Algebra1{
	

	void demo(){
		
		
		int a = 10;
		System.out.println("Local Scope : "+ a);

		//Block Level Scope -
		{
//			int a = 20; // a canot be same as 'a' already belong to local scope.
			int b = 20;
			System.out.println("Block Scope but Inside Local Scope :" +b);
			
		}
		
		// Local variable same name can not belongs to block scope variables inside the method but Block scope variables could be same -
		{
			
			int b = 30;
			System.out.println(b);
		}
		
		//tring to access the Block Scope -
//		System.out.println(b); // We canot access - 
		
		
		// with for loop -
		for(int i = 0; i<5; i++) 
		{ // Block level scope start -
			a = 10; // can not use 'a' of local scope.
			System.out.println("updated a value :"+a); // 10 - 5 times
 			
		}
		
	}

	
	int x = 10;
	
	{
		int x = 20;
		System.out.println("executing..");
	}
	

	
	
	public static void main(String[] args) {
		Algebra1 al = new Algebra1();
		al.demo();
		
		System.out.println(al.x);
	}
}



/*
 
 i. Formal Parameters and Actual Parameters -

Formal Parametera are those we declare inside the method defination.
Actual Parameters are those we pass values while calling the method, also called as Arguments.


ii. Pass By value and Pass by reference In Actual Parameters  :-

 We can pass the actual values to Actual Parameters via two ways -
 a) Pass By Value
 b) Pass By Reference : In java, only have pass by value not pass by Reference. 
 
 
 */ 


class Algebra2{
	
	static int sum(int a, int b) {
		
		return a + b;
	}
	
	// We can call static method directly inside main method without creating an object of this class 'Algebra2' -
	public static void main(String[] args) {
		
		int a = 5 , b = 10;
		System.out.println( sum(a,b) );;
	}
}


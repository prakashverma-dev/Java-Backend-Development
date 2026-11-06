/* 


1) variable : It is a conatiner which will hold the values or data to it -

int amount = 100;

variable value can be updated.
amount = 200;




# Plus Operator : To seperate static with dynamic things. We use + opertor for that.


*/

class Payment{
	
	public static void main(String a[]){
		
		//created variable -
		
		int balance; // Define variable // local variable coz it is inside method.
		balance = 200;  // Initialize the value to variable

		int amountToBeTxn = 10;  //local variable coz this is local to this method.
		
		System.out.println("Balance is : "+balance);
		System.out.println("Transaction is : "+amountToBeTxn);
		
	}


	void doSomething(){

		// System.out.println("Transaction Trying to access : "+amountToBeTxn); // we canot access local variable of other method scope to here.

	}
	
}


/*



2) Type of Variables : -

i.) Local Variable : local to something

variable declared inside the method, block{}, constructor etc. are called local variable. and this variable or value cannot be access outside of this local space or method.

local is boundary i.e limited to block {} and no body able to access this local variable outside.


Example : 

void m1{
 int balance = 200; //local variable
}


Note : local variable must be initialized at the time of variable creation to use it. As We know local variable is limited to only current method or scope so, it canot be use anywhere the reason jaava says user must initilize local variable value before use it.

Note : Method calling stored in stack. Like if there multiple method call happened, it stored in stack with follow LIFO principle. and also local variables stores in stack as well as it it part of method.




ii.) Instance variable : When a variable is declared outside the method but inside the class, called instace variable. and Instance variable can be access to all object created by this class.

And, also can be access to current class all methods.


iii.) Static Variable :  static variable means belongs to class itself. and It also decalre outside of method and inside the class.

instance variable means belongs to object creation by that class. If we creating 10 object of that class then those 10 object will have access to this instance variable but can not access to static variable.




*/

// instance variable : belongs to objects.
// static variable : belongs to curent class itself.
// local variable : belongs to method/block.

class Payment2{

	int amount = 100; // Instance variable
	static int payment = 1200; // Static variable

	public static void main(String[] args) {
		
		// System.out.println("Accessing Instance variable : "+ amount); // Intance variable canot access inside static method, it could either non static or we can access static variable.

		System.out.println("Accessing static variable from main method : "+ payment); // only static variable can be access in static method only, not instance variable.


		//a) To Call Non static method here we created object first -
		Payment2 py1 = new Payment2();
		py1.check(); // to call Non static method here we created object first.


		//b) To call static method here we can call it directly or with ClassName.method -
		check2();
		Payment2.check2();

		
	}

	// Non-static method or Instance method : Need to create object of this method class to call it -
	void check(){
		System.out.println("Accessing Instance variable : "+ amount);
		System.out.println("Accessing static variable : "+ payment);
	}

	// static method or Non Instance Method : It could be directly called or using ClassName.method() -
	static void check2(){
		
		System.out.println("Accessing static variableeee : "+ payment); // static variable can be only called.
	}

}


class Account{

	int balance = 100; //Intance variavble
	static int intrestRate = 5; // Interest Rate is common so we make it static.
	public static void main(String[] args) {
		// We canot access the instance variable inside static void, we need to create object of that class to access it -
		Account acc1 = new Account(); //created object of Account class
		// <Datatype> <variable_name> = <variable_value>;
		
		System.out.println("Balance is : "+ acc1.balance); 

		//Accessing the static variable : It can directly access using className.variable or direct variable -

		System.out.println("Interest Rate : "+ Account.intrestRate); 
		System.out.println("Interest Rate : "+ intrestRate);
		
		
		// Note : dot operator use to access method or variable from object. 

	}
}
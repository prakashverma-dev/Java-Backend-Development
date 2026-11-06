package com.kodewala.day28_Encapsulation;


/*   


 OOPs : - OOPs is nothing, It is way of writing objects so that our code will be re-usable, moduler, scalable, secure and maintainable.

 We use OOPs to achieve these features -
 
 Re usable : Somebody written code i,e class we can use it.
 moduler : break the entire code into different different module; to organize the code. --> pdfModule,
 scable : If you get more requirement or load, your sytstem can scale up.
 secure : Nobody can modify your data without your permission
 maintainable : Software requires more maintainable than development i.e to fix the problem easily.
                A good maintainable software is allow us to add new features and work greatly.




LLD --> Low Level Design (Depends on OOPS)  --> IN interview in LLD round, we need to achieve OOPS.
        Ex: IN LLD round at PVC : can you design Swiggy, instagram, amazon.

        Interview checking that a candidate able to achivee OOPS functionalities or not or your thought process.

        Ex1: can do LLD for 'Order Placement Flow'  --> OOPs achieve


# We have four OOPS COncept (Important) :-

1. Encapsulation : It is kind of a capsule (combine date/variables and methods as a unit)
2. Inheritance : code written and tested by someone can be reused.
3. Polymorphism : Act based on situation.(e.g : same person behave differenly based on situation his role get changed)
                  SITUATION Changes --> Behaviour Changes(methods)

4. Abstraction : Hide the internal Implementation of application and show only required details to user.
                 e.g: Remote button(show Buttons but doesno show internal implemenation), ATM machine(show only button not internal machine mechanism)

Note : OOPs basically tells whats the write way to write code by following OOPs 4 principles.




# Let'st Start Encapsulation : -

	Encapusulation tells to combine or bind the data(i.e variables) and method as a unit so that data can be 	only accessible within the class i.e declare data of class as 'private' and if somebody want to modify the 	data they could only modify through class's methods i.e setter methods and only able to access data using getter methods.

	As per Encapsulation, Two rule :-
         Declare the data as private(other class canot modify the data of owner class)
         Declare the method as public(with Setter(change the values of attrbutes) and Getter method(Provide or 	Access the attribute values)).


	For class having : variables(data) + methods(logic or functionality)
	
	As per Encpasulation, methods can only modifying the data of the class and NO body or other can able to modify the data of the class from outside.
	
	# Note : Not well capsulated : when data declared with public or default or protected, then it doenso follow OOPS's Encapsulation.



*/


//Note : When class is not well encapsulated, people will be able to modify the data(variables data) of this class from other class/outside which is not follows OOPS. 
public class Payment {
	
//	public int balance; //Not well Encapsulated coz data is Public so ATM balance can be changed.
	private int balance; //well Encapsulated coz data is private

	public Payment(int _balance) {
		super();
		this.balance = _balance;
	}

	
	// normal method to do debit -
	public void doDebit(int amount) {
		
		// modifying the data -
		if(amount>0) {
//			balance = balance - amount;
			this.balance = this.balance - amount; // hee balance refer to this clas variable ie intance variable and amount is local variable.
		}
		
	}
	
	// normal method to do credit -
	public void doCredit(int amount) {
		
		// modifying the data -
		if(amount > 0) {
			balance = balance + amount;
		}
		
	}
	
	// To show the data, we should define getter method to read the data of this class -
	public int getBalance() {
		return balance;
	}
	
	
	// Note : Above doDebit and DoCredit methods are setter methods means have the accessibility to modify i.e set the class data.
	
	// Setter Method : It is control access.(allowed to change the data with controlled access).
	// Getter method : It must return the value, caller will use it , then it is a getter method.
	
	

}

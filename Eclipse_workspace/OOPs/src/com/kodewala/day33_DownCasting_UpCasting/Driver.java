package com.kodewala.day33_DownCasting_UpCasting;


/*

 * # auto up-casting : Parent class can refer child class object, while creating child class object, In case of Inheritance. up-casting happen automatically.
 * 
 * 					   It is basically changing the type.
 * 					   User au2 = (User) new AdminUser(); --> up casting happen automatically compiler do automatically.
 * 
 * 
 * //Note : Super Class 'Object' can also be used to refer -
		Object fu2 = new FinanceUser();
		Object s = new String();
		Object ac = new Account();
		
# Down Casting : It doesn't happen automatically by the java, we need to explicitly tell the compiler by bracet that we converting child to parent i.e Child Class referring the parent class Object -

 	AdminUser au3 = (AdminUser) new User();  // for downCasting child need to tell what is my target i.e (AdminUser).
 	
 use of Downcasting : Whenever the object returning any generic type i.e OBJECT, we use downcasting to convert it to actual type.
		
 * 
 * 
 * 
 * 
 * 
 * 
 * */
class User{
	
	
}

class AdminUser extends User{// AdminUser IS-A type of User.
	
	
}


class LocalUser extends AdminUser{
	
}

class FinanceUser extends User{
	
}




public class Driver {

	public static void main(String[] args) {
		// 'User' class is referring its own class Object i.e User Class Object i.e u -
		User u = new User();  // int a = 100; // User() is actual object type of 'User'
		
		// 	'AdminUser' class is referring its own class Object i.e AdminUser Class Object i.e au -
		AdminUser au = new AdminUser();
		
//		Note : Parent class can refer child class object, called as auto-up-casting. //Either the same class or SuperClass can refer the new created object -
		User au2 = new AdminUser(); // User is Parent clss and AdminUser is child class.
		
		//Here USer is parent class of AdminUser.
		
		AdminUser lu1 = new LocalUser();
		User lu2 =new LocalUser(); // 'new LocalUser()' is actual object.
		
		
		User fu = new FinanceUser();
		
		
		//Down Casting - Child Class referring the parent class Object.
		
		AdminUser au3 = (AdminUser) new User();
		


	}

}




package com.kodewala.day30_Inheritance;



/*
 * 
 * Inheritance Revision : -
 * 
 * Account <----- Saving Account <---- Senior Citizen Account <----- Pension account
 * 
 * Inheritance Advantage : -
 * 
 * i. Code Reusability
 * ii. Trust
 * iii. 
 * 
 * 
 * Disadvantage :
 * 
 * i. if at parent level some change happened it will reflect to all child classes who extends it, Hence child class heavily dependent on the Parent class.If some changes happen at Parent class it will refelect to all child class.
 * ii. Heavy loading through constructor coz all hirachy loded.
 * iii. Tightly Coupled.
 * iv. Heavily Loading in memory of all the parent classes : if we call loweest child element then it iniatilize all the parent hirachy paramters in memory.
 * v. In case of Over-riding methods, if some new parameters i.e input added in parent class then we need to add in all over-riding  methods parameter.
 * 
 * 
 * 
 * Note : In this UNIVERSE, all the beautiful features comes with some problem. If you getting some benefit some loss involved.
 * 
 * 
 * 
 * 
 * # Type of Inheritance : -
 * 
 * i. Single Inheritance : When we we only one level i.e single relation, called Single Inheritance.
 *                         Ex: Account  <----- SavingAccount
 *                         
 * ii. Multilevel Inheritance : When we have more than one level relation.
 * 				Ex: Account  <---- SavingAccount <----- SeniorCtAccount
 * 
 * 
 * iii. Hierarchical Inheritance : When One class got two childs, called Hierachical Inhgeritance.
		   Ex: Account   <-------- SavingAccount
					 	 <-------- JanDhanAccount
 * 
 * 
 * 
 * iv) Multiple Inheritance(Refer the video clip for this) : Multiple Inheritance doesnot suuport by Java/Bydefault JAVA not allow MUltiple Inheritance, It creates DIAMOND problem(DOD) coz problme structure get like DIAMOND. And it could be solve by 'Inheritance'.
 * 
 * When two class have same parent and then there is a child which have two parent, NOt posible coz this child class get confuse which parent quality to adapt. So THIS COMES UNder DIAMOND problem IN JAVA, which can be solve by Inheritance.
 * 
 * 
 * */


//@Override  : It is not compulsory but it make sure you not breaking the rule.
// Override : Changing superclass functionality in child class when it get called.

//Override Rules : i. Same method name must be there 
				
class Account{
	
	public void openNewAccount(String userId, String email){  // x ==> x+1 will effect in all child classes.
		
		System.out.println("Account.openNewAccount()");
		
	}
	
	
}

class SavingAccount extends Account{
	
	
	@Override  /// To change Parent CLass i.e Super Class Method's functionality at child level.
	public void openNewAccount(String userId, String email){

		
		//Here migh be some different logic we want to perform so we used @override to overide the parent class method functionality here.
		
		System.out.println("SavingAccount.openNewAccount()");
		
	}
	
	
}


class SeniorCitizenAccount extends SavingAccount{
	
	
	@Override
	public void openNewAccount(String userId, String email){
		
		System.out.println("SeniorCitizenAccount.openNewAccount() Get Called!");
		
	}
	
}


class PensionAccount extends SeniorCitizenAccount{
	
	@Override
	public void openNewAccount(String userId, String email){
		
		System.out.println("PensionAccount.openNewAccount()");
		
	}
	
}






public class Driver {
	

	
	public static void main(String[] args) {
		
		// Calling Senerior Citens Account -
		SeniorCitizenAccount sc = new SeniorCitizenAccount(); // 'HAS-A' relationship when we create object of class. Driver has a sc object.
		
		
		sc.openNewAccount("2423d", "prakash@gmail.com");
		
	}
	

}













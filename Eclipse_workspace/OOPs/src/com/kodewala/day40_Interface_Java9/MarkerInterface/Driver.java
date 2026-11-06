package com.kodewala.day40_Interface_Java9.MarkerInterface;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Account acc = new Account("Kodewala Academy", "BTM layout", "234243444");
		System.out.println(acc);
		System.out.println(acc.accNo);
		
		//Cloning of an object : Instead of calling constructor again and again we can clone it.
		
		// We trying to clone the object 'acc' : We need to take permission of inbuilt 'Cloneable' marker Interface, how it look like -
//		public interface Cloneable {
//		}
		
		Account clonedObjOfacc = (Account) acc.myClone(); //myclone() method will return an object.
//		
		System.out.println(clonedObjOfacc);
		System.out.println(clonedObjOfacc.accNo);
		
		
		//TO check Cloneable or not - 
		if(acc instanceof Cloneable) {
			System.out.println("Clonable allowed");
		}else {
			System.out.println("Clonable denied.");
		}

	}

}

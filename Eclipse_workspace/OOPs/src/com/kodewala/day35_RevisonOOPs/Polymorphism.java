package com.kodewala.day35_RevisonOOPs;



class Delivery extends Object{  // Object is superclass by-default.

	public void doDelivery() { 
		
		System.out.println("DeliveryPartner.doDelivery()...Delivery");
	}

}


class ExpressBeee extends Delivery{
	
	
	@Override
	public void doDelivery() { 
		
		System.out.println("DeliveryPartner.doDelivery()... ExpressBeee");
	}
}


class Ekartt extends Delivery{
	
	
}








class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// TEST1 :
		
		Delivery delivery = new Delivery(); // int amount = 100;
		
		delivery.doDelivery();
		// At Compile time -- > it will check the method doDelivery() available in 'Delivery' Class or not.If not will go to check in superClass and fail.
		// At Runtime -- > it will return the actual method from current class, if not available return from super class method and so on..
		
		
		delivery.hashCode(); // hashCode() method not available in our superclas i.e 'Delivery' Class, so it went to Object class and call from there.
		
		
		//TEST2 :
		
		Delivery delivery1 = new ExpressBeee();  // Parent class can refer child class object
//		Delivery delivery1 = (Delivery) new ExpressBeee(); //Auto up casted.
		delivery1.doDelivery();
		
		// CompileTime -- > it will check the method i.e doDelivery() is present in 'Delivery' class or not.If not will go to check in superClass and fail.
		//At Runtime : It will call the method of actual class i.e ExpressBee class method.
		
		
		
		//TEST3 : Down-Casting - We need to explicitly specify the target -
		
//		ExpressBeee expressb = (ExpressBeee) new Delivery(); //We will get Class Cast Exception. To solve -
		
		Delivery del = new ExpressBeee();
		
		ExpressBeee expressb = (ExpressBeee) del; //Now, We will not get Class Cast Exception.
		expressb.doDelivery(); // It will call ExpressBeee class method. 
		
	}

}

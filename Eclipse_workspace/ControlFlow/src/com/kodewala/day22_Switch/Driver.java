package com.kodewala.day22_Switch;

/*
 * 
 * Loops : for and while
 * Control Flow : if-else and multiple if-else  --> used to decide the control flow of program.
 * 
 * 
 * 
 * Switch : It is an alternative of if-else. 
 * 			When we have multiple conditions to check each time, we prefer to use switch over if-else.
 * 
 * 
 * switch(<expression/condition expression>)
 * 
 * case <condition_value1>: do this;
 * 							break;
 * 
 * case <condition_value2> : do this;
 * 							 break;
 * 
 * case <condition_value3> : do this;
 * 							 break;
 * 
 * case <condition_value4> : do this;
 * 							 break;
 * 
 * 
 * After every case, we need to use break.
 * 
 * 'break' keyword is mandatory in switch to function it approprovately.
 * 
 * 
 * Note : In case of 'break' keyword with default, If we placed 'default' statement in between the cases, then it is mandatory to put break and if 'default' statement is last statment in the row, then it it optional to put 'break'. 
		
		
	It is not mandatory to put 'default statement' in the last row, but for best pratice we put.
 * 
 * 
 * 
 * */


//Example1 : Identify the day based on number supplied -

public class Driver {

	public static void main(String[] args) {
		// I will create object of 'Driver' class as indentify method is non static-
		Driver driver = new Driver();
		
//		driver.indetifyDay(1);
		
//		To take command line Input for dyanmic pass - 
		int day = Integer.parseInt(args[0]);
//		
		driver.indetifyDay(day); // F5 -- To step Into this method while debugging.
			

	}
	
	
	// Method - this method belong to driver class and It is non static -
	public void indetifyDay(int num) {
		
		
		switch (num) {
		
		case 1: 
			System.out.println("Monday");
			break;
			
	    default:
			
			System.out.println("Unknown Day! Please Provide Valid Day Number(1-7).");
			break;
		
		case 2: 
			System.out.println("Tueday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
			
	}
	
		
//		Note : we remove break keywords from Case1 to Case3, Then if we pass '1' i.e driver.indetifyDay(1); Expected output would be 'Monday' But it will fall till it not find break keyword and prints all sysout value from Case1 to Till Break keyword here we get  - Monday, Tuesday, Wednesday, Thursday i.e till Thursday we get.
		

	}

}


//Example2 : A customer wants to order Coffee : Fix Customer Order -

class CustomerOrder {

	
	  public static void main(String[] args) {
		  
	    int choice = 1; //for coffee order

	    // 1 = Coffee
	    // 2 = Tea

	    switch (choice) {
	      case 1:
	        System.out.println("You ordered Coffee");
			break;

	      case 2:
	        System.out.println("You ordered Tea");
			break;
		
		 default :
	        System.out.println("Invalid choice");
			break;
	    }
	  }
	}

/*
 * 
Task Time : As part of e-commerce application, you need to develop discount_API method which will calculate the discount based on customer type -

Customer Type :

	a) Gold  - 20% Discount
	   
	b) Silver  - 10% Discount
	
	c) Regular - 5% Discount
	

Max Discount : 2500

Minimum Purchase : 1000 --> if customer purchase values is above 1000 then only discount is applicable.

 * 
 * FOLLOW Naming convention and Single Responsibility(part of SOLID) .
 * 
 * 
 * 
 * */


class DiscountAPI{
	
	
	public double calculateDiscount(String customer_type, double purchaseAmount) {
		
		double maxDiscount = 2500;
		double discount;
		
		if(purchaseAmount < 1000) {
			
			System.out.println("Please Purchase Total Amount Upto 1000, To Get Eligible for Discount!");
			return 0.0; // No Discount Given
		}
		
		switch (customer_type) {
		
		case "GOLD": 
			
			discount = purchaseAmount * 0.2 ;
			
			return (discount < maxDiscount) ? discount : maxDiscount ;
			
			
			
		case "SILVER":
			
			discount = purchaseAmount * 0.1 ;
			
			return (discount < maxDiscount) ? discount : maxDiscount ;
			
			
			
		case "REGULAR":
			

			discount = purchaseAmount * 0.05 ;
			
			return (discount < maxDiscount) ? discount : maxDiscount ;
			

		default:
			
			System.out.println("Please Enter a valid Customer Type, To get eligible for Discount!");
			return 0;
		}
		

		
		
	}
	
	
	//Driver for this -
	public static void main(String[] args) {
		
		DiscountAPI dapi = new DiscountAPI();
		
		double purchaseAmount = 900;
		System.out.println("Purchase Amount : "+ purchaseAmount);
	
		double discount = dapi.calculateDiscount("GOLD", purchaseAmount);
		System.out.println("Max Discount Applied : " + discount);
		System.out.println("Need to Pay : "+(purchaseAmount - discount));
		
	}
}


// A Easy version of solving : where we update discount value each time and break it as it will update the value and break only exist from current switch loop not method -

//Note : Here we will use switch blioc


class DiscountAPI2{
	
	
	public double calculateDiscount(String customer_type, double purchaseAmount) {
		
		double maxDiscount = 2500;
		double discount = 0;
		
		if(purchaseAmount < 1000) {
			
			System.out.println("Please Purchase Total Amount Upto 1000, To Get Eligible for Discount!");
			return 0.0; // No Discount Given
		}
		
		switch (customer_type.trim().toUpperCase()) {
			
			case "GOLD": 
				
				System.out.println("Customer Type is Gold, applying 20% discount");
				discount = purchaseAmount * 0.2 ; //will update the value
				
				break;	
					
				
			case "SILVER":
				
				System.out.println("Customer Type is Silver, applying 10% discount");
				discount = purchaseAmount * 0.1 ;
				
				break;	
				
				
			case "REGULAR":
				
				System.out.println("Customer Type is Regular, applying 5% discount");
				discount = purchaseAmount * 0.05 ;
				
				break;
				
				
			default:
				
				System.out.println("Invalid Customer Type, Please Enter valid Customer type to get eligible for Discount, applying 0% discount");
				break;
				
		}
		
		//Checking if Discount amount cross max Discount amount or not -
		if(discount > maxDiscount) {
			
			discount = 2500; // Will reset the discount amount to 2500
			System.out.println("Max discount 2500 only!");
		}
		
		
		return discount;
		
		
		
		
	}
	
	
	//Driver for this -
	public static void main(String[] args) {
		
		DiscountAPI2 dapi = new DiscountAPI2();
		
		double purchaseAmount = 20000;
		System.out.println("Purchase Amount : "+ purchaseAmount);
		
		double discount = dapi.calculateDiscount("GOLD", purchaseAmount);
		System.out.println("Discount Applied Amount : " + discount);
		System.out.println("Need to Pay : "+(purchaseAmount - discount));
		
	}
}






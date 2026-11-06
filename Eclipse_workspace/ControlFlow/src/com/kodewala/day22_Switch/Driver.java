package com.kodewala.day22_Switch;

/*
 * 
 * Loops : for and while
 * Control Flow : if-else and multiple if-else  --> used to decide the control flow of program.
 * 
 * 
 * 
 * Switch : It is an alternative of if-else. 
 * 			When we have multiple conditons to check, we prefer to use switch over if-else.
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


//Example : Identify the day based on number supplied -

public class Driver {

	public static void main(String[] args) {
		// I will create object of 'Driver' class as indentify method is non static-
		Driver driver = new Driver();
		
		driver.indetifyDay(1);
		
//		To take command line Input for dyanmic pass - 
//		int day = Integer.parseInt(args[0]);
//		
//		driver.indetifyDay(day);
			

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

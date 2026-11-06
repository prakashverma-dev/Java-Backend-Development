package com.kodewala.day18.loops;

/*
 * # break keyword and continue keyword and return keyword explanation with example : -
 * 
 * a) break(exist the loop completely) : It is used in loop, as soon as 'break' keyword encountered, exist the complete loop and you will come out of the loop and give control to after loop program.
 * 
 * b) continue(skip the current iteration) : It is also use in loop, as soon as 'continue' keyword encountered, It is just skip the current iteration and move to next iteration and whatever biz logic after continue get ignored. 
 * 
 * c) return keyword(exist from current method completely) : It is used in any type of method, as soon as 'return' keyword encountered, exist the current method completely.
 * 
 * return keyword in main method : As main() method is the entry point of a Java application by JVM. Java starts execution from main(). When it encounters JVM return and the main() method terminates immediately with no return value. As -
 * 
 * Note : In main() method has a void return type, So main method return does not return any value to JVM.
 * 
 * 
 * return keyword in other methods : 'return' keyword works similar in all methods, here in other methods rather than main method, as soon as return keyword encounters, It terminates the current method immediately and control goes back to its caller.
 * 
 *  Note : The important difference between them is that, continue keyword in array loop through till last index but break keyword and return keyword can exist from at any point index in the array. 
 * 
 * 
 * 
 * 
 * 
 * Note : we use continue and break keyword and return keyword to improve the PERFORMANCE of our code. As, Whenever we writing code, Our focus should be on Performance of code/program rather focusing getting output.
 *
 * 
 * 
 * Question1(break and return keyword) : You have list of cities(1000 and it may be duplicate as well) and you need to find if Bangalore exists part of the list or not.
 * 
 * break : use when your work is done and dont wanna stay there and come out of the place.
 * 
 * Ex: Supose, waanna buy a newpaper from shop, we went to market and bought it from 2nd shop out of 10 shops, should we go to other shop as well No, If we go to all shops we just wasting our time. and PERFORMANCE will reduce.
 * 
 *
		
		

 * 
 * 
 * */


// Solution : break and return keyword example -
public class Example {

	public static void main(String[] args) {

		// Let's create an Array - 100 cities
		String[] cities = {

				"Mumbai", "Bengaluru", "Delhi", "Mumbai", "Chennai", "Kolkata", "Hyderabad", "Bengaluru", "Ahmedabad",
				"Pune", "Delhi", "Jaipur", "Lucknow", "Chennai", "Surat", "Kolkata", "Bengaluru", "Indore", "Hyderabad",
				"Pune" };

		// Find Bengaluru is part of this list or not -
		// cities size is fixed so we go with for-loop-
		// if cities size might have dyanmically gets changing we went with while loop .

		for (int i = 0; i < cities.length; i++) {

			String currentCity = cities[i];

			if (currentCity.equals("Bengaluru")) {

				System.out.println("Found the Bengaluru City!");
				
				break; // break the for-loop as soon as It reaches here on this statement, and control goes back to JVM with no return value as main method has void return type.
				
//				return;
			

			}
		}
		
		
		//For testing 'return' keyword -
		
		System.out.println("you seeing output after loop block..."); // if I will use 'break' you can see this but if I use 'return' keyword you can see this as main method terminats there with no return value to JVM.
		
		Test ts = new Test();
		
		System.out.println(ts.displayName());

	}

}



//Question2(continue keyword) : you have 100 positive and negative numbers in integer Array list, we need to multiply all positive number by 10 -

//Solution: continue keyword example -
class Example2 {

	public static void main(String[] args) {

		// Let's create an Array - 100 +ve and -ve numbers
		int[] numbers = { 45, -82, 19, -3, 0, 99, -125, 61, -74, 8, -15, 203, -67, 34, -91, 55, -2, 112, -48, 73, -36, 14,
				-8, 88, -250, 4, -19, 62, -5, 130 };
		
		
		// To multiply all +ve num by 10 -
		for(int i=0; i< numbers.length; i++) {
			
			int currentNum = numbers[i];
			
			if(currentNum <= 0) {
				
				continue; // 'skip' current iteration.
		
			}
			
			// Suppose 100 lines of Biz logic
			System.out.println("Positive Number : "+currentNum*10);
		}

	}

}

class Test{

	public String displayName() {
		
		return "Hello Prakash....!";
	}
}

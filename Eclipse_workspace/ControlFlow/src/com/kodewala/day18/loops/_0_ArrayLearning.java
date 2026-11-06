package com.kodewala.day18.loops;
/* 


Array : It is a Container --> hold or store similar type (int, Boolean, Employee, Account, String,
Delivery, Invoice, Notification, User etc ... ) of data.

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.


Array use continuous memory location to store array data.
Array is fixed in size. Means Once you create an array, it can not be changed later.



Why to use to Array -

Easy to use(access)
Organized with same type
Fixed in size : We cannot change size dynamically or run-time once we define array size.
Index based
[][][][][]
0 1  2 3 4

# To create an Array In Java : There are two ways -

a) Creating an Empty array with array size and assigning array element later : It is use to create empty array with fixed number of elements, which you can fill later -

Syntax : To declare an array, define the datatype with square brackets[ ] or define the variable with square bracket either one  and then followed by new keyword and then define Datatype with its size -

Datatype[] <arr_name> = new  Datatype[5];  //size is 5 

OR,

Datatype <arr_name>[] = new  Datatype[5];  --> Assign array value later.


Here, Once we create the array of suppose size 5 and we do not assign its element, then default value get assigns accoriding to its datatype.


b) Creating Array with directly assigning it values : When we already know the values we use this way to create the array and when we dont know the array element we use 'new' keyword to create array and assign its value later.


Syntax : Declare with datatype with [] and then assign array values using curly braces{}.

Datatype[] <arr_name> = {"Item1", "Item2"};

OR,

Datatype <arr_name>[] = {"Item1", "Item2"};


c) To know the array length : we use .length method -


<arr_name>.length --> return array length.



# Reading or Accessing Element In array : O(1) constant time complexity. coz we know the indexing and directly can access the element with its index.





*/



class ArrayLearning {
	
	
	
		public static void main(String a[]) {
			
			
			
			
			// i. Creating an array without storing data -
			String[] cars = {"Volvo", "BMW", "Ford"};
			System.out.println(cars);
					
			
			
			//ii. create an array which will hold 5 integer length data only -
			
			int productId[] = new int[5]; // if size is 5 index will be 0 to 4.
			
			// to add the elments in created array -
			
			productId[0] = 100;
			productId[1] = 77;
//			productId[2] = 84;
//			productId[3] = 13;
//			productId[4] = 9;
			
			System.out.println(productId[0]); // 0 default value
			System.out.println(productId[1]); // 0 default value
			System.out.println(productId[2]); // 0 default value
			System.out.println(productId[3]); // 0 default value
			System.out.println(productId[4]); // 0 default value
			
			
			
			// iii. Create an Array which will store 5 city name : type String
			
			String[] cities = new String[5];
			
			//storing the cities -
			cities[0] = "Bangalore";
			cities[1] = "Chennai";
			cities[2] = "Shimla";
			cities[3] = "Mumbai";
			cities[4] = "Surat";
			
			System.out.println(cities[0]); // default value 'null'
			System.out.println(cities[1]); 
			System.out.println(cities[2]);
			
			System.out.println(cities);
			
			// To find any city name starts with 's' from array, we iterate through array and check with .startsWith() method- -
			for(int i=0; i< cities.length; i++) {
				
				if(cities[i].startsWith("S")) {
					
					System.out.println("City Starts with S : "+cities[i]);
					
				}
				
			}
		
			
		}

}

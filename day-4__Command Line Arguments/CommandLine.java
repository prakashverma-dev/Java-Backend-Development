


/*


#1) Giving Input as Command Line Arguments :- Command-line arguments in Java allow you to pass dynamic input values to a program during its execution from the terminal. We use this to not hardcode the value in the program, NEVER DO HARDCODING.


We have seen, String args[]  --> It is use to receive command line arguments(string Inputs) at run time seperated with space after className. 

Syntax : <ClassName> arg1 arg2 ..

args[] recives all passed arguments from user in form of an array which is String type array items. 

To access array Items value -

agrs[0] --> first element from array.
agrs[1] --> first element from array.
agrs[2] --> first element from array.


Example1: Analzer Engine, takes user data as .txt or .doc to analyse and give results at run time.

vegacityMall.txt
NextMallData.txt

>java DataAnalyzer "today-vegacity-mal.txt"
>java DataAnalyzer "my-data.txt"
>java DataAnalyzer "nexus-all.txt"

In Java program, we can read excel file, text file(.txt), any formate data. and analysize data by Java engine and send offers to customer for eligible for cards.
  
 

Example2 : I want to display employee Details at run time  -

Here we doin Hardcoding of Employee Names, NeVER DO HARD-CODING In programming -

*/ 




class EmployeeDetails{

public static void main(String args[]){
	
	String emp1 = args[0];
	String emp2 = args[1];
	String emp3 = args[2];

// HardCOding variables -
//	System.out.println("Rajat");
//	System.out.println("Ajat");
//	System.out.println("Gaurav");
	
	// Variable received from command line arguments -
	
	System.out.println(emp1);
	System.out.println(emp1.getClass().getSimpleName());
	System.out.println(emp2);
	System.out.println(emp3);
	
}

}




/*
2) In Java we can supply Arguments for two purpose -

a) For Program Arguments : While working with coding, Ex: add two user numbers at run time.
b) For JVM Arguments : To change the Heap Size Memory to occupie, change Stack Size, Change Garbage Colletion, these can be changed using JVM argumetns.


3) To know datatype In java : Since Java is a statically typed language, the data type of every variable must be declared at compile time, making it generally predictable. However, if you need to determine or check the data type of a variable at runtime, the method depends on whether the variable is an Object type(e.g., String, Integer, ArrayLis) or a Primitive()

To Know Datatype of Object type-

variable.getClass().getSimpleName()   --> for exact datatype name.
variable.getClass().getnName()   ---> It returns the fully qualified name of the class, which includes the entire package path where the class is located.


String text = "Hello";
System.out.println(text.getClass().getName()); // Outputs: java.lang.String

ArrayList<Integer> list = new ArrayList<>();
System.out.println(list.getClass().getName()); // Outputs: java.util.ArrayList



*/


/*

# Example3 : Write program to print order id, product name, placed by, delivery address.

Sample Input : If input contains more than one words, make it string to pass it as one argument -

ORD11223
Iphone16
"Prakash Verma"
"32 Dharamatala Road"


*/

class ProductDetails{
	
	public static void main(String[] arr){
		
		System.out.println("Ram"+arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		// Array Index Out Of Bounds Exception - we exception when we dont pass arguments at run-time as per array length we expecting in program.
	}
	
}

// Note :  When you dont supply same no of arguments as we accepting in method, then we get Exception as "ArrayIndexOutOfBoundsException". that means we are try to read index value which has not been supplied. 






// # Example4 : Write a program to Add two user numbers at run-time -

//to convert string to integer in java : Two primary ways to convert a String to an integer in Java are Integer.parseInt(<str>) and Integer.valueOf(<str>). Integer is existing class, coming from JRE, developed by Oracle, Initially by Sun MicroSystems. .

// Note : "12" + "14" = "1214"

//

class AddTwoNum{
	
	
	void main(String[] value){
		
		int a = Integer.parseInt(value[0]);
		int b = Integer.parseInt(value[1]);
		
		System.out.print("The sum is :"+(a+b));
		
	}
	
	
} 











/*  

1) Java Indentifiers : Unique Name given to Class, method, variable, constants, interface, package, etc, are Indentifers.


class AddTwoNum{

	void main(String[] value){
		
		int a = Integer.parseInt(value[0]);
		int b = Integer.parseInt(value[1]);
		
		System.out.print("The sum is :"+(a+b));
		
	}
	
	
}

AddTwoNum  --> name for class
main  --> name for method
value  --> name for array
a,b --> name for variables


All these are above Indentifers Here.

Naming Convention for class : Pascal
Naming Convention for method, variable : camelCase




# Idenfiers Naming Some Rules :

i) [A-Z][0-9[a-z] can be use in indentifers
amount, amount1, myValue

ii) Indentifer can be start with _ and $(Doller)
_amount, $amount

iii) Except _ and $, No other special characters are allowed in indentifers.

amount#  --> Not allowed.

iv) Indentifer can not be start with number.
1amount  -->  Not allowed.


v) Reserved java keywords(55+ keywords) canot be use as Indenfiers.

int, String, public  --> Not allowed.





2) Datatypes In Java:

Java is strongly typed programming language, MEANS whatever variable you declaring in java, must have type, unlink python isnot stringly typed, it automatically decidede by python, we do not declare type of variable.

Strong name = "Prakash";

Data : Data is information. Ex: Order id, pin code, credit card, amount etc. In this world, everthing is data.

# To Declare the data, we need to define the type. There are two types of data -

a) Primitive : btye, short, int, long,   float, double, boolean ,char --> data type we choose based requirement.


Integer Data type Stroing : Depending on the size of value, we store, Integer can be positive and negative number -
byte --> -128 to 127 (number in the range)




Note : byte<short<int<long< so on size accordingly.


Syntax : <Type> <variable_name> = <value>;
Ex: int amount = 20;
	
// Note : Default value for all Integer Datatypes for non-local variable is 0. If we dont sepecify any value compiler assign 0 value to the variable.
// Local variable(local to current method only) canot have hold default value.Local variable must be initialed before using, else compiler will throw error.

// For long and float, default value will be 0.0f and 0.0d.
	
	
	
For double datatype : -

• double price = 6.5; — Any decimal number written without a suffix(d or D) is automatically treated as a double literal by default.

• double price = 6.5d; — The d (or D) suffix explicitly tells the compiler that the literal is a double. 

Note : To distinguish from floats: If you write 6.5f, it is a float. If you write 6.5, it is a double

	
b) Non-primitive : Object type datatypes are non-primitive datatypes.Ex: String Object, Aarray Object, Person, Employee, System, Account, Payment etc.

class Payment{
	
}


# Boolean : To repsent yes or no for answering, In java we have true or false boolean value.

boolean status = true;
boolean isValue = false;

Note : default value for boolean datatype is false.






*/


class Datatypes{
	
	short amount2;	//Default value = 0 
	boolean isPresent;
	
	void main(String[] arr){
	
	// a) Integer datatype : Negative and Positive number -
	
	
	// btye Datatype - 
	
	byte amount = 22; // byte Range : -128 to 127 Number lies.	
	// 1 btye = 8 bit
	// 8 bit = 2^(8-1) = 2^7 = 128;
	// btye datatype use when we have small numbers and By saving in Btye datatypes we will save memory space alot.
	
	
	// short datatype  : 16 bits
	
	short amount1 = 2302; // short Range : -2^15 to (2^15)-1  = -32K to 32K Number range.

	System.out.println("Default value of short is : "+amount2);
	
	
	// int datatype : to store data above 32k (32 bits) -
	// long datatype : 64 bits
	
	
	
	//2) Decimal value -
	
	// float value = 123.30f; --> 32 bits
	// double value = 4323433.34d 
	
	
	System.out.println("Default value of boolean is : "+isPresent);
	
	
	
	
	
}

}

/* 

Non-Primitive Type : Whtever we class creating and that class creating object, that object type is non-primite type.

Ex: AddNumber, AccountInfo, String, System  --> all are non-primitive datatypes.

The default value of non-primitive datatype is 'null';

AcountInfo emp1; // emp1 default value is 'null' (the object we created get default value of object is 'null')
AcountInfo emp2;



*/
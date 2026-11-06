


/*method and variables naming convension : It should follow camelCase naming convention. 

amount
maxNumber


method - 
doPayment(){}
createAmount(){}

Note : Do not define main signature method with 'Main', java compiler will pass it as it doesnot check naming convention, but JVM starts looing of Java signature 'main' method i.e public static void main(String[] args) for execution. Hence Main(not allowed method name, It looks like class name.)

Note : Java Compiler(javac) never checks the naming convention, it only checks the synatx and java code standards as per rules.




*/


/*   A Real World Example : 

SBI Account -> class in SBI net banking will represent customer/account information.

Displaying Account Information Details. / AccountInfo


*/

// Will Print Account Information -


class AccountInfo
{
	public static void main(String  a[]){
		
		System.out.println("Account Holder : Prakash Kumar Verma");
		System.out.println("Type  : Current");
		System.out.println("Address : BTM Layout");
		System.out.println("Bank Name : SBI");
	}
	
	void main(String  a[]){
		System.out.println("It will not execute by JVM, even the method name is 'main' but doensot have command line argumens");
	}
	
	
}





/*  


public static void main(String  a[]) {}   --> compiled but Runtime succeffully coz it follow java 'main' method signature.
public static void Main(String  a[]) {}   --> compiled but Runtime failed coz JVM canot recognise 'Main' method.
private static void main(String  a[]) {}   --> compiled but Runtime failed coz JVM canot recognise reach 'main' method coz of Private access modifier.
void main(String  a[]) {}    ---> compiled but Runtime succeffully coz java20 above version it supports void main(){} solely and madatory. JVM consider 'public static' internally.



# How JVM calls the main method internally :-

JVM written code in way to call directly main method with its respective classname.main() directly, here AccountInfo.main(); the reason it defined with static method.

Here, -

public : It is access modifier In Java, We have total four access modifiers -
public 
private
protected
default  

// If we want to call any method from that class to another place, then that method must be pubic. Best Example JVM as it calls the main() signature method from class, so if we kept main method witgh private then jvm canot be able to access signature main method.



# static and non static keywords in java :

static belongs to class. If something is static I can call that directlty with class name i dont need to create object of that to call it.
Ex: AccountInfo.main() to call directly if something is static.

static method : if a method is static, we can call it directly using classname.methodName() directly without creating any object of that class.


non static belongs to object.


# void : It is return type. void means nothing i.e when you do not want to send anything from method as return value, we use void.
Note : return will be sent to caller.


Note : In above code, JVM calling the main method by default as AccountInfo.main(), so JVM doesnot need any return ttype. Suppose, if we sent string value or integer value i.e 2+5 to JVM as return type what JVM will do nothing right.


# String  args[]   : It is single parameter passed to main method for accepting the command line arguments by user. Here, parameter is array and type of array will be String. Here args could any name as It is indefier.
String input[]  : It is for passing command line arguments. Array declaration with type of String datatype.


Note : There are two type of errro in java -
a) Compile Time Eror : javac gives
b) RunTime Error : JVM gives 

*/




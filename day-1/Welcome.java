
/* 


# How Java Code Works Internally  : -

We have 'source code(.java)' ----javac <filename.java> --->  compiler(checks source code as per java stabndard and rules written or not)  -------if compiled sucucfully ---> converted to .class file(Byte code) ---java <className>---> JVM(Actual thing, Java Virtaul Machine which takes bytecode and run it and gives the output)  ---> Output of program.


Java Compiler(javac) : tAKES .JAVA file and compile the code and gives the byte code i.e .class files.

Java compiler knows  all java standards and rules and syntax and It checks written jaava code or instrcution written as per java standards and rules and regulations.


JVM  : takes the byte code(which is platform independent)i.e .class as input and give the output.

JVM is a proccess which occupie some memory from ram of your system and take byetecode i.e machine code from user and gives the output to user.

JVM look for main method from the specified class to start executing the java code. 

By default Java Virtual Machine(JVM) will look for main method as entry point under the class from 1000 other methods. As JVM only executes only the main method from the class.





*/


//1) Defining the Class Without 'public' keyword -

// define class with 'class' keyword and then followed by class name with class naming convention and start body and end body -


class Greeting{ // House Boundary i.e Class Boundary

	public static void main(String args[]){ // Java Entry Point/ Main entry Gate to House or Main Entry Point. 	
	
	
		System.out.println("Hello World!");
		System.out.println("Compile Again To see Me!");
	}

}




/* 

// class can be compile without any 'main' method.
// Note : When we run respective class file, JVM starts looing for 'signature main' method as per jaava standards and starts executing the code from there. If it doesnot find main method in that class file it will throw error.

// that main method can call other methods inside for looping it.

// JVM run only one class run at time, we can run other class as well.


Inside java file may have hundreds of classes. we compile the java file with javac compiler and JVM execute the .class files with respective class name with java <classname>.

After compilation, we get respective .class files in our diretory e.g if we have 100 class in java files we will get 100 .class files in directory after succefull compilation.

In Industy we call compilation as build, means if our compilation is failing we call it as our build is failing.


Compilation starts from top to bottom all the clases present in the .java file.

To print Output in Java : we use -

System.out.print("Hello World!");  //here System is class as 'S' is capital.
System.out.println("Hello World!");  // for getting output in new line.



// Wheneevr changing any source code in .java, You must re-compile it with javac which will generate updated bytecode. so when jvm runs it will take updated bytecode.

Note : In Java When you chaning any source code, even a single dot, you must re-compile the source code to see updated result and see the .class timing in directory as we jvm will run bytecode and if user doesnot re-compile  then he could see the previos compiled bytecode result. Checking .class file generated timing in directory helps debugging the source code for updated output.

 

Note : There canot be two public class in same java file, if there is public class it could only one public class and MUST that public class name match wil java file name, REMEMBER this, as java standards and javac.


Note : There canot be same same signagture method in one class, it could be a different method but not two or more same signature main method.

Note : While ruuning the class, only main method signature is getting run by JVM, the reason it is knonw as entry point for java code execution.

If there is not main method means you constructed your house with boundary but there is not main gate to enter.


From Java20 above, main signature method can skip 'public static'.




*/


// Another Class with no method -
class Session{
	

	public static void main2(String args[]){
		
		System.out.println("Session 2 Started!");
		
	}
	
	
	void main(String args[]){ // Java Entry Point/ Main entry Gate to House or Main Entry Point. 	
	
	
		System.out.println("Session Started!");
	}
	
	// We canot define two main methods in same class.
	
}


//Defining the Class With 'public' keyword -
  
  // Here it is compulary to save file name with ClassName.java -

public class Greeting2 {
	
	public static void main(String args[]){
		
		System.out.println("Session 2 Started!");
		
	}
	
	// Will throw error as this class is public and It is mandatte to save file name matches with className.java.
		
}











/* 

1) JRE : Java Runtime environment. It inclues all the inbuilt class of java or existing classes we dont need to develope, just we it, libraries. JRE is on top of JVM.

JRE includes 'String' as inbuilt class, System class and many more.


Note :  rt.jar  --> Developed by Sun MirchoSystem, which includes all inbuilt java librabies and other files.

.jar file --> .jar stands for "Java Archive"; Achieve use to bundled or Zip, multiple files into single file.

To un-jar file i.e unzip : Open cmd in that directory -

>jar -xvf <filename.jar>

Now, we can able to see all packages -

java.lang  --> means inside java folder and then lang folder, then we have System, String, etc all these classes. 

java.math
java.util  --> 
java.io
java.Integer   --> parseInt() is static method.

Note : All general purpose classes are belong to java.lang package. SO whenever we working with any java.lang packages java internally import all those general purpose classes.

import java.lang.*;   --> * means all classes present under lang package import to current file.

Note : java.util package is not default import by java, so we need to import explicitly -

import java.util.Scanner;  --> import only 'Scanner' class from java.util package.



When we run program and if used System, String etc., JVM loads all these clases at run-time environment from there and execute the output.





2) Suppose, In a company if we lost the source code but we have the bytecode(.class) of Running Application, then we can use De-compiler to convert .class file into .java file. 

Data-clearner.jar App --> Running Since 10years

Source Code --> Compiler  --> Jar Created ---> Tested --> Running in Production.

De-compiler : Convert bytecode(.class) into source code(.java) ; 99% correct result. Decompiler do reverse of Compiler.




3) JDK -> It needed for only Develop the java code and compile it.
   JRE  -> It needed for only byetcode executions into output. It Provide environment for Program execution after code compilation into .class files.
   JVM -> Execute the program.
   
 Local/User Machine(Requires JDK & JRE)  --> Developed Code --> Compiled  --> Jar Created ---> Tested --> Running in Production(Requires only JRE).
 
 Note : For Production program environment running application, using only JRE i.e Java Run Time Envronment, they do not need JDK(Java development Kit as it is needed for Souce code development).

   





*/
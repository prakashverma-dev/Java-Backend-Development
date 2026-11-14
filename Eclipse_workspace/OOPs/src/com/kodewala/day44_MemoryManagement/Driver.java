package com.kodewala.day44_MemoryManagement;

import java.util.ArrayList;
import java.util.List;

/*

Q: what is the Biggest Challenge you have faced in your application ?

Answer : I am a SOftware engineer and users using our application.

One of the Biggest problem we face -

Memory Leaks in Java(OutOfMememoryError) : MetaSpace + Heap  Stack + PC

The unsused Objects(which is not poitning to any reference) are still live/available in HEAP, leads to memory leaks in java.

The un-used Objects when un-nessearily available in HEAP memory area, leads to Memory leaks in java.

Solution : Programmer has to write logic i.e nullifying the objects which we may not use it later in the program or application, so new created objects can occupie the space smoothly.

OutOfMemoryError Arrises : Solution --> Increase the HEAP SIZE. (WorkAround)
										Then Re-start the application.

When the created objects in Java Application doesnt referes to any variable i.e not in use or call it as un-used objects in our application occipies our HEAP size which may tends to memory leaks when we create more objects and that memoru size gets exceeds from preccribed heap size, It breaks and throw erorr as 'OutOfMememoryError. This phenamon called as memory leaks in Java. 

Java Application --> JVM ---> JVM Needs Memory ---> Memory(MetaSpace + Heap  Stack + PC + etc..)

pc --> Program Counter
HP --> 512 MB Size
ms --> mininum heap size
mx --> maximum heap size


We can Increase HEAP size in JVM(take memory space from our System Ram) :-

We have two types of Arguments in JAVA to provide -

Our Java Application/Program found inside the JVM. 

i. Program Arguments : TO provide inputs to the 'JAVA Program/APP' inside the JVM.

ii. VM Arguments(Virtual Machine Args) : To provide any inputs to the JVM Machine to run application, we use 'VM Arguments' in Eclipse. In pratical sencario we set in .jar file to set VM arguments.
											
# JAVA OPTS ( VM Args) : JAVA_OPTS stands for Java Options. It is a commonly used environment variable that holds custom configuration flags and settings to pass to the Java Virtual Machine (JVM) when launching a Java application.



Common Uses of JAVA OPS : -

• Memory Allocation. Developers use flags like -Xms (initial heap size) and -Xmx (maximum heap size) to control how much RAM an application can use.
• System Properties. Flags formatted as -Dproperty=value pass application-specific configuration settings directly into the Java code.
• Garbage Collection & Debugging. Advanced flags starting with -XX: tune performance, select garbage collectors, or generate heap dumps if the application runs out of memory

									
									
									setting HEAP SIZE  --> -Xms1024m -Xmx2048m 
									setting STACK SIZE -->
									setting GC
									setting META Space Size



Note : whenever the memory problem arise in JAVA application then we need to fined tuned the desired Memory paramters using VM arguments.

Memory Arguments for JVM machine for small application(metro tracking) requires less JVM memory space.
Memory Arguments for JVM machine for Large application(amazon) requires More JVM memory space.


# Garbage Collector(GC) : It comes with Java, It role is to clean or remove unwanted or unused objects from HEAP area to free-up the space in the HEAP.

Example -



		Address address;
		Employee emp1;
		Employee copiedEmp1;
		
		
	    address = new Address("16th main", "27th Cross", "Bangalore");
		emp1 = new Employee("Prakash", "2334df", address); 		
		copiedEmp1 = (Employee) emp1.clone();
		
		
		// We manually cut the referene by setting 'null' value to object as well to get eligible for gc process -
		address = null; // the object 'new Address("16th main", "27th Cross", "Bangalore")' is now not referred by any 'reference variable' so this object become orphaned now and remove by gc later.
		
		
	
Note : We can manually set the object with 'null' value which not gonna use later, so GC will check it and remove it. 	
 
 unused objects means : if object is later in program not referred actively, gc identifies it and remove that.
 
 
 
 
 
 # Thread Dump : It is MRI/CT Scan. It will take snapshot of all threads in the program.
 
 It will capture the all the state of the threads, escepcialy needed during Out of Memory Error.
 
 
 We can sepecify this in Java OPS/VM Args, that when Out of memory error arrise please capture 'Thread Dump' - the snapshot of state of all threds. and it get stores in some space to check the details why out of memory erorr occurred and which part and fixed it.
 
 
 
 # To intentionally trigger an out-of-memory error for testing :-
 
You need to restrict the maximum heap memory allocated to your application by passing a very small memory limit flag when running your program.
 
 In Java, you can force a java.lang.OutOfMemoryError: Java heap space by passing a very small -Xmx (maximum heap size) flag. Set it to a tiny value like 5m (5 megabytes) or 10m.
 
 
 To Verify in Code. Print the actual max memory inside your main method to confirm the JVM received your flag:-
 
 System.out.println("Max Memory (MB): " + (Runtime.getRuntime().maxMemory() / (1024 * 1024))); //If this prints 10 (or 9), your Eclipse settings are working properly.
 
 
Lower the Limit Even Further

A basic Java program without heavy frameworks easily runs in 10 MB of heap space because the Garbage Collector automatically cleans up unused objects.
• Drop to 2 MB. Change your VM arguments to -Xms1m -Xmx2m. At 2 MB, almost any program doing basic string or object manipulation will crash immediately.

 
 Note : After setting VM arguments to -Xms2m -Xmx4m --> Got The OutOfMemoryError.
 
 
 
 # To allow Heap Dump to take Snapshot and Save a heap dump file having extension .hprof :-
 
 Since you already have your OutOfMemoryError test working, you can capture a heap dump right at the moment your ArrayList crashes.

  Add the Heap Dump Flag : Open your Run Configurations and add -XX:+HeapDumpOnOutOfMemoryError next to your memory limits: -

		-Xms2m -Xmx4m -XX:+HeapDumpOnOutOfMemoryError
 
 Run your program. When it throws the OutOfMemoryError, the console will print a message saying Dumping heap to java_pidXXXX.hprof.
 
 Note : Refresh your project. Right-click your project folder in Eclipse's Package Explorer and click Refresh (or press F5). You will see the new .hprof file sitting in your project root folder.
 
 Note :-
 
 • -XX:+HeapDumpOnOutOfMemoryError tells the JVM to automatically take a snapshot of memory the exact moment an OutOfMemoryError occurs.
• -XX:HeapDumpPath=<path> specifies the exact folder or filename for the .hprof file. Without this flag, Java saves the dump in the current working directory.



To see the .hprof file we need to either Install 'Eclipse Memory Analyzer (MAT) inside Eclipse' from MarketPlace or, Independent  VisualVM (No Eclipse Plugin Needed), To see the exact problem/memory leaks happened in our program.


 
 
 
 
 

Note : main method : main method is the another method which is called by JVM automatically internally as first method to start the execution of Java Program as First Place.



*/




public class Driver {
	
	Address address;
	Employee emp1;
	
	
	public void testingOutOfMemoryError() {
		
		address = new Address("16th main", "27th Cross", "Bangalore");
		
		emp1 = new Employee("Prakash", "2334df", address); 		
	
		
		// changing sub-object 'city' field -
		emp1.address.city = "Hyderabad";
//		
		System.out.println(emp1.address.city);

		// Nullifying the objects- 
//		emp1 = null; 
//		address=null;
		

		// 500 more lines ...

		
//		To confirm the JVM received your set HEAP Size flag: -	
		System.out.println("Max Heap Memory Recieved By JVM for this Program : " +   Runtime.getRuntime().maxMemory() / (1024 * 1024) + " MB");

	
		List<byte[]> memoryHog = new ArrayList<>();
		
//		Creating Object In Order to fill the HEAP AREa -
//        while (true) {
//            // Allocates 1 MB per loop and keeps it in the list so GC cannot delete it
//            memoryHog.add(new byte[1024 * 1024]);
//        }
			

		
	}

	
	
	// main method to execute -
	public static void main(String[] args) {
		
		
		Driver drive = new Driver();
		
		drive.testingOutOfMemoryError();
	}

}

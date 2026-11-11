package com.kodewala.day25_String_Intern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		i. Java is case senstive lang -
		
		String s1 = "Kodewala";// SCP
		String s2 = "Academy"; // SCP 
		String s3 = new String("academy"); // SCP + HEAP  
		
		//Here TOTAL 4 Object is created.
		
		System.out.println(s3.equals(s2)); // false coz A and a are not same as Java is case senstive lang.
		
//		ii. .concat() method will create new Object in HEAP and end result in HEAP memory -
		
		String s4 = new String("Hello"); // 2 Objects --> SCP("Hello") + HEAP(s4)
		
		s4.concat(" World"); //2 Objects --> SCP : "World" is in SCP and HEAP : "Hello World" In HEAP with no pointing. 
							// .concat() method will create end result in HEAP memory.
		
		//Here total 4 Object get created.
		
		String s5 = s4.concat(" World"); // Now s5 pointing two Object created by .concat i.e "Hello World"
		
		System.out.println(s5); // Hello World
		
		
		// iii. When to use 'String Literal' and  'new' String to create String Object OR, Object Content vs Object Identity : -
		
		// Object Content : When We are interested in Object content, we are not interested in how many  object are created we use "String Literal" -
		
		String city = "Bangalore";	 	
		String city1 = "Bangalore";		
		String city2 = "Bangalore";		

		// Overall Here Only one Object is created and other variables refering to same Object created in SCP.
		
		// String Literal takes less memory. coz it is optmized by SCP.
		
		// Object Identity : When we are interested Object Identity for each Object, Not interested in Content i.e whether content is same or not, We use String 'new' keyword i.e each time creates a new Object irrespective of whatever content we are putting -
		
		
		String user1 = new String("Guest"); 
		String user2 = new String("Guest");
		String user3 = new String("Guest");
		String user4 = new String("Guest");
		String user5 = new String("Guest");
		String user6 = new String("Guest");// We have 6 Guest users on the Netflix now.
		
		// Here, irrespective of "Content" each time new String Object gets created ie total 6 Object created.
		
		// String 'new' keyword takes more memory. coz it creates each time new Object in Heap despite the content same or not.
		
		
		
//		## Compile time Optimization vs Run Time Optimization : anything static in String goes to compile time optimization, gives one object and any string is dynamic goes to Run Time without Optimization by compiler.
		
		
		//iv. Compile time Optimization when we using + operator in multiple string literals : When using + operator for concatination the string : Compiler will compile and combibe it in ONE String and crates one Object in SCP -  
		
		String msg = "This "+"is from "+"Kodewala "+"Academy "+"Bangalore."; //Stored in SCP
		
		// After compilation it looks like this - 
		
	//  String msg = "This is from Kodewala Academy Bangalore."; // Compiler compile and sends One String to JVM to store.
		
		System.out.println(msg);
		
		
		
		
		// v. When using + in already created Objects IN SCP(new StringBuilder() ) : If we use + for String Concatination then compile time Optimization done by Java and gives only one string but if use + for combining the reference variables it will Create a 'new' Object in HEAP AREA. Not In SCP, REMEMBER -
		
		String p1 = "Kodewala"; // 1 Object(SCP)
		String p2 = "Academy"; // 1 Object(SCP)
		
		String p3 = p1 + p2; // 1 Object(Heap) as "Kodewala Academy" as + operator uses internally new StringBuilder() method to create new Object in HEAP.
		
//		Here, Total 3 String Object created (2 in SCP + 1 in HEAP).
		
		
//		Note : String p3 = p1 + p2; --> This single line is where the magic happens. In modern versions of Java, when you use the + operator to concatenate dynamic String variables, Java translates this under the hood using a StringBuilder.
		System.out.println(p3);
		
		//Let's Check p3 created not in SCP rather in HEAP -
		String check = "KodewalaAcademy"; // If exists it will not create in SCP.
		System.out.println(p3 == check); // false -> Hence, p3 not created inside the SCP which is in HEAP memory.
		
		
		
		//vi.
		
//		.intern() : If we apply .intern() method on any Object from the MAIn HEAP Memory, then if that 'Object' exist in SCP then this method start referring to that object from SCP and if Object doesnot exist in SCP then it will a copy to SCP and start referring to -
		
//		Here, p3 is in the HEAP area, so -
		
		String p4 = p3.intern(); // if p3 content is there in SCP, it will starts pointing to that Object and if there is no content then it will create a copy there in SCP and start poiting.// It will look like : String p4 = "KodewalaAcademy"
		
		System.out.println(check == p4); // true --> Here, 'check' is already there is SCP but now 's3' will also starts pointing to 'check' coz of intern().
		
		
//		Note : basically .intern() method copy/moving object from 'Main HEAP Area' To 'SCP' if object doesnot exist and if object exist in SCP it starts reffering to it. 
		
		
//		<obj>.intern() --> if 'obj' Object content already available in SCP starts pinting to it and if not available just create a copy to scp and then starts Pointing.
		
		
//		Why .intern() usefull : If we create object using .concat() or + opertor etc. It create object in HEAP area, so If we want to take advantage of 'SCP' feature of data storing then we do .intern() to copy data from HEAP to SCP if exist in SCP or not anyhow, we do it.
		
		
		//vii. Task on intern() -
		
//		 a.
	     String k2 = new String("mama"); // "mama" in SCP + "mama" in HEAP(k2 pointing)
	     k2.intern(); 
	     String k1 = "mama";
	     System.out.println(k1 == k2); // false
	     
//	     b.
	  

		 String d3 = new String("Ja") + new String("va"); // SCP "Ja" + "va", Heap "Java"
		 d3.intern();   // Since "Java" is not there in SCP, intern will copy "Java" from Heap to SCP and s3 points to SCP
		 String d4 = "Java";
		  
	  System.out.println(d3 == d4); // true
		
	}

}

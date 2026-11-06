 





 
public class Greeting{ // House Boundary

	public static void main(String args[]){ // Main entry Gate to House or Main Entry Point. 	
	
	
		System.out.println("Hello World!");
		System.out.println("Compile Again To see Me!");
	}

}





class Session{
	
}




// As per Java Comiplation Standard, only one public class can be there in one .java file. If user wants another public class then he can create another .java file with that class name.
// Also, that public class must be same as .Java file name, else keep all class name without public. 
class Session2{
	public static void main(String[] args){
		
		System.out.println("Hello, Session2 Started!");
		
	}
}

// Dont forget to recompile, if sometimes we dont get the expected output coz we dint recompile it, so user must check the timestamp when previouysy .class file has been updated in directory.
// Once we recompile the previous .class get replace with new .class file in same place.


// There could be only one public class in .java file and which must be file name, this will give errro as file name is not Session3.java.
//public class Session3{
	
//}


// oNly 1 public class allowed which class name must matches .java file name.
// jvm --runs-> java Session  --> jvm start looing main method inside 'Session' class as entry point to execute. Suppose in session class there is Multiple methods but jvm only starts executing from main method as entry point.
// A house can have two entry point means in single .java file there could be two main method for respective class. But There canot be two main method in same class. 
//It will throw an error as we have adde two main method in same class. which is not acceptable by java compiler standards.
class Session3{
	public static void main(String[] args){
		
		System.out.println("Hello, Session3 Started!");
		
	}
	
		public static void main(String[] args){
		
		System.out.println("Hello, Session3 Started!");
		
	}
}


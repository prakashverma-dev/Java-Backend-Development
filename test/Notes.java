

//#1. To get Datatype of 'Object' class -

class Check {

    public static void main(String[] value) {
        
        // String num = "Ram";

        // Check chk1 = new Check();

        // System.out.println(num.getClass().getName());
        // System.out.println(chk1.getClass().getName());


        
		int a = Integer.parseInt(value[0]);
		int b = Integer.parseInt(value[1]);

        // System.out.println(a.getClass().getName());
		
		// System.out.print("The sum is :"+(a+b));
		// System.out.print(STR."Hello \{a+b}, next year you will be \{b}"); // Not supported in java23
    }
    
}







/*

#2. String Templates or To Mix String and value at a time :-

There are two ways -

i) Native Java 21+ String Templates : With Java 21 and above, you can wrap strings and variables together natively using the 'STR' processor.

Instead of backticks, Java uses regular double quotes preceded by STR. and uses \{variable} instead of ${variable} -

Example : - 

String name = "Alice";
int age = 30;

String message = STR."Hello \{name}, next year you will be \{age + 1}";

        //In JavaScript: `Hello ${name}, next year you will be ${age + 1}`;

System.out.println(message); //Hello Alice, next year you will be 31


Common format specifiers:
Specifier	Purpose
%s	String
%d	Integer
%f	Decimal number
%.2f	Decimal number with 2 digits after the decimal
%n	New line


ii.) For Java Project 17 Version or Older : Using Format String - 


String name = "Alice";
int age = 25;

// Prints everything in a single line -

System.out.printf("My name is %s and I am %d years old.", name, age) 
OR,
System.out.println(String.forma("My name is %s and I am %d years old.", name, age)); 

This uses format specifiers like %s (for strings) and %d (for integers) as placeholders, followed by the variables in order.



#3. To Put Comments for each class while developing to show to other developer : - 

Eclipse will only display comments in the hover tooltip if they are written in the official Javadoc format. i.e

/** */  


// Not, // or /* */ 

// Note : The Javadoc block must be placed directly above the class declaration. If you put the comment inside the class or separated it from the public class ... line with empty lines or other code statements, Eclipse will not associate the comment with that class.

// Regular comments are ignored by the hover documentation engine.





/*




 #4. Create a Custom Template for Quickly Logged Parameters

If you want a shortcut that sets up a clean template for printing a key-value style parameter, you can build a custom template:
1. Go to Window > Preferences > Java > Editor > Templates.
2. Click New... and configure it:
	• Name: sysp (or any short trigger word)
	• Pattern:java
System.out.println("${enclosing_method} -> ${var}: " + ${var});
3. Click OK and Apply.
When you type sysp and hit Ctrl + Space, Eclipse will automatically drop the template, auto-detect a nearby variable/parameter, and let you use the Tab key to cycle through other available parameters.












*/

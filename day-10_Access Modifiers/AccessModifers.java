/*

Access Modifiers : -

Access : Who can use that or Who can see this -


Examples -

    private Parking --> only owner can park
    Restricted Area --> only some people allowed.VIP
    Public Park --> Anyone can use


When we write code, developer can decide who can use it or not.

Who --> Other classes...

private --> Private class canot be visible to other class.

 Ex: Purpose of Access Modifiers to restrict seeing wwhat we dont want to see by others or other classes. 
 Ex: a whatsgroup is only visible to its only members and they can chat there. No other memebers can see or chat.
 Ex: Two private chat between two person only visible to them only.


 Comments are public. 
 dm is private.

 concept of visibilty, level of visibility.


 # In Java We have 4 categoory of acccess modifiers : It is use to restrict level of visibility by other classes.


a) public : Any class can use, methods or variables that is defined with public to the class.
            This method or variable is visible to outside of this class and any other class can use it.



b)private : This method or This variable can be used, only in this class , NO other class can able to access it.
           The scope of Private remains only to the class itself. Either It is variable or method of that class.



c)           : if we don't writing any access modifier, that is default access modifier. and It is default     visibinility. Default means Each other classes can be accessible in same under package, Not outside of this package.

There is no default keyword for access modifier, If we are not writting that means that is default.

if something is default means Within current package, It is visible to call; other than that It is not visible to other packges respective classes. 

Ex: com.kodewala.users.User  -->  Here USER IS class, Accessible it its own class as well as another made in same directory will be accessible but not in other package folder for default access modifier.
    com.kodewala.users.User2  --> here above 'User' can be accessible coz it is under same package.

    com.kodewala.account.Account  --> Here above 'User' canot be accessible coz that 'User' class in other package even I try to import still for default access modifier. 


d) protected : Within the same under package + child class outside the packges can access.

  There is slightly difference between protected and default.

  protected void showAccountInfo(){

             System.out.println("This is Package for Account Class to show Account Info!");
   }

   Any class of this 'package can access this method' as well as any child of this class outside of this package can also access it.




Note : private < default < protected < public

private   --> within the class accessible
default   --> within the package accessible
protected  --> within the package + child class outside of package accessible
public  --> Everywhere accessible

Note : When don't give any access modifier that is default and whatever we will code write only access to that directory folder only means that package.

Note : Without package creation, we dont write single class to develop any code, e.g : Eclipse doesnot allow this.



*/

class OrderManagement{

    // i.Public Declaration -
    public int orderValue = 800; //any other class can see it.

    public void placeOrder(String itemName){

        System.out.println("Placing an Order for :"+itemName);
        
    }


    //ii. Private Declaration -
    private int orderValue1 = 600; // only access to this class only. 

    private void placeOrder1(String itemName){ // This method 'placeOrder()' can be access within this class i.e 'OrderManagement' Class only.

    System.out.println("Placing an Order for :"+itemName);
    
    }


    


    // private void placeOrder(String itemName){

    //     System.out.println("Placing an Order for :"+itemName);
        
    // }
}

//Here will be not Run this class coz there is no main method, we will Execute Driver one.

// Note : We have two .java, we can compile all java file in single command with >javac *.java 


/*

# Package in Java : -

As we know 10k inbuilt/existing classes in java by JRE.

and Suppose we create 5k classes for my project.

and If two or more than one class have same name, which is not unique and canot be possible. so we create the two seperate folder and paste same class in them, to avoid naming conflicts of same class name. These folders are called as 'package' in java.

In application, we canot write user.java for more than one time in application.

Package : To organize the code, and avoid the naming conflicts. Package are nothing but folder.

>retail.user.java  --> Here Retail is folder i.e package having user.java file.
>reseller.user.java  --> Here Reseller is folder i.e package having user.java file.


Creating Package Rule In Java : - Mostly package name is reverse of your domain -

tcs.com  ----reverse---> com.tcs.<project_name>.<module_name>.<file_name>

                         com.tcs.icici.usermanagement.retail.registration --> IN registration folder we have User.java
                         com.tcs.icici.usermanagement.b2b.registration --> IN registration folder we have User.java

                        

# In Java There are two types of Packages : -

a) Built-in Packages (packages provided by JRE by Sun MicroSystems) :- This is built-in packages by JRE, we just need to use it by importing in our java file -

Syntax -

import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package

Example : - import java.util.Scanner;
            import java.util.*;



b) User-defined Packages (create your own packages) : To create our own user-defined packages, you need to understand that Java uses a file system directory to store them. Just like folders on your computer -

To create a package, use the package keyword and followed by folder names till our .java logic is there -



To save the packeags Compile as -
>javac <directory_of_package>.java

//To See created packages output -
>java <package_name.className>


*/



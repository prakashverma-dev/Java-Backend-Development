
//Actually we are creating package, by using 'package' keyword, then follwed by subpackages or folder till our .java file is located and then terminate(;) -

package com.kodewala.users;
import com.kodewala.account.Account;


class User {

    public static void main(String[] args) {
        System.out.println("Im New Package Created by User!");


        // to call other package class here, we need to import that package from that package to here with 'import' keyword then followed by package path -

        Account acc = new Account();

        acc.showAccountInfo();

    }

}




 //To Save This .class file as Package, we need to compile to check -
 
 // >javac com\kodewala\ users\User.java

// To run the created package, with seeing package output -
// >java com.kodewala.users.User




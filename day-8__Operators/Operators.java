/*

## Operators In Java : -

i) Assignment Operator(=) : used to assign/set the value.

int amount = 20;

single equal(=) is use to assign the value in java.
double equal(==) to compare value i.e mathematical equal.



ii) Relation Operator : Compare the values -

Ex: Ajay's is older than vijay -

> --> greater than
< ---> less than
!=  --> not qual
>=  --> greater than equal
<=   ---> less than equal.
==   --> equals.


iii) Logic Operators : -  If we have multiple relational condition applied, it will be check the overall result-

   AND(&&) --> If both the conditions are true then result will be true. If any one of it false, result false.

   condition1(true) && condition2(true) ==> true

   true && false --> false
   false && false  --> false
   false && false  --> false

   Note : Short-circuit : If first conditon is false --> then result will be false, known as Short-Circuit in programming world.


   OR(||)  --> If anyone of the condition is true, then it will be true result.

   If I send to bring both Coffee and Tree, and bring both then you will be true; if any unavailable then false.
   If I send to bring coffer or tree, then either one you get it, true.


   true && false --> true
   false && true  --> true
   true && true  --> true
   false && false  --> false( as there is no either true)


   Note : In OR operator if first operator is true then result will be true and second condition will not get checked. if first condition is false then only second condition get checked.



   iv) Ternary Operator(? :) : This is replacement of if-else.

   ?
   :

   condition ? conditonTrue(print) : conditonFalse(print)



   v) Unary Operator : Uniary Opertor works on one value.
   
   i++
   i--
   --i
   ++i


   vi) 


# use case  of Operators : 

get free delivery if order value is more than 500 amount.
same day delivery if you are amazon prime user.
3% transaction changes if transaction amount is more than 2000.

*/


class Operators{


     public static void main(String[] args) {
        int minAge = 10; //Assignment operator
        int maxAge = 24;
        
        System.out.println(minAge < 15); //true
        System.out.println(minAge > 15); //false

        //Ask user to enter the age and name via command line arguments
        String userName = args[0];
        int userAge = Integer.parseInt((args[1])); // Number format Exception if we provide string that can not be convertable into interger we get Number Format Exception.

        System.out.println("User Details : "+userName );
        System.out.println(userAge);


        // Inputs :

        // java Operators --> Exception : Array Index out of the Bounds Exception
        // java Operators Prakash 24 --> Prakash 24
        // java Operators Prakash 24years  --> Exception : Number Format Exception (parseInt() expecting only string with number only.)

        // java Operators Prakash "22" --> Prakash 22

        // Logical Opertor -

        System.out.println("Allowed for Going out for play : "+ ((minAge < userAge) && (maxAge < userAge)) );

        System.out.println("Allowed for Going out for play : "+ ((minAge < userAge) || (maxAge < userAge)) );
         
        // Ternary Operator -

        System.out.println("Allowed for Vote :"+ ( (userAge >= 18) ? "Allowed" : "Not Allowed" ) );

     }

}

// Write a program to enter an amount by user, and that amount must be between or equal to 1 and 2000 then he could able to add the amount to account; else deny. result as true or false.

class AddMoney{

   public static void main(String[] args) {
      
      int userAmount = Integer.parseInt(args[0]);

      int minAmount = 1;
      int maxAmount = 2000;

      System.out.println("Added Money Status : "+ ((userAmount >= minAmount) && (userAmount <= maxAmount) ));

   }
}
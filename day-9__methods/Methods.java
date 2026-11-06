/*


Software Engineer  --> Software Development and maintenance(enhancement + bug fixing + monitoring and Health)

Ex: Car --> Sale -> Purchase Car -> Service Centre

Data + Business Logic( add two numbers, fund transfer, send email, register user etc.)


Business Logic always written inside the methods or block in java program.

Business logic --> Work or Task --> Logic Written inside Method.


// Syntax of method :-

Requirement -

Name for the method  : camelCase Naming convention
Inputs(parameters of method)
Method body({})  --> here we will write logic or task or work
Return Value/output  --> true or false --> It sends back to caller whoever will call this method.

Ex: pay(int amount, String accountNumber)

Note : Java is strongly types so everywhere when we are declaring any variable or method we need to define its Datatype simultaneously just before of it and then further we define other keywords like static and public. 

Syntax for Defining Method -

    <type_name> <method_name>( <parameters> ){

        // Biz logic // Non-Static Method 

    }


    <static> <type_name> <method_name>( <parameters> ){

        // Biz logic

    }


    <access_modifier> <static> <type_name> <method_name>( <parameters> ){

        // Biz logic

    }


# Method types : -

a) Inbuilt Methods In java : Already provided or developed by Oracle/Sun MicroSystems.

parseInt() method of 'Integer' class.
b) user defined methods : based on requirement, developer will like custom methods.





*/

/* 

Developing method to Transfer the fund between accounts(debit to credit), when user calls method or clicks -

// Requirement -

Input : amount to be transferred, sender account account, receiver account
Output : true/false  (true means fund transfer successfully)

accountNum --> 13334353445 (we keep String it is coz we are not going perform any operation on it(accountNum+1), as it will be fixed as well for security reason String is safe. )


Example : Sender have initial balance is 100 and Reciever have initial balance is 200; Now, sender sends 10 rupees to receiver now -

Initial Balances -
int senderBalance = 200;
int receiverBalance = 100;

int txtAmount = 10;

//Now,
int senderBalance = senderBalance - txtAmount = 200 - 10 = 90 rupees
int receiverBalance = receiverBalance + txtAmount = 100 + 10 = 110 rupees.

Note : At the end money remains same in this world, someone sending and someone receiving but NET MONEY is Same.
This is basic Transaction system for Phone-pe or Online Payment gateway.

To use this method ---> call the method.

static method --> always belong class itself.
non-static method --> we need to create the object of that class to call that method -
                        ClassName.methodName(); 
                         methodName();




*/ 

class FundTransfer{

    public static void main(String[] args) {

        System.out.println("Starting Main Method...");

        // Calling static method inside static method - Directly or with its className -
        boolean result = FundTransfer.doTransaction(10, "2342443244", "909484940940"); // method sends boolean result.

        // doTransaction(50, "34435344", "43344433"); // Can call directly without class
        System.out.println("Is txt Done : "+result);


        System.out.println("Ending Main Method.. ");
        
    }

    static boolean doTransaction(int  amountToBeTxn, String senderAccNum, String receiverAccNum ){

        System.out.println("DoTransaction started..");

        System.out.println("Input Received : "+amountToBeTxn+" "+senderAccNum+" "+receiverAccNum);
        System.out.printf("Amount to be Transaction : %d, senderAccount Number : %s and Receiver Account Number: %s%n ", amountToBeTxn, senderAccNum, receiverAccNum);

        // It is best practice to add %n at the very end of your string to get the new line.

        System.out.println("DoTransaction Exited..");
        return true; // It sends back to caller whoever will call this method.
    }


    // Note : JVM firstly call the main method, then it goes inside main method and find other methods call control and lastly JVM it ends the main method.
}
 
// Output : - JVM starts executing from main method -

// Starting Main Method...
// DoTransaction started..
// Input Received : 10 2342443244 909484940940
// Amount to be Transaction : 50, senderAccount Number : 34435344 and Receiver Account Number: 43344433
// DoTransaction Exited..
// Is txt Done : true
// Ending Main Method..



/*


/*

TASK : Write program to add two numbers, User provide inputs from command line arguments. Mthod should return the sum(should be separate method not main method).

Follow : SOLID principle and Method naming convention.


*/

// # SOLID Design Principle : - Your one class should be responsible for one functionality or one logic to perform. Mixing multiple functionality in single class is not good recommended, It should responsible for one functionality.

// S --> Single Responsibility(One Class --> One MUST Single Functionality Only.)

class AddTwoNum{

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        // Calling the static method here -
        int result = doSum(a, b);
        // int result = AddTwoNum.doSum(a, b);

        System.out.println("SUM is : "+result);

        // Using method multiple times -
        int result2 = doSum(a, b);
        int result3 = doSum(a, b);

    }

    static int doSum(int a, int b){
        return a + b;
    }
}


// Note : We get error like :Could not find or load main class AddTwoNumber, when we don't recompile after some changes and there was any error error in old .class file.

// Purpose of Method Writing : that logic can be hundred times other places. and Code or Functionality will be used multiple times with changing arguments. Method purpose is Reusability of code or Functionality.








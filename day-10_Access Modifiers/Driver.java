
// Writing this class to call methods from other class -
// Driver : Driver means Drive my program or start my program from here. It will get the main method.

class Driver {


    private static int amount = 200;
    public static void main(String[] args) {

        // Writting to Trace How JVM Executed -
        System.out.println("main method started...");


        //i. Public Access Modifier Call -

        OrderManagement ordMang1 = new OrderManagement(); // JVM will create object for instance method.

        //calling placeOrder() method of OrderManagement Class -
        ordMang1.placeOrder("Iphone 18");
        // Accessing the public variable of 'OrderManagement Class' -
        System.out.println(ordMang1.orderValue);


        // Private Access Modifier Call -
        // ordMang1.placeOrder1("Iphone 12"); // placeOrder1 is not visible
        // System.out.println(ordMang1.orderValue1); // orderValue1 is not visible

        System.out.println("Accessing Private variable :"+ amount);
        System.out.println("Accessing Private variable :"+ Driver.amount);


        System.out.println("main method ended...");

        
    }
    
}

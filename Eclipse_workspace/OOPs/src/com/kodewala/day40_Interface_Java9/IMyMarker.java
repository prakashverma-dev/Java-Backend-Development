package com.kodewala.day40_Interface_Java9;


// Marker Interface/Tag : It allow us to perform special activity
// With Permission only allowed.

public interface IMyMarker {

}

//Special Activity : -
// Cloning of object of class : by using java inbuilt Marker Interface 'Cloneable'.
// For Serialization (Writing the state of the object) : by using java inbuilt Marker Interface 'Serializable'.// Written to file system called serialization(written to byte streams) and when to read it by de-Serilization(convert btye to source code) at that time.



//Note :  Account is instance of clonable.


/* intanceof ---> to control the activity internally.
 * 
 * if(acc instanceof Clonable){
 * 
 *   // clonable.
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

package com.kodewala.day42_Custom_MarkerInterface;





/*
 * Revision Marker Interface :-
 * 
 * Marker Interface In JAVA : A Java marker interface is an empty interface with no methods or fields that acts as a tag to signal the JVM or compiler that an implementing class has a special capability or behavior.
 * 
 * As Already we know, Java Inbuilt Marker Interfaces are - Cloneable, Serializable , Cleanable etc.
 * 
 * 
 * Custom Marker Interface : We can create our custom Marker Interface as well and controll the Class Object performing things. E.g : To not allow to delete any Objects from class without Class Owner Permission -
 * 
 * 
 * public inteface Deletable{
 * 
 * 
 * }
 * 
 * Note : We can achive Custom Marker Interface functionality using 'Empty Class' by extends As well but IT is not advisable coz then we further can not extends another class.
 * 
 * 
 * 
 * 
 * 
 * */



/**
 * 
 * @author Prakash Verma 
 * 
 * */

//This is our Custom Marker Interface :  Deletable --> for allowing to delete the Objects of Class else no -

public interface Deletable {

}


/*
 * Cloning : Copy the object
 * 
 * 1. Shallow Cloning : one level copying
 * 2. Deep Cloning : 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

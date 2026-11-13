package com.amazon.sample; // directory structure is called package.

import java.util.Scanner;

public class HelloWorld {

	public static void main(String args[]) {

		System.out.println("Hello World from Eclipse..!"); // syso

		int amount = 200;
		System.out.println("Amount : " + amount);

		HelloWorld.doSomething();
		
		Scanner sc = new Scanner(System.in);
		
//		Command Line Arguments -
		String name = args[0];
		System.out.println("User NAme is :"+name);

	}

	public static void doSomething() {

		System.out.println("HelloWorld.doSomething()"); // syst
	}

}

/* 
 
 
 Ram is a good boy.
 *
 *
 *
 *
 */

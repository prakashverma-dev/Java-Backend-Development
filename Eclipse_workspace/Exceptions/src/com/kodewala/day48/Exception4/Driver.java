
package com.kodewala.day48.Exception4;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Driver.main()...START");
		
		AccountManagement accMange = new AccountManagement();
		
		accMange.openAccount("3433444333");
		
		System.out.println("Driver.main()...END");


	}

}

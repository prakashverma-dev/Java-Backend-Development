package com.kodewala.day37_Interface_Java7;

public interface IPropertyTaxDiscount extends IDiscount { //a Interface extends another interface.

	//Abstract Method -
	public abstract void calculatePropDisc();
	
	//technially we have three abstract methods(2 from Parent Inteface) are here.
}

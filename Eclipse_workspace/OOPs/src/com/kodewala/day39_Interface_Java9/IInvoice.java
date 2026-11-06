package com.kodewala.day39_Interface_Java9;


//Ex: Functional Interface/Single Abstract Method(SAM) Interface : When we have only one abstract method in the interface, called functional Interface. It could have many default methods but only one abstract method.

public interface IInvoice {
	
	
	void doInvoice();  // By-default It is as : 'public abstract' void doInvoice(); 
//	public abstract void doInvoice();

}


//let make class -
class InvoiceImp implements IInvoice{
	
//	@Override
//	void doInvoice() {  // It will gives error as We try to reduce visibility from 'public' to 'default' here.
//		
//	}
	
	@Override
	public void doInvoice() {  // so we need to explicity make it public, in order to not reduce visibility.
		
	}
	
	
}
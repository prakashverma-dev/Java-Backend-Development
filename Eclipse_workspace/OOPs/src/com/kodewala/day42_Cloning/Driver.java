package com.kodewala.day42_Cloning;

public class Driver { // LEVEL2 - Class

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Address adds = new Address("16th main", "27th Cross", "Bangalore");
		
		
		Employee emp1 = new Employee("Prakash", "2334df", adds);
		
		//Let's try to clone -
		
		Employee clonedEmp = (Employee) emp1.clone(); 
		
		//Let check -
		
		emp1.address.line3 = "Delhi"; //Level - 2 Object will not copied, It will same.
		
		
		
		System.out.println(emp1.address.line3);
		System.out.println(clonedEmp.address.line3);
		
		
		

	}

}

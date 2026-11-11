package com.kodewala.day26_StringBuffer_Builder;import java.util.EmptyStackException;

/*
 * 
 * What if you want to modify the object ?

	Can we use String ?  --> No


 * # StringBuilder and StringBuffer : As we know String Object cannot be modify in java, so Java Introduced StringBuilder and StringBuffer in order to modify the String Object if some requirement comes, 
 * 
 * Without creating a new Object we can modify existing String Object(StringBuilder or StringBuffer Object), with help either StringBuilder and StringBuffer.
 * 
	StringBuilder and StringBuffer Objects are mutable/ we can change.
	
	StringBuilder and StringBuffer object allow us to change the content of created String Object.
	
	When we have to take dynamic strings based on user Input e.g SQL then we use StringBuilder and StringBuffer.
	
	Function in StringBuilder and StringBuffer are same.
	
	

 * # Difference Between StringBuilder and StringBuffer : -
 * 
 * a) StringBuilder : It is fast but It is 'Not Thread Safe' coz All All methods here is Asynchornized means at the same time multiple or parellel threads can work.
 * 
 * Thread Safe means that Thread cannot corrupt or trouble your data.
 * 
 * 
 * 
 * b) StringBuffer : It is slow But It is 'Thread Safe' coz All methods here is Synchornized means one thread can access at one time. 
 *
 * In StringBuffer, one thread allowed to work at a time.
 * 
 * Note : Anything in java which is 'Thread Safe' will be 'slow' in nature coz methods are synchronizd and work one Thread at a time and other thread waiting in queue.
 * 
 * Note : StringBuffer is Synchronized in nature whereas StringBuilder is asynchronized.
 * 
 * 
 * Note : .append() method doesnot create 'new' object in HEAP Area, where as it updates/modifies by existing object in HEAP area with latest value.
 * 
 * .contact() used to create new object each time, when we tried to modify the string Object.
		
 * 
 * Q. If require to change the String Object --> use either StringBuilder or, StringBuffer
 * Q. If require to change the String Object and with Thread Safe --> use StringBuffer
 * Q. Anythin which is immutable are always Thread Safe coz String is canot change later.
 * 
 * 
 * 
 * */

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringBuilder  --> StringBuilder Object is mutable/ we can change.
		
		StringBuilder sb = new StringBuilder("Kodewala"); // 2 object --> 1 in SCP("Kodewala" referred by local 'str') + 1 Object in HEAP("Kodewala" referred by 'sb')
		
		//To prove - we have append() method in place of '.concat' -
		sb.append(" Academy"); // modifying existing String object in SCP. // Here 1 object " Academy" in SCP referred by local, after then previous 'sb' content in HEAP memory get modified/updated with "Kodewala Academy" referred by 'sb'.  --> Hence, Overall Only 1 Object created in SCP i.e " Academy" and updated object in HEAP AREA asb"Kodewala Academy".
		
		System.out.println(sb);
		
//		Note : .append() method doesnot create 'new' object in HEAP Area, where as it updates/modifies by existing object in HEAP area with latest value.
		
		
		//ii. We try to add a string at each loop running -
		
		
		
		StringBuilder sb2 = new StringBuilder("Ram"); // 2 objects : 1 ("Ram" in SCP reffered by local 'str') + 1 ("Ram" in HEAP reffered by 'sb2')
		
		for(int i=0; i<10; i++) {
			
			sb2.append(" Sita"+i); // only 1 Object created in SCP i.e " Sita" and Rest all Objects get updated in HEAP memory reffered by 'sb2' ; each time loop runs.
			
		}
		
		System.out.println(sb2);
		
		
		
		// iii. checking .equals() for StringBuilder - In StringBuilder Class, .equals() method it not ovverriden so It takes from 'Object' class and compares the addresses -
		
		StringBuilder sb3 = new StringBuilder("Academy");
		StringBuilder sb4 = new StringBuilder("Academy");
		
		
		System.out.println(sb3.equals(sb4)); //false as checks two different memory addresses. // .equals() opens 'Object' class. 
		System.out.println(sb3.toString().equals(sb4.toString())); // true 
		

	}

}



/// Real Time Example of StringBuilder : To generate the SQL queries based on User inputs/Dynamic Inputs salary and empID  - We use StringBuilder() for this -
/// 
// If we use Here 'String' Object then suupose 1000 user hitting this, and it will create 1000 times the new String Object then it might get Server/System Crash within few minuts. Hence, We use 'StringBuilder' to create string for in case of dyamic String data update so It will not create 1000 times new String Object each time each user whereas It will create only one object overall for all the Users.

class SQLQueryGenerator{
	
	
	//We will return modified String , the reason used 'StringBuilder' as Method type -
	// I need to select the SQL queries based on salary or empID -
	
	public StringBuilder generateQuery(int salary, String empID) {
		
		// creating String builder object -
		StringBuilder sqlQuery = new StringBuilder("Select * from employee "); // this query will get updated as per user inputs 
		
		
		if(salary > 0) {
			
			sqlQuery.append(" where salary = " + salary + ";"); // modifying existing builder String object.
			
		}else if(empID != null) {
			
			sqlQuery.append(" where empID = " + empID + ";"); // modifying existing builder String object.
			
		}else {
			
			sqlQuery.append(";"); // modifying existing builder String object.
		}
		
			
		
		return sqlQuery; //finally we return the updated SQL Query
	}
	
	
	
	
	
	
	//Driver 'main' method call this method -
	public static void main(String[] args) {
		
		//Since, generateQuery method is non static, I need to make instance of that class -
		SQLQueryGenerator sqlQuery = new SQLQueryGenerator();
		
		StringBuilder result = sqlQuery.generateQuery(12000, null);
		
		System.out.println(result);
		
		//If somebody doesnot pass the salry only pass the empID -
		StringBuilder result2 = sqlQuery.generateQuery(0, "PKV133");
		System.out.println(result2);
		
		//If somebody doesnot pass any data -
		StringBuilder result3 = sqlQuery.generateQuery(0, null);
		System.out.println(result3);
	}
}
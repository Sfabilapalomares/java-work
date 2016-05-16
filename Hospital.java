package ch5;
import java.text.NumberFormat;	

//Program Name: 	 HospitalEmployee.java
//Author : 			 Alan Shugert
//Brief Description: Create a class called Hospital Employee and practice creating methods.

public class Hospital {

	public static void main(String[] args)
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		
		System.out.println("Welcome to our Hospital");
	
		HospitalEmployee worker1 = new HospitalEmployee();
		
		System.out.println("\nState of Worker 1: " + worker1.toString());
		
		worker1.changePayRate(4.50);
		
		worker1.changeHoursWorked(30);
		
		System.out.println("\nAfter pay rate and hours worked increase: " + worker1.toString());
	
		worker1.getEmpName();
		
		System.out.println(" \nEmployee " + worker1.getEmpName() + " earned " + fmt.format(worker1.calculateGrossPay()));

		worker1.calculateBonus("excellent");
		
		System.out.println("\nAfter Bonus: " + worker1.getEmpName() + " recieved a bonus of " 
		+ worker1.calculateBonus("excellent") + " and earned a total of "
		+ fmt.format(worker1.calculateGrossPay() + worker1.calculateBonus("excellent")));
		
		System.out.println("\n====================================");
		
		HospitalEmployee worker2 = new HospitalEmployee("Jon Jones", 5961, 44, 23.15);

		System.out.println("\nState of Worker 1: " + worker1.toString());
		
		System.out.println("\nState of Worker 2: : " + worker2.toString());
	
		System.out.println("\nState of Workers after worker2 pay rate and hours worked reset. ");

		System.out.println("\nState of Worker 1: " + worker1.toString());
		
		worker2.setPay(12.25);
		
		worker2.setHoursWorked(15);
		
		System.out.println("\nState of Worker 2: : " + worker2.toString());
		
		System.out.println("\nEmployee " + worker2.getEmpName() + " earned " + fmt.format(worker2.calculateGrossPay()));
		
		System.out.println("\nAfter bonus: " + worker2.getEmpName() + " recieved a bonus of " + fmt.format(worker2.calculateBonus(1)));
		
		System.out.println("\nNumber of HospitalEmployees created: " + HospitalEmployee.getHospitalEmployeeCount());
		
		System.out.println("\nGood Bye");
/*
	  Welcome to our Hospital

State of Worker 1: Employee name: Chris Smith
 Employee Number: 9999
 Hours Worked: 0.0
 Pay Rate: $0.00

After pay rate and hours worked increase: Employee name: Chris Smith
 Employee Number: 9999
 Hours Worked: 30.0
 Pay Rate: $4.50
 
Employee Chris Smith earned $135.00

After Bonus: Chris Smith recieved a bonus of 500.0 and earned a total of $635.00

Good Bye

*/
		
		
/*Welcome to our Hospital

State of Worker 1: Employee name: Chris Smith
 Employee Number: 9999
 Hours Worked: 0.0
 Pay Rate: $0.00

After pay rate and hours worked increase: Employee name: Chris Smith
 Employee Number: 9999
 Hours Worked: 30.0
 Pay Rate: $4.50
 
Employee Chris Smith earned $135.00

After Bonus: Chris Smith recieved a bonus of 500.0 and earned a total of $635.00

====================================

State of Worker 1: Employee name: Chris Smith
 Employee Number: 9999
 Hours Worked: 30.0
 Pay Rate: $4.50

State of Worker 2: : Employee name: Jon Jones
 Employee Number: 5961
 Hours Worked: 44.0
 Pay Rate: $23.15

State of Workers after worker2 pay rate and hours worked reset. 

State of Worker 1: Employee name: Chris Smith
 Employee Number: 9999
 Hours Worked: 30.0
 Pay Rate: $4.50

State of Worker 2: : Employee name: Jon Jones
 Employee Number: 5961
 Hours Worked: 15.0
 Pay Rate: $12.25

Employee Jon Jones earned $183.75

After bonus: Jon Jones recieved a bonus of $125.00

Number of HospitalEmployees created: 2

Good Bye
	
	*/
	
	}

}

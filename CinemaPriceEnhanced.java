package ch4;

//Program Name: 		CinemaPriceEnhanced.java
//Author : 			Alan Shugert
//Brief Description: This program allows the user to input a ticket price and an age then receive a discount.

import java.util.Scanner;
import java.text.NumberFormat;

public class CinemaPriceEnhanced {

	
	public static void main(String[] args) {
		
		
		double ticketPrice;
		 String message;
		 int age = 1;
		 double finalPrice;
		 Scanner scan = new Scanner(System.in);
		 
			System.out.print( "Enter Ticket Price: ");
			   ticketPrice = scan.nextDouble();	
		
		 while (age != 0)
		 {	 
		
		   System.out.print( "Enter your age (0 to quit): ");
		   age = scan.nextInt();
		   
			System.out.println( "Your age: " + age);
			
			NumberFormat nf = NumberFormat.getCurrencyInstance();

	if (age == 0)
	{			
	System.out.print("Good Bye");
	}
	else if (age <= 5)	
	{ 
		finalPrice = ticketPrice * 0.00;
		message = "You get in for free!\n";
		System.out.println (message + nf.format(finalPrice));

	}
	else if (age <= 12)
	{
		finalPrice = ticketPrice / 2.00; 
		message = "Half Price!\n";
		System.out.println (message + nf.format(finalPrice));
	}
	else if (age <= 54)
	{
		finalPrice = ticketPrice / 1.00;
		message = "Full Price\n";
		System.out.println (message + nf.format(finalPrice));
	}
	
	else
	{
		finalPrice = ticketPrice * 0.00;
		message = "You get in for free!\n";
	    System.out.println (message + nf.format(finalPrice));
	}
	}
	   
	}
	
	/*
	
	 Enter Ticket Price: 15.23
	Enter your age (0 to quit): 25
	Your age: 25
	Full Price
	$15.23
	Enter your age (0 to quit): 0
	Your age: 0
	Good Bye
	
	 */
}



package ch4;

//Program Name: 		CinemaPrice.java
//Author : 			Alan Shugert
//Brief Description: This program allows the user to input a ticket price with a random age and receive a discount.

import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

public class CinemaPrice {

	
	public static void main(String[] args) {
		
		 Random generator = new Random();
		
		double ticketPrice;
		 String message;
		 int age = generator.nextInt(100) + 1;
		 double finalPrice;
		 Scanner scan = new Scanner(System.in);
		 
			System.out.print( "Enter Ticket Price: $");
		   ticketPrice = scan.nextDouble();
			
			System.out.println( "Your age: " + age);
			
			NumberFormat nf = NumberFormat.getInstance();

		 if (age <= 5)	
	{ 
		finalPrice = ticketPrice * 0.00;
		message = "You get in for free!";
		System.out.println (message + ": $" + nf.format(finalPrice));

	}
	else if (age <= 12)
	{
		finalPrice = ticketPrice / 2.00; 
		message = "Half Price!";
		System.out.println (message + ": $" + nf.format(finalPrice));
	}
	else if (age <= 54)
	{
		finalPrice = ticketPrice / 1.00;
		message = "Full Price";
		System.out.println (message + ": $" + nf.format(finalPrice));
	}
	else
	{
		finalPrice = ticketPrice * 0.00;
		message = "You get in for free!";
	    System.out.println (message + ": $" + nf.format(finalPrice));
		
	}
	   
	}
	
	/*Enter Ticket Price: $7.25
	Your age: 29
	Full Price: $7.25
	 */
}



package ch2;


//Program Name : ChangeMaker.java
//Author : 	  Alan Shugert
//Brief Description:  
//This program will give you exact change for the value you input.

import java.util.Scanner;


public class ChangeMaker {


	public static void main(String[] args)
	{

	Scanner scan = new Scanner(System.in);
	
		
	final int PENNIES = 1;
	final int NICKELS = 5;
	final int DIMES = 10;
	final int QUARTERS = 25;
	
	
	System.out.print("Enter any whole number from 1 to 99: ");
	int cents = scan.nextInt();
	
	System.out.println(cents + " cents in coins can be given as: ");
	
	int totalQuarters = cents / QUARTERS;
	cents %= QUARTERS;
	int totalDimes = cents / DIMES;
	cents %= DIMES;
	int totalNickels = cents / NICKELS;
	cents %= NICKELS;
	int totalPennies = cents / PENNIES;
	cents %= PENNIES;
	
	
	System.out.println(totalQuarters + " quarters");
	
	
	System.out.println(totalDimes + " dimes");
	
	
	System.out.println(totalNickels + " nickels and");
		

	System.out.println(totalPennies + " pennies");
	
	
	scan.close();
	
	/*
	 Case 1:
	Enter any whole number from 1 to 99: 88
	88 cents in coins can be given as: 
	3 quarters
	1 dimes
	0 nickels and
	3 pennies
	
	Case 2:
	Enter any whole number from 1 to 99: 51
	51 cents in coins can be given as: 
	2 quarters
	0 dimes
	0 nickels and
	1 pennies
	
	Case 3:
	Enter any whole number from 1 to 99: 17
	17 cents in coins can be given as: 
	0 quarters
	1 dimes
	1 nickels and
	2 pennies
	
	Case 4:
	Enter any whole number from 1 to 99: 4
	4 cents in coins can be given as: 
	0 quarters
	0 dimes
	0 nickels and
	4 pennies
	 
	 */
	}

}

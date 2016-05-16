package ch3;
//**********************************************************
//Program Name: 		UsernameGenerator.java
//Author : 			Alan Shugert
//Brief Description:This program allows user to input names
//and come out with a unique username

//importing correct statements
import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator {

	
	public static void main(String[] args) {
	
		Random generator = new Random();
		
		//indicating that the random number will be between 10-99
		int randomNumber = generator.nextInt(90) + 10;
		
		Scanner scan = new Scanner(System.in);
		
		//request first and last name for user
		System.out.print("Enter your first name: ");
		String name1 = scan.nextLine();
		
		System.out.print("Enter your last name: ");
		String name2 = scan.nextLine();
		
		//produced username and random number 
		//then added the components together
		System.out.println ("Your username: " +  
							name1.substring(0,1) + name2.substring(0,5) + randomNumber);
		
		scan.close();
		
		/*		OUTPUT
	
	    Enter your first name: Alan
		Enter your last name: Shugert
		Your username: AShuge97
		
		*/
	}

}

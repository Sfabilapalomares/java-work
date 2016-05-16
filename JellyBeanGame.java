package ch4;
// ****************************************************************
//   Program Name: JellyBeanGame.java - SKELETON CODE for STEP 1
//  
//   Author :  Alan Shugert
//   Description: Play a game where the user tries to guess the
//   number of jellybeans in a jar.  Can range from 1 to 1000
//   
//   Uses a do..while loop.
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class JellyBeanGame
{
    public static void main(String[] args)
    {
        int numOfJellyBeans = 0;       //Number of jellybeans in jar
        int guess = 0;                       //The user's guess
        int numOfGuesses = 0;
        String message;


		 Random generator = new Random();
		 Scanner scan = new Scanner (System.in);

		//randomly generate the number of jellybeans in jar
		 numOfJellyBeans = generator.nextInt(1000) + 1;

		System.out.println("There are between 1 and 1000 jellybeans in the jar,");
		

		do
		{
			numOfGuesses++;
	    //prompt user to quess and read in 
		 System.out.print("Enter your guess: ");
		 guess = scan.nextInt();
		 
		 //if the quess is wrong display message
		 if (guess < numOfJellyBeans)
		 {
		 	message = "Too Low!\n";
		 	System.out.println(message);
		 }
		 else if (guess > numOfJellyBeans)
		 {
			 message = "Too High!\n";
			 System.out.println(message);
		 }
		 else
		 {
			 message = "High Five! You got it after " + numOfGuesses + " guesses!";
			 System.out.println(message);
		 }
			 
		}	while (guess != numOfJellyBeans);


		
/*	There are between 1 and 1000 jellybeans in the jar,
Enter your guess: 59
Too Low!

Enter your guess: 250
Too Low!

Enter your guess: 300
Too Low!

Enter your guess: 450
Too Low!

Enter your guess: 500
Too Low!

Enter your guess: 900
Too Low!

Enter your guess: 1000
High Five! You got it after 7 guesses!


 */
    }
}

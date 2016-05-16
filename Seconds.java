package ch2;


//Program Name : Seconds
//Author : 	  Alan Shugert
//Brief Description:  
//   This program calculates the amount of seconds in a hour, minute and finds the total.

/* PSEUDOCODE:
Define values for integers.
Prompt user for hours, minutes and seconds.
Display the sum of all integers in correct format
 */


import java.util.Scanner;

public class Seconds {


	public static void main(String[] args) 
	{
// Defining value of hours, minutes and seconds.
		final int HOURS = 3600;
		final int MINUTES = 60;
		final int SECONDS = 1;

		Scanner scan = new Scanner(System.in);
// Defining variables		
		int hours;
		int minutes;
		int seconds;
		int totalSeconds;
// Entering text that correspond with variables		
		System.out.print("Enter number of hours: ");
		hours = scan.nextInt();
		
		System.out.print("Enter number of minutes: ");
		minutes = scan.nextInt();
		
		System.out.print("Enter number of seconds: ");
		seconds = scan.nextInt();
// Mathematics that make the variables work		
		totalSeconds = (hours * HOURS) + (minutes * MINUTES) + (seconds * SECONDS);
		
		// Addition that concludes with the said amount
		System.out.println("Total number of seconds: " + totalSeconds);
		
		
		scan.close();

/* OUTPUT
Case 1:

Enter number of hours: 1
Enter number of minutes: 1
Enter number of seconds: 2
Total number of seconds: 3662

Case 2:

Enter number of hours: 1
Enter number of minutes: 45
Enter number of seconds: 0
Total number of seconds: 6300

Case 3:
Enter number of hours: 0
Enter number of minutes: 6
Enter number of seconds: 0
Total number of seconds: 360	

*/
	}

}

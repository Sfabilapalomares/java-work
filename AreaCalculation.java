 //Program Name : AreaCalculation
 //Author : 	  Alan Shugert
 //Brief Description:  
 //        This program calculates the area of a rectangle.
package ch2;

import java.util.Scanner;  //Needed for the Scanner class


public class AreaCalculation
{

	public static void main(String[] args)  //all the action happens here!
	{

		 //define all variables and assign values
		 int length = 20;
		 int width = 40;
		 int area;

		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Enter the length: ");
		  length = scan.nextInt();
		 
		  
		 System.out.print("Enter the width: ");
		  width = scan.nextInt();
		  //perform area calculation 

		 area = length * width;

		 //now display your answer
		 System.out.println("The area is:  " + area);


	} //end of the main method


} // end of the class 

/* MY OUTPUT
Enter the length: 5
Enter the width: 5
The area is:  25
*/
package ch4;

import java.util.Scanner;

//****************************************************************
//Class Name :  MultiplicationTable.java
//Author : 	Alan Shugert
//Brief Description:  This program will allow you to create
//a multiplication table and input values.
//****************************************************************

public class MultiplicationTable 
{

	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		 
		int num1 = 1;
		
			while (num1 != 0)
		{
		
			System.out.print("Please enter a number from 1 to 5 (0 to quit) : ");
			num1 = scan.nextInt();
		 
					 
			while (num1 < 0 || num1 > 5)
			   {  
					System.out.println("Sorry, not a number from 1 to 5. Try again. ");
					System.out.print("Please enter a number from 1 to 5 (0 to quit) : ");
					num1 = scan.nextInt();
			   }
			
				for(int horiz =1; horiz <= num1; horiz++)
			   {
				   System.out.print("\t" + horiz);
			   }
			   System.out.println();
			   
			   	for(int dashes = 1; dashes <= num1; dashes++)
				{
					System.out.print("\t-");
				}
				
				System.out.println();
				
				for(int r = 1; r <= num1; r++)
				{
					System.out.print("   " + r + "|   ");
					
				for (int c = 1; c <= num1; c++)
					{
						System.out.print(r * c + "\t");						
					}
					
					System.out.println();
				}
		}
			System.out.print("Done!");
			scan.close();
		
	
	}	
	
	
/* Please enter a number from 1 to 5 (0 to quit) : 3
	1	2	3
	-	-	-
   1|   1	2	3	
   2|   2	4	6	
   3|   3	6	9		

Please enter a number from 1 to 5 (0 to quit) : 10
Sorry, not a number from 1 to 5. Try again. 

Please enter a number from 1 to 5 (0 to quit) : 5
	1	2	3	4	5
	-	-	-	-	-
   1|   1	2	3	4	5	
   2|   2	4	6	8	10	
   3|   3	6	9	12	15	
   4|   4	8	12	16	20	
   5|   5	10	15	20	25	
Please enter a number from 1 to 5 (0 to quit) : 0


Done!
	 */
}


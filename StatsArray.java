package ch10;
/* 
 * Author:  Alan Shugert
 *
 *  Brief Description:  Defines a class that has a 10 element integer array
 *  Methods perform tasks for the array - find max, sum, find average, etc
 *  
 */

import java.awt.*;
import java.util.Random;  //for our random number generator
import java.util.Scanner;



public class StatsArray {

	private int size;  
	private int[ ] stats; 


	//default constructor 
	StatsArray() {
		size = 10;
		stats = new int[size];
	}


	public void display(Graphics g)
   {
		int x = 50;  //coordinates
		int y = 40;
		//display the array 
		for(int i = 0; i < stats.length; i++)
		 {
			g.drawString("Stats [" + i + "] = "+ stats[i], 
			x, (y + 15 * i) );
		}
	}

	public void fillArray()
	{
		//fill the array with random numbers from 0 - 100
		Random random = new Random();
		for(int i = 0; i < stats.length; i++)
		 {
			stats[i] = random.nextInt(101) ;
       }
	}

	public int getSum()
	{
		
		int total = 0;
		for (int i = 0; i < stats.length; i++)
			total = total + stats[i];
		return total;
	}


	public int getMax() 
	{
		
			int maxValue = stats[0];
			for (int i = 0; i < stats.length; i++){
				if (stats[i] > maxValue)
					maxValue = stats[i];
			}
			return maxValue;
	}

	public int getMin() 
	{
		
			int minValue = stats[0];
			for (int i = 0; i < stats.length; i++){
				if (stats[i] < minValue)
					minValue = stats[i];
			}
			return minValue;
	}

	public double getAverage() 
	{
		
			return (double)getSum() / stats.length;
	}

	public int countValues(int lowRange, int highRange) 
	{
		
		int count = 0;
		for (int i = 0; i < stats.length; i++) {
			if ( (stats[i] >= lowRange) && (stats[i] <= highRange) ) 
			{
				count++;
			}
		}
		return count;
	}


	public boolean isValueFound(int someNumber) {
		
		boolean found = false;

		for(int i = 0; (i < stats.length && !found); i++) {
			if (stats[i] == someNumber) {
				found = true;
			}
		}
		return found;
	}


	public void sortBArray() {
		

		int tempValue;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[i])
				{
					tempValue = stats[i];
					stats[i] = stats[j];
					stats[j] = tempValue;
				}
			}
		}

	}


    public void sortArray() {
			

			int tempValue;
			int min;

			for (int i = 0; i < (stats.length - 1); i++)
			{
				min = i;
				for (int j = (i + 1); j < (stats.length); j++)
				{
					if (stats[j] < stats[min])
					{
						min = j;
					}
				}
				tempValue = stats[min];
				stats[min] = stats[i];
				stats[i] = tempValue;


			}

		}
    public void fillArrayFU()
    {
    	int value = 0;
    	Scanner scan = new Scanner(System.in);
    	do(scanner.hasNext())
    	{
    		
    	}
    		
    }
   public void cNegative(int someValue)
    {
    	if(0 > someValue)
    	{
    		throw new IllegalArgumentException( );
    	}
    }

    
    public void dOut()
    {
    	for (int i = 0; i < (stats.length - 1); i++)
    	{
    		System.out.println("Enter Value [i]");
    	}
    }
}
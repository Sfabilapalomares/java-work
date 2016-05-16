package ch3;


//Program Name : SphereCalculator.java
//Author : 	  Alan Shugert
//Brief Description:  
//This program will give you the volume and surface area of a given radius from a sphere.


// Importing necessary utilities
import java.text.DecimalFormat;

import java.util.Scanner;

public class SphereCalculator {
	

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
	
//defining variables
	double radius;
	double surfaceArea;
	double volume;
	//Introductory text
	System.out.println("Welcome to the Sphere Calculator.");
	
	System.out.print("Enter the sphere's radius: ");
	radius = scan.nextDouble();
	//Calculations for volume
	volume = (4 * Math.PI * Math.pow(radius,3)) / 3;
	//Calculations for Surface Area
	surfaceArea = (4 * Math.PI * Math.pow(radius,2));
	//Indicating the use of 4 decimal places
	DecimalFormat dFmt = new DecimalFormat("0.0000");
	//Implementing all methods in text
	System.out.println("Your Results are: ");
	
	System.out.println("Radius: " + radius);
	
	System.out.println("Volume: " + dFmt.format(volume));
	
	System.out.println("Surface Area: " + dFmt.format(surfaceArea));
	
	scan.close();


	/*
	
	Welcome to the Sphere Calculator.
Enter the sphere's radius: 7.5
Your Results are: 
Radius: 7.5
Volume: 1767.1459
Surface Area: 706.8583
	
	*/
	
	}

}

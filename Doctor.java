package ch8;
//Author: Alan Shugert
//Class: CSC110

import java.util.Random;
public class Doctor extends HospitalEmployee
{
	private String special; 
	
	public Doctor(String eName, int eNumber, double hours, double pay, String special)
	{
		super(eName, eNumber, hours, pay);
		special = "unknown";
		
	}
	
	public String getSpecialty()
	{
		return special;
	}
	
	public void setSpecialty(String specialz)
	{
		
		special = specialz;
	}
	
	public double calculateBonus(String shift)
	{
		double bonus;
		if (shift == "night shift")
		{
			bonus = super.calculateBonus(10);
		}
		else
		{
			bonus = super.calculateBonus(5);
		}
		return bonus;
	}
	
	Random gen = new Random();
	public String createLogin()
	{
		
		String username = "idk";
		int num = gen.nextInt(10);
		username = (empName.substring(0,2) + num + empNumber);
		return username;
	}
	
	public String toString()
	{
		return ( super.toString( ) + " Specialty: " + special);
	}
}

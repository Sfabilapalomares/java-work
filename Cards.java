package ch4;

//Program Name: 		Cards.java
//Author : 			Alan Shugert
//Brief Description: This program allows the user pick a card at random and the program will tell the user what it is.

//importing class
import java.util.Random;


public class Cards {
	
		
		public static void main(String[] args){

		
		
	Random generator = new Random();
	//defining variables and limits
	int suit = generator.nextInt(4) + 1;
		
    int cardNumber = generator.nextInt(13) + 1;
		
		System.out.print("You have selected the ");
	

	//initiating the switch
		switch (cardNumber)
		{

case 1 :  System.out.print("Ace");
break;

case 2 :  System.out.print("2");
break;

case 3 :  System.out.print("3");
break;

case 4 :  System.out.print("4");
break;

case 5 :  System.out.print("5");
break;

case 6 :  System.out.print("6");
break;

case 7 :  System.out.print("7");
break;

case 8 :  System.out.print("8");
break;

case 9 :  System.out.print("9");
break;

case 10 : System.out.print("10");
break;

case 11 : System.out.print("Jack");
break;

case 12 : System.out.print("Queen");
break;
		
case 13 : System.out.print("King");
break;		
}

		System.out.print(" of ");

//initiating second switch
	switch (suit)
{
case 1 : System.out.print("spades");
break;

case 2 : System.out.print("diamonds");
break;

case 3 : System.out.print("clubs");
break;

case 4 : System.out.print("hearts");
break;

		}
		

}
	
}	


package groupProject;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class QuizShowPanel extends JPanel
{

	
		private JLabel titleLabel;
		private JLabel q1;
		private JLabel q2;  
		private JLabel q3;
		private JLabel q4;
		private JLabel q5;
		private JLabel q1a;
		private JLabel q2a;  
		private JLabel q3a;
		private JLabel q4a;
		private JLabel q5a;
		
		
		private JTextField q1TF;
		private JTextField q2TF;
		private JTextField q3TF;
		private JTextField q4TF;
		private JTextField q5TF;
		
		private JButton Button;
		
		private JTextField Correct;

	

	//-----------------------------------------------------------------
	//  Constructor: Sets up the GUI.
	//-----------------------------------------------------------------
	public QuizShowPanel ()
	{
	   		
			//create labels
	   		titleLabel = new JLabel("Quiz Show by TEAM OVERLOAD");
	   		
	   		q1 = new JLabel("What is Iron Man's real first name?");
			q2 = new JLabel("What is Batman's real first name?");
			q3 = new JLabel("What is Superman's earthly first name?");
			q4 = new JLabel("What is the Hulk's real first name?");
			q5 = new JLabel("What is Spider-Man's real first name?");
			q1a = new JLabel("First Answer: ");
			q2a = new JLabel("Second Answer: ");
			q3a = new JLabel("Third Answer: ");
			q4a = new JLabel("Fourth Answer: ");
			q5a = new JLabel("Fifth Answer: ");
			
			//create textfields and assign initial values
			q1TF = new JTextField(15);
		
			q2TF = new JTextField(15);
		
			q3TF = new JTextField(15);
		
			q4TF = new JTextField(15);
		
			q5TF = new JTextField(15);
			
			
			Button = new JButton("Click to see how many you got right.");
			
			Correct = new JTextField(15);
			/*
				String Question, Answer;
				
				Scanner inFile;
				PrintWriter outFile;
				try {	inFile = new Scanner(new FileReader("src/groupProject/TriviaSuperheroNames.txt"));
				outFile = new PrintWriter("src/groupProject/TriviaSuperheroNames.txt");
				String line;
				
				while ( inFile.hasNextLine())
				{
					
				
					
					line = inFile.nextLine();
					Scanner tokens = new Scanner(line);
					
					tokens.useDelimiter(",");
					
					Question = tokens.next();
					Answer = tokens.next();
					
					txt = new String[rowSize][columnSize];
				
					outFile.println(line);
				}
				}
			*/
			
				
			//set up buttons and register with ActionListener
			

		     
	        //add the components to the panel.  Order is important
			add(titleLabel);
			add(q1);
			add(q1a);
			add(q1TF);
			add(q2);
			add(q2a);
			add(q2TF);
			add(q3);
			add(q3a);
			add(q3TF);
			add(q4);
			add(q4a);
			add(q4TF);
			add(q5);
			add(q5a);
			add(q5TF);
			add(Button);
			add(Correct);
		
			setBackground (Color.gray);
			setPreferredSize (new Dimension(650, 300));
	

	//*****************************************************************
	//  Represents a listener for button push (action) events.
	//*****************************************************************
	 Button.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
		   int count =0;
		   //for(int i = 0; i < 6; i++)
		   if(q1TF.getText().equalsIgnoreCase("Tony"))
		    	{count ++; }
		   if(q2TF.getText().equalsIgnoreCase("Bruce"))
	    	{count ++; }
		   if(q3TF.getText().equalsIgnoreCase("Clark"))
	    	{count ++; }
		   if(q4TF.getText().equalsIgnoreCase("Bruce"))
	    	{count ++; }
		   if(q5TF.getText().equalsIgnoreCase("Peter"))
	    	{count ++; }
		   Correct.setText("Number Correct: " + String.valueOf(count));
		   }}); 

	
	//private class ButtonListener implements ActionListener{
	 // public void actionPerformed (ActionEvent event){
	 		
			
				
						
			
				
	  // }
			
	//}
		
	}//end of DiePanel
}


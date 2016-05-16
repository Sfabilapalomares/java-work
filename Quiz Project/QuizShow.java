package groupProject;

import java.util.Scanner;
import java.io.*; //for file reading

public class QuizShow
{
	public static void main(String[] args)
	{
		//Create quiz and question objects.
		Quiz aQuiz = new Quiz();
		Question question1;
		Question question2;
		Question question3;
		Question question4;
		Question question5;
		
		Scanner scan = new Scanner(System.in);
		
		String question1Question;
		String question1Answer;
		
		String question2Question;
		String question2Answer;
		
		String question3Question;
		String question3Answer;
		
		String question4Question;
		String question4Answer;
		
		String question5Question;
		String question5Answer;
		
		//Option to fill quiz manually or from file
		String questionsOption;
		System.out.println("Enter \"manual\" to manually enter questions for the quiz, or \"file\" to fill the quiz with questions from the questions file.");
		questionsOption = scan.nextLine();
		
		if (questionsOption.equalsIgnoreCase("manual")) //if the user wants to manually enter questions
		{			
			System.out.println("What is the first question?");
			question1Question = scan.nextLine();
			System.out.println("What is the answer to this question?");
			question1Answer = scan.nextLine();
			question1 = new Question(question1Question, question1Answer);
			
			System.out.print("What is the second question?");
			question2Question = scan.nextLine();
			System.out.print("What is the answer to this question?");
			question2Answer = scan.nextLine();
			question2 = new Question(question2Question, question2Answer);
			
			System.out.print("What is the third question?");
			question3Question = scan.nextLine();
			System.out.print("What is the answer to this question?");
			question3Answer = scan.nextLine();
			question3 = new Question(question3Question, question3Answer);
			
			System.out.print("What is the fourth question?");
			question4Question = scan.nextLine();
			System.out.print("What is the answer to this question?");
			question4Answer = scan.nextLine();
			question4 = new Question(question4Question, question4Answer);
			
			System.out.print("What is the fifth question?");
			question5Question = scan.nextLine();
			System.out.print("What is the answer to this question?");
			question5Answer = scan.nextLine();
			question5 = new Question(question5Question, question5Answer); 
			
			aQuiz.add(question1);
			aQuiz.add(question2);
			aQuiz.add(question3);
			aQuiz.add(question4);
			aQuiz.add(question5);
			
		} //end "if"
		
		else if (questionsOption.equalsIgnoreCase("file")) //if user wants to fill questions from file
		{
			Scanner inFile; //declare the input file object
			
			try 
			{
				inFile = new Scanner(new FileReader("src/groupProject/TriviaSuperheroNames.txt"));
				String line; //variable to put each line as read
				
				for(int i = 0; i <= 5; i++) 
				{
					line = inFile.nextLine(); //reading each line
					Scanner tokens = new Scanner(line); //scanner to parse data into variables
					tokens.useDelimiter("@");
					
					String currentQuestionQuestion = tokens.next(); //will read line until it sees delimiter
					String currentQuestionAnswer = tokens.next();
					Question question = new Question(currentQuestionQuestion, currentQuestionAnswer);
					
					aQuiz.add(question);
				} //end while
				
				inFile.close();
				scan.close();
				
			} //end try
			
			catch(IOException e) 
			{
				System.err.println("Error in file: " + e.toString() );		
			}
		
		} //end else if
		
		aQuiz.giveQuiz();
		System.out.println("The number of questions correct is " + aQuiz.getNumCorrect() +
				". The number of questions incorrect is " + aQuiz.getNumIncorrect());
		
	} //end main
} //end QuizShow

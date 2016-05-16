package groupProject;


// Alan Shugert
// Quiz.java

import java.util.Scanner;

public class Quiz 
{
	//instance variables
	private int maxQuestions;
	private Question[] questions;
	private int current;
	private int correct;
	private int incorrect;
	
	//constructor
	public Quiz()
	{
		maxQuestions = 25;
		questions = new Question[maxQuestions];
		current = 0;
		correct = 0;
		incorrect = 0;
	}
	
	//Scanner Object
	Scanner scanner = new Scanner(System.in);
	
	//other methods
	public void add(Question newQuestion)
	{
		//add the specified question to questions array if room is available
		if (current < maxQuestions)
		{
			//newQuestion = new Question();
			questions[current]= newQuestion;
			current++;
		}
	}
	
	public void giveQuiz()
	{
		for (int index = 0; index < current; index++)
		{
			System.out.println(questions[index].getQuestion());
			String candidateAnswer = scanner.nextLine();
			
			if (questions[index].answerCorrect(candidateAnswer))
			{
				correct++;
			}
			else
			{
				incorrect++;
			}
		}
	}
	
	public int getNumCorrect()
	{
		return correct;
	}
	
	public int getNumIncorrect()
	{
		return incorrect;
	}
}

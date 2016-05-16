//Program Name:				Question.java
//Author:					Alan Shugert
//Brief Description:		This class represents a question that will be used with
//							the classes Quiz and QuizShow.

package groupProject;

public class Question 
{
	private String question;
	private String answer;
	
	public Question(String query, String result)//constructor. Set instance variables
	{
		question = query;
		answer = result;
	}
	
	public String getQuestion()//returns the question
	{
		return question;
	}
	
	public String getAnswer()//returns the answer to this question
	{
		return answer;
	}
	
	public boolean answerCorrect(String candidateAnswer) //returns true if the candidate answer
														 //matches the answer
	{
		if (candidateAnswer.equalsIgnoreCase(answer))
		{
			return true;
		}
		else
			return false;
	}
	
	public String toString()//returns this question and its answer as a String
	{
		return "Question: " + question + "Answer: " + answer;
	}
}

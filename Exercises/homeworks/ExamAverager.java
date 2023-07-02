package cmpe113;
import java.util.Scanner;

public class ExamAverager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This program computes the average of");
		System.out.println("a list if (nonnegative) exam scores.");
		double sum;
		int numberOfStudents;
		double next;
		String answer;
		Scanner keyboard = new Scanner(System.in);
		
		do 
		{
			System.out.println();
			System.out.println("Enter all the scores to be averaged.");
			System.out.println("Enter a negative number after");
			System.out.println("you have entered all scores.");
			sum = 0;
			numberOfStudents = 0;
			next = keyboard.nextDouble();
			while (next >= 0) 
			{
				sum = sum + next;
				numberOfStudents++;
				next = keyboard.nextDouble();
			}
			if(numberOfStudents > 0)
				System.out.println("The average is " + sum / numberOfStudents);
			else
				System.out.println("No scores to average.");
			System.out.println("Want to average another exam?");
			System.out.println("Enter yes or no");
			answer = keyboard.next();
			
		} while (answer.equalsIgnoreCase("yes"));
	
		System.out.println("Terminated!");
	}
	

}

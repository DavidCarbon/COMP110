/*
 File: AdditionQuiz.java
 Date: 9/03/2020
 Author: David Landaverde
 */
package Lab3;
import java.util.*;

public class AdditionQuiz {
	public static void main(String[] args) {
		
		//Generate three random integers [Restrict the Range of the Random Numbers]
		int randiDigit1 = 10 + (int)(Math.random() * 89);
		int randiDigit2 = 10 + (int)(Math.random() * 89);
		int randiDigit3 = 10 + (int)(Math.random() * 89);

		//Prompt user to enter the sum of three integers
		Scanner addition = new Scanner(System.in);
		System.out.print
		("What is " + randiDigit1 + " + " + randiDigit2 + " + " + randiDigit3 + " = ");
		int answer = addition.nextInt();
		
		//Check if USER inputed correct results
		if (randiDigit1 + randiDigit2 + randiDigit3 == answer) {
			System.out.println("You are Correct!");
		}
		else {
			System.out.println("You are Wrong. \nThe correct answer is displayed below");
			System.out.println
				(randiDigit1 + " + " + randiDigit2 + " + " + randiDigit3 + " = " + (randiDigit1 + randiDigit2 + randiDigit3));
		}
		addition.close();
	}
}
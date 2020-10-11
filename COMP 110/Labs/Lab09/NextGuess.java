/*
 File: NextGuess.java
 Date: 10/1/2020
 Author: David Landaverde
 */
package Lab09;
import java.util.*;

public class NextGuess {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter an integer
		System.out.print("Enter a number: ");
		long number = input.nextLong();

		// Display the square root
		System.out.println(
			"The approximated square root of " + number + " is: " + sqrt(number));
		input.close();
	}
	
	/** Method squrt approximates the square root of n */
	public static double sqrt(long n) {
		// Initial guess to positive value
		long lastGuess = 1;
		long nextGuess = (lastGuess + n / lastGuess) / 2; 

		// If the difference between nextGuess and lastGuess is less than 0.0001,
		// Return nextGuess as the approximated square root of n.
		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}
}
/*
 File: CheckPassword.java
 Date: 10/1/2020
 Author: David Landaverde
 */
package Lab9;
import java.util.*;

public class CheckPassword {
	  public static void main(String[] args) {
	    // Prompt the user to enter a password
		Scanner input = new Scanner(System.in);
	    System.out.println("Square root of 12 is " + sqrt(12));
	    System.out.println("Square root of 4 is " + sqrt(4));
	    System.out.println(" ");
	    System.out.print("Enter a string for password: ");
	    
	    String password = input.nextLine();

	    if (isValidPassword(password)) {
	      System.out.println("Valid password");
	    }
	    else {
	      System.out.println("Invalid password");
	    }
	    input.close();
	  }

		/** Method isPasswordVaild tests whether a string is a valid password */
		public static boolean isValidPassword(String password) {
			final int LENGTH_OF_VALID_PASSWORD = 8;	// Valid length of password
			final int MINIMUM_NUMBER_OF_DIGITS = 2;	// Minimum digits it must contain

			boolean validPassword = 
				isLengthValid(password, LENGTH_OF_VALID_PASSWORD) && 
				isOnlyLettersAndDigits(password) &&
				hasNDigits(password, MINIMUM_NUMBER_OF_DIGITS);

			return validPassword;
		}

		/** Method isLengthValid tests whether a string is a valid length */
		public static boolean isLengthValid(String password, int validLength) {
			return password.length() >= validLength;
		}

		/** Method isOnlyLettersAndDigits tests if a string contains only letters
		 and digits */
		public static boolean isOnlyLettersAndDigits(String password) {
			for (int i = 0; i < password.length(); i++) {
				if (!Character.isLetterOrDigit(password.charAt(i))) {
					return false;
				}
			}
			return true;
		}

		/** Method has "n" Digits tests if a string contains at least n digits */
		public static boolean hasNDigits(String password, int n) {
			int numberOfDigits = 0;
			for (int i = 0; i < password.length(); i++) {
				if (Character.isDigit(password.charAt(i))) {
					numberOfDigits++;
				}
				if (numberOfDigits >= n) {
					return true;
				}
			}
			return false;
		}

		/** Method sqrt approximates the square root of n */
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

/*
 File: Count.java
 Date: 10/13/2020
 Author: David Landaverde
 */
package Lab11;

public class Count {
	/** Main Method */
	public static void main(String[] args) {
		// Array of ten integers
		int[] counts = new int[10]; 

		// Store the counts of 100 random numbers
		for (int i = 1; i <= 100; i++) {
			counts[(int)(Math.random() * 10)]++;
		}

		// Display the results
		System.out.println("Count for each number between 0 and 9:");
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + "s: " + counts[i]);
		}
	}
}

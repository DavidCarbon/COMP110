/*
 File: Shipping.java
 Date: 9/15/2020
 Author: David Landaverde
 */
package Lab5;
import java.util.*;

public class Shipping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the weight of the package
		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();

		// Calculate cost of shipping
		if (weight > 20)
			System.out.println("The package cannot be shipped. \nThe Package MUST Weight under 20 pounds.");
		else if (weight <= 0)
			System.out.println("Invalid Weight. \nPlease Check your Input Again");
		else
		{
			double cost; 
			if (weight > 0 && weight <= 1)
				cost = 3.5;
			else if (weight > 1 && weight <= 3)
				cost = 5.5;
			else if (weight > 3 && weight <= 10)
				cost = 8.5;
			else
				cost = 10.5;
			
			System.out.println("Shipping cost of package is $" + cost);
			// Professor Confirmed saying "fixed shipping cost"
			//System.out.println("Shipping cost of package is $" + cost * weight);
		}
		input.close();
	}
}
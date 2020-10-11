/*
 File: CostOfDriving.java
 Date: 9/1/2020
 Author: David Landaverde
 */
package Lab02;
import java.util.*;
public class CostOfDrivingALT {

	public static void main(String[] args) {
		
		//DRIVING DISTANCE INPUTS
		System.out.println("Enter the driving distance:");
			//Initialise USER INPUT
		Scanner distance = new Scanner(System.in);
		double d = distance.nextDouble();
		
		//MILES PER GALLON INPUTS
		System.out.println("Enter miles per gallon:");
		Scanner gallons = new Scanner(System.in);
		double miles = gallons.nextDouble();
		
		//CALCULATE THE MPG
			//GOTTA LOVE MATH RIGHT? (Big No, From Me)
		double mpg;
		mpg = (d/miles);
		
		//PRICE PER GALLON
		System.out.println("Enter price per gallon:");
		Scanner price4Gas = new Scanner(System.in);
		double price = price4Gas.nextDouble();
		
		//CALCULATE COST OF TRIP
		double cost = Math.round(mpg*price*100.00)/100.00;
		
		//DISPLAY FINAL RESULTS
		System.out.println("The cost of driving is $" + cost);
		
		//CLOSE SCANNERS
		distance.close();
		gallons.close();
		price4Gas.close();
		
	}
}

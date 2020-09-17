/*
 File: AdditionQuiz.java
 Date: 9/03/2020
 Author: David Landaverde
 */
package Lab4;
import java.util.*;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = scnr.nextDouble();
		double b = scnr.nextDouble(); 
		double c = scnr.nextDouble();
		
		//Math Calculator
		double innerSqrt = Math.pow(b, 2) - (4*a*c);
		double x1 = (-b - Math.sqrt(innerSqrt))/(2*a);
		double x2 =	(-b + Math.sqrt(innerSqrt))/(2*a);
		
		//Check Statements
		if ( x1 < 1 || x1 > 1 )
			System.out.print("Root ONE: " + x1 +" Root TWO: " + x2);
		else
			System.out.print("Has NO Real Roots");
		scnr.close();
	}

}
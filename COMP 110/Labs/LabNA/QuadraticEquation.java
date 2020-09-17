/*
 File: QuadraticEquation.java
 Date: 8/27/2020
 Author: David Landaverde
 */
package LabNA;
import java.util.*;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = scnr.nextDouble();
		double b = scnr.nextDouble(); 
		double c = scnr.nextDouble();
		double innerSqrt = Math.pow(b, 2) - (4*a*c);
		double x1 = (-b - Math.sqrt(innerSqrt))/(2*a);
		double x2 =	(-b + Math.sqrt(innerSqrt))/(2*a);
		if ( x1 < 1 || x1 > 1 )
			System.out.print("Root one: " + x1 +" Root two: " + x2);
		else
			System.out.print("Has no real roots");
		scnr.close();
		
	}

}
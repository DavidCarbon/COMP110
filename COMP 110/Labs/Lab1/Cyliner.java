/*
 File: Cyliner.java
 Date: 8/27/2020
 Author: David Landaverde
 */
package Lab1;
import java.util.*;

public class Cyliner {
	
	public static void main(String[] args) {
		try (// USER's INPUTED NUMBS
		Scanner in = new Scanner(System.in)) {
			// RADIUS INPUT
		System.out.print("Enter the radius: ");
			// STORES RADIUS IN "MEM"
		double radius = in.nextDouble();
			// LENGTH INPUT
		System.out.print("Enter the length: ");
			// LENGTH RADIUS IN "MEM"
		double length = in.nextDouble();
		
		// Area Calculate
		double area = radius * radius * Math.PI;
		// Volume Calculate
		double volume = area * length;
		
		//Display Results
		System.out.println("Area = " + area);
		System.out.println("Volume = " + volume);
		}
	}
}
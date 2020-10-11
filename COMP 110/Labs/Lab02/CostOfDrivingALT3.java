package Lab02;
import java.util.*;
public class CostOfDrivingALT3 {

	public static void main(String[] args) {
		//Initialise Scanner
		Scanner in = new Scanner(System.in);

		//START USER INPUTS
		System.out.print("Enter the driving distace: ");
		double distance = in.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double miles = in.nextDouble();
		System.out.print("Enter price per gallon: ");
		double price = in.nextDouble();

		//CALCULATE THE COST OF DRVING
		double mpg = distance / miles;
		double cost = mpg * price;
		
		// Compute the cost of driving
		double total = Math.round(cost * 100.00) / 100.00;

		// Display result
		System.out.println("The cost of driving is $" + total);
		
		//END SCANNER
		in.close();
	}
}

/*
 File: Sum.java
 Date: 9/17/2020
 Author: David Landaverde
 */
package Lab06;

public class Sum {

	public static void main(String[] args) {
		int i = 0;
		int even = 0;
		int odd = 0;
		while (i <= 10){
		    int gen = (int)(Math.random() * 91 + 10);
		    if (gen % 2 == 0){
		        even = gen + even;
		        System.out.print(" " + gen);
		    } else {
		        odd = odd + gen;
		    	System.out.print(" " + gen);
		    }
		    System.out.printf("\n");
		    i++;
		}
		System.out.println("The sum of odd is: " + odd);
		System.out.println("The sum of even is: "+ even);

	}

}
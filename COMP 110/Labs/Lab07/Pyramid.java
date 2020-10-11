/*
 File: Pyramid.java
 Date: 9/22/2020
 Author: David Landaverde
 */
package Lab07;

public class Pyramid {

	public static void main(String[] args) {
	    //Amount of Rows
		int max = 8;
		//Display Numbers in Rows with Correct Padding
	    int padLength = (int) Math.ceil(Math.log10(Math.pow(2, max) + 1)) + 2;
	    
	    //Create Pyramid by Amount of Rows
	    for (int i = 0; i < max; i++) {
	        for (int j = 1; j < max - i; j++) {
	            System.out.print(pad(" ", padLength));
	        }
	        for (int k = 0; k <= i; k++) {
	            System.out.print(pad(Math.pow(2, k), padLength));
	        }
	        for (int k = i - 1; k >= 0; k--) {
	            System.out.print(pad(Math.pow(2, k), padLength));
	        }
	        System.out.println();
	    }
	}

	//Display Pyramid
	public static String pad(double d, int l) {
	    Integer i = (int) d;
	    return pad(i.toString(), l);
	}

	public static String pad(String s, int l) {
	    return String.format("%-" + l + "s", s);
	}
}
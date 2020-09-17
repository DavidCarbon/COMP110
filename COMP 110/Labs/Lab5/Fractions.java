/*
 File: Fractions.java
 Date: 9/15/2020
 Author: David Landaverde
 */
package Lab5;
import java.util.*;

public class Fractions {
      public static void main(String[] args){
            Scanner scnr = new Scanner(System.in);
            
            System.out.print("Enter a numerator: ");
            int num = scnr.nextInt();
            
            System.out.print("Enter a denominator: ");
            int den = scnr.nextInt();
            
            if (den == 0)
            	System.out.print("Not a Fraction. \nThe denominator cannot be a Zero");
            else if ( num > den && num % den !=0)
            	System.out.print(num + "/" + den + " is an improper fraction and its mixed fraction is " + num / den + " + " + num % den + "/" + den);
            else if ( num > den && num % den ==0)
                System.out.print( num +"/" + den + " is an improper fraction and it can be reduced to " + num / den);
            else 
                System.out.print( num + "/" + den + " is a proper fraction");
           
            scnr.close();
      }
}
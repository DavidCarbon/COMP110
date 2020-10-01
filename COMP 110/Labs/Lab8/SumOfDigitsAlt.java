/*
 File: SumOfDigits.java
 Date: 9/29/2020
 Author: David Landaverde
 */
package Lab8;
import java.util.*;

public class SumOfDigitsAlt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer to sum the digits of: ");
        long value = in.nextLong();
        System.out.println("The sum of all digits is: " + sumDigits(value));
        in.close();
    }

    public static int sumDigits(long n){
        int temp = (int)Math.abs(n);
        int sum = 0;
        
        while(temp != 0){
            sum += (temp % 10);
            temp = temp / 10;
        }

        return sum;
    }    
}
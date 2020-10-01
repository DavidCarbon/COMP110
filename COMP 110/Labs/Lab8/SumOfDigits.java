/*
 File: SumOfDigits.java
 Date: 9/29/2020
 Author: David Landaverde
 */
package Lab8;

public class SumOfDigits {
    public static void main(String[] args){
    	System.out.println("Sum of digits of 1024 is " + sumDigits(1024));
    	System.out.println("Sum of digits of 236 is " + sumDigits(236));
    }
    
    public static int sumDigits(int n){
        int temp = (int)Math.abs(n);
        int sum = 0;
        
        while(temp != 0){
            sum += (temp % 10);
            temp = temp / 10;
        }

        return sum;
    }    
}
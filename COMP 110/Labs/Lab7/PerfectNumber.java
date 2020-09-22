/*
 File: PerfectNumber.java
 Date: 9/22/2020
 Author: David Landaverde
 */
package Lab7;

public class PerfectNumber {
	   public static void main(String[] args){
		   
		      
		      for(int i=1; i<10000; i++){
		         int k=0;
		        //Iterates up to 10000
		         for (int j=1;j<i;j++){
		           //Computes to get factors and adds them to each other
		            if(i%j == 0 )
		               k+=j;
		         }
		        //If the sum of the factors is equal to "i", then it's a perfect number
		         if (k == i)
		            
		            System.out.println(i);
		      }     
		   }
		}
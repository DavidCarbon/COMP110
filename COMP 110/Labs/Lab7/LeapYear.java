/*
 File: PerfectNumber.java
 Date: 9/22/2020
 Author: David Landaverde
 */
package Lab7;

public class LeapYear {
	   public static void main(String[] args){
		     //Initializes the counter for formatting
		      int j = 0;
		      for(int i = 2001; i<=2100; i++){
		       //Checks to see if it's a leap year  
		         if(i%4==0 ){
		            System.out.printf("% d", i); 
		            j++;
		           //Checks to see if the COUNTER has reached a multiple of 10. If met, starts a new line
		            if (j%10==0){
		               System.out.print("\n");
		            } 
		         
		         }
		      }
		   }
		}
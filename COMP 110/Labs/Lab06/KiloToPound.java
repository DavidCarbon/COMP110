/*
 File: KiloToPound.java
 Date: 9/17/2020
 Author: David Landaverde
 */
package Lab06;

public class KiloToPound {

    public static void main(String[]args)
    {
     System.out.printf("%-20s%-20s\n", "Kilograms", "Pounds");
     double conversion = 2.2; 
     int kilos = 0;
     double pounds = 0.0;
     int i = 0;
     while(i <= 19.0)
      { 
        kilos++;
        i++;
        if( i % 2 == 1 )
          {
           pounds = (kilos * conversion);
           System.out.printf("%-20d%-20.2f\n", kilos, pounds);     
          }
      }
    }
  }

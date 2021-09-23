/*

-----
Write a program to print prime numbers between 10 and 99.
----

*/

import java.util.*;
public class Prg13 
{
    public static void main(String[] args)
    {
        int i = 0,n = 0;
        String  primeNumbers = "";
 
        for (i = 10; i <= 99; i++)         
        { 		  	  
           int count=0; 	  
           for(n = i; n >= 1; n--)
            {
              if(i%n == 0)
                count = count + 1;
            }
        if (count == 2)
            primeNumbers = primeNumbers + i + " ";
        }	
        System.out.println("Prime numbers from 10 to 99 are :");
        System.out.println(primeNumbers);

    }
    
}

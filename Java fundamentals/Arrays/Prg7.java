/*

--------
Write a program to remove the duplicate elements in an array and print the same.

Example: 1
I/P: { 12,34,12,45,67,89 }
O/P: { 12,34,45,67,89 }
-------

*/

import java.util.*;
import java. util. Arrays;
public class Prg7 
{
    public static void main(String[] args) 
    {
    int[] array = {12,34,12,45,67,89 };
	Arrays.sort(array);												
	System.out.print("Sorted Array : ");
    for(int i = 0; i < array.length; i++) 
    {				
        if(i != array.length-1) 
        {
            if(array[i] != array[i+1])
                System.out.print(array[i]+" ");
        }
        else
            System.out.println(array[i]);		
    }
    }	
}

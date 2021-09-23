/*

-------
Write a program to initialize an integer array and print the sum and average of the array.
-------

*/

import java.util.*;
public class Prg1
{
    public static void main(String[] args) 
    {
		int[] array = {1,6,9,8,4};
		int n,sum = 0;						
		n = array.length;
		for(int i = 0; i < n; i++) 										
			sum = sum + array[i];
		System.out.println("The sum of the array is: "+sum);
		float avg = (sum/n);											
		System.out.println("The average of the array is: "+avg);	
	}
}
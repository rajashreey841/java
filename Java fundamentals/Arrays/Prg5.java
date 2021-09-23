/*

------
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
------

*/

import java.util.*;
public class Prg5 
{
    public static void main(String[] args)
    {
        int[] array = {6,9,4,7,2};										
		for(int i = 0; i < array.length-1; i++) 
        {
			for(int j = 0; j < array.length-1; j++) 
            {
				if(array[j] > array[j+1]) 
                {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Largest two numbers are "+array[array.length-1]+", "+array[array.length-2]);
		System.out.println("Smallest two numbers are "+array[0]+", "+array[1]);
    }
    
}

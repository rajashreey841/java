/*

-------
Write a program to initialize an array and print them in a sorted order.
-------

*/


import java. util. Arrays;
public class Prg6 
{
    public static void main(String[] args) 
    {
		int[] array = {9,12,4,8,10,3,2};
		Arrays.sort(array);												
		System.out.print("Sorted Array : ");
        for (int i = 0; i < array.length; i++) 
            System.out.print(array[i]+ " ");
		
	}
}

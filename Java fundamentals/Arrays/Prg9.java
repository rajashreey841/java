/*

-------
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example : 1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example: 2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
---------

*/

import java.util.*;
public class Prg9
{
    public static void main(String[] args) 
	{
		if(args.length != 4)
			System.out.println("Please enter 4 integer numbers");
		else 
		{
			int[][] array = new int[2][2];
			int x = 0;
			for (int i = 0; i < array.length; i++)
			{
				for (int j = 0; j < array.length; j++) 
					array[i][j] = Integer.parseInt(args[x++]);
				
			}

			System.out.println("The given array is :");				
			for (int i = 0; i < array.length; i++) 
			{
				for (int j = 0; j < array.length; j++) 
				{
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
			
			System.out.println("The reverse of the array is :");
			for(int i = array.length-1; i >= 0; i--) 
			{
				for(int j = array.length-1; j >= 0; j--) 
				{
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}
    
}

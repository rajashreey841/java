/*

-------
Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
Example: 1  If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example: 2 If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
-------

*/

import java.util.*;
public class Prg3 
{
    public static void main(String[] args)
    {
        int[] array = {1, 4, 34, 56, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key value : ");
        int key = sc.nextInt();
		int i, flag = 0;
		
		for(i = 0; i < array.length; i++) 
        {
			if(array[i] == key) 
				flag = 1;
				break;
			
		}
		if(flag == 1) 
		    System.out.println(i+1);
		
		else 
			System.out.println("-1");
		
    }
    
}

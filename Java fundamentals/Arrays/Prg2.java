/*

-------
Write a program to initialize an integer array and find the maximum and minimum value of the array.
-------

*/

import java.util.*;
public class Prg2 
{
    public static void main(String[] args)
    {
        
        int[] array = {1,4,7,9,7};
        int n,min=array[0],max = array[0];
        n = array.length;
        for(int i=1;i<n;i++)
        {
            if(array[i]>max)
                max = array[i];
        }
        System.out.println("Maximum Array is : "+max);
        for(int i=1;i<n;i++)
        {
            if(array[i]<min)
                min = array[i];
        }
        System.out.println("Minimum Array is : "+min);

    }
  
}

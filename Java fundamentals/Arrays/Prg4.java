/*

------
Initialize an integer array with ascii values and print the corresponding character values in a single row.
------

*/

import java.util.*;
public class Prg4 
{
    public static void main(String[] args)
    {
        int[] array = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};
        int i,n = array.length;
        for(i = 0;i < n;i++)
        {
            System.out.print((char)array[i]+" ");

        }
    }
}

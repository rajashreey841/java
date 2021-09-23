/*

-------
Write a program to check if the program has received command line arguments or not.
If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)
Example: 1 java Example
O/P: No values

Example: 2 java Example Mumbai Bangalore
O/P: Mumbai,Bangalore

[Hint: You can use length property of an array to check its length]
--------

*/

import java.util.*;
public class Prg3 
{
    public static void main(String[] args)
    {
        if(args.length == 0)
            System.out.println("no Value");
        else
            for(String i:args)
                System.out.print(i+",");    
    }
}

/*

-------
Write a program to print * Floyds format (using for and while loop).
*
* *
* * *

Example : 1
C:\>java Prg16
O/p:Please enter the integer number

Example : 2
C:\>java Prg16 3
O/p: *
     * *
     * * *
--------

*/

import java.util.*;
public class Prg16 
{
    public static void main(String[] args)
    {
        int i,j,n=0;
        if(args.length >= 1) 
        {
            n = Integer.parseInt(args[0]);
        }
        else
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        n = sc.nextInt();
        }
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        System.out.println();       
        }
        
    }
    
}

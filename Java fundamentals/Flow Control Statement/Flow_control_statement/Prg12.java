/*

--------
Write a program to check if a given number is prime are not.
--------

*/

import java.util.*;
public class Prg12 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,m=0,flag=0;
        System.out.println("Enter the number to check prime are not");
        int n = sc.nextInt();
        m = n/2;
        for (i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                System.out.println("The number is not a prime");
                flag= 1;
                break;
            }
        }
        if (flag==0)
            System.out.println("The number is prime number");

    }
    
}

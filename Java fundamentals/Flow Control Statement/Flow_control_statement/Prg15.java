/*

------
Write a program to print the sum of all the digits of the give number.

Example :1 
I/p:1234
O/p:10
------

*/

import java.util.*;
public class Prg15 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int n = sc.nextInt();
        int rev = 0,sum = 0;
        while(n>0)
        {
            rev = n%10;
            sum = sum+rev;
            n = n/10;

        }
        System.out.println("Sum = "+sum);

    }
    
}

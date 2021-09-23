/*

------
Write a program to reverse a give number and print.

Example :1
I/p:1234
O/p:4321
------

*/

import java.util.*;
public class Prg17 
{
    public static void main(String[] args)
    {
        int n,rev,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        n = sc.nextInt();
        while(n>0)
        {
            rev = n%10;
            sum = sum*10+rev;
            n = n/10;
        }
        System.out.println("Output : "+sum);

    }
    
}

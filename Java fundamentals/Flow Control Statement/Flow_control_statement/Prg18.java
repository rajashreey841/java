/*

------
write a java program to find the give number is palindrome or not .

Example :1
C:\>java Prg18 110011
O/p:110011 is a palindrome

Example : 2
C:\>java Prg18 1234
O/p:1234 is not a palindrome
-------

*/

import java.util.*;
public class Prg18 
{
    public static void main(String[] args)
    {
        int rev,rem,sum=0,n=0;
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
        rem = n;
        while(n>0)
        {
            rev = n%10;
            sum = sum*10+rev;
            n = n/10;
        }
        if (rem==sum)
            System.out.println(rem+" is a palindrom");
        else
            System.out.println(rem+" is not a palindrom");

    }
    
}


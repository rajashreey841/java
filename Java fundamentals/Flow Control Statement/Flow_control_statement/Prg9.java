/*
--------

Write a program to receive a number and print the corresponding month name.
Example : 1
C:\>java Prg9 12
0/p Excepted : December
Example : 2
C:\>java Prg9 
0/p Excepted : Please enter the month in numbers
Example : 3
C:\>java Prg9 15
0/p Excepted : Invalid month

--------
*/

import java.util.*;
public class Prg9
{
    public static void main(String[] args)
    {
        if(args.length==0)
            System.out.println("Expected:Please enter the month in numbers");
        else
        {
            int var = Integer.parseInt(args[0]);
            switch (var)
            {
                case 1:
                System.out.println("January");
                break;
                case 2:
                System.out.println("February");
                break;
                case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("April");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                break;
                case 7:
                System.out.println("July");
                break;
                case 8:
                System.out.println("August");
                break;
                case 9:
                System.out.println("September");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("November");
                break;
                case 12:
                System.out.println("December");
                break;
                default:
                System.out.println("Invalid month");
                break;


            }
        }
    }
}
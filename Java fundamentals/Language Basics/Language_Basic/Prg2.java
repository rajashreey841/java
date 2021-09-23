/*
-----
Write a Program to accept a String as a command line argument and print a Welcome message as given below.
Example
C:\> java Prg2 John
O/P Expected : Welcome John
-----
*/

public class Prg2 
{
    public static void main(String[] args)
    {
        System.out.print("Welcome " );
        System.out.print(args[0] + " " );
    }
}

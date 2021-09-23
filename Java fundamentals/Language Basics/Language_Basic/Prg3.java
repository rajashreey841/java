/*
-----
Write a java program to accept two integers as command line arguments and print the sum of the two numbers.
Example
C:\> java Prg3 10 20
O/P Expected : The sum of 10 and 20 is 30
-----
*/

public class Prg3 
{
    public static void main(String[ ] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b; 
        System.out.print("The sum of 10 and 20 is " + sum);
        
    }
}

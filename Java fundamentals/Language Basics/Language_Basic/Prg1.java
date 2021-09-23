/*
-----
Question 1: Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
Example 1:
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

Example 2:
If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai.
-----
*/

public class Prg1 
{
    public static void main(String[ ] args) 
    {
        System.out.print(args[0] + " " );
        System.out.print("Technologies " );
        System.out.println(args[1] + " " );
        
    }
}
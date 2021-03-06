/*

-----------
Write a program to receive an integer number as a command line argument, and print the binary, octal and hexadecimal equivalent of the given number.
Sample Output:
java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
-----------

*/

import java.util.*;
public class Prg2 
{

	public static void main(String[] args) 
    {
        int num;
        if(args.length >= 1) 
        {
            num = Integer.parseInt(args[0]);
        }
        else
        {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the integer : ");
            num = sc.nextInt();
        }
        System.out.println("Given Number :" + num);		
        System.out.println("Binary equivalent :" + Integer.toBinaryString(num));
        System.out.println("Octal equivalent :" + Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(num));
            

	}

}
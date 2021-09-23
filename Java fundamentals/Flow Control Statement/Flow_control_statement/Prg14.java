/*

-----
write a java program to find if the given number is prime or not.
Example 1:
C:\>java Prg14
o/p:Please enter an integer number

Example 2:
C:\>java Prg14 0
o/p:0 is either prime or composite

Example 3:
C:\>java Prg14 10 
o/p:10 is not a prime number 

Example 4:
C:\>java Prg14 7
o/p:7 is a prime number 
-----

*/

import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Prg14 
{
    public static void main(String[] args) 
    {
		int num = 0;
        if(args.length >= 1) 
        {
            num = Integer.parseInt(args[0]);
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter an integer number ");
            num = sc.nextInt();
        }
        if(num == 0 || num == 1) 
        	System.out.println(num + " is neither prime nor composite");
            
        else 
        {
        	if(isPrime(num))
                    System.out.println(num + " is a prime number");
                else
                    System.out.println(num + " is a not prime number");
        }
    }
        static boolean isPrime(int num) 
        {
            for(int i=2; i <= num/2; i++) 
            {
                if(num % i == 0)
                    return false;
            }
            return true;
	    } 
}

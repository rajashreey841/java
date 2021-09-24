/*

---------
Write a java program that will return the first half of the string, if the length of the string is even.
It should return null for odd length string.

Example :1)
i/p:TomCat
o/p:Tom

Example :2)
i/p:Apron
o/p:null
---------

*/

import java.util.*;
public class Prg4 
{
    static String firstHalf(String str) 
    {
		if(str.length() % 2 == 0)
			return str.substring(0, str.length()/2);
		else 
			return "null";
	}
	
	public static void main(String[] args) 
    {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.println(firstHalf(str));
	}
    
}

/*

--------
Given two strings, a and b, print a new string which is made of the following combination-first 
character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
---------

*/

import java.util.*;
public class Prg9 
{
    static String mergeStrings(String str1, String str2) 
    {
		String bigStr = str1.length() > str2.length() ? str1 : str2;
		String smallStr = str1.length() < str2.length() ? str1 : str2;
		String outStr = "";

		for (int i = 0; i < smallStr.length(); i++) 
        {
			outStr += str1.charAt(i);
			outStr += str2.charAt(i);
		}
		
		outStr += bigStr.substring(smallStr.length(), bigStr.length());
		
		return outStr;
	}
	
	public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String a = scan.nextLine();
		System.out.print("Enter the 2nd string: ");
		String b = scan.nextLine();
		
		System.out.print(mergeStrings(a, b));
	}
    
}

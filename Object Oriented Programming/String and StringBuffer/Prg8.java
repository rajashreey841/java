/*

--------
Write a Java program that accepts a string (with * in it). The program should return a new string 
in which the following characters are removed-*, the characters that are to the left and right of *
Example :1)
i/p:ab*cd
o/p:ad
---------

*/

import java.util.*;
public class Prg8 
{
    static String removeStar(String str)
    {
        int len = str.length();
        String resultString = "";
        for (int i = 0; i < len; i++) 
        {
            if (i == 0 && str.charAt(i) != '*')
            resultString += str.charAt(i);
            if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
            resultString += str.charAt(i);
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
            resultString = resultString.substring(0,resultString.length()-1);
        }
        return resultString;
    }
public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(removeStar(str));
	}
    
}

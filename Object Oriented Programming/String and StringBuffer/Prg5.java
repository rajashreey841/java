/*

-------
Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example :1)
i/p:Suman
o/p:uma
--------

*/

import java.util.*;
public class Prg5
{
    static String newString(String str)
    {
        String str1 = str.substring(1,str.length()-1); 
        return str1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(newString(str));
    }
}
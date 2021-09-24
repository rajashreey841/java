/*

-------
Given 2 strings, a and b, return a new string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
If input is "hi" and "hello", then output will be "hihellohi".
--------

*/

import java.util.*;
public class Prg6 
{
    static String shortLongShort(String str1, String str2) 
    {
        if(str1.length() < str2.length())
            return str1 + str2 + str1;
        else
            return str2 + str1 + str2;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.println(shortLongShort(str1, str2));
    }

}

/*

------------
Write a java program that will concatenate 2 strings and return the result. 
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example: 1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example: 2)
i/p:Mark,kate
o/p:markate
------------

*/

import java.util.*;
public class Prg2 
{

        static String combin(String str1, String str2) 
        {
            String s = "";
            if (str1.charAt(str1.length()-1) == str2.charAt(0))
                s = str1.substring(0, str1.length()-1) + str2;
            else
                s = str1 +" " + str2;
            
            return s.toLowerCase();
        }
        
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Frist string: ");
            String str1 = sc.nextLine();
            System.out.print("Enter the Second string: ");
            String str2 = sc.nextLine();
            System.out.println(combin(str1, str2));
        }
    

}

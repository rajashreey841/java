/*

-------
Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 
Example1)
i/p:Wipro,3
o/p:propropro
---------

*/


import java.util.*;
public class Prg10 
{
    static String lastRepeat(String str,int n)
    {
        String str1 = str.substring(str.length()-n);
        String str2 = "";
        for (int i =0;i<n;i++)
        {
            str2 += str1;
        }
        return str2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(lastRepeat(str,n));

    }
    
}

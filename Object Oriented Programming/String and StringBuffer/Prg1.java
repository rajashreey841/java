/*

---------
Write a Program to check whether a given String is Palindrome or not.
--------

*/

import java.util.*;
public class Prg1
{
    public static void main(String[] args) 
    {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
        boolean flag = true;
        int len = str.length(); 
          
        for(int i = 0; i < len/2; i++)
        {  
            if(str.charAt(i) != str.charAt(len-i-1))
            {  
                flag = false;  
                break;  
            }  
        }
        if(flag)  
            System.out.println("Given string is palindrome");  
        else  
            System.out.println("Given string is not a palindrome");  


    }
}
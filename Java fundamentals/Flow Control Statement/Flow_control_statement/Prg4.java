/* 
-------
Initialize two character variable in a program and display the character in alphabetical order.
Example if the first character is 's' and second character is 'e' then output should be e,s 
--------
*/


import java.util.*;  
public class Prg4 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the First Character: ");  
        char var1 = sc.next().charAt(0);
        System.out.print("Enter the Second Character: ");  
        char var2 = sc.next().charAt(0);   
        if (var1 > var2)
            System.out.println(var2+","+var1);
        else
            System.out.println(var1+","+var2);
    }
    
}

/*
-----

Initialize a character variable with an alphabet in a program.
If the character value is in lowercase,the output should be displayed in uppercase in the following format.

Example : 1
i/p:a
o/p:a->A

If the character value is in uppercase,the output should be displayed in lowercase in the following format.

Example : 2
i/p:A
o/p:A->a

------
*/

import java.util.*;
public class Prg7 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character:");
        char var = sc.next().charAt(0);
        if(var >='A' && var <='Z')
            System.out.println(var+"->"+Character.toLowerCase(var));
        else if(var >='a' && var <='z')
            System.out.println(var+"->"+Character.toUpperCase(var));
    }
    
}

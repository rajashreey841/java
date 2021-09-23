/*
------
Initialize a character variable in a program and 
print 'Alphabet' if the initialized value in an alphabet ,
print 'digit' if the initialized value in a number ,and
print 'Special character ' if the initialized value is anything else.
------
*/


import java.util.*;
public class Prg5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character:\t");
        char var = sc.next().charAt(0);
        if(var >= 48 && var <= 57)
            System.out.println("Digits");
        else if((var >= 'a' && var <= 'b')||(var >= 'A' && var <= 'Z'))
            System.out.println("Alphabet");
        else
            System.out.println("Special Character");
    }    
}

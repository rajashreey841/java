/*

-----
Write a program to check if a given integer number is Positive, Negative, or Zero.
------

*/

import java.util.*;  
public class Prg1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter number ");  
        int i = sc.nextInt(); 
        if(i > 0)
            System.out.println(" positive ");
        else if(i < 0)
            System.out.println(" negtive");
        else
            System.out.println(" Zero");
       
    }
    
}


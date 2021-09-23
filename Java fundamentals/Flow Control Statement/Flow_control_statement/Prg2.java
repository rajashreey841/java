/*

-------
Write a program to check if a given integer number is odd or even.
-------

*/

import java.util.*;  
public class Prg2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter number ");  
        int i = sc.nextInt(); 
        if(i%2 == 0)
            System.out.println("Even ");
        else 
            System.out.println(" odd ");
    }
}    
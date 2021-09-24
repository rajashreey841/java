/*

-------
Given a string, if the first or last chars are 'x', return the string without those 'x' chars,otherwise return the string unchanged. 
If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
--------

*/


import java.util.*;
public class Prg7 
{
    static String changeX(String str)
    {
        if (str.charAt(0)=='x' && str.charAt(str.length()-1)=='x')
            return str.substring(1,str.length()-1); 
        else
            return str;
    }    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(changeX(str));
    }
    
}

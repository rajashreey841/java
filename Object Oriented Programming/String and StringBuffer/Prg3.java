/*

----------
Given a string, return a new string made of 'n' copies of the first 2 chars of the original string 
where 'n' is the length of the string.

Example:1)
i/p:Wipro
o/p:WiWiWiWiWi
-----------

*/

/*import java.util.*;
public class Prg3 
{
    static String copyS(String str)
    {
        String s = str.substring(0,3);
        String s1 = "";
        for (int i =0;i<str.length();i++)
        {
            s1 += s;

        }
        return s1;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String");
        String str = sc.nextLine();
        System.out.print(copyS(str));

    }
    
}
*/
import java.util.Scanner;

public class Prg3 
{

	static String copyS(String str) 
    {
		String a = str.substring(0, 2);				
		String b = "";
		
		for (int i = 0; i < str.length(); i++) 
        {
			b += a;
		}
		return b;
	}
	
	public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		System.out.println(copyS(str));
	}

}


// Print the ASCII value of the character inputted by user.

import java.util.Scanner;
class P2
{
        public static void  main (String args[])

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character : ");
		char ch = sc.next().charAt(0);
		
		int ascii = (int) ch;
		System.out.println("The Ascii value of '"+ ch + "' is " + ascii );
	}
}
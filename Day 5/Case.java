// wap to chek whether a character is in lower or upper case.

import java.util.Scanner;
class Case
{
	public static void main(String args[])

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);

		System.out.println( ch >=97 && ch<=122?" lower case : "+ch:"upper case");
		
	}	
}
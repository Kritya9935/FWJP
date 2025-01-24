//Write a program to add 32 to the ASCII value of a character and print the equivalent character
import java.util.Scanner;
class P3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character : ");
		char ch = sc.next().charAt(0);
		int ascii = (int) ch;
		int res = 32 + ascii;
	 	char ch1 = (char) res;
		System.out.println("the equivalent character is : "+ch1);   
		
	}
}
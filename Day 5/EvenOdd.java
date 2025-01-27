//Wap to check whether a number is even or odd.

import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		String result = num%2==0?"even":"odd";
		System.out.println("given number is : "+result);

	}
}
// Wap to check whether a number is negative or positive or zero.

import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		
		String result = num>0?"positive":num<0?"negative":"zero";
		System.out.println("given number is  :"+result);
	}
}
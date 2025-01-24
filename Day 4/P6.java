//Write a program to assign a value of 100.235 to a double variable and then convert it to int.

import java.util.Scanner;
class P6
{
	public static void main(String args[])
	{
		//double a = 100.235;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the double value : ");
		double a = sc.nextDouble();
		int b = (int) a;
		System.out.println("the coverted value from double to integer : "+b);
		
		
	}

}


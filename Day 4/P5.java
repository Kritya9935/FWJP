// Write a program to find the square of the double number.
import java.util.Scanner;
class P5 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value(double value) : ");
		double a = sc.nextDouble();
		double res = a*a;
		System.out.println("The square of the double number :"+res);
	}

}
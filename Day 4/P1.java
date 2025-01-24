//Write a program to print the area of a rectangle.
import java.util.Scanner;
class P1
{
	public static void main(String args[])
	{
 		int l ;
		int w ;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the length = ");
		l=sc1.nextInt();
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the width = ");
		w=sc1.nextInt();
		int area = l*w;
		System.out.println("Area of rectangle :"+area);
	}
}
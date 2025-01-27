//wap to chek whether an year is leap or not?

import java.util.Scanner;
class Leapyear
{
public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Year : ");
		int year = sc.nextInt();
		System.out.println(year%4==0? "leap year" : "not leap year");
	}
}
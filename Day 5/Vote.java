//wap to chek if a person is eligible to vote or not.

import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter the age :");
		int a = sc.nextInt();
	
		System.out.println(a>18?"eligible for vote " : " not eligible");
	}
}
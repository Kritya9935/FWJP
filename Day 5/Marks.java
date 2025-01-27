// Wap to print pass or fail according to marks.

import java.util.Scanner;
class Marks

{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks : ");
		int marks = sc.nextInt();
		System.out.println("enter the totalmarks : ");
		int totalmarks = sc.nextInt();
		int percentage = (marks*100)/totalmarks;
		

		String result = percentage>=33?"pass":"fail";
		System.out.println("student is : "+result);
	}
}
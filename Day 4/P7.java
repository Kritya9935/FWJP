//write a program to find the percentage of marks. Input marks and total marks.

import java.util.Scanner;
class P7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Gained marks : ");
		int marks = sc.nextInt();
		System.out.println("enter the Total marks : ");
		int Totalmarks = sc.nextInt();
		int per = (marks*100)/Totalmarks;
		System.out.println("The percentage of marks : "+per);
		
	}
}
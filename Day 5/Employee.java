//wap to chek the experience of an employee , if exp is greater than 20 ,bonus = 20% salary else calculate bonus = 10% of salary.

import java.util.Scanner;
class Employee
{
 public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the experience : ");
		int experience = sc.nextInt();
		System.out.println("enter the salary :");
		int salary = sc.nextInt();
		int bonus1 = (20*salary)/100;
		int bonus2 = (10*salary)/100;


		System.out.println(experience>20? "bonus : "+bonus1 : "bonus : " +bonus2);
	}
}
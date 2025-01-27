import java.util.Scanner;
class RelationalDemo
{
public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("enter two values : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("A is grater than B : "+(a>b));
		System.out.println("A is grater than equals to B : "+(a>=b));
		System.out.println("A is less than B : "+(a<b));
		System.out.println("A is less than equal to  B : "+(a<=b));
		System.out.println("A is equals to B : "+(a==b));
		System.out.println("A is not equals to B : "+(a!=b));
	}
}
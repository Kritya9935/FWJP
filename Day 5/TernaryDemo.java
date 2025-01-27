import java.util.Scanner;
class TernaryDemo

{
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers : ");
		int a = sc.nextInt();
		int b =sc.nextInt();
		System.out.println(a>b?"a is greater": "b is greater ");		int result = a>b ? a-b : b-a;
		System.out.println("result :"+result);
	}

}
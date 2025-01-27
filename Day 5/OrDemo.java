import java.util.Scanner;
class OrDemo
{
public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);	
		
		System.out.println("enter a character :");

		//chek whether this char is in lower case or upper case 
		//ascii range for lower case : 97-122
		boolean lower = ch >=97 && ch<=122;
System.out.println(ch+" is in upper case : "+lower);
		boolean upper = ch >=65 && ch<=90;
System.out.println(ch+" is in upper case : "+lower);

		// chek if it is an alphabet or not 

		boolean result = lower || upper;
		System.out.println(ch+" is an alphabet or not : "+result);
	}
}
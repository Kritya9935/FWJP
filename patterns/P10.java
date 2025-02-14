import java.util.Scanner;

class P10 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	System.out.println("enter no : ");
	int rows =  sc.nextInt();
        
        for(int i=1;i<=rows;i++)
	{
	  for(int j=1;j<=9;j++)
	  {
		if(j>=6-i && j<=4+i)
		{ System.out.print("*");}
		else
		{System.out.print(" ");}
	  }
	System.out.println();
	}
    }


}
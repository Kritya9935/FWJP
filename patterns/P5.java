import java.util.Scanner;

class P5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	System.out.println("enter no : ");
	int rows =  sc.nextInt();

	 for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
         for (int i = 1; i <= rows-1; i++) {
           
            for (int j = i; j <= rows-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

	
	
    }


}
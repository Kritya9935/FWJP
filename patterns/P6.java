import java.util.Scanner;

class P6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	System.out.println("enter no : ");
	int rows =  sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
           
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

	 for (int i = 2; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }


}
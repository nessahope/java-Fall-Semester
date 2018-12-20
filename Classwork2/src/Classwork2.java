import java.util.Scanner;

public class Classwork2 
{
//  public static void main(String[] args)
//  {
//	 int x;
//	 int prev;
//	 int next;
//	 
//	 Scanner in = new Scanner(System.in);
//	 
//	 System.out.println("Enter a number: ");
//	 x = in.nextInt();
//	 next = x + 1;
//	 System.out.println("The next value is: "+next);
//	 prev = x - 1;
//	 System.out.println("The prev value is: "+prev);
//  }
	
	public static void main(String[] args)
	{
		int x;
		int y;
		int z;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		x = in.nextInt();
		System.out.println("Enter a second number: ");
		y = in.nextInt();
		
		z = x + y;
		System.out.println("The result of the addition is: "+z);
		
		z = x - y;
		System.out.println("The result of subtraction is: "+z);
		
		z = x * y;
		System.out.println("The result of multiplication is: "+z);
		
		if(y != 0)
		{
		z = x / y;
		System.out.println("The result of division is: "+z);
		}else {
			System.out.println("0 is an invalid number");
		}
	}
}
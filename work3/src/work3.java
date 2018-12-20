import java.util.Scanner;

public class work3 
{
	public static void main(String[] args)
	{
//		int x, y, z;
//
//		Scanner in = new Scanner(System.in);
//
//		System.out.println("Enter a number: ");
//		x = in.nextInt();
//
//		System.out.println("Enter a second number: ");
//		y = in.nextInt();
//
//		if ( x > y)
//		{
//			z = x;
//			System.out.print("The larger number is "+z);
//		}else {
//			z = y;
//			System.out.println("The larger number is "+z);
//		}
		
//		int a, b, c;
//		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Enter a number: ");
//		a = in.nextInt();
//		
//		System.out.println("Enter a second number: ");
//		b = in.nextInt();
//		
//		if (a < b) {
//			c = a;
//			System.out.println("The smaller number is: "+c);
//		}else {
//			c = b;
//			System.out.println("The smaller number is: "+c);
//		}
		
		int num1, num2, num3, z, x;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num1 = in.nextInt();
		
		System.out.println("Enter a second number: ");
		num2 = in.nextInt();
		
		System.out.println("Enter a third number: ");
		num3 = in.nextInt();
		
		if (num1 > num2) {
			z = num1;
		} else {
			z = num2;
		} if (num3 > z) {
			z = num3;
		}
		if (num1 < num2) {
			x = num1;
		} else {
			x = num2;
		} if (num3 < z) {
			x = num3;
		}
			System.out.println("The largest number is: "+z);
			System.out.println("The smallest number is: "+x);
		
	} //closes main method
	
} //closes main class
import java.util.Scanner;

public class Classwork3 
{
	public static void main(String[] args)
	{
		int x, y, z;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		x = in.nextInt();

		System.out.println("Enter a second number: ");
		y = in.nextInt();

		if ( x > y)
		{
			z = x;
			System.out.print("The larger number is "+z);
		}else {
			z = y;
			System.out.println("The larger number is "+z);
		}
	}
}
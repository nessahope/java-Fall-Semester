import java.util.Scanner;


public class Hello 
{
    public static void main(String[] args)
    {
    	int Num1 = 0;
    	double Num2 = 0.0, Num3 = 0.0;
    
    	Scanner in = new Scanner(System.in);
    	System.out.println("Please enter your first number:");
    	Num1 = in.nextInt();
    	
    	System.out.println("Please enter your second number: ");
    	Num2 = in.nextInt();
    	
    	Num3 = Num1 + Num2;
    	System.out.println(Num3);
    }
}
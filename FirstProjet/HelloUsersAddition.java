import java.util.Scanner;


public class HelloUsersAddition 
{
    public static void main(String[] args)
    {
    	int Num1 = 0;
    	double Num2 = 0.0;
    	char operator;
    
    	Scanner in = new Scanner(System.in);
    	System.out.println("Please enter your first number:");
    	Num1 = in.nextInt();
    	
    	System.out.println("Please enter your second number: ");
    	Num2 = in.nextInt();
    	
    	System.out.println("Which operator would you like to apply? (+,-,*,/)");
    	operator = in.next().charAt(0);
    	double addition = Num1+Num2;
    	double subtraction = Num1-Num2;
    	double multiplication = Num1*Num2;
    	double division = Num1/Num2;
    	
    	switch(operator) {
    	
    	case '+' : {
    		System.out.println("Total addition: "+addition);
    		break;
    	}
    	case '-' :{
    		System.out.println("Total subtraction: "+subtraction);
    		break;
    	}
    	case '*' :{
    		System.out.println("Total multiplication: "+multiplication);
    		break;
    	}
    	case '/' :{
    		System.out.println("Total division: "+division);
    		break;
    	}
    	default :{
    		System.out.println("Invalid operator. Try again");
    		return;
    	}
    	}
    
    }
}
package labswitch1;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		int a1 = 0; 
		
		Scanner in = new Scanner(System.in);
		
		
		
			System.out.println("Enter a number between 1 and 12 or 0 to quit: ");
			a1 = in.nextInt(); 
			
		while (a1 != 0);
		
			switch(a1) {

			case 1 :
				System.out.println("The first month is January.");
				break;
			
			case 2 :
				System.out.println("The second month is February.");
				break;
			
			case 3 :
				System.out.println("The third month is March.");
				break;
			
			case 4 :
				System.out.println("The fourth month is April.");
				break;
				
			case 5 :
				System.out.println("The fifth month is May.");
				break;
			
			case 6 :
				System.out.println("The sixth month is June.");
				break;
			
			case 7 :
				System.out.println("The seventh month is July.");
				break;
			
			case 8 :
				System.out.println("The eight month is August.");
				break;
			
			case 9 :
				System.out.println("The ninth month is September.");
				break;
			
			case 10 :
				System.out.println("The tenth month is October.");
				break;
			
			case 11 :
				System.out.println("The eleventh month is November.");
				break;
			
			case 12 :
				System.out.println("The twelfth month is December.");
				break;
			
			case 0 :
				System.out.println("Quitting" );
				break;
				
			default :
				System.out.println("Wrong value. Enter a number between 1 to 12.");
				return;
	}

}
}
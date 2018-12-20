package selectorsreview;

import java.util.Scanner;

public class conditonal {
	public static void main(String[] args) {
		
		int a;
		String s;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number: ");
		a = input.nextInt();
		
			//CONDITIONAL
		
		s = (a%2==0) ? "even" : "odd";
		System.out.println(a + " Is an " +s+ " number.");
	}
	
}

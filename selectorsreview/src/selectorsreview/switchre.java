package selectorsreview;

import java.util.Scanner;

public class switchre {

	public static void main(String[] args) {
	
		
		int remainder;
		int y;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		y = in.nextInt();
		
		remainder = y%2;
		
			//SWITCH
		
		switch (remainder) {
		
		case 1 :
			
			System.out.println(y + " Is an odd number.");
			break;
			
		case 0 :
			
			System.out.println(y + " Is an even number.");
			break;			
		} //switch close
	}

}

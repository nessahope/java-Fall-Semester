/*Vanessa L'Esperance
 October 4, 2018
 Selectors Review
 */
import java.util.Scanner;

public class selectorsreview {

	public static void main(String[] args) {
		
		int x;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		x = in.nextInt();
		
		//IF ELSE

if (x%2==0) {
			System.out.println(x + " Is an even number.");
} else {
		System.out.println(x +" Is an odd number.");
}		
		
		} //arg close
	} //class close
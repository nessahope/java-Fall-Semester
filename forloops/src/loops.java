/*Vanessa L'Esperance
 October 4, 2018
 For Loops Review
 */


public class loops {
	public static void main(String[] args) {
		int x;
		int y = 0;
		
		//PRINTS all EVEN numbers less than 100
		for (x = 2; x <=100; x += 2) {
		
			//System.out.println("All even numbers less than 100: "+ x);
		}
		
		//PRINTS all EVEN numbers with %2
		for (int i = 0 ; i <= 100 ; i++) {
			if (i%2 == 0) {
				System.out.print("All even numbers less than 100: " + i );
	
			}else {
				System.out.println("\t All odd numbers less than 100: " + i);
			}
		}
		
		
		//PRINTS all ODD numbers less than 100
		for (x = 1; x <=100 ; x += 2) {
			
			//System.out.println("All odd numbers less than 100: " + x);
		}
		
	} //arg close
} //class close
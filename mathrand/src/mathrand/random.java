/*Vanessa L'Esperance
 October 4, 2018
 Random Generator
 */

package mathrand;



public class random {

	public static void main(String[] args) {
	
		int sum = 0;
		int avg;
			
			for (int i = 0; i <= 5; i++) {
				int randNum = (int) (Math.random()*100)+1;
				
				System.out.println("[" + i + "]");
				System.out.println("Random number: " + randNum);
				
			
				
		 
		 avg = sum / i;
		 //System.out.print();
		}
		//System.out.print(avg);
		
	}

}

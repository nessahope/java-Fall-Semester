//Vanessa L'Esperance
//October 25, 2018
//MidTerm Exam with Questions 1, 2, 3

import java.util.Scanner;

public class MidTerm {
	
	public static void main(String[] args) {
		
//-----------Question 1 --> Write an algorithm in pseudo code
		
//		START
//		String name
//		Numeric values num, celcius, total, avg
//		Numeric array, fahrenheit
//		Print: Enter your name:
//		Read name
//		Print: Enter a number:
//		Read number
//		total = cel
//		Repeat 9 times:
//			Print: Enter another number:
//				Read num
//				Convert number to fahrenheit 
//				total = total + array
//			avg = total / array length
//		Print: name in uppercase "the temperatures are: " + print array +"the total is: " + print total+"the average is: "+the average
//		END
		
		
//-----------Qestion 2 --> Write the pseudo code in Java code with some extra steps
		
		try
		{
				String name;
		        double cel = 0, total = 0, avg;
		        int i;
		        double[] fah = new double[10];
		        double arr[] = new double[10];
		        
		       
		            Scanner in = new Scanner(System.in);
		            System.out.println("Enter your name: ");
		            name = in.nextLine();
		            
		            while (name.isEmpty()) 
		            {
		                System.out.println("Oops! You must enter a name!");
		                System.out.println("Enter your name: ");
		                name = in.nextLine();
		            }
		            
		                System.out.println("Enter a numerical vaue in Celcius: ");
		                arr[0] = in.nextDouble();
		                
		                for (i = 1; i < arr.length; i++) {
		                    System.out.println("Enter another value in Celcius: ");
		                    arr[i] = in.nextDouble();
		                }
		                
		                for(int j = 0; j<9 ; j++)
		                {
		                	  fah[j] = 32 + ((arr[j]) * (9.0/5.0));
		                	  total += arr[j];
		                }
		       
		                avg = total/arr.length;
		        
		                for(int j =0;j<9;j++)
		                {
		                	System.out.println(name.toUpperCase()+" entered these tempertures: "+arr[j]+" the fehrenheit is "+fah[j]);
		                }
		                System.out.println("\nNumber of characters in name is: "+name.length());
		                System.out.println( "\nThe total is: "+total+"\nThe average is: "+avg);
		}
		catch(Exception e)
		{
			  System.out.println("you must enter a number try again");
		}
		
		
//------------Question 3 --> a -> j
		
//-------a Use one statement to assign the sum of x and y to z, then increment x by 1 and decrement y by 1.
//		int x = 0, y = 0, z;
//		z = x++ + y--;
//		System.out.println(z);
//
//-------b Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
//		int count = 11;
//		if (count > 10) {
//			System.out.println("Count is greater than 10!");
//		}else { System.out.println("Count is less than 10!");}
//		
//-------c Use one statement to decrement the variable x by 1, then subtract it from variable total and store the result in variable total.
//		int x, total;
//		total -= x-1;
//		
//-------d Calculate the remainder after q is divided by divisor, and assign the result to q. Write this statement in two different ways.
//		int q = 0, result;
//		result = q%q;
//		result = q(q%q);				
//		
//-------e Declare variables sum and x to be of type int, and declare variable ave to be of type double
//		int sum, x;
//		double ave;
//		
//-------f Assign 10 to variable x. Assign 0 to variable sum and ave.
//		int x= 10, sum = 0;
//		double ave = 0;
//		
//-------g Add variable x to variable sum, and assign the result to variable sum. and increment x by 10
//		sum += x;
//		x += 10;
//		
//-------h Add variable x to variable sum, and assign the result to variable sum.
//		sum += x;
//		
//-------i Print "The sum is: ", followed by the value of variable sum.
//		System.out.println("The sum is: " +sum);
//		
//-------j Calculate the average and print "The average is: ", followed by the value of variable ave.
//		System.out.println("The average is: "+ave);
//
//		
	} //closes main
} //closes class
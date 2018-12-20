//Vanessa L'Esperance
//November 7, 2018
//Calcultaor and Methods lab

import java.util.Scanner;

public class Calc2 {
	
	public static double Add(double n1, double n2) {
		return n1 + n2;
	}
	
	public static double Subtract(double n1, double n2) {
		return n1 - n2;
	}
	
	public static double Divide(double n1, double n2) {
		return n1 / n2;
	}
	
	public static double Multiply(double n1, double n2) {
		return n1 * n2;
	}
	
	public static void main(String[] args) {
		int i=0, option=0;
		//create Scanner object inputValue with constructor Scanner() for user inputs
		Scanner inputValue = new Scanner(System.in);
		//double array of two dimensions to hold up to ten by two numbers from user
		double[][] arr_Two = new double [2][2];
			
		
		do {
			System.out.println("Enter the value for the option you want: ");
			System.out.println("1 for adding two values ");
			System.out.println("2 for subtracting two values ");
			System.out.println("3 for dividing two values ");
			System.out.println("4 for multiplying two values ");
			System.out.println("0 for quitting app. ");
			option = inputValue.nextInt();
			
			switch(option) {
			case 1 : {
				System.out.println("Enter the first value: ");
				arr_Two[i][0] = inputValue.nextDouble();
				System.out.println("Enter the second value: ");
				arr_Two[i][1] = inputValue.nextDouble();
				System.out.println(Add(arr_Two[i][0], arr_Two[i][1]));
				i++;
			}break;
			case 2: {
				System.out.println("Enter the first value: ");
				arr_Two[i][0] = inputValue.nextDouble();
				System.out.println("Enter the second value: ");
				arr_Two[i][1] = inputValue.nextDouble();
				System.out.println(Subtract(arr_Two[i][0], arr_Two[i][1]));
				i++;
			}break;
			case 3: {
				System.out.println("Enter the first value: ");
				arr_Two[i][0] = inputValue.nextDouble();
				System.out.println("Enter the second value: ");
				arr_Two[i][1] = inputValue.nextDouble();
				System.out.println(Divide(arr_Two[i][0], arr_Two[i][1]));
				i++;
			}break;
			case 4: {
				System.out.println("Enter the first value: ");
				arr_Two[i][0] = inputValue.nextDouble();
				System.out.println("Enter the second value: ");
				arr_Two[i][1] = inputValue.nextDouble();
					System.out.println(Multiply(arr_Two[i][0], arr_Two[i][1]));
					i++;
			}break;
			case 0 : {
				int op = 0;
				
				System.out.println("Are you sure you want to quit? Enter 0 to confirm, or other value to continue. ");
				op = inputValue.nextInt();
				if(op != 0) {
					System.out.println("You decide to continue. ");
					option = 4;
				}
				else {
					System.out.println("Bye. ");
					inputValue.close();
				}
			}break;
			default : {
				System.out.println("Enter 1,2,3,4,5 or 0 to quit! ");
			}break;
			}//end switch
		}while(option != 0);	
	}

	}//end main
//end class Calc

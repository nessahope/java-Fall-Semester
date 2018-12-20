import java.util.Scanner;

public class prep {
	
	
	public static void main(String[] args) {
//		
		//QUESTION 1
//		int i;
//		float num1 = 0, nummax = -999999, total, avg;
//		float arr[] = new float[6];
//		String name;
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter you name: ");
//		name = in.nextLine();
//		
//		System.out.println("Enter a random number: ");
//		arr[0] = in.nextFloat();
//		nummax = num1;
//		total = num1; 
//		
//		for (i=1; i<arr.length; i++) {
//			System.out.println("Enter another random number: ");
//			arr[i] = in.nextFloat();
//			if (nummax < arr[i])
//				nummax = arr[i];
//			total += arr[i];
//		}
//		avg = total/arr.length;
//		System.out.println("The biggest number "+name.toUpperCase()+" entered is: "+nummax +" and the average is: "+avg );
//		
		
//		int count = 0, ans;
//		float num = 0, nummax = -999999, nummin= 999999, total= 0, avg;
//		float arr[] = null;
//		String name;
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		name = in.nextLine();
//		
//		
		// QUESTION 2
//		System.out.println("Enter your first random number: ");
//		num = in.nextFloat();
//		nummax = num;
//		total = num;
//		nummin = num;
//		
//		do {
//			System.out.println("Enter another random number " +name+ " or 0 to quit: ");
//			num = in.nextFloat();
//			total += num;
//			count++;
//			if (num < nummin) {
//				nummin = num;
//			}
//			if (num > nummax) {
//				nummax = num;
//			}
//			avg = total/count;
//		}
//		while (num !=0.0);
//		System.out.println("The biggest number "+name.toUpperCase()+" entered is: "+ nummax + "The smallest number is: "+nummin + " and the average is: " +avg);
//	
		int option;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter 1 for Question 2: ");
			System.out.println("Enter 2 for Question 4: ");
			System.out.println("Enter 3 to quit: ");
			option = input.nextInt();
			
			switch (option) {
			
			case 1:
			{
				int i;
				float num1 = 0, nummax = -999999, total, avg;
				float arr[] = new float[6];
				String name;
				
				Scanner in = new Scanner(System.in);
				System.out.println("Enter you name: ");
				name = in.nextLine();
				
				System.out.println("Enter a random number: ");
				arr[0] = in.nextFloat();
				nummax = num1;
				total = num1; 
				
				for (i=1; i<arr.length; i++) {
					System.out.println("Enter another random number: ");
					arr[i] = in.nextFloat();
					if (nummax < arr[i])
						nummax = arr[i];
					total += arr[i];
				}
				avg = total/arr.length;
				System.out.println("The biggest number "+name.toUpperCase()+" entered is: "+nummax +" and the average is: "+avg+"\n\n" );
				
			}
			break;
			
			case 2:
			{
				int count = 0, ans;
				float num = 0, nummax = -999999, nummin= 999999, total= 0, avg;
				float arr[] = null;
				String name;
				
				Scanner in = new Scanner(System.in);
				System.out.println("Enter your name: ");
				name = in.nextLine();
				
				
				System.out.println("Enter your first random number: ");
				num = in.nextFloat();
				nummax = num;
				total = num;
				nummin = num;
				
				do {
					System.out.println("Enter another random number " +name+ " or 0 to quit: ");
					num = in.nextFloat();
					total += num;
					count++;
					if (num < nummin) {
						nummin = num;
					}
					if (num > nummax) {
						nummax = num;
					}
					avg = total/count;
				}
				while (num !=0.0);
				System.out.println("The biggest number "+name.toUpperCase()+" entered is: "+ nummax + "The smallest number is: "+nummin + " and the average is: " +avg+"\n\n");
			
			}
			break;
			
			case 3:
			{
				System.out.println("You have decided to quit!");
			}
			break;
			
			default:
			{
				System.out.println("Not a valid option!\n\n");
			}
			
			} //closes switch
		}//closes do
		while(option != 3);
		
		
	} //closes main
} //closes class
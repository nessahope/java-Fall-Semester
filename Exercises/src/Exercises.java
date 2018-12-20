
//Vanessa L'Esperance
//Exercises

import java.util.Scanner;

public class Exercises {
	public static void main(String[] args) {

//---------------------Question 1-------------------------
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double x = scan.nextDouble();
		System.out.print("Enter the Second number: ");
		double y = scan.nextDouble();
		System.out.print("Enter the third number: ");
		double z = scan.nextDouble();
		System.out.print("The smallest value is " + smallest(x, y, z) + "\n");
	}

	public static double smallest(double x, double y, double z) {
		return Math.min(Math.min(x, y), z);
	}

//---------------------Question 2-------------------------
	public Exercises() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double x = scan.nextDouble();
		System.out.print("Enter the Second number: ");
		double y = scan.nextDouble();
		System.out.print("Enter the third number: ");
		double z = scan.nextDouble();
		System.out.print("The smallest value is " + smallest(x, y, z) + "\n");
	}

	public static double average(double x, double y, double z) {
		return (x + y + z) / 3;
	}

//---------------------Question 3-------------------------
	public void Exercise3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		System.out.print("The middle character in the string is: " + middle(str) + "\n");
	}

	public static String middle(String str) {
		int position;
		int length;
		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		return str.substring(position, position + length);

	}

//---------------------Question 4-------------------------   
	public void Exercise4() {
		String str = "w3resource";
		System.out.print("Number of  Vowels in the string: " + countVowels(str) + "\n");
	}

	public int countVowels(String str1) {

		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
					|| str1.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

//---------------------Question 5------------------------- 
	public void Exercise5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();

		System.out.print("Number of words in the string: " + countWords(str) + "\n");
	}

	public static int countWords(String str) {
		int count = 0;
		if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}
			}
			count = count + 1;
		}
		return count; // returns 0 if string starts or ends with space " ".
	}

//---------------------Question 6------------------------- 
	public void Exercise6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int digits = in.nextInt();
		System.out.println("The sum is " + sumDigits(digits));
	}

	public static int sumDigits(long n) {
		int result = 0;

		while (n > 0) {
			result += n % 10;
			n /= 10;
		}

		return result;
	}

//---------------------Question 7------------------------- 
	public void Exercise7() {
		int count = 1;
		for (int i = 1; i <= 50; i++) {
			System.out.printf("%-6d", getPentagonalNumber(i));
			if (count % 10 == 0)
				System.out.println();
			count++;
		}
	}

	public static int getPentagonalNumber(int i) {

		return (i * (3 * i - 1)) / 2;
	}

//---------------------Question 8------------------------- 
	public void Exercise8() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the investment amount: ");
		double investment = scan.nextDouble();
		System.out.print("Enter the rate of interest: ");
		double rate = scan.nextDouble();
		System.out.print("Enter number of years: ");
		int year = scan.nextInt();

		rate *= 0.01;

		System.out.println("Years    FutureValue");
		for (int i = 1; i <= year; i++) {
			int formatter = 19;
			if (i >= 10)
				formatter = 18;
			System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate / 12, i));
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}

//---------------------Question 9------------------------- 
	public void Exercise9() {
		print_Chars('(', 'z', 20);
	}

	public static void print_Chars(char char1, char char2, int n) {
		for (int ctr = 1; char1 <= char2; ctr++, char1++) {
			System.out.print(char1 + " ");
			if (ctr % n == 0)
				System.out.println("");
		}
		System.out.print("\n");
	}

//---------------------Question 10------------------------- 
	public void Exercise10() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scan.nextInt();

		System.out.println(isLeapYear(year));
	}

	public static boolean isLeapYear(int y) {
		boolean a = (y % 4) == 0;
		boolean b = (y % 100) != 0;
		boolean c = ((y % 100 == 0) && (y % 400 == 0));

		return a && (b || c);
	}

//---------------------Question 11------------------------- 
	public static final int PASSWORD_LENGTH = 8;

	public void Exercise11() {
		Scanner input = new Scanner(System.in);
		System.out.print("1. A password must have at least eight characters.\n"
				+ "2. A password consists of only letters and digits.\n"
				+ "3. A password must contain at least two digits \n"
				+ "Input a password (You are agreeing to the above Terms and Conditions.): ");
		String s = input.nextLine();

		if (is_Valid_Password(s)) {
			System.out.println("Password is valid: " + s);
		} else {
			System.out.println("Not a valid password: " + s);
		}
	}

	public static boolean is_Valid_Password(String password) {
		if (password.length() < PASSWORD_LENGTH)
			return false;

		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);

			if (is_Numeric(ch))
				numCount++;
			else if (is_Letter(ch))
				charCount++;
			else
				return false;
		}
		return (charCount >= 2 && numCount >= 2);
	}

	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}

	public static boolean is_Numeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}

//---------------------Question 12------------------------- 
	public void Exercise12() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}

//---------------------Question 14------------------------- 
	public void Exercise14() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of sides: ");
		int n = input.nextInt();
		System.out.print("Input the side: ");
		double side = input.nextDouble();

		System.out.println("The area of the pentagon is " + pentagon_area(n, side));
	}

	public static double pentagon_area(int n, double s) {
		return (n * s * s) / (4 * Math.tan(Math.PI / n));
	}

//---------------------Question 15------------------------- 
	public void Exercise15() {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = (int) (totalSeconds % 60);

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = (int) (totalMinutes % 60);

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = (int) (totalHours % 24);

		long totalDays = totalHours / 24;

		// current year
		int currentYear = (int) (totalDays / 365) + 1970;

		long daysInCurrentYear = (totalDays - numberOfLeapYearsSince1970(currentYear)) % 365;
		if (currentHour > 0)
			daysInCurrentYear++; // add today

		// get current month number
		int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);

		// getting current month name
		String month = getMonthName(currentMonthNum);

		// getting day of current month
		int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);

		int startDay = getStartDay(currentYear, currentMonthNum);
		int today = (int) daysInCurrentYear - daysTillCurrentMonth;
		String dayOfWeek = dayNameOfWeek(((startDay + today) % 7));

		// Display results
		System.out.println("Current date and time: " + dayOfWeek + " " + month + " " + today + ", " + currentYear + " "
				+ currentHour + ":" + currentMinute + ":" + currentSecond);

	}

	public static String dayNameOfWeek(int dayOfWeek) {

		switch (dayOfWeek) {
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		case 1:
			return "Sunday";
		default:
			return null;
		}
	}

	public static int numberOfLeapYearsSince1970(long year) {

		int count = 0;
		for (int i = 1970; i <= year; i++) {
			if (isLeapYear(i))
				count++;
		}
		return count;
	}

	public static int getMonthFromDays(int year, int days) {
		int dayTracker = 0;
		for (int i = 1; i <= 12; i++) {

			dayTracker += getNumberOfDaysInMonth(year, i);

			if (dayTracker > days)
				return i;
		}
		return 12;
	}

	public static int getNumOfDaysToReachThatMonth(int year, int month) {
		int dayTracker = 0;
		for (int i = 1; i < month; i++) {

			dayTracker += getNumberOfDaysInMonth(year, i);

		}
		return dayTracker;
	}

	/** Get the start day of month/1/year */
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	/** Get the total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	/** Get the number of days in a month */
	public static int getNumberOfDaysInMonth(int year, int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	public static boolean is_LeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	/** Get the English name for the month 1-12 */
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}

		return monthName;
	}

	// ---------------------Question 16-------------------------
	public void Exercise16() {
		for (int i = 2; i < 100; i++) {

			if (is_Prime(i) && is_Prime(i + 2)) {
				System.out.printf("(%d, %d)\n", i, i + 2);
			}
		}
	}

	public static boolean is_Prime(long n) {

		if (n < 2)
			return false;

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0)
				return false;
		}
		return true;
	}

}

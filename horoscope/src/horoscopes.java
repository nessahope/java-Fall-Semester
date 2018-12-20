import java.util.Scanner;
import java.util.Calendar;

public class horoscopes {

	public static void main(String[] args) {
		
		int month;
		int day;
		String x, y, ans = null;
		Scanner enter=null;
		
		Scanner in = new Scanner(System.in);
		
		
			do {
				try {
					
				System.out.println("Enter your birth Month as a numerical value: MM");
				month = in.nextInt();
				
				if (month < 1 || month > 12) {
					System.out.println("Wrong value! Should be between 1 and 12!");
				}
				else {
					try {
						System.out.println("Enter your birth Day as a numerical value: DD ");
						day = in.nextInt();
						
						if(day <1 || day >31) {
							System.out.println("Wrong value! Should be between 1 and 31!");
					}else {
						switch (month) {
							case 1: 
								if (day <= 19) {
										System.out.println("Your horoscope is: Capricorn");
										System.out.println("Your Element is: " + "Earth".toUpperCase());
										System.out.println("Your best match is with: Taurus, Virgo, Capricorn");
									}
								if (day >= 20) {
										System.out.println("Your horoscope is: Aquarius");
										System.out.println("Your Element is: " + "air".toUpperCase());
										System.out.println("Your best match is with: Gemini, Libra, Aquarius.");
								}
								break;
							case 2:
								if (day <= 18) {
									System.out.println("Your horoscope is: Aquarius");
									System.out.println("Your Element is: " + "air".toUpperCase());
									System.out.println("Your best match is with: Gemini, Libra, Aquarius");
								}
								if (day >= 19) {
									System.out.println("Your horoscope is: Pisces");
									System.out.println("Your Element is: " + "water".toUpperCase());
									System.out.println("Your best match is with: Cancer, Scorpio, Pisces");
								}
								break;
							case 3:
								if (day <= 20) {
									System.out.println("Your horoscope is: Pisces");
									System.out.println("Your Element is: " + "water".toUpperCase());
									System.out.println("Your best match is with: Cancer, Scorpio, Pisces");
								}
								if (day >= 21) {
									System.out.println("Your horoscope is: Aries");
									System.out.println("Your Element is: " + "fire".toUpperCase());
									System.out.println("Your best match is with: Aries, Leo, Sagittarius");
								}
								break;
							case 4:
								if (day <= 19) {
									System.out.println("Your horoscope is: Aries");
									System.out.println("Your Element is: " + "fire".toUpperCase());
									System.out.println("Your best match is with: Aries, Leo, Sagittarius");
								}
								if (day >= 20) {
									System.out.println("Your horoscope is: Taurus");
									System.out.println("Your Element is: " + "Earth".toUpperCase());
									System.out.println("Your best match is with: Taurus, Virgo, Capricorn");
								}
								break;
							case 5:
								if (day <= 20) {
									System.out.println("Your horoscope is: Taurus");
									System.out.println("Your Element is: " + "Earth".toUpperCase());
									System.out.println("Your best match is with: Taurus, Virgo, Capricorn");
								}
								if (day >= 21) {
									System.out.println("Your horoscope is: Gemini");
									System.out.println("Your Element is: " + "air".toUpperCase());
									System.out.println("Your best match is with: Gemini, Libra, Aquarius");
								}
								break;
							case 6: 
								if (day <= 21) {
									System.out.println("Your horoscope is: Gemini");
									System.out.println("Your Element is: " + "air".toUpperCase());
									System.out.println("Your best match is with: Gemini, Lira, Aquarius");
								}
								if (day >= 22) {
									System.out.println("Your horoscope is: Cancer");
									System.out.println("Your Element is: " + "water".toUpperCase());
									System.out.println("Your best match is with: Cancer, Scorpio, Pisces");
								}
								break;
							case 7:
								if (day <= 22) {
									System.out.println("Your horoscope is: Cancer");
									System.out.println("Your Element is: " + "water".toUpperCase());
									System.out.println("Your best match is with: Cancer, Scorpio, Pisces");
								}
								if (day >= 23) {
									System.out.println("Your horoscope is: Leo");
									System.out.println("Your Element is: " + "fire".toUpperCase());
									System.out.println("Your best match is with: Aries, Leo, Sagittarius");
								}
								break;
							case 8:
								if (day <= 22) {
									System.out.println("Your horoscope is: Leo");
									System.out.println("Your Element is: " + "fire".toUpperCase());
									System.out.println("Your best match is with: Aries, Leo, Sagitarius");
								}
								if (day >= 23) {
									System.out.println("Your horoscope is: Virgo");
									System.out.println("Your Element is: " + "Earth".toUpperCase());
									System.out.println("Your best match is with: Taurus, Virgo, Capricorn");
								}
								break;
							case 9:
								if (day <= 22) {
									System.out.println("Your horoscope is: Virgo");
									System.out.println("Your Element is: " + "Earth".toUpperCase());
									System.out.println("Your best match is with: Taurus, Virgo, Capricorn");
								}
								if (day >= 23) {
									System.out.println("Your horoscope is: Libra");
									System.out.println("Your Element is: " + "air".toUpperCase());
									System.out.println("Your best match is with: Gemini, Libra, Aquarius");
								}
								break;
							case 10:
								if (day <=22) {
									System.out.println("Your horoscope is: Libra");
									System.out.println("Your Element is: " + "air".toUpperCase());
									System.out.println("Your best match is with: Gemini, Libra, Aquarius");
								}
								if (day >= 23) {
									System.out.println("Your horoscope is: Scorpio");
									System.out.println("Your Element is: " + "water".toUpperCase());
									System.out.println("Your best match is with: Cancer, Scorpio, Pisces");
								}
								break;
							case 11:
								if (day <=21) {
									System.out.println("Your horoscope is: Scorpio");
									System.out.println("Your Element is: " + "water".toUpperCase());
									System.out.println("Your best match is with: Cancer, Scorpio, Pisces");
								}
								if (day >= 22) {
									System.out.println("Your horoscope is: Sagittarius");
									System.out.println("Your Element is: " + "fire".toUpperCase());
									System.out.println("Your best match is with: Aries, Leo, Sagittarius");
								}
								break;
							case 12:
								if (day <= 21) {
									System.out.println("Your horoscope is: Sagittarius");
									System.out.println("Your Element is: " + "fire".toUpperCase());
									System.out.println("Your best match is with: Aries, Leo, Sagittarius");
								}
								if (day >=22) {
									System.out.println("Your horoscope is: Capricorn");
									System.out.println("Your Element is: " + "Earth".toUpperCase());
									System.out.println("Your best match is with: Taurus, Virgo, Capricorn");
								}
								break;
								} //closes switch
					} //ends else 2
					}catch(Exception e) {
						System.out.println("Wrong value! the day should be between 1 and 31!\n" + e.getMessage());
					 
					} //close catch 2
				}//ends else 1
				}catch(Exception e) {
					System.out.println("Wrong vlaue! The month should be between 1 nd 12!\n" + e.getMessage());
				}
				try {
					System.out.println("\n\nEnter y if you wnt to continue, or anything else to quit!");
					enter = new Scanner(System.in);
					ans = enter.next();
				}catch(Exception ex)
				{System.out.println("Wrong value!");}
			}while (ans.equals("y") || ans.equals("Y"));
			
			System.out.println("\n\nYou decided to quit!");
			enter.close();
			
			
		} //closes arg
} //closes class
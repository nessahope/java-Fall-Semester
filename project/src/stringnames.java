//Vanessa L'Esperance
//November 1, 2018
//String name practice


public class stringnames {
	
	
	public static void main(String[] args) {
		
		String st1 = " Vanessa ";//String object
		String st2 = new String(" L'Esperance ");//String object
		String st3 = st1 + " " + st2;//concatenating objects
		
		System.out.println("The value of st3 is = " + st3);

		//method length()
		System.out.println("The length of st1 is = " + st1.length());
		System.out.println("The length of st2 is = " + st2.length());
		System.out.println("The length of st3 is = " + st3.length());
		
		//method charAt()
		System.out.println("The character of st3 at index 0 is : *" + st3.charAt(0) + "*");
		System.out.println("The character of st3 at index 0 using trim() is : *" + st3.trim().charAt(0) + "*");
			
		//method substring()
		System.out.println("The value of sub-string from the char 0 to char 5) is = *" + st3.substring(0, 9) + "*");
		System.out.println("The value of sub-string from the char 5 to the end) is = *" + st3.substring(10) + "*");
		
		//method toUpperCase()
		System.out.println("The value of st1 in Upper Cases is : " + st1.toUpperCase());
		
		
	}
}
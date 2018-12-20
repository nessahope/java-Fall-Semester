package passowrd;

import java.util.Random;

public class passwordgenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 10;
		System.out.println(generatePswd(length));
	}
	static char[] generatePswd(int len)
	{
		System.out.println("Your password:");
		String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String symbols = "!@#$%^&*_+=-/?<>";
		
		String passSymbols = charsCaps + chars + nums + symbols;
		Random rnd = new Random();
		
		char[] password = new char [len];
		int index = 0;
		for (int i = 0; i < len; i++)
		{
			password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
		}
		return password;
	}

}
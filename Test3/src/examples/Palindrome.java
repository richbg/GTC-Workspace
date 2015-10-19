package examples;


public class Palindrome {

	public static void main(String[] args) {
		
		String test = "abc";
		System.out.println( reverseIt(test));
		System.out.println( "Palindrome? " + palindromeCheck(test));
		

	}

	

	private static boolean palindromeCheck(String string) {
		if (string.equals(reverseIt(string)))
			return true;
		else
			return false;

	}



	private static String reverseIt(String string) {
		String reversedString = "";
		for ( int i  = string.length() -1 ; i >= 0; i--) {
			reversedString = reversedString + string.substring(i,i+1);
		}
		return reversedString;
	}

}

import java.util.Scanner;

/*
 * Benjamin Rich 
 * CIST731 Java I 
 * 11/18/11
 * 
 Write a program that asks a user to enter a string. 
 The program will evaluate the string to make sure that it meets the requirements listed below. 
 The program should loop and keep asking the user to enter another string until a -1 (negative one) is entered. 
 Display a message that the data entered is valid or invalid after evaluating the data.

- must begin with a letter character
- has a length between of at least 3 and no more than 7
- has an upper and lower case letter
- has either %, &, %, $
- the last character in the string has to be a 'J' (for Java)

 */



public class regexProject {
	
	static String regexString = "";
	
	
	public static void main(String[] args) {
		
		getInput();

	} 

	private static boolean matchResult(String regexString, String re) {
		return regexString.matches(re);
		
		
	}

	private static void getInput() {
		boolean isNeg = false;

		while (isNeg != true) {

			Scanner sc = new Scanner(System.in);
			sc.useDelimiter(System.getProperty("line.separator"));
			System.out.println("Enter a string: ");
			String regexString = sc.next();

			if (regexString.equalsIgnoreCase("-1")) {
				isNeg = true;
			}else {
				
				System.out.println("Data entered is valid: " +  matchResult(regexString, "((^[a-zA-Z])(?=.*[a-z])(?=.*[A-Z])(?=.*[%|&|%|$]).{3,7}([J$|j$]))"));
			}

		}
		
	}

	

}

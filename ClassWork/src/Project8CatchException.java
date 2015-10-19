/* Assignment: Chapter 8 Project 8 
 * Author: Benjamin G. Rich
 * 
 * Write a program that ask the user to enter an integer. 
 * Then display what the user entered back on the screen if the user entered an integer ("you entered ..."). 
 * If the user enter something other than an integer then display on the screen 
 * a message that says "you did not enter an integer".
 * Next, the program asks the user to enter a string. 
 * Display back on the screen the string that the user entered ("you entered ...". If the data entered is not a string, 
 * then display a message that says "user did not enter a string" by generating (throwing) an exception.
 * Use try, catch, and throw examples in chapter 8 to accomplish this (page 453 is a good example for multiple catch).
 * Use InputMismatchException for integer validation. Use Exception for string validation.
 * To check if a string variable called myString is a string or not, use this statement:
 * myString.matches("^[-+]?\\d+(\\.\\d+)?$")
 * 
 */

import java.util.*;

class Project8CatchException {


	public static void main(String[] args){
		int x = 0;
		String text = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer: ");
		try{	
			x = scanner.nextInt();
			{
				System.out.println("You entered: " + x);
			}
		}
		catch (InputMismatchException ime)
		{
			scanner.next();
			System.out.println("You did not enter an integer");
		}

		System.out.println("Please enter a string: ");
		try{
			text = scanner.next();

		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
			System.exit(0);
		}
		if	(text.matches("^[-+]?\\d+(\\.\\d+)?$"))
		{
			System.out.println("You entered a numeric string:" + text);
		}
		else	
		{
			System.out.println("You entered a character string: " + text);
		}



	}
}
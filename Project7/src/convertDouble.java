/*
 * Project 7: 
 * Write a program that asks the user to enter a double-type number with decimals. 
 * Use the DecimalFormat example in chapter 3 to display the number back in 2 decimal format (for money displaying purpose).
 * 
 * Using the GUI example in chapter 2, Write a program that displays a text box or text area in a frame that says 'I like Java'. 
 * You may need to do some research at Google about the use of textbox or textarea in Java.
 * Submit both programs together in one submission. 
 * If you need to make corrections and have to submit multiple times, always include both programs in the latest submission.
 */

import java.text.*;
import java.util.*;

class Ch7_ConversionDoubleTo2Decimals {
	public static void main(String[] args) {

		double number = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number with more then 2 decimals");
		number = scanner.nextDouble();
		System.out.println("The number is:" + df.format(number));

	}

}

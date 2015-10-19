/* Assignment: Chapter 2 Exercise 27
 * Author: Benjamin G. Rich
 * 
 * Code accepts a user given string,
 * the length of the string is printed 
 * as well as the first & last character.
 * 
 */

import java.util.*;

class Ch2Ex27 {

	public static void main(String[] arg){


		String quote;

		Scanner sc = new Scanner(System.in);

		sc.useDelimiter (System.getProperty("line.separator"));

		System.out.print("Enter your text: " );

		quote = sc.next( );

		System.out.println(quote.length());
		System.out.println(quote.substring(0,1));
		System.out.println(quote.substring(quote.length() -1));


	}

}
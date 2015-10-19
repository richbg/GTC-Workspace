/*
 *	File Name:  SurveyResponses.java
 *	Program:    SurveyResponses
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 10 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *  
 * Figure 7.8 (StudentPoll) contains an array of survey responses that is
 * hard coded into the program.  Suppose we wish to process survey results
 * that are stored in a file.  This exercise requires two separate programs.  
 * First, create an application that prompts the user for survey responses and outputs
 * each response to a file.  Use a Formatter to create a file called numbers.txt.  
 * Each integer should be written using method format.  Then modify the program in
 * Fig. 7.8 to read the survey responses from numbers.txt.  The responses should be read 
 * from the file using a Scanner.  Use method nextInt to input one integer at a time from the file.  
 * The program should continue to read responses until it reaches the end of the file.  
 * The results should be output to the text file Òoutput.txtÓ.  (17.12)
 * 
 * Additional Notes:
 * Note that this assignment requires two separate programs.  
 * Do not combine the user input program with the student poll analysis program.
 * Your StudentPoll class should not contain a responses array.  
 * If it does, it is wrong.  Read and process each response from the file one at a time.
 * The input program should allow any number of responses to be entered.  
 * You may NOT require the user to count the number of responses before entering them.  
 * Use sentinel-controlled repetition (see chapter 4) for inputting the responses.
 *
 * - Program asks the user to enter and integer, stores in output data file numberts.txt
 */

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SurveyResponses {
	private int getValue() {
		int result = -1;
		Scanner sc = new Scanner(System.in);

		// Prompt the user for input
		System.out.print("Take our survey enter some numbers (1 - 10), -1 to quit: ");

		try {
			result = sc.nextInt();
		} catch (NoSuchElementException nse)

		{
			System.err.println("Error with input.");
			System.exit(1);
		}

		return result;
	}// End method getValue

	public void outputData() {
		Formatter pollNumbers = null;

		try {
			// Create the output file numbers.txt
			pollNumbers = new Formatter("numbers.txt");

			int pollValue = getValue(); // Get input from the user

			// Test for the sentinel value of -1
			while (pollValue != -1) {
				// if the number is valid
				if (pollValue > 0 && pollValue < 11)

					// write the value
					pollNumbers.format("%d\n", pollValue);

				pollValue = getValue(); // Get more input from the user
			} // end while

			pollNumbers.close(); // Close the file numbers.txt
		} // end try
		catch (SecurityException se) {
			System.err.println("Error opening file.");
		} // end catch
		catch (FileNotFoundException fne) {
			System.err.println("Output file cannot be found.");
		} // end catch
		catch (IllegalFormatException ife) {
			System.err.println("Error with the output's format.");
		} // end catch
		catch (FormatterClosedException fce) {
			System.err.println("File has been closed.");
		} finally {
			if (pollNumbers != null)

				pollNumbers.close();
		} // end finally
	}// end method outputData

//	public static void main(String args[]) {
//		SurveyResponses sr = new SurveyResponses();
//		sr.outputData();
//	} // end main
} // end class CreateResults
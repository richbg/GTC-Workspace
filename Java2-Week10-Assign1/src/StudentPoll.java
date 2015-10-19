/*
 *	File Name:  StudentPoll.java
 *	Program:    StudentPoll
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
 * The results should be output to the text file “output.txt”.  (17.12)
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
 * - Program reads input date file numbers.txt & creates the StudentPoll output.txt
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentPoll {
	public void displayData() {
		int frequency[] = new int[10];

		Formatter writer = null;
		Scanner pollNumbers = null;
		

		try {
			pollNumbers = new Scanner(new File("numbers.txt"));

			writer = new Formatter("output.txt");

			writer.format("%-12s%-12s\n", "Rating", "Frequency");

			// For each answer, use that value as subscript to
			// determine element to increment
			while (pollNumbers.hasNext())
				++frequency[pollNumbers.nextInt()];

			// append frequencies to String output
			for (int rating = 1; rating < frequency.length; rating++)
				writer.format("%-12d%-12d\n", rating, frequency[rating]);
		} // end try
		catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error: Files cannot be opened.");
		} // end catch
		catch (FormatterClosedException formatterClosedException) {
			System.err.println("Error: Output file is closed.");
		} // end catch
		catch (SecurityException securityException) {
			System.err.println("Error opening file for writing.");
		} // end catch
		catch (IllegalFormatException illegalFormatException) {
			System.err.println("Error writing data to file.");
		} // end catch
		catch (NoSuchElementException noSuchElementException) {
			System.err.println("Error reading from file.");
		} // end catch
		catch (IllegalStateException illegalStateException) {
			System.err.println("Error: Input file is closed.");
		} // end catch
		finally {
			if (writer != null)
				writer.close();

			if (pollNumbers != null)
				pollNumbers.close();
		} // end finally
	} // end displayData
} // end class StudentPoll


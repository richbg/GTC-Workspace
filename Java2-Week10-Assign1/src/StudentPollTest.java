/*
 *	File Name:  StudentPollTest.java
 *	Program:    StudePollTest
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
 * - Tests the StudentPoll Program
 */

public class StudentPollTest {
	public static void main(String args[]) {
		StudentPoll sp = new StudentPoll();
		sp.displayData();
	} // end main
} // end class StudentPollTest
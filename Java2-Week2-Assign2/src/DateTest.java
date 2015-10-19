/*
 *	File Name:  DateTest.java
 *	Program:    DateTest
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 2 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 *  Modify class Date of Fig. 8.7 to perform error checking on the initializer values
 *  for instance variables month, day and year (currently it validates only the month and day).  
 *  Use a utility method checkYear to validate the year.  Provide a method nextDay to increment the day by one.  
 *  The Date object should remain in a consistent state.  
 *  Write a program that tests method nextDay in a loop 
 *  that prints the date during each iteration to illustrate that the method works correctly.  
 *  Also test the following cases:
 *  Incrementing into the next month and
 *  Incrementing into the next year.
 * 
 */

public class DateTest {
	public static void main(String[] args) {
		// Initial Date Object
		Date d1 = new Date();

		// Test 1
		// Utilizing nextDay to increment a day for 31 days
		System.out
				.println("Testing the nextDay method in a loop to increment a day for 31 days");
		// Set first test date to 1/1/2012
		d1.setDate(1, 1, 2012);
		// Print out the current value for date1
		System.out.println("Current date is: " + d1.toString());

		// call nextDay method in a loop to roll to the next day
		int i = 1;
		do {
			d1.nextDay();
			System.out.println("Date after calling nextDay is: "
					+ d1.toString());

		} while (++i < 31);
		System.out.println("Test 1 Complete");

		// Test 2
		// Utilizing nextDay method to roll to the next month
		System.out
				.println("\nTesting the nextDay method in to roll to the next month");
		d1.setDate(3, 31, 2012);
		System.out.println("Curent date is: " + d1.toString());
		// Increment date by one day
		d1.nextDay();
		System.out.println("Rolling to the next month: " + d1.toString());
		System.out.println("Test 2 Complete");

		// Test3
		// utilize nextDay method to roll into the next year
		System.out
				.println("\nTesting the nextDay method to roll into the next year");
		d1.setDate(12, 31, 2012);
		System.out.println("Current date is: " + d1.toString());
		d1.nextDay();
		System.out.println("Rolling to the next year: " + d1.toString());
		System.out.println("Test 3 Complete");

	}
}
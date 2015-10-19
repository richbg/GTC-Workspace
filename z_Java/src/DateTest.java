/* Assignment 2, pt2: class DateTest.java
Created by:  Deitels' ~ Modified by: Lee Gilley, CIST2372-Java Programming II (40450)

Write a program that tests method nextDay in a loop that prints the date during each iteration to illustrate that the method 
works correctly.  Also test the following cases:

•	Incrementing into the next month and
•	Incrementing into the next year.
(8.7)

Additional Notes:

•	Your test program must test the two conditions mentioned in the assignment.   A test program that just asks the user for 
a date to increment is insufficient.  The test program must display clearly what condition it is testing and what the results 
are.  A test program which just calls nextDay and displays the dates in a loop is insufficient.
•	The test program must be in a separate class.  You may NOT write the test program within the Date class.
*/


public class DateTest
{
   public static void main( String args[] )
   {
		Date date1 = new Date( ); //date object
						
		//Test 1
		System.out.println( "" );
		System.out.println( "Test 1: Test the nextDay method in a loop to increment a day for 31 days" );
		//Setting the date
		date1.setDate( 8, 1, 1970 );
		
		//Checking my setDate method
		System.out.println( "Current date: " + date1.toString() );
		
		//Checking my nextDay method in a loop to roll to the next day
		for(int count = 1; count < 31; count++)
		{
			date1.nextDay();
			System.out.println( "One day later: " + date1.toString() );
		}

		//Test 2 Checking my nextDay method rolling to the next month
		System.out.println( "" );
		System.out.println( "Test 2: Test nextDay method to roll to the next month" );
		date1.setDate( 4, 30, 1986 );
		System.out.println( "Current date: " + date1.toString() );		
		//Increment by one day
		date1.nextDay();
		System.out.println( "Rolling to next month: " + date1.toString() );
		
		//Test 3 Checking my nextDay method rolling to the next year
		System.out.println( "" );
		System.out.println( "Test 3: Test nextDay method to roll to the next year" );
		date1.setDate( 12, 31, 1999 );
		System.out.println( "Current date: " + date1.toString() );		
		//Increment by one day
		date1.nextDay();
		System.out.println( "Rolling to next year: " + date1.toString() );
	
	} // end 
	
} // end class DateTest

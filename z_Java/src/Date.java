// Fig. 8.7: Date.java
/* Assignment 2, pt.1: class Date.java
Created by:  Deitels' ~ Modified by: Lee Gilley, CIST2372-Java Programming II (40450)
Modify class Date of Fig. 8.7 to perform error checking on the initializer values for instance variables month, day and year
(currently it validates only the month and day).  Use a utility method checkYear to validate the year.  Provide a method nextDay 
to increment the day by one.  The Date object should remain in a consistent state.
  
•	The Date class of Fig. 8.7 includes displays for illustration which are inappropriate for real programming.  Remove the 
inappropriate System.out.printf calls.  (Hint:  All the calls to System.out.printf in the Date class are inappropriate.)  
There is a cleaned up Date class in Angel that you can use.
•	What constitutes a valid year for a Date?  Todays calendar is the Gregorian calendar.  This calendar was adopted in 1582 
by Pope Gregory XIII.  Therefore, you can consider invalid any year earlier than 1582.  If you wish to extend the calendar to 
earlier years just remember one thing… Counting of years goes from year -1 to year +1.  In other words, there is no such thing 
as year zero on any calendar.
•	When method nextDay is called it should advance the date by one calendar day, keeping the month, day and year in valid states.
There are utility methods already written which can be used to check for valid day and month.  Use these methods “as is” in your 
nextDay method.  If you are cutting and pasting code you are doing it wrong.  Copy and paste is NOT code reuse.  
•	The nextDay method acts entirely internally.  There should be no arguments or return value  (  public void nextDay()  ).

// Date class declaration.
/// Modified to remove printf statements that are inappropriate*/

public class Date
{
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

	//Constructors  
	// Date no-argument constructor: initializes each instance variable 
   // to a valid date; ensures that Date objects start in a consistent state
   public Date()
   {
      this( 1, 1, 1582 ); 
   } // end 


   // constructor: call checkMonth to confirm proper value for month, checkYear to confirm proper value for the year, and
   // call checkDay to confirm proper value for day
   public Date( int theMonth, int theDay, int theYear )
   {
      month = checkMonth( theMonth ); // validates month
      year = checkYear( theYear ); // validates year
      day = checkDay( theDay ); // validates day

   } // end Date constructor

  //Set methods
   // Set a new date value 
	public void setDate( int mo, int dy, int yr )
	{
      month = checkMonth( mo ); // validates the month and sets it
		day = checkDay( dy ); // validates the day and sets it
		year = checkYear( yr ); // validates the year and sets it
   }


	//Get Methods
	public int getDay( )
	{
		return day;
	}
	
	public int getMonth( )
	{
		return month;
	}
	
	public int getYear( )
	{
		return year;
	}
 
   // utility method to confirm proper month value
   private int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 ) // validate month
         return testMonth;
      else // month is invalid
      {
		  // invalid month - return January
          return 1; // maintain object in consistent state
      } // end else
   } // end method checkMonth

   // utility method to confirm proper day value based on month and year
   private int checkDay( int testDay )
   {
      int[] daysPerMonth =
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;

      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;

	  // invalid day - return first
      return 1;  // maintain object in consistent state
   } // end method checkDay


	// utility method to confirm proper year value based on month and year
   private int checkYear( int testYear )
   {
      // check if year is in range for the Gregorian calendar
      if ( testYear > 1581 )
         return testYear;

     // invalid year - return 1582
      return 1582;  // maintain object in consistent state
   } // end method checkDay
	
	public void nextDay( )
	{
		day = day + 1;
		day = checkDay( getDay() );
		if( day == 1 )
		{
			month = month + 1;
		}
		
		month = checkMonth( getMonth());
		if( month == 1)
		{
			year = year + 1;
		}
		
	}

   // return a String of the form month/day/year
   public String toString()
   {
      return String.format( "%d/%d/%d", month, day, year );
   } // end method toString
} // end class Date



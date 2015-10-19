/*
 *	File Name:  Time2.java
 *	Program:    Time2
 *	Programmer: Benjamin Rich
 *	Exercise:   Week 3 OOP Inheritance
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Modify class Time2 of Fig. 8.5 to include a tick method that increments the time stored in a Time2 object by one second.  
 * Provide method incrementMinute to increment the minute by one and method incrementHour to increment the hour by one.   
 * The Time2 object should always remain in consistent state.  Write a program that tests the tick method, the incrementMinute method 
 * and the incrementHour method to ensure that they work correctly.  Be sure to test the following cases:
 * 	Incrementing into the next minute using tick
 * 	Incrementing into the next hour using tick and incrementMinute
 * 	Incrementing into the next day (i.e. 11:59:59 PM to 12:00:00 AM)
 * 
 */
//Fig. 8.5: Time2.java
//Time2 class declaration with overloaded constructors.  

public class Time2
{
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// Time2 no-argument constructor: initializes each instance variable 
	// to zero; ensures that Time2 objects start in a consistent state
	public Time2()
	{
		this( 0, 0, 0 ); // invoke Time2 constructor with three arguments
	} // end Time2 no-argument constructor

	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time2( int h ) 
	{ 
		this( h, 0, 0 ); // invoke Time2 constructor with three arguments
	} // end Time2 one-argument constructor

	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time2( int h, int m ) 
	{ 
		this( h, m, 0 ); // invoke Time2 constructor with three arguments
	} // end Time2 two-argument constructor 

	// Time2 constructor: hour, minute and second supplied
	public Time2( int h, int m, int s ) 
	{ 
		setTime( h, m, s ); // invoke setTime to validate time
	} // end Time2 three-argument constructor 

	// Time2 constructor: another Time2 object supplied
	public Time2( Time2 time )
	{
		// invoke Time2 three-argument constructor
		this( time.getHour(), time.getMinute(), time.getSecond() );
	} // end Time2 constructor with a Time2 object argument

	// Set Methods
	// set a new time value using universal time; ensure that 
	// the data remains consistent by setting invalid values to zero
	public void setTime( int h, int m, int s )
	{
		setHour( h ); // set the hour
		setMinute( m ); // set the minute
		setSecond( s ); // set the second
	} // end method setTime

	// validate and set hour 
	public void setHour( int h ) 
	{ 
		hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
	} // end method setHour

	// validate and set minute 
	public void setMinute( int m ) 
	{ 
		minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
	} // end method setMinute

	// validate and set second 
	public void setSecond( int s ) 
	{ 
		second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
	} // end method setSecond

	// Get Methods
	// get hour value
	public int getHour() 
	{ 
		return hour; 
	} // end method getHour

	// get minute value
	public int getMinute() 
	{ 
		return minute; 
	} // end method getMinute

	// get second value
	public int getSecond() 
	{ 
		return second; 
	} // end method getSecond

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format( 
				"%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
	} // end method toUniversalString

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString()
	{
		return String.format( "%d:%02d:%02d %s", 
				( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
				getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
	} // end method toString
	
	// Method Tick to increment the time stored 
	// by one second, if the seconds supplied are > 59
	// set setSecond to 0 & call incrementMinute
	public void tick()
	{
		++second;
		if (second > 59)
		{
			setSecond(0);
			incrementMinute();
		}
	}

	// Method incrementMinute to increment the minute 
	// by one minute, if the minutes supplied are > 59 
	// setMinute to 0 & call incrementHour
	public void incrementMinute()
	{
		++minute;
		if (minute > 59)
		{
			setMinute(0);
			incrementHour();
		}
	}

	// Method incrementHour to increment the hour by one
	// if the hour supplied are > 23 setHour to 0 
	public void incrementHour()
	{
		++hour;
		if (hour > 23)
		{
			setHour(0);
		}
	}
} // end class Time2


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

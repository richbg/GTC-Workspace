/*
 *	File Name:  DateAndTime.java
 *	Program:    DateAndTime
 *	Programmer: Benjamin Rich
 *	Exercise:   Week 3 OOP Inheritance
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Create class DateAndTime that combines the modified Time2 class of Exercise 8.7 
 * and the modified Date class of Exercise 8.8.  
 * Override method incrementHour to call method nextDay if the time is incremented into the next day.  
 * Override methods toString and toUniversalString to output the date in addition to the time.  
 * Write a program to test the new class DateAndTime.  
 * Specifically, test incrementing the time to the next day using method tick.  (8.13)
 * 
 * Additional Notes:
 * 
 * Have your DateAndTime class inherit the Time2 class as a superclass.  
 * Incorporate the Date class by using composition.  
 * You will need to write pass-through methods for the public methods in the Date class (except for the constructor).
 * Write a constructor for the DateAndTime class that will accept the month, day, year, hour, minute and second as parameters.  
 * Initialize the date and time in the constructor.
 * Set up a default constructor that initializes the DateAndTime object to January 1, 2011, at 12:00:00 PM (noon).
 * Your test program must test the condition mentioned in the assignment.   
 * A test program that just accepts input from the user insufficient.  
 * The test program must display clearly what condition it is testing and what the results are.  
 * A test program which just calls nextDay and displays the dates in a loop is insufficient.
 * The test program must be in a separate class.  
 * You may NOT write the test program within the DateAndTime class
 * 
 */

public class DateAndTime extends Time2 {
	private Date theDate;

	// Constructor: DateAndTime accepts the month, day, year, hour, minute and
	// second as parameters
	// and is composed of Date
	public DateAndTime(int theMonth, int theDay, int theYear, int theHour,
			int theMinute, int theSecond) {
		super(theHour, theMinute, theSecond);
		theDate = new Date(theMonth, theDay, theYear);

	} // end Date constructor

	// Default Constructor initialize the DateAndTime Object to
	// January 1, 2011 at 12:00:00 PM (noon).
	public DateAndTime() {
		super(12, 0, 0);
		theDate = new Date(1, 1, 2011);
	}

	// Passthrough Methods to get Date

	public int getDay() {
		return theDate.getDay();
	}

	public int getMonth() {
		return theDate.getMonth();
	}

	public int getYear() {
		return theDate.getYear();
	}

	// Passthrough method return a String of the form month/day/year, HH:MM:SS
	// AM/PM
	// Override to include date & time
	@Override
	public String toString() {
		return String.format("%d/%d/%d, %d:%02d:%02d %s", theDate.getMonth(),
				theDate.getDay(), theDate.getYear(),
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}

	// convert string to universal-date/time format MM/DD/YYYY, HH:MM:SS
	@Override
	public String toUniversalString() {
		return String.format("%d/%d/%d, %02d:%02d:%02d", theDate.getMonth(),
				theDate.getDay(), theDate.getYear(), getHour(), getMinute(),
				getSecond());
	}

	// Override methods
	@Override
	public void incrementHour() {
		int hr = getHour();
		hr++;
		if (hr <= 23) {
			setHour(hr);
		}

		if (hr == 24) {
			setHour(0);
			theDate.nextDay();
		}

	}

}

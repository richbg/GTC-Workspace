/*
 *	File Name:  DateAndTimeTest.java
 *	Program:    DateAndTimeTest
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


public class DateAndTimeTest 
{

	
	public static void main(String[] args) {
		
		DateAndTime d = new DateAndTime(8, 1, 2012, 23,59,59);
		DateAndTime d1 = new DateAndTime(8, 31, 2012, 23,59,59);
		DateAndTime d2 = new DateAndTime(8, 31, 2012, 23,58,59);
		
		//Test 1 - Increment to the next day using method tick
		System.out.println("Date & Time Before incrementing to the next day using tick");
		System.out.println(d.toUniversalString() );
		System.out.println(d.toString() );
		d.tick();
		
		System.out.println("\nDate & Time after incrementing to next day using tick method");
		System.out.println(d.toUniversalString() );
		System.out.println(d.toString() );
		System.out.println("Test 1 Complete");
	
	
		// Test 2
		// Utilizing tick method to roll to the next month
		System.out.println("\nDate & Time Before incrementing to the next month using tick");
		System.out.println(d1.toUniversalString() );
		System.out.println(d1.toString() );
		d1.tick();
		
		System.out.println("\nDate & Time after incrementing to next month using tick method");
		System.out.println(d1.toUniversalString() );
		System.out.println(d1.toString() );
		System.out.println("Test 2 Complete");
		
		// Test 3
		// Utilizing tick method to roll to the next minute
		System.out.println("\nDate & Time Before incrementing to the next minute using tick");
		System.out.println(d2.toUniversalString() );
		System.out.println(d2.toString() );
		d2.tick();
		
		System.out.println("\nDate & Time after incrementing to next minute using tick method");
		System.out.println(d2.toUniversalString() );
		System.out.println(d2.toString() );
		System.out.println("Test 3 Complete");

	}

}

/*
 *	File Name:  Date.java
 *	Program:    Date
 *	Programmer: Benjamin Rich
 *	Exercise:   Week 4 Polymorphism Assignment
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Modify the payroll system of Figs. 10.4-10.9 to include private instance variable birthDate in class Employee.  
 * Use class Date from Exercise 8.8 (Objects Assignment 2) to represent an employeeÕs birthday.  
 * Add get methods to class Date.  Assume that payroll is processed once per month (but you are only paying weekly Ð ignore this paradox) .    
 * Include an additional Employee subclass PieceWorker that represents and employee whose pay is based on the number of 
 * pieces of merchandise produced.  Class PieceWorker should contain private instance variables wage 
 * (to store the employeeÕs wage per piece) and pieces (to store the number of pieces produced).  
 * Provide a concrete implementation of method earnings in class PieceWorker that calculates the employeeÕs earnings 
 * by multiplying the number of pieces produced by the wage per piece.  
 * Write a test program to use the birth date and new PieceWorker employee. 
 * Create an array (or ArrayList) of Employee variables to store references to the various employee objects.  
 * Include a PieceWorker object in the array. In a loop, calculate the payroll for each Employee polymorphically, 
 * and add a $100.00 bonus to the personÕs payroll amount if the current month is the one in which the EmployeeÕs birthday occurs.
 * 
 * (10.8 and 10.10)
 * Additional Notes:
 * Adding a birthdate to the Employee class will require you to rewrite the constructors for Employee and all its subclasses.
 * Hint: The PieceWorker class most closely resembles a CommissionEmployee.
 * 
 * 
 */
//Fig. 8.7: Date.java
//Date class declaration.
/// Modified to remove printf statements that are inappropriate

public class Date {
	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // any year

	// constructor: call checkMonth to confirm proper value for month;
	// call checkDay to confirm proper value for day
	public Date(int theMonth, int theDay, int theYear) {
		month = checkMonth(theMonth); // validate month
		year = theYear; // could validate year
		day = checkDay(theDay); // validate day
		year = checkYear(theYear); // validate year

	} // end Date constructor

	// Date constructor with no arguments:
	// Initializes instance variables to a valid date.
	// Consistent Date Object state
	public Date() {
		this(1, 1, 1582);

	}

	// utility method to confirm proper month value
	private int checkMonth(int testMonth) {
		if (testMonth > 0 && testMonth <= 12) // validate month
			return testMonth;
		else // month is invalid
		{
			// invalid month - return January
			return 1; // maintain object in consistent state
		} // end else
	} // end method checkMonth

	// utility method to confirm proper day value based on month and year
	private int checkDay(int testDay) {
		int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
				31 };

		// check if day in range for month
		if (testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;

		// check for leap year
		if (month == 2 && testDay == 29
				&& (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			return testDay;

		// invalid day - return first
		return 1; // maintain object in consistent state
	} // end method checkDay

	// checkYear utility method to confirm proper year value
	private int checkYear(int testYear) {
		// validate year by Gregorian calendar adopted in 1582, valid if 1582 or
		// greater
		if (testYear > 1581)
			return testYear;
		// invalid year - return 1582
		return 1582; // maintain object in consistent state
	} // end method checkYear

	// return a String of the form month/day/year
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	} // end method toString

	// Mutator methods
	// Set a new date value
	public void setDate(int mo, int dy, int yr) {
		month = checkMonth(mo); // validates the month and sets it
		day = checkDay(dy); // validates the day and sets it
		year = checkYear(yr); // validates the year and sets it
	}

	public void setMonth(int theMonth) {
		month = theMonth;
	}

	// Accessor Methods
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// nextDay method
	public void nextDay() {
		// check if the day can be incremented by 1
		if (checkDay(day + 1) == (day + 1)) {
			day++;
			// check if the month needs to be incremented due to end of month
			// day
		} else if (checkMonth(month + 1) == (month + 1)) {
			month++;
			day = 1;
			// check if the year needs to be incremented in the case of end of
			// year
		} else if (checkYear(year + 1) == (year + 1)) {
			year++;
			day = 1;
			month = 1;

		}

	}

} // end class Date

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/

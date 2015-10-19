/*
 *	File Name:  HourlyEmployee.java
 *	Program:    HourlyEmployee
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
// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee.

public class HourlyEmployee extends Employee {
	private double wage; // wage per hour
	private double hours; // hours worked for week

	// HourlyEmployee six-argument constructor
	public HourlyEmployee(String first, String last, String ssn,
			Date DayOfBirth, double hourlyWage, double hoursWorked) {
		super(first, last, ssn, DayOfBirth);
		setWage(hourlyWage); // validate and store hourly wage
		setHours(hoursWorked); // validate and store hours worked
	} // end six-argument HourlyEmployee constructor

	// set wage
	public void setWage(double hourlyWage) {
		if (hourlyWage >= 0.0)
			wage = hourlyWage;
		else
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
	} // end method setWage

	// return wage
	public double getWage() {
		return wage;
	} // end method getWage

	// set hours worked
	public void setHours(double hoursWorked) {
		if ((hoursWorked >= 0.0) && (hoursWorked <= 168.0))
			hours = hoursWorked;
		else
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
	} // end method setHours

	// return hours worked
	public double getHours() {
		return hours;
	} // end method getHours

	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {
		if (getHours() <= 40) // no overtime
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	} // end method earnings

	// return String representation of HourlyEmployee object
	@Override
	public String toString() {
		return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(), "hours worked",
				getHours());
	} // end method toString
} // end class HourlyEmployee

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and * Pearson Education,
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

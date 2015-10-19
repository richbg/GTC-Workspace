/*
 *	File Name:  SalariedEmployee.java
 *	Program:    SalariedEmployee
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
// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee.

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	// SalariedEmployee five-argument constructor
	public SalariedEmployee(String first, String last, String ssn,
			Date DayOfBirth, double salary) {
		super(first, last, ssn, DayOfBirth); // pass to Employee constructor
		setWeeklySalary(salary); // validate and store salary
	} // end five-argument SalariedEmployee constructor

	// set salary
	public void setWeeklySalary(double salary) {
		if (salary >= 0.0)
			weeklySalary = salary;
		else
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	} // end method setWeeklySalary

	// return salary
	public double getWeeklySalary() {
		return weeklySalary;
	} // end method getWeeklySalary

	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {
		return getWeeklySalary();
	} // end method earnings

	// return String representation of SalariedEmployee object
	@Override
	public String toString() {
		return String.format("salaried employee: %s\n%s: $%,.2f",
				super.toString(), "weekly salary", getWeeklySalary());
	} // end method toString
} // end class SalariedEmployee

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

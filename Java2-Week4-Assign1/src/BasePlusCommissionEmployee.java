/*
 *	File Name:  BasePlusCommissionEmployee.java
 *	Program:    BasePlusCommissionEmployee
 *	Programmer: Benjamin Rich
 *	Exercise:   Week 4 Polymorphism Assignment
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Modify the payroll system of Figs. 10.4-10.9 to include private instance variable birthDate in class Employee.  
 * Use class Date from Exercise 8.8 (Objects Assignment 2) to represent an employee�s birthday.  
 * Add get methods to class Date.  Assume that payroll is processed once per month (but you are only paying weekly � ignore this paradox) .    
 * Include an additional Employee subclass PieceWorker that represents and employee whose pay is based on the number of 
 * pieces of merchandise produced.  Class PieceWorker should contain private instance variables wage 
 * (to store the employee�s wage per piece) and pieces (to store the number of pieces produced).  
 * Provide a concrete implementation of method earnings in class PieceWorker that calculates the employee�s earnings 
 * by multiplying the number of pieces produced by the wage per piece.  
 * Write a test program to use the birth date and new PieceWorker employee. 
 * Create an array (or ArrayList) of Employee variables to store references to the various employee objects.  
 * Include a PieceWorker object in the array. In a loop, calculate the payroll for each Employee polymorphically, 
 * and add a $100.00 bonus to the person�s payroll amount if the current month is the one in which the Employee�s birthday occurs.
 * 
 * (10.8 and 10.10)
 * Additional Notes:
 * Adding a birthdate to the Employee class will require you to rewrite the constructors for Employee and all its subclasses.
 * Hint: The PieceWorker class most closely resembles a CommissionEmployee.
 * 
 * 
 */
// Fig. 10.8: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class extends CommissionEmployee.

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; // base salary per week

	// BasePlusCommisionEmployee seven-argument constructor
	public BasePlusCommissionEmployee(String first, String last, String ssn,
			Date DayOfBirth, double sales, double rate, double salary) {
		super(first, last, ssn, DayOfBirth, sales, rate);
		setBaseSalary(salary); // validate and store base salary
	} // end seven-argument BasePlusCommissionEmployee constructor

	// set base salary
	public void setBaseSalary(double salary) {
		if (salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	} // end method setBaseSalary

	// return base salary
	public double getBaseSalary() {
		return baseSalary;
	} // end method getBaseSalary

	// calculate earnings; override method earnings in CommissionEmployee
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	} // end method earnings

	// return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary());
	} // end method toString
} // end class BasePlusCommissionEmployee

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
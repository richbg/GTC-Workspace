/*
 *	File Name:  CommissionEmployee.java
 *	Program:    CommissionEmployee
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
// Fig. 10.7: CommissionEmployee.java
// CommissionEmployee class extends Employee.

public class CommissionEmployee extends Employee {
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	// CommissionEmployee six-argument constructor
	public CommissionEmployee(String first, String last, String ssn,
			Date DayOfBirth, double sales, double rate) {
		super(first, last, ssn, DayOfBirth);
		setGrossSales(sales);
		setCommissionRate(rate);
	} // end six-argument CommissionEmployee constructor

	// set commission rate
	public void setCommissionRate(double rate) {
		if (rate > 0.0 && rate < 1.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
	} // end method setCommissionRate

	// return commission rate
	public double getCommissionRate() {
		return commissionRate;
	} // end method getCommissionRate

	// set gross sales amount
	public void setGrossSales(double sales) {
		if (sales >= 0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	} // end method setGrossSales

	// return gross sales amount
	public double getGrossSales() {
		return grossSales;
	} // end method getGrossSales

	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	} // end method earnings

	// return String representation of CommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(), "gross sales",
				getGrossSales(), "commission rate", getCommissionRate());
	} // end method toString
} // end class CommissionEmployee

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

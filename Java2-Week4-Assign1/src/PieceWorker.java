/*
 *	File Name:  PieceWorker.java
 *	Program:    PieceWorker
 *	Programmer: Benjamin Rich
 *	Exercise:   Week 4 Polymorphism Assignment
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Modify the payroll system of Figs. 10.4-10.9 to include private instance variable birthDate in class Employee.
 * Use class Date from Exercise 8.8 (Objects Assignment 2) to represent an employee’s birthday.
 * Add get methods to class Date.  Assume that payroll is processed once per month (but you are only paying weekly – ignore this paradox) .
 * Include an additional Employee subclass PieceWorker that represents and employee whose pay is based on the number of
 * pieces of merchandise produced.  Class PieceWorker should contain private instance variables wage
 * (to store the employee’s wage per piece) and pieces (to store the number of pieces produced).
 * Provide a concrete implementation of method earnings in class PieceWorker that calculates the employee’s earnings
 * by multiplying the number of pieces produced by the wage per piece.
 * Write a test program to use the birth date and new PieceWorker employee.
 * Create an array (or ArrayList) of Employee variables to store references to the various employee objects.
 * Include a PieceWorker object in the array. In a loop, calculate the payroll for each Employee polymorphically,
 * and add a $100.00 bonus to the person’s payroll amount if the current month is the one in which the Employee’s birthday occurs.
 *
 * (10.8 and 10.10)
 * Additional Notes:
 * Adding a birthdate to the Employee class will require you to rewrite the constructors for Employee and all its subclasses.
 * Hint: The PieceWorker class most closely resembles a CommissionEmployee.
 *
 *
 */

public class PieceWorker extends Employee {
	private double wage; // wage per piece
	private double pieces; // number of pieces produced

	// PieceWorker six-argument constructor
	public PieceWorker(String first, String last, String ssn, Date dayOfBirth,
			double wage, double pieces) {
		super(first, last, ssn, dayOfBirth);
		setWage(wage); // validate and store wage
		setPieces(pieces); // validate and store pieces;
	} // end six-argument PieceWorker constructor

	// set wage
	public final void setWage(double Wage) {
		wage = (Wage < 0.0) ? 0.0 : Wage;
	} // end method setWage

	// return wage
	public double getWage() {
		return wage;
	} // end method getWage

	// set Pieces produced
	public final void setPieces(double Pieces) {
		pieces = ((Pieces >= 0.0) && (Pieces <= 168.0)) ? Pieces : 0.0;
	} // end method setPieces

	// return pieces
	public double getPieces() {
		return pieces;
	} // end method getPieces

	// calculate earnings; override abstract method earnings in Employee
	public double earnings() {
		return getWage() * getPieces();
	} // end method earnings

	// return String representation of PieceWorker object
	@Override
	public String toString() {
		return String.format("Piece Worker: %s\n%s: $%,.2f; %s: %,.2f",
				super.toString(), "Wage per piece", getWage(),
				"Number of pieces produced", getPieces());
	} // end method toString

}

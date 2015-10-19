/*
 *	File Name:  Employee.java
 *	Program:    Employee
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
// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Date birthDate;

	// three-argument constructor
	public Employee(String first, String last, String ssn, Date dayOfBirth) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		/// never just assign an internal reference (birthDate) to an external reference (DayOfBirth)
		//birthDate = dayOfBirth;
		/// always create a new instance for your internal reference
		birthDate = new Date( dayOfBirth.getMonth(), dayOfBirth.getDay(), dayOfBirth.getYear() );
	} // end three-argument Employee constructor

	// set first name
	public void setFirstName(String first) {
		firstName = first; // should validate
	} // end method setFirstName

	// return first name
	public String getFirstName() {
		return firstName;
	} // end method getFirstName

	// set last name
	public void setLastName(String last) {
		lastName = last; // should validate
	} // end method setLastName

	// return last name
	public String getLastName() {
		return lastName;
	} // end method getLastName

	// set social security number
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn; // should validate
	} // end method setSocialSecurityNumber

	// return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber

	// set employee birthday
	public void setBirthDay(Date DayOfBirth) {
		/// never just assign an internal reference (birthDate) to an external reference (DayOfBirth)
		birthDate = DayOfBirth;
		/// always create a new instance for your internal reference
		/// birthDate = new Date( DayOfBirth.getMonth(), DayOfBirth.getDay(), DayOfBirth.getYear() );
	}// end method

	// accessor to get employee birthday
	public Date getBirthday() {
		/// this is also dangerous
		/// you are handing the external program an open reference to a private object in your class
		/// now the external program can change the birthDate of the employee without using the set method
		return birthDate;
	}

	// return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",
				getFirstName(), getLastName(), getSocialSecurityNumber(),
				getBirthday());
	} // end method toString

	// abstract method overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
} // end abstract class Employee

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

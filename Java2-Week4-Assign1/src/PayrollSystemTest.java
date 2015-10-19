/*
 *	File Name:  PayrollSystemTest.java
 *	Program:    PayrollSystemTest
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
// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

/// birthDate assigned an external reference in Employee class: -5 points

public class PayrollSystemTest {
	public static void main(String[] args) {
		// create subclass objects
		Date currentDate = new Date(2, 16, 2012);
		// Print Current Date
		System.out.printf("Current Date is: %s\n", currentDate.toString());

		// Create Salaried employee
		SalariedEmployee salariedEmployee = new SalariedEmployee("John",
				"Smith", "111-11-1111", new Date(1, 11, 1981), 800.00);

		// Create Hourly employee
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price",
				"222-22-2222", new Date(5, 14, 1956), 16.75, 40);

		// Create Commission employee
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue",
				"Jones", "333-33-3333", new Date(2, 12, 1972), 10000, .06);

		// Create BasePlusCommission employee
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "444-44-4444", new Date(11, 23, 1968), 5000,
				.04, 300);

		// Create PieceWorker employee
		PieceWorker pieceWorker = new PieceWorker("John", "Rambo",
				"936-01-1758", new Date(7, 6, 1947), 8, 66);

		System.out.println("Employees processed individually:\n");

		System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned",
				salariedEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned",
				hourlyEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned",
				commissionEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee,
				"earned", basePlusCommissionEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", pieceWorker, "earned",
				pieceWorker.earnings());

		// create five-element Employee array
		Employee[] employees = new Employee[5];

		// initialize array with Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		employees[4] = pieceWorker;

		System.out.println("Employees processed polymorphically:\n");

		// generically process each element in array employees
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee); // invokes toString

			// determine whether element is a BasePlusCommissionEmployee
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				// downcast Employee reference to
				// BasePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

				double oldBaseSalary = employee.getBaseSalary();
				employee.setBaseSalary(1.10 * oldBaseSalary);

				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						employee.getBaseSalary());
			} // end if

			if (currentDate.getMonth() == currentEmployee.getBirthday()
					.getMonth()) {
				System.out
						.printf("earned $%,.2f. %s\n\n",
								currentEmployee.earnings() + 100.00,
								"Note: added a $100 bonus to your payroll amount for birthday!!!");
			} else {
				System.out.printf("earned $%,.2f\n\n",
						currentEmployee.earnings());
			}
		} // end for

		// get type name of each object in employees array
		for (int j = 0; j < employees.length; j++)
			System.out.printf("Employee %d is a %s\n", j, employees[j]
					.getClass().getName());
	} // end main
} // end class PayrollSystemTest

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

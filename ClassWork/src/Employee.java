/*
Write a class Employee with the following specifications:

Fields: (Make all of them private)

Name - Name of employee
Id - Employee id
Salary - Employee salary
Age - Employee age
Position - Employee title

Constructors

Write at least two constructors.

Static field:

Include at least one static field.

Methods: (You can decide whether they should be public or private)

    getFedTax() – Returns (int) federal tax withheld. Computed as follows: multiply (salary – 800) by 17%.
    getSsTax(rate) – returns (int) social security tax withheld, rate% of salary; rate is int.
    getHealthFee(rate) – returns(int) health coverage employee contribution, rate% of salary; rate is int.
    getInsurance() – returns (int) employee contribution for insurance coverage. Amount of deduction is computed as follows:
	 If the employee is under 40 rate is 3% of salary, if the employee is between 40 and 50 rate is 4% of salary, and if the employee is between 50 and 60 rate is 5% of salary. If the employee is above 60 the rate is 6% of salary.
    getNetPay() -returns (double) the net pay for the employee after deducting from salary, the deductions: ss(1), health(3), fed_tax() and insurance.

Write an appropriate main class with a main() method to create two employee objects, and print information.
*/
import java.util.*;

public class Employee {

	// Name of employee
	private String name;

	// Employee id
	private int id;

	// Employee salary
	private double salary;

	// Employee age
	private int age;

	// Employee title
	private String position;

	// Include at least one static field.
	//
	// Stores the number of instances of this class
	private static int count = 0;

	/**
	 * Write at least two constructors.
	 *
	 * FIRST - Default Constructor.
	 */
	public Employee() {
		// increment the counter.
		count++;
	}

	/**
	 * Write at least two constructors.
	 *
	 * SECOND - Useful constructor that initializes the attributes of the
	 * Employee.
	 */
	public Employee(String name, int id, double salary, int age, String position) {
		// increment the counter.
		count++;
		// set the value of the attributes.
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.position = position;
	}

	/**
	 * 1. Returns (int) federal tax withheld. Computed as follows: multiply
	 * (salary - 800) by 17%.
	 */
	public double getFedTax() {
		return (salary - 800) * 0.17;
	}

	/**
	 * 2. Returns (int) social security tax withheld, rate% of salary; rate is
	 * int.
	 */
	public int getSsTax(int rate) {
		return (int) (rate * salary / 100.00);
	}

	/**
	 * 3. Returns(int) health coverage employee contribution, rate% of salary;
	 * rate is int.
	 */
	public int getHealthFee(int rate) {
		return (int) (rate * salary / 100.00);
	}

	/**
	 * 4. Returns (int) employee contribution for insurance coverage. Amount of
	 * deduction is computed as follows: If the employee is under 40 rate is 3%
	 * of salary, if the employee is between 40 and 50 rate is 4% of salary, and
	 * if the employee is between 50 and 60 rate is 5% of salary. If the
	 * employee is above 60 the rate is 6% of salary.
	 */
	public int getInsurance() {
		int rate = 0;
		if (age < 40) {
			rate = 3;
		} else if (age > 40 && age <= 50) {
			rate = 4;
		} else if (age > 50 && age <= 60) {
			rate = 5;
		} else {
			rate = 6;
		}
		return (int) (rate * salary / 100.00);
	}

	/**
	 * 5. Returns (double) the net pay for the employee after deducting from
	 * salary, the deductions: ss(1), health(3), fed_tax() and insurance.
	 */
	public double getNetPay() {
		return salary - getSsTax(1) - getHealthFee(3) - getFedTax()
				- getInsurance();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * Returns a string representation of the object. In general, the toString
	 * method returns a string that "textually represents" this object. The
	 * result should be a concise but informative representation that is easy
	 * for a person to read. It is recommended that all subclasses override this
	 * method.
	 */
	@Override
	public String toString() {
		String s = "";

		s += "\nName:\t\t" + getName();
		s += "\nId:\t\t" + getId();
		s += "\nSalary:\t\t$" + getSalary();
		s += "\nAge:\t\t" + getAge();
		s += "\nPosition:\t" + getPosition();
		s += "\nFed Tax:\t$" + getFedTax();
		s += "\nSS Tax:\t\t$" + getSsTax(1);
		s += "\nHealth Fee:\t$" + getHealthFee(3);
		s += "\nInsurance:\t$" + getInsurance();
		s += "\nNet Pay:\t$" + getNetPay();

		return s;
	}

	/**
	 * Write an appropriate main class with a main() method to create two
	 * employee objects, and print information.
	 */
	public static void main(String[] args) {
	
		int numOfEmp = 0;	
		Scanner scanner = new Scanner(System.in);
		Employee john = new Employee();
		System.out.println("Enter the number of employees you want to enter: ");
		numOfEmp = scanner.nextInt();
		for (int i = 1; i <= numOfEmp ; i++)
		{
			System.out.println("Enter the employee age: ");
			int ageemp = scanner.nextInt();
			john.setAge( ageemp );
			System.out.println("Enter the employee ID: ");
			int Idnum = scanner.nextInt();
			john.setId(Idnum);
			System.out.println("Enter the employee name: ");
			String nameemp = scanner.next();
			john.setName( nameemp );
			System.out.println("Enter the employee position: ");
			String positionemp = scanner.next();
			john.setPosition( positionemp );
			System.out.println("Enter the employee salary: ");
			double sal = scanner.nextDouble();
			john.setSalary(sal);
			System.out.println(john);
		   int count = i;
			System.out.println("Employee Count: " + count);
			}
			
	}
}

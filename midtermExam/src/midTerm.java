
import java.util.Scanner;

/*
 * Benjamin Rich
 * CIST2371 - Java Programming I 
 * MidTerm Exam 
 * 11/3/2011
 * Main Program
 */

public class midTerm {
	
	static Employee employeeOne = new Employee();
	static String employeeName = "null";
	static double payRate = 0;
	static double hoursWorked = 0;
	
	static Employee employeeTwo = new Employee();
	static String employeeName2 = "null";
	static double payRate2 = 0;
	static double hoursWorked2 = 0;
	

	
	public static void main(String[] args) {
		//midTerm runner = new midTerm();
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		

		System.out.println("Enter the Employee name: ");
		String employeeName = sc.next();
		employeeOne.setEmployeeName(employeeName);
		System.out.println("Enter the Employee pay rate: ");
		double payRate = sc.nextDouble();
		employeeOne.setPayRate(payRate);
		System.out.println("Enter the Employee hours worked: ");
		double hoursWorked = sc.nextDouble();
		employeeOne.setHoursWorked(hoursWorked);
		
		System.out.println("Enter the second Employee name: ");
		String employeeName2 = sc.next();
		System.out.println("Enter the second Employee pay rate: ");
		double payRate2 = sc.nextDouble();
		System.out.println("Enter the second Employee hours worked: ");
		double hoursWorked2 = sc.nextDouble();
		employeeTwo.setEmployeeName2(employeeName2, payRate2, hoursWorked2);
		
		
		System.out.println("Employee one name is: " + employeeOne.getName());
		System.out.println("Employee one salary is: " + "$" + getSalary());
		
		System.out.println("\n");
		System.out.println("Employee two name is: " + employeeTwo.getName());
		System.out.println("Employee two salary is: " + "$" + getSalary2());


	}
	
	public static double getSalary() {
		double retval = 0;
		if ( employeeOne.getHoursWorked() > 60 )
		{
			retval = Math.round(0);
		}else if(employeeOne.getHoursWorked() > 40 )
		{
		
			double overTime = (employeeOne.getHoursWorked() - 40);
			double overTimePay = ( employeeOne.getPayRate() * 1.5);
			retval = Math.round(employeeOne.getPayRate()  * employeeOne.getHoursWorked() + overTimePay);
		}else 
		{
			retval = Math.round(employeeOne.getPayRate() * employeeOne.getHoursWorked());
		}		
		return retval;
	}
	
	public static double getSalary2() {
		double retval = 0;
		if ( employeeTwo.getHoursWorked() > 60 )
		{
			retval = Math.round(0);
		}else if(employeeTwo.getHoursWorked() > 40 )
		{
			double overTime = (employeeTwo.getHoursWorked() - 40);
			double overTimePay = ( employeeTwo.getPayRate() * 1.5);
			retval = Math.round(employeeTwo.getPayRate()  * employeeTwo.getHoursWorked() + overTimePay);
		}else 
		{
			retval = Math.round(employeeTwo.getPayRate() * employeeTwo.getHoursWorked());
		}		
		return retval;
	}
	

	
	

	

}

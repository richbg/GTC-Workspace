/*
 * Benjamin Rich
 * CIST2371 - Java Programming I 
 * MidTerm Exam 
 * 11/3/2011
 * Employee Class
 */


public class Employee {
	
	private String employeeName = "none";
	private double hoursWorked = 0;
	private double payRate = 0.00;
	
	
	
	public Employee () 
	{
		employeeName = "blank";
		hoursWorked = 0;
		payRate = 0.00;
	}
	
	public Employee ( String nName, double hWorked, double pRate )
	{
		employeeName = nName;
		hoursWorked = hWorked;
		payRate = pRate;
	}

	
	
	public String getName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setEmployeeName2(String nName, double hWorked, double pRate) {
		this.employeeName = nName;
		this.hoursWorked = hWorked;
		this.payRate = pRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	

	

}

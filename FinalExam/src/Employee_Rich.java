/*
 Benjamin Rich CIST2371-Java Programming I (20393) 
 December 12, 2011
 Final Exam Part Two - Class Employee_Rich
*/


public class Employee_Rich {
	
	private String employeeName = "none";
	private double hoursWorked = 0;
	private double payRate = 0.00;
	private double overTimeHours = 0;
	private double salary = 0.00;
	
	
	public Employee_Rich () 
	{
		employeeName = "blank";
		hoursWorked = 0;
		payRate = 0.00;
	}
	
	public Employee_Rich ( String nName, double hWorked, double pRate )
	{
		employeeName = nName;
		hoursWorked = hWorked;
		payRate = pRate;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
	public double getOverTimeHours() {
		return overTimeHours;
	}
	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
	
	
	public double getSalary() {
		
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}

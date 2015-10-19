package ClassExamples10202011;

public class Employee {
	
	private String empName = "";
	
	public Employee (String newEmpName)
	{
		empName = newEmpName;
	}
	
	public String getName()
	{
		return empName;
	}
	
	public void openFirstDoor()
	{
		System.out.println(this.getName());
		System.out.println("\n Opening first door");
	}

}

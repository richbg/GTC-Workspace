package ClassExamples10202011;

public class Usage {

	
	public static void main (String[] args)
	{
		Employee t = new Employee("Thomas");
		String outPut = t.getName();
		
		System.out.println("Name:" + outPut);
		t.openFirstDoor();
		
		Supervisor s = new Supervisor("Susan");
		outPut = s.getName();
		System.out.println("Name: " + outPut);
		
		s.openFirstDoor();
		s.openSecondDoor();
	}
}

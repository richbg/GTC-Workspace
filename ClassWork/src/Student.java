class Student
{
	private String name;
	private String address;
	private int age;
	private boolean active;

	private static String name2 = "Tim";
	
	public Student()
	{
		name = "none";
		address = "blank";
		setAge(0);
		active = false;
		name2 = "Tom";

	}

	public Student(  String nName, String nAddress, int nAge, boolean nActive )
	{
		name = nName;
		address = nAddress;
		setAge(nAge);
		active = nActive;
	}
	
	public void setName( String newName )
	{
		name = newName;
	}
	
	public String getName(  )
	{
		return name;
	}
	
	public String getAddress(  )
	{
		return address;
	}

	public int getAge(  )
	{
		return age;
	}

	public void status(  )
	{
		System.out.println( active );
	}
	
	
	private double calculateSomething(  )
	{
		double result = 112.5;
		return result;
	}

	public static int calculateSomething2(  )
	{
		return 100;
	}

	public static String getName2(  )
	{
		return name2;
	}

	public static void setName2( String pname2  )
	{
		name2 = pname2;
	}

	public void displayInformation() {
		// TODO Auto-generated method stub
		
	}

	public void updateActive() {
		// TODO Auto-generated method stub
		
	}

	public void overrideActiveStatus(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public int yearsLeft() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setAge(int age) {
		this.age = age;
	}

						
}


public class ClassExamples {


// Examples of how functions in java called Methods work and are done 
	
	public static void main(String[] args)
	{
		displayOutput();
		displayOutputTwo( "This is muy fun" );
		
		String a = "Testing";
		displayOutputTwo(a);	
	
		displayCalculationResult(5, 4);
	
		int i = 10; 
		
		int j = calculateResult(3, 4, 5);
		System.out.println(j);
		
		System.out.println( calculateResult(30, 40, 51));
		
		Student stuOne = new Student();
		stuOne.setName("Lisa Johnson Smith" );
		System.out.println(stuOne.getName());
		
		Student stuTwo = new Student (" Michael", "321 acb drive....", 40, true );
		
		
		
		/*
		Student stuOne = new Student();
		stuOne.name = "Tom";
		System.out.println(stuOne.name);
		*/
		

	}
	
	public static void displayOutput( ) 
	{
		System.out.println( "Please wake up ...");
	}
	
	public static void displayOutputTwo(String message ) 
	{
		System.out.println( message );
	}
	
	public static void displayCalculationResult( int num1, int num2) 
	{
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public static int calculateResult ( int num1, int num2, int num3 ) 
	{
		int result = num1 + num2 + num3;
		return result;
	}
	
	

}

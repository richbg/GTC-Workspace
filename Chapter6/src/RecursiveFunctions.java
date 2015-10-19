
public class RecursiveFunctions {

	public static void main(String[] args) {

		System.out.println(" Factorial is "  + factorial ( 1 ) );



	}

	public static int factorial ( int num ) 
	{
		if (( num != 0 ) && ( num > 0 ) )
		{

			if ( num <= 1 )
			{
				return 1;
			}else
			{
				return ( num * factorial ( num -1 ) );
			}
		}

		else 
		{ 
			System.out.println(" Invalid data " );
			return 0;
		}
	}

	public static int sum ( int num1, int num2 )
	{
		return num2;

	}
}

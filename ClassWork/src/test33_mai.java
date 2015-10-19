import java.text.*;
import java.util.*;

public class test33_mai
{
	public static void main(String[] args) 
	{
	
		Student studentOne = new Student();
		studentOne.displayInformation();
		
		studentOne.updateActive();
		studentOne.displayInformation();
		
		studentOne.overrideActiveStatus(false); 
		studentOne.displayInformation();

		//studentOne.name = "Lisa";
		
		//studentOne.updateName("Lisa");
		studentOne.displayInformation();
		
		studentOne.setAge(55);
		int years = studentOne.yearsLeft();
		System.out.println( years );
		
		studentOne.setName("Tom");
		System.out.println( studentOne.getAge() );
		studentOne.displayInformation();
		
		//System.out.println( studentOne.name );
		

		int n;
		n = 1;

		Random myRandomNumber = new Random( );
		//int m;
		 		 
		double j = 2.00001;
		double k = Math.pow(j,4);		
	
		System.out.println( k );
		
		DecimalFormat myDF = new DecimalFormat( "0.00" );
		String m = myDF.format( 17.8989898 );		
		System.out.println("$" + m );	
		
		double myNumber = Math.random();
		System.out.println( myNumber );	
		
		int myIntNumber = 8;
		System.out.println( myIntNumber );

		if(  (myIntNumber % 2) ==  0  )
		{
			System.out.println( "myIntNumber is even" );
		}
		else
		{
			System.out.println( "myIntNumber is odd" );
		}



	
/*
		while( n < 100 )
		{
			m = myRandomNumber.nextInt();
			System.out.println( m );
			n++;	
		}
*/
  		
	}
}

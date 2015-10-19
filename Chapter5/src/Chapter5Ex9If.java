import java.util.Scanner;

public class Chapter5Ex9If {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		sc.useDelimiter (System.getProperty("line.separator"));

		System.out.print(" Enter a  number between 6 and 100 " );

		int num =  sc.nextInt();

		checkHowBig(num);


	}

	private static void checkHowBig(int num) {
		if (num < 6 )
		{
			System.out.println("number is not even a million: " + num );
		}else if(num <9 && num > 5 )
		{
			System.out.println("number is a million: 10^ " + num);
		}else if ( num > 9 && num < 12)
		{
			System.out.println("number is a trillion: 10^ " + num);
		}else if ( num > 12 && num < 15 )
		{
			System.out.println("number is a Quadrillion: 10^ " + num);
		}else if (num > 15 && num < 18)
		{
			System.out.println("number is a Quintillion: 10^ " + num);
		}else if ( num > 18 && num < 21 )
		{
			System.out.println("number is a Sextillion: 10^ " + num);
		}else if (num > 21 && num < 30 )
		{
			System.out.println("number is a Nonillion: 10^ " + num);
		}else if ( num > 30 && num < 100 )
		{
			System.out.println("number is a Googol: 10^ " + num);
		}else 
		{
			System.out.println("the number is greater than he range.");
		}


	}


}

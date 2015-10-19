import java.util.Scanner;


public class Chapter6Ex7 {


	public static void main(String[] args) {

		boolean repeat = true;
		int i, j;
		int num = 0;
		Scanner scanner = new Scanner(System.in);


		do
		{	
			System.out.println("Enter a number:");
			num = Integer.parseInt(scanner.next());

			if (num < 0)
			{
				System.out.println("The number is negative, execution will stop");
				break;
			}


			for (i=2; i < num; i++ )
			{
				if ((num%i) == 0 )
				{
					j = i;
					System.out.println("The number is not a prime because is a multiple of:" + j);
					break;
				}		
			}
			if ((num%i) != 0 )
			{	
				System.out.println("This is a prime number!");
				break;
			}

		}
		while ( repeat );	
	}
}
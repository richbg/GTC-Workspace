import java.util.Scanner;


public class Chapter6Ex15 {

	
	public static void main(String[] args) {

		int i,count = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = Integer.parseInt(scanner.next());
		//System.out.println("Prime number: ");

		for (i=2; i < num; i++ )
		{
			if ((num%i) == 0)
			{
				count = count + i;
				System.out.println(" The numbers divisors are: " + i);
				
			}
		}
		if ((count + 1) == num)
		{
			System.out.println("This is a positive perfect number and is also divisible by 1"); 
			
		}
		else
		{
			System.out.println("The number is not a perfect number");
		}
	}
}
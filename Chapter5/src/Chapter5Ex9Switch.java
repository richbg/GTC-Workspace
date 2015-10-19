import java.util.Scanner;

public class Chapter5Ex9Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.useDelimiter (System.getProperty("line.separator"));

		System.out.print(" Enter a  number between 6 and 100 " );

		int num =  sc.nextInt();

		checkHowBig(num);

	}

	private static void checkHowBig(int num) {

		int num2 = num / 3;

		switch(num2)
		{
		case 0:
		case 1:
			System.out.println("number is not even a million: 10^ " + num);
			break;
		case 2:
			System.out.println("Your number is a million: 10^ " + num);
			break;
		case 3:
			System.out.println("number is a billion: 10^ " + num);
			break;
		case 4:
			System.out.println("number is a trillion: 10^ " + num);
			break;
		case 5:
			System.out.println("number is a quadrillion: 10^ " + num);
			break;
		case 6:
			System.out.println("number is a quintillion: 10^ " + num);
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("number is a sextillion: 10^ " + num);
			break;

		default:
			int num3 = num / 100;

			switch (num3) {
			case 0:
				System.out.println("number is a nonillion: 10^ " + num);
				break;
			case 1:
				System.out.println("number is a googol: 10^ " + num);
				break;
			default:
				System.out.println("Number is greater than googol: 10^ "+ num);
				break;
			}
		}

	}

}

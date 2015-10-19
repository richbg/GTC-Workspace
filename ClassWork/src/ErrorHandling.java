import java.util.InputMismatchException;
import java.util.Scanner;


public class ErrorHandling {

	
	public static void main(String[] args) {
		
		int dataUserProvided = 0;
		
		Scanner myScan = new Scanner(System.in);
		myScan.useDelimiter(System.getProperty("line.separator"));
		
		try{
		System.out.println("Type in a number: " );
		dataUserProvided = myScan.nextInt();
		System.out.println("You entered: " + dataUserProvided);
		}catch( InputMismatchException ime ) {
			System.out.println("You entered the wrong type of data.: " + dataUserProvided);
			
		}
		


	}

}

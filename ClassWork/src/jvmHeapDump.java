import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class jvmHeapDump {

	static int userProvidedInput = 0;
	
	
	
	
	public static void main(String[] args) {
		
		getJpsInfo();
		getInput();

	}

	private static void getJpsInfo() {
		String s = null;
		try {
			Process jps = Runtime.getRuntime().exec("/usr/local/jdk/bin/jps -l");
			
			BufferedReader stdInput = new BufferedReader(new
					InputStreamReader(jps.getInputStream()));
			
			BufferedReader stdError = new BufferedReader(new
					InputStreamReader(jps.getErrorStream()));
			
			System.out.println("Standard output: \n");
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}
			
			System.out.println("Standard error: \n");
			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (IOException e) {
			System.out.println("exception occured: ");
			e.printStackTrace();
		}
		
	}

	private static void getInput() {
		//String input;
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter (System.getProperty("line.separator"));
		System.out.print("Input the PID you would like to to process: " );
		userProvidedInput = sc.nextInt();
		
	}

}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class fileReader {

	
	public static void main(String[] args) throws IOException {
		
		File myFile = new File("example.txt");
		FileReader  myFileReader  = new FileReader(myFile);
		BufferedReader myBufReader = new BufferedReader(myFileReader);
		
		/*System.out.println(myBufReader.readLine());
		System.out.println(myBufReader.readLine());
		System.out.println(myBufReader.readLine());*/
		
		String tempString = myBufReader.readLine();
		
		while ( tempString != null )
		{
			System.out.println(tempString);
			tempString = myBufReader.readLine();
		}
		
		myBufReader.close();

	}

}

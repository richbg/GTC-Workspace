import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class classExamples {

	public static void main(String[] args) throws IOException { 
		
		File myFile = new File("example.txt");
		
		FileOutputStream  outFileStream  = new FileOutputStream(myFile);
		
		PrintWriter outStream = new PrintWriter(outFileStream);
		
		int count = 1;
		while (count <= 20)
		{
			outStream.println(count);
			count = count + 1;
			
		}
		
		outStream.close();
		
		System.out.println("Wrote to the file successfully");

	}

}

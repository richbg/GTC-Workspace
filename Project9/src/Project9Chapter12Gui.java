/* 
 * Benjamin Rich 
 * Java CIST2371 
 * Project 9 Chapter 12 
 * 20111110
 */

import java.awt.*; 
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

 
public class Project9Chapter12Gui extends Frame{ 

  TextField textfield1; 
  Button button;
  TextArea textarea = new TextArea ("Display: \n",15,15,15);
  
  String temp; 


	public Project9Chapter12Gui() {

		setSize(300, 300);
		setTitle("GUI Problem 9");
		setLayout(new FlowLayout());
		textfield1 = new TextField("", 4);
		button = new Button("Click Me");
		add(textfield1);
		add(button);
		add(textarea);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				temp = textfield1.getText();
				
				// Write out data entered from textfield1 into filename ben.txt
				File myFileWrite = new File("rich.txt");
				FileOutputStream outFileStream = null; 
				
				// try,catch block for writing to file
				try {
					outFileStream = new FileOutputStream(myFileWrite);
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				}
				PrintWriter outStream = new PrintWriter(outFileStream);
				
				outStream.println(temp);
				outStream.close();		// close the file		
				
				// Read data from file rich.ext 
				File myFileRead = new File("rich.txt");
				FileReader myFileReader = null;
				
				// try,catch block for reading from file
				try {
					myFileReader = new FileReader(myFileRead);
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				}
				BufferedReader myBufReader = new BufferedReader(myFileReader);
				
				String tempString = null;
				
				try {
					tempString = myBufReader.readLine();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				textarea.append(tempString);
				textarea.append("\n");
				
				try {
					myBufReader.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				

			}
		});
	}

	public static void main(String[] args) {
		Project9Chapter12Gui myGuiExampleObject = new Project9Chapter12Gui();
		myGuiExampleObject.setVisible(true);

	}

}

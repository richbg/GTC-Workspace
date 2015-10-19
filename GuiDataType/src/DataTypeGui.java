import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JRadioButton;

/*
- Write a GUI program that does the following:
- Ask users to enter a date into a text field box
- Ask the user to specify which date format to display as (using drop-down list or radio box with 3 options for 3 different date formats)
- When the 'Display' button is clicked, the program should display the correct date format in a text area box
 */


public class DataTypeGui extends Frame {

	TextField textfield1;
	Button button;
	TextArea textarea = new TextArea("Formatted Date: \n", 30, 30, 30);

	public DataTypeGui() {

		setSize(400, 450);
		setTitle("Enter a Date in the text field & choose a format");
		setLayout(new GridLayout(0,1));
		textfield1 = new TextField("", 20);
		button = new Button("Display Format");
		add(textfield1);
		add(button);
		Label la = new Label("What is your choice:");
		add(la);
		add(new JRadioButton("YYMMDD", false));
		add(new JRadioButton("Date2", false));
		add(new JRadioButton("Date3", false));
		add(textarea);
	
		

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp1;
				temp1 = textfield1.getText();
				//textarea.append("Formatted Date " );
				//textarea.append("\n");
				

			}
		});
	}

	public static void main(String[] args) {
		DataTypeGui myGuiExampleObject = new DataTypeGui();
		myGuiExampleObject.setVisible(true);

	}
}

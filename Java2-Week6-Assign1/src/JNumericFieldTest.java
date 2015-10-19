/*
 *	File Name:  JNumericFieldTest.java
 *	Program:    JNumericFieldTest
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 6 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Write a class JNumericField that extends JTextField so that only valid numeric input can be typed into the field.  
 * Include a method getNumber that returns the numeric value of the field as a double value.  
 * Write a test program that uses an instance of JNumericField to get numeric input from a user and then 
 * displays the numeric input and twice the numeric input in a JLabel.
 * 
 */

import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JNumericFieldTest extends JFrame {
	JNumericField textfield1;
	JButton button;
	double i;

	public JNumericFieldTest() {
		setTitle("JNumericField Program"); // set Frame Title
		setSize(300, 300);	// Set Frame size
		setLayout(new FlowLayout(FlowLayout.LEFT)); // setLayout to FlowLayout
		setCursor(new Cursor(Cursor.HAND_CURSOR));  // change the cursor to a Hand
		final JNumericField txtField1 = new JNumericField(20); 
		JLabel jLabel1 = new JLabel("Enter only numbers: ");
		add(jLabel1);
		add(txtField1);
		JButton jButton1 = new JButton("Enter");
		add(jButton1);
		final JLabel output = new JLabel("");
		add(output);
		final JLabel output2 = new JLabel("");
		add(output2);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				i = txtField1.getNumber();
				output.setText(String.format("Numeric input entered: " + i ));
				output2.setText(String.format("Twice the numeric input is: " + (i * 2)));
				
			}
		});

	}

	public static void main(String[] args) {
		JNumericFieldTest frame = new JNumericFieldTest();
		frame.setVisible(true);
	}// end main

} //end class JNumericFieldTest
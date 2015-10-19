/*
 *	File Name:  JNumericField.java
 *	Program:    JNumericField
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

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class JNumericField extends JTextField {
	
	// constructor JNumbericField accepts an integer 
	public JNumericField(int columns) {
		super(columns);
	}

	// Overrides: createDefaultModel() in JTextField
	protected Document createDefaultModel() {
		return new NumericDocument();
	}

	// method getNumber returns the numeric value of the field as a double value
	public double getNumber() {
		try {
			return Double.parseDouble(getText());
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	private class NumericDocument extends PlainDocument {
		private double i;

		public void insertString(int offs, String str, AttributeSet a)
				throws BadLocationException {
			if (str == null) {
				return;
			}

			// Create a string with entire text including text being input
			String text = getText(0, offs) + str;
			try {
				// Use Double.parseDouble() method to determine if text is numeric.  
				// Catch the NumberFormatException
				i = Double.parseDouble(text);
				super.insertString(offs, str, a);
			} catch (NumberFormatException nfe) {
			}
		}
	}

}// end class JNumericField
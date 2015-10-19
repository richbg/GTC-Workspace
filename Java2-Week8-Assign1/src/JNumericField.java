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

@SuppressWarnings("serial")
public class JNumericField extends JTextField {
	public JNumericField(int cols) {
		super(cols);
	}

	public JNumericField() {
		super();
	}

	public JNumericField(String text) {
		super(text);
	}

	public JNumericField(String text, int cols) {
		super(text, cols);
	}

	protected Document createDefaultModel() {
		return new NumericDocument();
	}

	public double getNumber() {
		try {
			return Double.parseDouble(getText());
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	static class NumericDocument extends PlainDocument {
		private double x;

		public void insertString(int offs, String str, AttributeSet a)
				throws BadLocationException {
			if (str == null) {
				return;
			}

			if (offs == 0 && str.equals("-")) {
				super.insertString(offs, str, a);
			} else {
				String text = getText(0, offs)
						+ str
						+ getText(
								offs,
								((getLength() - offs) > 0) ? (getLength() - offs)
										: 0);
				try {
					x = Double.parseDouble(text);
					super.insertString(offs, str, a);
				} catch (NumberFormatException nfe) {
				}
			}
		}
	}

}
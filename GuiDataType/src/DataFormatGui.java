/**
 * @author Ben Rich
 * @since JDK 1.6.0
 */
/*
- Write a GUI program that does the following:
- Ask users to enter a date into a text field box
- Ask the user to specify which date format to display as (using drop-down list or radio box with 3 options for 3 different date formats)
- When the 'Display' button is clicked, the program should display the correct date format in a text area box
 */


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DataFormatGui extends JApplet {

	private static JTextField t1 = new JTextField(15);
	private static JTextArea t2 = new JTextArea(30, 30);

	private ButtonGroup g = new ButtonGroup();
	private ButtonGroup g2 = new ButtonGroup();

	private JLabel lb1 = new JLabel(
			"Enter a Date in the text field & choose a format");

	private JButton b1 = new JButton("Display Format");

	private static JRadioButton rb1 = new JRadioButton("MM/dd/yy", false);
	private static JRadioButton rb2 = new JRadioButton("dd-MMM-yy", false);
	private static JRadioButton rb3 = new JRadioButton("yy/MM/dd", false);

	private static String temp1 = null;

	private ActionListener al = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			temp1 = t1.getText();
			t2.append("Formatted Date: " + getSelected());
			t2.append("\n");

		}
	};

	public void init() {
		b1.addActionListener(al);
		g2.add(b1);
		g.add(rb1);
		g.add(rb2);
		g.add(rb3);
		t1.setEditable(true);
		t2.setEditable(false);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.LEFT));
		cp.add(lb1);
		cp.add(t1);
		cp.add(rb1);
		cp.add(rb2);
		cp.add(rb3);
		cp.add(b1);
		cp.add(t2);
	}

	public static void main(String[] args) {
		run(new DataFormatGui(), 550, 550);
		getSelected();
		;
	}

	private static Date getSelected() {
		Date retval = null;
		if (rb1.isSelected()) {
			Date s = null;
			Format formatter;
			Date date = new Date();
			formatter = new SimpleDateFormat("MM/dd/yy");
			try {
				s = ((DateFormat) formatter).parse(t1.getText());
			} catch (ParseException e) {
				t2.append("Invalid Date Entered\n");
				e.printStackTrace();
			}
			return s;
		} else if (rb2.isSelected()) {
			Date s = null;
			Format formatter;
			Date date = new Date();
			formatter = new SimpleDateFormat("dd-MMM-yy");
			try {
				s = ((DateFormat) formatter).parse(t1.getText());
			} catch (ParseException e) {
				t2.append("Invalid Date Entered\n");
				e.printStackTrace();
			}
			return s;
		} else if (rb3.isSelected()) {
			Date s = null;
			Format formatter;
			Date date = new Date();
			formatter = new SimpleDateFormat("yy/MM/dd");
			try {
				s = ((DateFormat) formatter).parse(t1.getText());
			} catch (ParseException e) {
				t2.append("Invalid Date Entered\n");
				e.printStackTrace();
			}
			return s;
		}
		return retval;

	}

	public static void run(JApplet applet, int width, int height) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(applet);
		frame.setSize(width, height);
		applet.init();
		applet.start();
		frame.setVisible(true);
	}
}
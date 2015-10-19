/*
 Benjamin Rich CIST2371-Java Programming I (20393) 
 December 12, 2011
 Final Exam Part Two - Main Program
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RichFinalExamPart2 extends JApplet {

	private static JTextField tf1 = new JTextField(15);
	private static JTextField tf2 = new JTextField(15);
	private static JTextField tf3 = new JTextField(15);
	private static JTextArea ta1 = new JTextArea(30, 30);
	private ButtonGroup g = new ButtonGroup();
	private ButtonGroup g2 = new ButtonGroup();
	private JLabel lb1 = new JLabel(
			"Enter Employee name, Hours worked & Pay rate");
	private JButton b1 = new JButton("Click Me");

	private static String temp1 = null;
	DecimalFormat money = new DecimalFormat("$0.00");

	static Employee_Rich employeeOne = new Employee_Rich();
	static String employeeName = "null";
	static double payRate = 0;
	static double hoursWorked = 0;

	private ActionListener al = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			employeeOne.setEmployeeName(tf1.getText());
			double hW = Double.parseDouble(tf2.getText());
			employeeOne.setHoursWorked(hW);
			double pR = Double.parseDouble(tf3.getText());
			employeeOne.setPayRate(pR);
			fileWriter();
			ta1.append("Employee Name:" + "\n" + employeeOne.getEmployeeName());
			ta1.append("\n" + "Salary is: " + "\n" +  money.format(getSalary()));
			ta1.append("\n");

		}

		private Double getSalary() {
			double retval = 0;
			if (employeeOne.getHoursWorked() > 60) {
				retval = -1;
			} else if (employeeOne.getHoursWorked() > 40) {
				retval = (1.5 * employeeOne.getPayRate())
						* (employeeOne.getHoursWorked() - 40)
						+ (employeeOne.getPayRate() * 40);

			} else {
				retval = (employeeOne.getPayRate()
						* employeeOne.getHoursWorked());
			}
			return retval;

		}

		private void fileWriter() {
			File myFileWrite = new File("output.txt");
			FileOutputStream outFileStream = null;

			// try,catch block for writing to file
			try {
				outFileStream = new FileOutputStream(myFileWrite);
			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}
			PrintWriter outStream = new PrintWriter(outFileStream);

			outStream.println(employeeOne.getEmployeeName() + "\n" 
					+ money.format(getSalary()));
			outStream.close(); // close the file

		}
	};

	public void init() {
		b1.addActionListener(al);
		g2.add(b1);
		ta1.setEditable(false);
		lb1.setAlignmentX(LEFT_ALIGNMENT);
		tf1.setAlignmentX(LEFT_ALIGNMENT);
		tf2.setAlignmentX(LEFT_ALIGNMENT);
		tf3.setAlignmentX(LEFT_ALIGNMENT);
		tf1.setToolTipText("Enter employee name here");
		tf2.setToolTipText("Enter hours worked here");
		tf3.setToolTipText("Enter pay rate here");
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.LEFT));
		cp.add(lb1);
		cp.add(tf1);
		cp.add(tf2);
		cp.add(tf3);
		cp.add(b1);
		cp.add(ta1);
		cp.setBackground(Color.orange);
		cp.setForeground(Color.white);
		cp.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	public static void main(String[] args) {
		run(new RichFinalExamPart2(), 375, 450);

		;
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
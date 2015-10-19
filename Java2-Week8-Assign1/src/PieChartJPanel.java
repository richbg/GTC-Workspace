/*
 *	File Name:  PieChartJPanel.java
 *	Program:    PieChartJPanel
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 8 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Write a program that inputs four numbers and graphs them as a pie chart.  
 * Use class Arc2D.Double and method fill of class Graphics2D to perform the drawing.  
 * Draw each piece of the pie in a separate color. (15.27)
 *
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PieChartJPanel extends JPanel {
	private JNumericField txtField1, txtField2, txtField3, txtField4;

	private static final String txtFieldString1 = "Enter a number for red   : ";
	private static final String txtFieldString2 = "Enter a number for green : ";
	private static final String txtFieldString3 = "Enter a number for blue  : ";
	private static final String txtFieldString4 = "Enter a number for black : ";

	public PieChartJPanel() {
		this.setLayout(new FlowLayout());

		//Create text fields;
		txtField1 = new JNumericField(3);
		txtField2 = new JNumericField(3);
		txtField3 = new JNumericField(3);
		txtField4 = new JNumericField(3);

		// Labels for text fields;
		JLabel label1 = new JLabel(txtFieldString1);
		label1.setLabelFor(txtField1);
		JLabel label2 = new JLabel(txtFieldString2);
		label2.setLabelFor(txtField2);
		JLabel label3 = new JLabel(txtFieldString3);
		label3.setLabelFor(txtField3);
		JLabel label4 = new JLabel(txtFieldString4);
		label4.setLabelFor(txtField4);

		// Buttons for Draw & Clear
		JButton calcButton = new JButton("Draw");
		JButton clrButton = new JButton("Clear");

		// Lay out for text controls & labels.
		JPanel textControlsPane = new JPanel();
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		textControlsPane.setLayout(gridbag);

		JLabel[] labels = { label1, label2, label3, label4 };
		JTextField[] textFields = { txtField1, txtField2, txtField3, txtField4 };

		addLabelTextRows(labels, textFields, gridbag, textControlsPane);

		c.gridwidth = GridBagConstraints.REMAINDER;
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 1.0;

		// Include all components
		JPanel leftPane = new JPanel(new BorderLayout());
		leftPane.add(textControlsPane, BorderLayout.PAGE_START);
		JPanel rightPane = new JPanel(new BorderLayout());
		rightPane.add(calcButton);
		rightPane.add(clrButton, BorderLayout.SOUTH);
		add(leftPane, BorderLayout.WEST);
		add(rightPane, BorderLayout.EAST);

		clrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				txtField1.setText("");
				txtField2.setText("");
				txtField3.setText("");
				txtField4.setText("");
				txtField1.requestFocus();
			}
		}); // end clearButton

		calcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				paint(getGraphics());
			}
		}); // end calculateButton

	} // end PieChartJPanel

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		double redDepth = txtField1.getNumber();
		double greenDepth = txtField2.getNumber();
		double blueDepth = txtField3.getNumber();
		double blackDepth = txtField4.getNumber();
		double total = redDepth + greenDepth + blueDepth + blackDepth;

		redDepth = (redDepth / total) * 360;
		greenDepth = (greenDepth / total) * 360;
		blueDepth = (blueDepth / total) * 360;
		blackDepth = (blackDepth / total) * 360;

		g2.setPaint(Color.RED);
		g2.fill(new Arc2D.Double(290, 100, 200, 200, 0, redDepth, Arc2D.PIE));
		g2.setPaint(Color.GREEN);
		g2.fill(new Arc2D.Double(290, 100, 200, 200, redDepth, greenDepth,
				Arc2D.PIE));
		g2.setPaint(Color.BLUE);
		g2.fill(new Arc2D.Double(290, 100, 200, 200, redDepth + greenDepth,
				blueDepth, Arc2D.PIE));
		g2.setPaint(Color.BLACK);
		g2.fill(new Arc2D.Double(290, 100, 200, 200, redDepth + greenDepth
				+ blueDepth, blackDepth, Arc2D.PIE));

	} // end paintComponent

	private void addLabelTextRows(JLabel[] labels, JTextField[] textFields,
			GridBagLayout gridbag, Container container) {
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.EAST;
		int numLabels = labels.length;

		for (int i = 0; i < numLabels; i++) {
			c.gridwidth = GridBagConstraints.RELATIVE;
			c.fill = GridBagConstraints.NONE;
			c.weightx = 0.0;

			container.add(labels[i], c);

			c.gridwidth = GridBagConstraints.REMAINDER;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.weightx = 1.0;

			container.add(textFields[i], c);

		} // end for loop

	} // end addLabelTextRows

	public void setLayout(String afterLastLine) {
		// TODO Auto-generated method stub
		
	}

} // end class PieChartJPanel
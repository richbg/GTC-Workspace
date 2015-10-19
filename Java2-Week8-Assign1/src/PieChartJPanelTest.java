/*
 *	File Name:  PieChartJPanelTest.java
 *	Program:    PieChartJPanelTest
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 8 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Write a program that inputs four numbers and graphs them as a pie chart.  
 * Use class Arc2D.Double and method fill of class Graphics2D to perform the drawing.  
 * Draw each piece of the pie in a separate color. (15.27)
 *
 */

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class PieChartJPanelTest {

	public static void main(String[] args) {
		// Frame for PieChartJPanel
		JFrame frame = new JFrame("Draw a pie chart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color c = new Color(255, 250, 250);
		Container con = frame.getContentPane();
		con.setBackground(c);

		PieChartJPanel jp = new PieChartJPanel();
		jp.setBackground(Color.DARK_GRAY);
		

		frame.setContentPane(jp);
		frame.setBackground(c);
		frame.setSize(800, 420);
		frame.setLocation(300, 200);
		frame.setVisible(true);
		frame.setResizable(false);

	} // end main

}

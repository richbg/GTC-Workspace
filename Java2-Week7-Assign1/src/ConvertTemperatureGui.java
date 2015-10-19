/*
 *	File Name:  ConvertTemperatureGui.java
 *	Program:    ConvertTemperatureGui
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 7 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Write a temperature conversion application that converts temperatures between three scales: 
 * Fahrenheit, Celsius, and Kelvin.  Use a JTextField to enter the temperature and display the 
 * converted temperature using a JLabel.  
 * The application should allow the user to make conversions between any two scales.  
 * Use the following formulas to convert temperatures:
 * Celsius  =  ( 5/9 )  ( Fahrenheit Ð 32 )
 * Kelvin  =  Celsius  +  273.15
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConvertTemperatureGui extends JFrame {
	private JPanel convertFrom, convertTo;
	private JLabel label1, label2, label3, label4;
	private JTextField temperature1, temperature2;
	private ButtonGroup radioFrom, radioTo;
	private JRadioButton celciusBoxTo, fahrenheitBoxTo, kelvinBoxTo,
			celciusBoxFrom, fahrenheitBoxFrom, kelvinBoxFrom;

	// set up GUI
	public ConvertTemperatureGui() {
		super("Temperature Conversion");

		fahrenheitBoxFrom = new JRadioButton("Fahrenheit", true);
		celciusBoxFrom = new JRadioButton("Celcius", false);
		kelvinBoxFrom = new JRadioButton("Kelvin", false);
		radioFrom = new ButtonGroup();
		radioFrom.add(fahrenheitBoxFrom);
		radioFrom.add(celciusBoxFrom);
		radioFrom.add(kelvinBoxFrom);

		fahrenheitBoxTo = new JRadioButton("Fahrenheit", false);
		celciusBoxTo = new JRadioButton("Celcius", true);
		kelvinBoxTo = new JRadioButton("Kelvin", false);
		radioTo = new ButtonGroup();
		radioTo.add(fahrenheitBoxTo);
		radioTo.add(celciusBoxTo);
		radioTo.add(kelvinBoxTo);

		convertFrom = new JPanel();
		convertFrom.setLayout(new GridLayout(1, 3));
		convertFrom.add(fahrenheitBoxFrom);
		convertFrom.add(celciusBoxFrom);
		convertFrom.add(kelvinBoxFrom);

		convertTo = new JPanel();
		convertTo.setLayout(new GridLayout(1, 3));
		convertTo.add(fahrenheitBoxTo);
		convertTo.add(celciusBoxTo);
		convertTo.add(kelvinBoxTo);

		label1 = new JLabel("Convert from:");
		label2 = new JLabel("Convert to:");
		label3 = new JLabel("Enter Numeric Temperature: ");
		label4 = new JLabel("Comparable Temperature is: ");

		temperature1 = new JTextField(10);
		temperature1.addActionListener(

		new ActionListener() { // anonymous inner class

					// perform conversions
					public void actionPerformed(ActionEvent event) {

						double convertTemp, temp;
						
						
							temp = Double.parseDouble(((JTextField) event
									.getSource()).getText());

						// fahrenheit to celcius

						if (fahrenheitBoxFrom.isSelected()
								&& celciusBoxTo.isSelected()) {
							convertTemp = (int) (5.0f / 9.0f * (temp - 32));
							temperature2.setText(String.valueOf(convertTemp));
						}
						// fahrenheit to kelvin
						else if (fahrenheitBoxFrom.isSelected()
								&& kelvinBoxTo.isSelected()) {
							convertTemp = (int) (5.0f / 9.0f * (temp - 32) + 273);
							temperature2.setText(String.valueOf(convertTemp));
						}

						// celcius to fahrenheit
						else if (celciusBoxFrom.isSelected()
								&& fahrenheitBoxTo.isSelected()) {
							convertTemp = (int) (9.0f / 5.0f * temp + 32);
							temperature2.setText(String.valueOf(convertTemp));
						}

						// celcius to kelvin
						else if (celciusBoxFrom.isSelected()
								&& kelvinBoxTo.isSelected()) {
							convertTemp = temp + 273;
							temperature2.setText(String.valueOf(convertTemp));
						}

						// kelvin to celcius
						else if (kelvinBoxFrom.isSelected()
								&& celciusBoxTo.isSelected()) {
							convertTemp = temp - 273;
							temperature2.setText(String.valueOf(convertTemp));
						}

						// kelvin to fahrenheit
						else if (kelvinBoxFrom.isSelected()
								&& fahrenheitBoxTo.isSelected()) {
							convertTemp = (int) (5.0f / 9.0f * (temp - 273) + 32);
							temperature2.setText(String.valueOf(convertTemp));
						}

					} // end method actionPerformed

				} // end anonymous inner class

				); // end call to addActionListener

		temperature2 = new JTextField(10);
		temperature2.setEditable(false);

		// add components to GUI
		Container container = getContentPane();
		container.setLayout(new GridLayout(8, 1));
		container.add(label1);
		container.add(convertFrom);
		container.add(label3);
		container.add(temperature1);
		container.add(label2);
		container.add(convertTo);
		container.add(label4);
		container.add(temperature2);

		setSize(300, 300);
		setVisible(true);

	} // end constructor

} // end class ConvertTemperatureGui
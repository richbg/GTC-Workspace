/*
 *	File Name:  TemperatureConvertApplet.java
 *	Program:    TemperatureConvertApplet
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 12 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *  
 * Rewrite exercise 14.13 (page 627) as an applet.  
 * Keep in mind the proper applet methods to place setup code and operational code.
 */


import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TemperatureConvertApplet extends Applet {
	
	TextField celsiusField = new TextField();
	TextField status = new TextField();
	TextField fahrenheitField = new TextField();
	TextField kelvinField = new TextField();
	Label fahrenheit = new Label();
	Label kelvin = new Label();
	Label celsius = new Label();
	Button fahrenheitKelvin = new Button();
	Button kelvinCelsius = new Button();
	Button fahrenheitCelsius = new Button();
	Button celsiusFahrenheit = new Button();
	Button kelvinFahrenheit = new Button();
	Button celsiusKelvin = new Button();
	
	public void init() {
		setLayout(null);
		setSize(450, 250);
		add(celsiusField);
		celsiusField.setBounds(12, 12, 62, 35);
		fahrenheit.setText("Fahrenheit");
		add(fahrenheit);
		fahrenheit.setBounds(84, 132, 66, 29);
		status.setEditable(false);
		status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		add(status);

		status.setBounds(10, 204, 420, 36);
		fahrenheitKelvin.setLabel("Fahrenheit -> Kelvin");
		add(fahrenheitKelvin);

		fahrenheitKelvin.setBounds(180, 156, 220, 24);
		kelvinCelsius.setLabel("Kelvin -> Celsius");
		add(kelvinCelsius);

		kelvinCelsius.setBounds(180, 72, 220, 24);
		add(fahrenheitField);
		fahrenheitField.setBounds(12, 132, 62, 35);
		kelvin.setText("Kelvin");
		add(kelvin);
		kelvin.setBounds(84, 72, 66, 29);
		fahrenheitCelsius.setLabel("Fahrenheit -> Celsius");
		add(fahrenheitCelsius);

		fahrenheitCelsius.setBounds(180, 132, 220, 24);
		celsiusFahrenheit.setLabel("Celsius -> Fahrenheit");
		add(celsiusFahrenheit);

		celsiusFahrenheit.setBounds(180, 36, 220, 24);
		add(kelvinField);
		kelvinField.setBounds(12, 72, 62, 35);
		celsius.setText("Celsius");
		add(celsius);
		celsius.setBounds(84, 12, 66, 29);
		kelvinFahrenheit.setLabel("Kelvin -> Fahrenheit");
		add(kelvinFahrenheit);

		kelvinFahrenheit.setBounds(180, 96, 220, 24);
		celsiusKelvin.setLabel("Celsius -> Kelvin");
		add(celsiusKelvin);

		celsiusKelvin.setBounds(180, 12, 220, 24);
		GetSelection getSelection = new GetSelection();
		celsiusKelvin.addActionListener(getSelection);
		celsiusFahrenheit.addActionListener(getSelection);
		kelvinCelsius.addActionListener(getSelection);
		kelvinFahrenheit.addActionListener(getSelection);
		fahrenheitCelsius.addActionListener(getSelection);
		fahrenheitKelvin.addActionListener(getSelection);
	}

	private class GetSelection implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object tmpObject = event.getSource();
			if (tmpObject == celsiusKelvin)
				celsiusKelvinActionPerformed(event);
			else if (tmpObject == celsiusFahrenheit)
				celsiusFahrenheitActionPerformed(event);
			else if (tmpObject == kelvinCelsius)
				kelvinCelsiusActionPerformed(event);
			else if (tmpObject == kelvinFahrenheit)
				kelvinFahrenheitActionPerformed(event);
			else if (tmpObject == fahrenheitCelsius)
				fahrenheitCelsiusActionPerformed(event);
			else if (tmpObject == fahrenheitKelvin)
				fahrenheitKelvinActionPerformed(event);
		}
	}

	private void celsiusKelvinActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(celsiusField.getText()).doubleValue();
		if (temp >= -273) {
			temp += 273;
			fahrenheitField.setText("");
			kelvinField.setText(String.valueOf(temp));
			status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {    
			kelvinField.setText("");
			fahrenheitField.setText("");
			status.setText("Temperatures below minus 273 degrees Celsius are impossible");
		}
	}

	private void celsiusFahrenheitActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(celsiusField.getText()).doubleValue();
		if (temp >= -273) {
			temp = 9 * temp / 5 + 32;
			kelvinField.setText("");
			fahrenheitField.setText(String.valueOf(temp));
			status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			kelvinField.setText("");
			fahrenheitField.setText("");
			status.setText("Temperatures below minus 273 degrees Celsius are impossible");
		}
	}

	private void kelvinCelsiusActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(kelvinField.getText()).doubleValue();
		if (temp >= 0) {
			temp -= 273;
			fahrenheitField.setText("");
			celsiusField.setText(String.valueOf(temp));
			status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			fahrenheitField.setText("");
			celsiusField.setText("");
			status.setText("Temperatures below zero Kelvin are impossible");
		}
	}

	private void kelvinFahrenheitActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(kelvinField.getText()).doubleValue();
		if (temp >= 0) {
			temp -= 273;
			temp = 9 * temp / 5 + 32;
			celsiusField.setText("");
			fahrenheitField.setText(String.valueOf(temp));
			status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			celsiusField.setText("");
			fahrenheitField.setText("");
			status.setText("Temperatures below zero Kelvin are impossible");
		}
	}

	private void fahrenheitCelsiusActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(fahrenheitField.getText()).doubleValue();
		if (temp >= -459.4) {
			temp -= 32;
			temp = 5 * temp / 9;
			kelvinField.setText("");
			celsiusField.setText(String.valueOf(temp));
			status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			kelvinField.setText("");
			celsiusField.setText("");
			status.setText("Temperatures below minus 459.4 degrees Fahrenheit are impossible");
		}
	}

	private void fahrenheitKelvinActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(fahrenheitField.getText()).doubleValue();
		if (temp >= -459.4) {
			temp -= 32;
			temp = 5 * temp / 9;
			temp += 273;
			celsiusField.setText("");
			kelvinField.setText(String.valueOf(temp));
			status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			kelvinField.setText("");
			celsiusField.setText("");
			status.setText("Temperatures below minus 459.4 degrees Fahrenheit are impossible");
		}
	}
}
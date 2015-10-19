/*
 *	File Name:  TempConverter.java
 *	Program:    TempConverter
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

import javax.swing.JFrame;


public class TempConverter {
	
	
	public static void main ( String args[] )
	{
		ConvertTemperatureGui application = new ConvertTemperatureGui();
		application.setResizable(false);
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}

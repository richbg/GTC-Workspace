/* Assignment: Chapter 3 Exercise 
 * Author: Benjamin G. Rich
 * 
 * Code prompts user for a temperature 
 * in degrees fareneheit, converts this value to celsius 
 * and returns the value to the user. Class Temperature is utilized
 * to calculate the date provied by the user
 * 
 */

import java.util.*;

public class convertTemperature {


	public static double getInput()
	{

		Scanner sc = new Scanner(System.in);

		sc.useDelimiter (System.getProperty("line.separator"));

		System.out.print(" Enter a  temperature in degrees Farenheit: " );

		return sc.nextDouble();

	}


	public static void main(String[] args) 
	{
		double temp = convertTemperature.getInput();
		Temperature tempOne = new Temperature();
		tempOne.toCelsius(temp);

		System.out.println(" The converted temperature is: " + Math.round(tempOne.getCelsius())  );

	}


}

/* Assignment: Chapter 3 Exercise 
 * Class Temperature
 * Author: Benjamin G. Rich
 * 
 * Code prompts user for a temperature 
 * in degrees fareneheit, converts this value to celsius 
 * and returns the value to the user. Class Temperature is utilized
 * to calculate the date provied by the user
 * 
 */

public class Temperature 
{
	double fahrenheit = 0.0;
	double celsius = 0.0;

	public Temperature() 
	{

	}


	public void toFarenheit(double tempInCelsius) 
	{
		celsius = tempInCelsius;
		// Convert it to Fahrenheit
		fahrenheit = ((9.0/5.0) * celsius) + 32;

	}


	public void toCelsius(double tempInFarenheit)
	{
		fahrenheit = tempInFarenheit;
		// Convert it to Celsius
		celsius = (5.0/9.0) * (fahrenheit - 32);

	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}



	public double getCelsius() {
		return celsius;
	}



	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}



}

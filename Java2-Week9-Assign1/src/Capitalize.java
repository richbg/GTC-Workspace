/*
 *	File Name:  Capitalize.java
 *	Program:    Capitalize
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 9 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * To "capitalize" a string means to change the first letter of each word in 
 * the string to upper case (if it is not already upper case). For example, a 
 * capitalized version of "Now is the time to act!" is "Now Is The Time To Act!"  
 * 
 * Write a class called Capitalize which will store ( in an instance variable ) a long String 
 * containing one or more words.  The class must be instantiated with a String ( the class will 
 * contain only one constructor that will have a String input parameter ).  Include in your Capitalize 
 * class a method called getCapitalized which will return a String that is a capitalized version of the instance string.  
 * Within the getCapitalized method use a local object of type StringBuilder or StringBuffer to construct your capitalized 
 * version of the instance String and return it as a String.  Also include a method called getAllCaps which will return a 
 * String that is a version of the instance String with all letters in upper case. 
 * Write a program that will ask the user to input a multi-word string (a sentence, if you will).  
 * Have it create an object of the Capitalize class and use the object to output a capitalized version of 
 * the input sentence and also an all-caps version of the input sentence.  
 *
 */

public class Capitalize {

	private static String m_string = "";

	// Default constructor
	public Capitalize(String str) {
		this.m_string = str;

	}

	// method getCapitalized
	public String getCapitalized() {
		StringBuilder b = new StringBuilder(m_string);
		int i = 0;
		do {
			b.replace(i, i + 1, b.substring(i, i + 1).toUpperCase());
			i = b.indexOf(" ", i) + 1;
		} while (i > 0 && i < b.length());

		return b.toString();
	} // end method getCapitalized

	// method getAllCaps
	public String getAllCaps() {
		return m_string.toUpperCase();

	}// end method getAllCaps

} // end class Capitalize

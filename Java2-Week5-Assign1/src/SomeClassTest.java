/*
 *	File Name:  SomeClassTest.java
 *	Program:    SomeClassTest
 *	Programmer: Benjamin Rich
 *	Exercise:   Week 5 Exceptions Assignment
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * 1. (Constructor Failure)  Write a program that shows a constructor passing information about constructor failure 
 * to an exception handler.  Define class SomeClass, which throws an exception in the constructor.  
 * Your program should try to create an object of type SomeClass and catch the exception 
 * that is thrown from the constructor.  (11.20)
 *
 */

public class SomeClassTest 

{

	public static void main(String[] args) 
	{
		// Create an instance object for SomeClass
		try 
		{
			SomeClass someClass = new SomeClass();
		} catch (Exception e) 
		{
			System.err.println("An Exception was thrown when trying to create an instance of the class: "
					+ "\n" + e);

		}
	}// end main
}// end SomeClassTest
/*
 *	File Name:  SomeClass.java
 *	Program:    SomeClass
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

public class SomeClass 
{
	
	public SomeClass() throws Exception 
	{
		
		throw new Exception("The constructor has failed and is throwing an exception.");
	}
}

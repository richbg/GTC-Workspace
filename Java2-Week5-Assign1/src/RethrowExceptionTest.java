/*
 *	File Name:  RethrowExceptionTest.java
 *	Program:    RethrowExceptionTest
 *	Programmer: Benjamin Rich
 *	Exercise:   Week 5 Exceptions Assignment
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * (Rethrowing Exceptions)  Write a program that illustrates rethrowing an exception.  
 * Define methods someMethod and someMethod2.  Method someMethod2 should initially throw an exception.  
 * Method someMethod should call someMethod2, catch the exception and rethrow it.  
 * Call someMethod from method main, and catch the rethrown exception.  
 * Print the stack trace of this exception.  (11.21)
 *
 */

public class RethrowExceptionTest 
{


	public static void main(String[] args) 
	{
		try 
		{	
			// Calling someMethod which calls someMethod2  
			someMethod();
		} catch (Exception e) //Catch the exception thrown

		{
			System.err.printf("%s\n\n", e.getMessage()); // Print the detail message of the throwable exception
			e.printStackTrace(); // Print the stack trace
		}
	}// end main


	// Method someMethod rethrows an exception caught by
	// calling  someMethod2
	private static void someMethod() throws Exception 
	{
		try 
		{
			//Calling someMethod2
			someMethod2();
		} catch (Exception e) 
		{
			System.err.println("Exception thrown by someMethod2 and is being rethrown");
			throw new Exception(e.getMessage()); // Rethrow the exception back to the calling method
		}
	}// end someMethod

	// someMethod2 throws an exception
	private static void someMethod2() throws Exception 
	{
		throw new Exception("someMethod2 threw and exception");
	}// end someMethod2

}

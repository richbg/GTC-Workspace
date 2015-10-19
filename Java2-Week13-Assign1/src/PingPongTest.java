/*
 *	File Name:  PingPongTest.java
 *	Program:    PingPongTest
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 13 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *  
 *  Write a PingPong class that implements the Runnable interface 
 *  and will write ping or pong in a console window.  
 *  Have it print the word (ping or pong) at least 10 times before it terminates.
 *  
 *  Write a program that creates and runs two threads using the PingPong class.  
 *  One that prints ping, one that prints pong.
 *  
 *  Additional Notes:
 *  The PingPong class should print ping or pong only.  
 *  It should not even be able to print anything else.  
 *  You can use the constructor to set up which it prints (ping or pong).
 *  Use a loop in the PingPong class to print at least 10 times and have the thread sleep for at least 10 seconds each time through the loop.
 *  The main program should create and run two instances of the PingPong class, one that does ping and one that does pong.
 */

public class PingPongTest {


	public static void main(String[] args) {

		Thread thread = new Thread(new PingPong(true)); // ping thread
		
		Thread thread1 = new Thread(new PingPong(false)); // pong thread
		
		thread.start();
		thread1.start();
	}


}



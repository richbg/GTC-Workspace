/*
 *	File Name:  ServerTest.java
 *	Program:    ServerTest
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 1 Assignment 1
 *  Class: 		CIST2373-Java Programming III 
 *
 * Use a socket connection to allow a client to specify a file name of a text file 
 * and have the server send the contents of the file or indicate that the file does not exist. (27.13)
 * 
 * Additional Notes:
 * There will be two programs, four java files.  
 * You may write the two programs from scratch or you may use the 
 * examples in the book as templates. ( Fig. 27.5-27.6 for the server class 
 * and Fig. 27.7-27.8 for the client class )
 * Class ServerTest and class ClientTest need no modification.  
 * They just launch the Server and Client objects respectively.  
 *
 */

// class that tests the server

import javax.swing.JFrame;

public class ServerTest {
	public static void main(String[] args) {
		Server application = new Server(); // create server
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.runServer(); // run server application
	} // end main
} // end class ServerTest

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/

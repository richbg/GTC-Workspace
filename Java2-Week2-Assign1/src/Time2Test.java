/*
 *	File Name:  Time2Test.java
 *	Program:    Time2Test
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 2 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *
 * Modify class Time2 of Fig. 8.5 to include a tick method that increments the time stored in a Time2 object by one second.  
 * Provide method incrementMinute to increment the minute by one and method incrementHour to increment the hour by one.   
 * The Time2 object should always remain in consistent state.  Write a program that tests the tick method, the incrementMinute method 
 * and the incrementHour method to ensure that they work correctly.  Be sure to test the following cases:
 * 	Incrementing into the next minute using tick
 * 	Incrementing into the next hour using tick and incrementMinute
 * 	Incrementing into the next day (i.e. 11:59:59 PM to 12:00:00 AM)
 * 
 */


public class Time2Test 
{
public static void main( String[] args )
{
	//Incrementing into the next minute using tick method
	Time2 t1 = new Time2( 0, 0, 59 );
	//Incrementing into the next hour using tick and incrementMinute
	Time2 t2 = new Time2( 0, 59, 59 );
	//Incrementing into the next day(i.e. 11:59:59 PM to 12:00:00 AM)
	Time2 t3 = new Time2( 23, 59, 59 ); 
   
	
   // Modify Time Object t2 by one minute
   System.out.println("Time Before incrementing to the next minute using tick");
   System.out.println(t1.toUniversalString());
   System.out.println(t1.toString());
   t1.tick();
   
   System.out.println("Time Incrementin to the next minute after tick method is called");
   System.out.println(t1.toUniversalString());
   System.out.println(t1.toString());
   
   System.out.println("Time before incrementing to the next hour using tick");
   System.out.println(t2.toUniversalString() );
   System.out.println(t2.toString() );
   t2.tick();
   
   System.out.println("Time Incrementing to next hour after tick method is called");
   System.out.println(t2.toUniversalString() );
   System.out.println(t2.toString() );

   System.out.println("Time Before incrementing to the next day using tick");
   System.out.println(t3.toUniversalString() );
   System.out.println(t3.toString() );
   t3.tick();
      
   System.out.println("Time Incrementing to next day after tick method is called");
   System.out.println(t3.toUniversalString() );
   System.out.println(t3.toString() );
   
        
   
} // end main


} // end class Time2Test




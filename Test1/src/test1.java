/* Assignment: Test 1 
 * Author: Benjamin G. Rich
 * 
 *  Sept 29, 2011
 *  
 * 
 */

import java.util.*;


public class test1 {


	public static void main(String[] args) {
		
		
/* Void is a return type that can be utilized by methods in java.  
*  A programmer can utilize the return type void when the method doesn't return a value to the caller.
*  When using a setter method such as setAge in our test, 
*  the method is void because there isn't any data to be returned to the caller.
* 
*  Setting class variables: 
*  Private  restricts who can have access to the data member, if the modifier is 
*  private, then only the methods defined in the class can access it directly.
* 
*  Public class variables: 
*  Public allows access to the data member by any class within the program 
*  or classes which implement the class.
* 
*  An example when you would want to set a method access modifier to private is when 
*  you have a large group working on a project & the data objects you want to protect.
*
*/		
		
		

		Scanner sc = new Scanner(System.in);

		sc.useDelimiter (System.getProperty("line.separator"));

		Customer c = new Customer();

		String firstName = null;

		System.out.print(" What is your first name? " );

		firstName = sc.next();
		c.setFirstName(firstName);

		String lastName = null;

		System.out.println("What is our last name? ");
		lastName = sc.next();
		c.setLastName(lastName);

		String emailAddress = null;
		System.out.println("What is your email address");
		emailAddress = sc.next();
		c.setEmailAddress(emailAddress);

		String phoneNumber = null;
		System.out.println("What is your phone number");
		phoneNumber = sc.next();
		c.setPhoneNumber(phoneNumber);

		int age = 0;
		System.out.println("What is your age");
		age = sc.nextInt();
		c.setAge(age);

		int retireOption = 0;
		System.out.println("Enter your retirement option 1 or 2");
		retireOption = sc.nextInt();

		System.out.println("Your Contact information is: " + "\n" + " Your Name is: " +  c.getFirstName() + " " +  c.getLastName() + "\n" 
				+ "Your email address is: " + c.getEmailAddress() + "\n" + " Your phone number is: " +  c.getPhoneNumber() + "\n" + " Your age is: " + c.getAge() + " \n" 
				+ "Years till retirement are: " +  c.calculateRetirementYears(retireOption));

		int count = c.calculateRetirementYears(retireOption);
		while ( count != 0 )
		{
			System.out.println("Happy Birthday");
			count--;
			
		}
		



	}




}

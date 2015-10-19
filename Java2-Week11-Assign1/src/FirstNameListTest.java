/*
 *	File Name:  FirstNameListTest.java
 *	Program:    FirstNameListTest
 *	Programmer: Benjamin Rich
 *	Exercise:   Lesson 11 Assignment 1
 *  Class: 		CIST2372-Java Programming II (40450)
 *  
 *  Write a program that reads in a series of first names and 
 *  eliminates duplicates by storing them in a Set.  
 *  Allow the user to search for a first name.  (20.13)
 *  Additional Notes:
 *  Note that there a three parts to this program, the (user) input of the first names, 
 *  the elimination of duplicate names, and allowing user to search for a first name.
 *  Store the input names in a List (not directly into a Set) so duplicates may be input 
 *  initially into the list.  You may not eliminate duplicates during input.  
 *  To eliminate duplicates load the list into a Set, then clear and reload the list 
 *  with the resulting set.  Then do the searching on the newly edited list.
 *  Display the contents of the list before and after duplicate elimination to 
 *  verify that duplicates have been eliminated.
 */

import java.util.Scanner;

public class FirstNameListTest {

	private static FirstNameList firstNameObj = new FirstNameList();

	public static void main(String[] args) {

		boolean sentinel = true;
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));

		inputFirstnames(sentinel, sc);

		System.out.println("This is all the first names entered: "
				+ firstNameObj.getWorking() + "\n");
		System.out
				.println("This is all the first names entered, duplicates removed: "
						+ firstNameObj.getResults() + "\n");
		searchFirstNames(sc);

	}

	private static void searchFirstNames(Scanner sc) {
		boolean sentinel2 = true;
		do {

			// Prompt for search input
			System.out
					.println("Enter first name to search, type stop to exit search: ");
			String searchName = sc.next().toLowerCase();
			if (searchName != null && searchName.length() > 0)
				if (firstNameObj.searchList(searchName))
					System.out.println("Found first name: " + searchName);
				else {
					if (!"stop".equals(searchName)) {
						System.out
								.println("List did not contain the search name provided: "
										+ searchName + "\n");

					}

				}
			if ("stop".equals(searchName))
				sentinel2 = false;

		} while (sentinel2);
	}

	private static void inputFirstnames(boolean sentinel, Scanner sc) {
		String firstName;
		do {
			// Prompt the user for input
			System.out.print("Enter some first names, type stop to exit: "
					+ "\n");
			firstName = sc.next().toLowerCase();
			if (firstName != null && firstName.length() > 0
					&& firstName.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"))
				if (!"stop".equals(firstName)) {
					firstNameObj.getWorking().add(firstName);

				}
			if ("stop".equals(firstName))
				sentinel = false;
		} while (sentinel);
	}

}

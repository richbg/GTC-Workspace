/*
 *	File Name:  FirstNameList.java
 *	Program:    FirstNameList
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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FirstNameList {

	private List<String> working = new ArrayList<String>();
	private Set<String> results = new TreeSet<String>();

	public List<String> getWorking() {
		return working;
	}

	public Set<String> getResults() {
		removeDuplicates();
		return results;
	}

	public boolean searchList(String sName) {
		return results.contains(sName);
	}

	private void removeDuplicates() {
		results.addAll(working);

	}

}

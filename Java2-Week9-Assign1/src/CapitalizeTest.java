/*
 *	File Name:  CapitalizeTest.java
 *	Program:    CapitalizeTest
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

import java.util.Scanner;
public class CapitalizeTest {

    public static void main(String[] args)
    {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Please input a multi-word string: ");
        String  str = sc.nextLine();
         
        Capitalize string1 = new Capitalize(str);

        System.out.println(string1.getCapitalized());
        System.out.println(string1.getAllCaps());
        
    }  // end main()

    
}  // end class


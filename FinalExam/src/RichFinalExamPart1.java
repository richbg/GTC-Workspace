/*
 Benjamin Rich CIST2371-Java Programming I (20393) 
 December 12, 2011
 Final Exam Part One

- Requirements
- Write a non-gui program that asks the user to enter 5 numbers (double type).
- Assign all to an array
- Pass the array to a method called findBelowAverage that you create (you choose its implementation)

- the findBelowAverage method will do the following:
- find the average of all 5 numbers and display it as output.
- use a 'for' or 'while' loop to print out all numbers in the array that are less than the average on the screen one line at a time.

Call this method from the main method of your program to get it to produce the result.

EXTRA CREDIT: add one more method to the Part 1 code and call it 'extraCredit(...)' method that 
A) prints out the smallest number and largest number of the array, 
B) prints out all the even numbers of the array, and 
C) prints out the list of all values in the array in decending order.  
Call this method from the main method of your program to get it to produce the result.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RichFinalExamPart1 {
	static Boolean isEven = false;

	public static void main(String[] args) {
		Scanner input = getInput();
		double array[] = new double[5];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		findBelowAverage(array);
		extraCredit(array);
	}

	private static void extraCredit(double[] array) {
		smallestLargest(array);
		arraySort(array);
		arrayDescending(array);
	}

	private static void arrayDescending(double[] array) {
		for (int counter = 0; counter < array.length - 1; counter++) {
			for (int index = 0; index < array.length - 1 - counter; index++) {
				if (array[index] < array[index + 1]) {
					double temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
				}
			}
		}

		System.out.println("\n");
		System.out.println("Sorted in Descending Order:");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void arraySort(double[] array) {
		double[] array_sort = array;

		List<Double> odd = new ArrayList<Double>();
		List<Double> even = new ArrayList<Double>();
		for (double i : array) {
			if ((i % 2) == 1) {
				odd.add(i);
			} else {
				even.add(i);
			}
		}
		Collections.sort(odd);
		Collections.sort(even);
		// System.out.println("Odd:" + odd);
		System.out.println("\n");
		System.out.println("Even numbers are: " + even);

	}

	private static void smallestLargest(double[] array) {
		double smallest = array[0];
		double largetst = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largetst)
				largetst = array[i];
			else if (array[i] < smallest)
				smallest = array[i];

		}

		System.out.println("\n" + "EXTRA CREDIT SECTION: " + "\n"
				+ "Smalest & Largest");
		System.out.println("Smallest Number is : " + smallest);
		System.out.println("Largest Number is : " + largetst);

	}

	public static void findBelowAverage(double array[]) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = sum / array.length;
		System.out.println("Average of all numbers: " + average);
		System.out.println("Numbers that are less than the average: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] < average) {
				System.out.println(array[i]);
			}
		}
	}

	private static Scanner getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		return input;
	}

}
